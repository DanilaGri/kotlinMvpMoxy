package com.example.master.githubusers.base

import android.app.Application
import com.example.master.githubusers.di.AppComponent
import com.example.master.githubusers.di.DaggerAppComponent
import com.example.master.githubusers.di.modules.AppModule
import com.example.master.githubusers.users.di.UsersComponent
import com.example.master.githubusers.users.di.UsersModule

class App : Application() {
    private lateinit var mAppComponent: AppComponent
    private  var mUsersComponent: UsersComponent? = null


    override fun onCreate() {
        mAppComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
        super.onCreate()
        instance = this

    }

    fun getAppComponent(): AppComponent {
        return mAppComponent
    }

    fun plusUsersModule(usersModule: UsersModule): UsersComponent {
        if (mUsersComponent == null) {
            mUsersComponent = getAppComponent().plusUsersModule(usersModule)
        }
        return mUsersComponent as UsersComponent
    }

    companion object {
        lateinit var instance: App private set
    }

}