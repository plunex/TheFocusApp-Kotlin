package com.plunex.thefocusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_ic_focus.*

class SetFocusActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ic_focus)
        init()
    }

    private fun init(){
        btn_save.setOnClickListener {
            saveFocus()
        }
    }

    private fun  saveFocus(){
        val focus = et_focus.text.toString()
        if (focus.isEmpty()){
            Toast.makeText(this, "The focus should not be empty", Toast.LENGTH_SHORT).show()
        }else{
            AppPrefs(this).setFocus(focus)
            finish()
        }

    }
}
