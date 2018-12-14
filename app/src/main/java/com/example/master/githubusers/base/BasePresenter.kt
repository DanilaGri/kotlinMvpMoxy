package com.example.master.githubusers.base

import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BasePresenter<T : MvpView> : MvpPresenter<T>() {
    private val compositeDisposable = CompositeDisposable()

    protected fun setDisposable(disposable: Disposable) {
        compositeDisposable.add(disposable)
    }

    override fun destroyView(view: T) {
        super.destroyView(view)
        clearCompositeDisposable()
    }

    protected fun clearCompositeDisposable() {
        if (compositeDisposable.size() > 0) {
            compositeDisposable.clear()
        }
    }
}