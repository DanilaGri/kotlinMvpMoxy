package com.example.master.githubusers.users.presentation

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.master.githubusers.users.domain.model.User

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface UsersView : MvpView {
    fun showUsers(list: List<User>)
}