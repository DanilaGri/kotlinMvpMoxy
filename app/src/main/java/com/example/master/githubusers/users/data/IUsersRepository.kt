package com.example.master.githubusers.users.data

import com.example.master.githubusers.users.domain.model.Result
import kotlinx.coroutines.Deferred

interface IUsersRepository {
    fun searchUsers(location: String, language: String) : Deferred<Result>
}