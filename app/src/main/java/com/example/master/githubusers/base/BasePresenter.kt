package com.example.master.githubusers.base

import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView
import kotlinx.coroutines.Job

abstract class BasePresenter<T : MvpView> : MvpPresenter<T>() {
//    private val compositeDisposable = CompositeDisposable()
protected var myJob: Job? = null

    protected fun setJob(job: Job) {
        myJob = job
    }

    override fun destroyView(view: T) {
        super.destroyView(view)
        myJob?.cancel()
    }

//    protected fun clearCompositeDisposable() {
//        if (compositeDisposable.size() > 0) {
//            compositeDisposable.clear()
//        }
//    }
}