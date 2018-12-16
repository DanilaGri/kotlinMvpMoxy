package com.example.master.githubusers.users.domain.interactor

import com.example.master.githubusers.users.domain.model.Result
import kotlinx.coroutines.Deferred

interface IUsersInteractor {
    fun searchUsers(location: String, language: String) : Deferred<Result>
}