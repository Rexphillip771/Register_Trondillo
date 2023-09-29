package ph.edu.uic.register_trondillo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Login : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        auth = Firebase.auth;
        var _Loginbutton = findViewById<Button>(R.id.Loginbutton)
        _Loginbutton.setOnClickListener{
            signup()
        }


    }


    private fun signup() {

        val _Email = findViewById<EditText>(R.id.Email)
        val _Password = findViewById<EditText>(R.id.Password)
        val _Email_toString = _Email.text.toString()
        val _Password_toString = _Password.text.toString()

        auth.createUserWithEmailAndPassword(_Email_toString, _Password_toString)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Toast.makeText(this, "successful", Toast.LENGTH_SHORT).show()
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(this, "failed sign in", Toast.LENGTH_SHORT).show()
                }
            }
    }
}