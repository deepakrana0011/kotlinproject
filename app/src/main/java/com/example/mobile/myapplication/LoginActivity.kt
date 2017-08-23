package com.example.mobile.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.mobile.myapplication.webserivce.Handler.LoginHandler
import com.example.mobile.myapplication.webserivce.Web


class LoginActivity : AppCompatActivity() {


    var buttonLoging: Button? = null
    var name: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var textView = findViewById(R.id.textView) as TextView
        var imageView = findViewById(R.id.imageView) as ImageView
        var editTextEmail = findViewById(R.id.editTextEmail) as EditText
        var editTextPassword = findViewById(R.id.editTextPassword) as EditText
        buttonLoging = findViewById(R.id.buttonLogin) as Button
        var forgetPassowrdsdfds = findViewById(R.id.forgetPassowrd) as TextView
        var textViewDntHaveAccount = findViewById(R.id.textViewDntHaveAccount) as TextView

        buttonLoging?.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                if (TextUtils.isEmpty(editTextEmail.text.toString())) {
                    name = null
                    var deepak = name?.toInt();
                    Toast.makeText(this@LoginActivity, deepak.toString(), Toast.LENGTH_SHORT).show()
                } else if (!Patterns.EMAIL_ADDRESS.matcher(editTextEmail.text.toString()).matches()) {
                    Toast.makeText(this@LoginActivity, "plaese enter the valid email", Toast.LENGTH_SHORT).show()
                } else if (TextUtils.isEmpty(editTextPassword.text.toString())) {
                    Toast.makeText(this@LoginActivity, "plaese enter the pasword", Toast.LENGTH_SHORT).show()
                } else {
                    Web().login("7814474404","123456",object : LoginHandler {
                        override fun onSuccess(data: String) {
                            val intent = Intent(this@LoginActivity, Main4Activity::class.java)
                              startActivity(intent)
                        }
                        override fun onFial(data: String) {
                            Toast.makeText(this@LoginActivity, "something went wrong", Toast.LENGTH_SHORT).show()
                        }
                    })
                }
            }
        })
    }
}






