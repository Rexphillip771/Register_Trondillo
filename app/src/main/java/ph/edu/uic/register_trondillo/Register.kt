package ph.edu.uic.register_trondillo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Register : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        auth = Firebase.auth
        var _Regbutton = findViewById<Button>(R.id.Regbutton)
        _Regbutton.setOnClickListener {
            Reg()
        }
    }

    private fun Reg() {
        val _EmailRegister = findViewById<EditText>(R.id.EmailRegister)
        val _PassRegister = findViewById<EditText>(R.id.PassRegister)
        val _EmailRegister_toString = _EmailRegister.text.toString()
        val _PassRegister_toString = _PassRegister.text.toString()

        auth.createUserWithEmailAndPassword(_EmailRegister_toString,_PassRegister_toString)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Toast.makeText(this, "successful", Toast.LENGTH_SHORT).show()
                } else {
                    // If sign in fails, display a message to the user.
                    Toast.makeText(this, "failed Register", Toast.LENGTH_SHORT).show()
                }
            }
    }
}