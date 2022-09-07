package com.example.dota.presentation.heroes

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dota.data.models.Hero
import com.example.dota.data.repositories.HeroRepository
import com.example.dota.util.extentions.cacheThresholdPassed
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HeroesViewModel @Inject constructor(
    private val heroRepository: HeroRepository
) : ViewModel() {

    val errorLiveData: MutableLiveData<Throwable> = MutableLiveData()
    val heroesLiveData: MutableLiveData<List<Hero>> = MutableLiveData()
    val isLoading: MutableLiveData<Boolean> = MutableLiveData()


    fun getHeroes() {
        isLoading.postValue(true)
        val cachedHeroList = heroRepository.getHeroListFromCache()
        if (cachedHeroList == null || heroRepository.getLastTimeCached().cacheThresholdPassed()) {
            fetchHeroListFromRemote()
        } else {
            isLoading.postValue(false)
            cachedHeroList.let { heroesLiveData.postValue(it) }
        }

    }

    @SuppressLint("CheckResult")
    fun fetchHeroListFromRemote() {
        heroRepository.fetchHeroList()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ heroesList ->
                isLoading.postValue(false)
                heroesLiveData.postValue(heroesList)
                heroRepository.cacheHeroList(heroesList)
            }, { error ->
                isLoading.postValue(false)
                errorLiveData.postValue(error)
            })
    }

}