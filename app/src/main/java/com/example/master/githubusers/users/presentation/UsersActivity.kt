package com.example.master.githubusers.users.presentation

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.master.githubusers.R
import com.example.master.githubusers.base.BaseActivity
import com.example.master.githubusers.users.domain.model.User
import kotlinx.android.synthetic.main.activity_users.*

class UsersActivity : BaseActivity(), UsersView {

    @InjectPresenter
    lateinit var mPresenter: UsersPresenter

    private lateinit var adapter: UsersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
        initializeView()
        mPresenter.searchUsers()
    }

    override fun showUsers(list: List<User>) {
         adapter.addAll(list = list)
    }

    private fun initializeView() {
        adapter = UsersAdapter(ArrayList(), this)
        usersList.layoutManager = LinearLayoutManager(this)
        usersList.adapter = adapter
    }
}
