package com.udacoding.mvpkalkulator

import com.udacoding.mvpkalkulator.model.ModelHasil


class HitungPresenter(var view : HitungView) {


    fun hitung(input1 : String,input2 : String,opr : String){


        view.isLoading(true)
        if(input1.isNotEmpty() && input2.isNotEmpty()) {
            val nilai1 = input1.toDouble()
            val nilai2 = input2.toDouble()

            var hasil = 0.0

            when (opr) {

                "+" -> hasil = nilai1.plus(nilai2)
                "-" -> hasil = nilai1.minus(nilai2)
            }
            var model = ModelHasil(hasil)
            view.isHasil(model)

            view.isLoading(false)




        }
        else{

            view.isLoading(false)
            view.isEmpty()


        }


    }

}