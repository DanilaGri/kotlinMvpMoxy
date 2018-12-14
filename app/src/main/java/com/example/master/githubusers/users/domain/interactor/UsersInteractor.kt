package com.example.master.githubusers.users.domain.interactor

import com.example.master.githubusers.users.data.IUsersRepository
import com.example.master.githubusers.users.domain.model.Result
import io.reactivex.Observable
import javax.inject.Inject

class UsersInteractor @Inject constructor(private val mRepo: IUsersRepository) : IUsersInteractor {

    override fun searchUsers(location: String, language: String): Observable<Result> {
        return mRepo.searchUsers(location,language)
    }
}