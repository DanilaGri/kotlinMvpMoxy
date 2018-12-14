package com.example.master.githubusers.di.modules

import android.content.Context
import com.example.master.githubusers.base.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: App) {
    @Provides @Singleton fun provideApplicationContext(): Context = application

}