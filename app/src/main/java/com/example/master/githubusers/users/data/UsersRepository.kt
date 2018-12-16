package com.example.master.githubusers.users.data

import com.example.master.githubusers.api.GithubApiService
import com.example.master.githubusers.users.domain.model.Result
import kotlinx.coroutines.Deferred
import javax.inject.Inject

class UsersRepository @Inject constructor(private val mApi: GithubApiService) : IUsersRepository {

    override fun searchUsers(location: String, language: String): Deferred<Result> {
        return  mApi.search(query = "language:$language+location:$location")
    }
}