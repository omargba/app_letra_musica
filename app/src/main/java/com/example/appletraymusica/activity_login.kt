package com.example.appletraymusica

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appletraymusica.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Aquí irá la lógica para validar el login
                // Por ahora mostramos un mensaje
                println("Email: $email, Password: $password")
            } else {
                println("Por favor, llena todos los campos")
            }
        }
    }
}
