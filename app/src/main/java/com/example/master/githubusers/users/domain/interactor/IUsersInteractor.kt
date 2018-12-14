package com.example.master.githubusers.users.domain.interactor

import com.example.master.githubusers.users.domain.model.Result
import io.reactivex.Observable

interface IUsersInteractor {
    fun searchUsers(location: String, language: String): Observable<Result>
}