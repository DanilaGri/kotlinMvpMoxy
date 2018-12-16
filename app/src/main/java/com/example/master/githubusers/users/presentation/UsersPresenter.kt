package com.example.master.githubusers.users.presentation


import com.arellomobile.mvp.InjectViewState
import com.example.master.githubusers.base.App
import com.example.master.githubusers.base.BasePresenter
import com.example.master.githubusers.di.scopes.UsersScope
import com.example.master.githubusers.users.di.UsersModule
import com.example.master.githubusers.users.domain.interactor.UsersInteractor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@UsersScope
@InjectViewState
class UsersPresenter : BasePresenter<UsersView>() {

    @Inject
    lateinit var mInteractor: UsersInteractor

    init {
        App.instance.plusUsersModule(UsersModule()).inject(this)
    }

      fun searchUsers() {
          myJob = CoroutineScope(Dispatchers.IO).launch()
          {
              val response = mInteractor.searchUsers("Taganrog", "Java").await()
              withContext(Dispatchers.Main) {
                  viewState.showUsers(response.items)
              }
          }
      }
}


