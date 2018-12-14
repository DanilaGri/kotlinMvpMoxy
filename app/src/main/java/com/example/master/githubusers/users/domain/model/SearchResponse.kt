package com.example.master.githubusers.users.domain.model

data class User(
    val login: String?,
    val id: Long,
    val url: String?,
    val htmlUrl: String?,
    val followersUrl: String?,
    val followingUrl: String?,
    val starredUrl: String?,
    val gistsUrl: String?,
    val type: String?,
    val score: Int
)

data class Result (val totalCount: Int, val incompleteResults: Boolean, val items: List<User>)