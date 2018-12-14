package com.example.master.githubusers.di

import com.example.master.githubusers.di.modules.AppModule
import com.example.master.githubusers.di.modules.NetworkModule
import com.example.master.githubusers.users.di.UsersComponent
import com.example.master.githubusers.users.di.UsersModule
import dagger.Component

@Component(modules = [AppModule::class, NetworkModule::class])
interface AppComponent {
    fun plusUsersModule(usersModule: UsersModule) : UsersComponent

}