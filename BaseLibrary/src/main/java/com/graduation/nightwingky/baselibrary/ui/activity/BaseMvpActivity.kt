package com.graduation.nightwingky.baselibrary.ui.activity

import com.graduation.nightwingky.baselibrary.presenter.BasePresenter
import com.graduation.nightwingky.baselibrary.presenter.view.BaseView

open class BaseMvpActivity<T: BasePresenter<*>>: BaseActivity(), BaseView {
    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    lateinit var mPresenter: T
}