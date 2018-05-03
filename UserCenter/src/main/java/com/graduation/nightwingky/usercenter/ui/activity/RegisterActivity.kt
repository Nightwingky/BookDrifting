package com.graduation.nightwingky.usercenter.ui.activity

import android.os.Bundle
import com.graduation.nightwingky.baselibrary.ui.activity.BaseMvpActivity
import com.graduation.nightwingky.usercenter.R
import com.graduation.nightwingky.usercenter.presenter.RegisterPresenter
import com.graduation.nightwingky.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        mRegisterBtn.setOnClickListener {
            mPresenter.register("", "")
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }
}
