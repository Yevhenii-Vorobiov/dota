package com.example.dota.presentation.heroes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dota.data.Hero
import com.example.dota.data.HeroRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HeroesViewModel @Inject constructor(
    private val heroRepository: HeroRepository
) : ViewModel() {

    val heroesLiveData: MutableLiveData<List<Hero>> = MutableLiveData()

    fun getHeroes() {

        heroRepository.fetchHeroList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ heroesList ->
                Timber.d("heroes || $heroesList")
                heroesLiveData.postValue(heroesList)
            }, { error ->
                Timber.d("heroes || $error")
            })
    }

}