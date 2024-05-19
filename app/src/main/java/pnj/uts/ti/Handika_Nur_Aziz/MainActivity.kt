package pnj.uts.ti.Handika_Nur_Aziz

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.Toast
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val inputEmail: EditText = findViewById(R.id.inputEmail)
        val inputPassword: EditText = findViewById(R.id.inputPassword)

        val hardcodedEmail1: String = "handika.tik@pnj.ac.id"
        val hardcodedPassword1: String = "12345"
        val hardcodedEmail2: String = "tofu@gmail.com"
        val hardcodedPassword2: String = "tofu"

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {

            val input1 = inputEmail.text.toString()
            val input2 = inputPassword.text.toString()
            val hardcode1 = hardcodedEmail1
            val hardcode2 = hardcodedPassword1
            val hardcode3 = hardcodedEmail2
            val hardcode4 = hardcodedPassword2

            if (input1 == hardcodedEmail1 && input2 == hardcodedPassword1) {
                val intent = Intent(this,FragmentHome::class.java)
                startActivity(intent)
            } else if (input1 == hardcodedEmail2 && input2 == hardcodedPassword2) {
                val intent = Intent(this,FragmentHome::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "No user login data found", Toast.LENGTH_SHORT).show()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}