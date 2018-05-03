package com.graduation.nightwingky.baselibrary.presenter

import com.graduation.nightwingky.baselibrary.presenter.view.BaseView

open class BasePresenter<T: BaseView> {
    lateinit var mView: T
}