package com.example.master.githubusers.users.di

import com.example.master.githubusers.di.scopes.UsersScope
import com.example.master.githubusers.users.presentation.UsersPresenter
import dagger.Subcomponent

@UsersScope
@Subcomponent(modules = [UsersModule::class])
interface UsersComponent {
    fun inject(usersPresenter: UsersPresenter)

}