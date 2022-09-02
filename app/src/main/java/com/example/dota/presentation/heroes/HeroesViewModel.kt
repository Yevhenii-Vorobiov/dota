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
    val isLoading: MutableLiveData<Boolean> = MutableLiveData()
    fun getHeroes() {
        isLoading.postValue(true)
        heroRepository.fetchHeroList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ heroesList ->
                isLoading.postValue(false)
                Timber.d("heroes || $heroesList")
                heroesLiveData.postValue(heroesList)
            }, { error ->
                isLoading.postValue(false)
                Timber.d("heroes || $error")
            })
    }


}