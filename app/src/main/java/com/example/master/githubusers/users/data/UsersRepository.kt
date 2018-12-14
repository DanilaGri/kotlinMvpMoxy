package com.example.master.githubusers.users.data

import com.example.master.githubusers.users.domain.model.Result
import com.example.master.githubusers.api.GithubApiService
import io.reactivex.Observable
import javax.inject.Inject

class UsersRepository : IUsersRepository {
    private val mApi: GithubApiService

    @Inject constructor(mApi: GithubApiService) {
        this.mApi = mApi
    }

    override fun searchUsers(location: String, language: String): Observable<Result> {
        return  mApi.search(query = "language:$language+location:$location")
    }
}