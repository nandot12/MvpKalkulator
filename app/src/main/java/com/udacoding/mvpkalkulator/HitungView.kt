package com.udacoding.mvpkalkulator

import com.udacoding.mvpkalkulator.model.ModelHasil

interface HitungView {

    fun isEmpty()
    fun isLoading(status : Boolean)
    fun isHasil(model : ModelHasil)

}