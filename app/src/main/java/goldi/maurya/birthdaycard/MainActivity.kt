package goldi.maurya.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createBirthdayCard(view: View) {
        val  nameInput :TextView = findViewById(R.id.nameInput)
        val name = nameInput.editableText.toString()
        Toast.makeText(this,"name is $name" , Toast.LENGTH_LONG).show()
        val intent = Intent(this,BirthdayGreetingAcitivity::class.java)
        intent.putExtra(BirthdayGreetingAcitivity.NAME_EXTRA,name)
        startActivity(intent)
    }
}