package com.graduation.nightwingky.usercenter.presenter

import com.graduation.nightwingky.baselibrary.presenter.BasePresenter
import com.graduation.nightwingky.usercenter.presenter.view.RegisterView

class RegisterPresenter: BasePresenter<RegisterView>() {

    fun register(mobile: String, verifyCode: String) {
        //业务逻辑

        mView.onRegisterResult(true)
    }
}