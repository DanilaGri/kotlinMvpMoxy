package com.example.master.githubusers.users.data

import com.example.master.githubusers.users.domain.model.Result
import io.reactivex.Observable

interface IUsersRepository {
    fun searchUsers(location: String, language: String): Observable<Result>
}