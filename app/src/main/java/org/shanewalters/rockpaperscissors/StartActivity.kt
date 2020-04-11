package org.shanewalters.rockpaperscissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    fun startButtonPressed(view: View) {
        val whereAmIGoing = Intent(this, MainActivity::class.java)
        startActivity(whereAmIGoing)
    }
}
