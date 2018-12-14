package com.example.master.githubusers.users.di

import com.example.master.githubusers.api.GithubApiService
import com.example.master.githubusers.di.scopes.UsersScope
import com.example.master.githubusers.users.data.IUsersRepository
import com.example.master.githubusers.users.data.UsersRepository
import com.example.master.githubusers.users.domain.interactor.IUsersInteractor
import com.example.master.githubusers.users.domain.interactor.UsersInteractor
import dagger.Module
import dagger.Provides

@Module
class UsersModule {
    @Provides
    @UsersScope
    fun provideIUsersRepository(api: GithubApiService): IUsersRepository {
        return UsersRepository(api)
    }

    @Provides
    @UsersScope
    fun provideIUsersInteractor(repo: IUsersRepository): IUsersInteractor {
        return UsersInteractor(repo)
    }
}
