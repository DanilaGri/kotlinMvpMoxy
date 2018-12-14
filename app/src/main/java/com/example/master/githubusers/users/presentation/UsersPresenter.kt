package com.example.master.githubusers.users.presentation

import com.arellomobile.mvp.InjectViewState
import com.example.master.githubusers.base.App
import com.example.master.githubusers.base.BasePresenter
import com.example.master.githubusers.di.scopes.UsersScope
import com.example.master.githubusers.users.di.UsersModule
import com.example.master.githubusers.users.domain.interactor.UsersInteractor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@UsersScope
@InjectViewState
class UsersPresenter : BasePresenter<UsersView>() {

    @Inject lateinit var mInteractor: UsersInteractor

    init {
        App.instance.plusUsersModule(UsersModule()).inject(this)
    }

    fun searchUsers() {
        val disposable = mInteractor
            .searchUsers("Taganrog", "Java")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribeWith(object : DisposableObserver<com.example.master.githubusers.users.domain.model.Result>() {
                override fun onNext(response: com.example.master.githubusers.users.domain.model.Result) {
                    viewState.showUsers(response.items)
                }

                override fun onError(e: Throwable) {
                }

                override fun onComplete() {

                }
            })
        setDisposable(disposable)
    }



}