package com.udacoding.mvpkalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.udacoding.mvpkalkulator.model.ModelHasil

class MainActivity : AppCompatActivity(), HitungView {

    private var inp1 : TextInputEditText? = null
    private var inp2 : TextInputEditText? = null
    private var btnTambah : Button? = null
    private var btnKurang : Button? = null
    private var txtHasil : TextView? = null
    private var presenter : HitungPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inp1 = findViewById(R.id.editTextNumber)
        inp2 = findViewById(R.id.editTextNumber2)
        btnKurang = findViewById(R.id.kurang)
        btnTambah = findViewById(R.id.tambah)
        txtHasil = findViewById(R.id.textViewHasil)


        presenter = HitungPresenter(this)

        btnTambah?.setOnClickListener {

            presenter?.hitung(inp1?.text.toString(),inp2?.text.toString(),"+")
        }

        btnKurang?.setOnClickListener {

            presenter?.hitung(inp1?.text.toString(),inp2?.text.toString(),"-")
        }



    }

    override fun isEmpty() {

        //show alert bilang tidak boleh kosong
    }

    override fun isLoading(status: Boolean) {
        if(status) //progress.visibility = View.Visible
            else // Gone
    }

    override fun isHasil(model: ModelHasil) {
        //show alert hasil
        
    }
}