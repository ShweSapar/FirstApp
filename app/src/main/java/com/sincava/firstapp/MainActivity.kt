package com.sincava.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtView: TextView
    lateinit var btnPlus: Button
    lateinit var btnMinus: Button
    lateinit var btnMultiple: Button
    lateinit var btnDivide: Button
    lateinit var btnEqual: Button

    var plusFlg: Boolean = false
    var minusFlg: Boolean = false
    var multipleFlg: Boolean = false
    var divideFlg: Boolean = false
    var valOne: Int = 0
    var valTwo: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView = findViewById(R.id.txt_View)
        btnPlus = findViewById(R.id.btn_plus)
        btnMinus = findViewById(R.id.btn_minus)
        btnMultiple = findViewById(R.id.btn_multiple)
        btnDivide = findViewById(R.id.btn_divide)
        btnEqual = findViewById(R.id.btn_equal)
    }

    fun showButtonContent(view: View){
        when (view.id) {
            R.id.btn_000 -> {
                txtView.append("0")
            }

            R.id.btn_001 -> {
                txtView.append("1")
            }

            R.id.btn_002 -> {
                txtView.append("2")
            }

            R.id.btn_003 -> {
                txtView.append("3")
            }

            R.id.btn_004 -> {
                txtView.append("4")
            }

            R.id.btn_005 -> {
                txtView.append("5")
            }

            R.id.btn_006 -> {
                txtView.append("6")
            }

            R.id.btn_007 -> {
                txtView.append("7")
            }

            R.id.btn_008 -> {
                txtView.append("8")
            }

            R.id.btn_009 -> {
                txtView.append("9")
            }

            R.id.btn_delete -> {
                txtView.text = ""
            }
        }

        btnPlus.setOnClickListener{
            if (txtView.text == null) {
                txtView.text = ""
            } else {
                valOne = txtView.text.toString().toInt()
                plusFlg = true
                txtView.text = null
            }
        }

        btnMinus.setOnClickListener{
            if (txtView.text == null) {
                txtView.text = ""
            } else {
                valOne = txtView.text.toString().toInt()
                minusFlg = true
                txtView.text = null
            }
        }

        btnMultiple.setOnClickListener{
            if (txtView.text == null) {
                txtView.text = ""
            } else {
                valOne = txtView.text.toString().toInt()
                multipleFlg = true
                txtView.text = null
            }
        }

        btnDivide.setOnClickListener{
            if (txtView.text == null) {
                txtView.text = ""
            } else {
                valOne = txtView.text.toString().toInt()
                divideFlg = true
                txtView.text = null
            }
        }

        btnEqual.setOnClickListener{
            valTwo = txtView.text.toString().toInt()
            when {
                plusFlg -> {
                    txtView.text = (valOne + valTwo).toString()
                    plusFlg = false
                }
                minusFlg -> {
                    txtView.text = (valOne - valTwo).toString()
                    minusFlg = false
                }
                multipleFlg -> {
                    txtView.text = (valOne * valTwo).toString()
                    multipleFlg = false
                }
                divideFlg -> {
                    txtView.text = (valOne / valTwo).toString()
                    divideFlg = false
                }
            }
        }
    }
}