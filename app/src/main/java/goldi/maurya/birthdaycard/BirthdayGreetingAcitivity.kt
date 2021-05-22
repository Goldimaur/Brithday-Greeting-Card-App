package goldi.maurya.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingAcitivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "ame_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        val birthdayGreeting:TextView = findViewById(R.id.birthdayGreeting)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting_acitivity)
        val name = intent.getStringExtra("name_extra")
        birthdayGreeting.text="Happy Birthday \n $name"
    }
}