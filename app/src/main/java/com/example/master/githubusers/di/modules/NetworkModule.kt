package com.example.master.githubusers.di.modules

import com.example.master.githubusers.api.GithubApiService
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    fun provideGithubApiService(): GithubApiService {
        return GithubApiService.create()
    }
}