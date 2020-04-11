package org.shanewalters.rockpaperscissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.util.rangeTo
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

// ------------ General Notes ------------- //

// 3 selections - rock, paper, scissors
// when I select one option, computer should make a random selection
// see who won, lost, or if tied

// how I want to stretch
    // custom images for rock, paper, scissors -- image button
    // start screen - simple background & start game button


// ------------ UI Notes ------------- //

// 3 selections (buttons) at top - rock, paper, scissors
// three textviews - top my selection, bottom cpu selection, middle scoreboard


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // create 3 functions for each selection
    // randomize the cpu selection
        // random number generator - nextInt
        // 0 = rock, 1 = paper, 2 = scissors
    // display what user selected -- userSelection
    // display what cpu selected -- cpuSelection
        // when express
            // when (cpuChoice)
            // cpuSelection.text = whatever the cpu selected
    // display if you won, lost, or tied game based off what cpu selected -- scoreboardView
        // conditional statement


    fun rockButtonPressed (view: View) {
        val cpuChoice = Random.nextInt(3)
        userSelection.text = "I Chose Rock!"
        when (cpuChoice) {
            0 -> cpuSelection.text = "The CPU Chose Rock"
            1 -> cpuSelection.text = "The CPU Chose Paper!"
            2 -> cpuSelection.text = "The CPU Chose Scissors!"
        }
        when (cpuChoice) {
            0 -> scoreboardView.text = "It's a Tie Game."
            1 -> scoreboardView.text = "I Lost!"
            2 -> scoreboardView.text = "I Won!"
        }

    }
    fun paperButtonPressed (view: View) {
        val cpuChoice = Random.nextInt(3)
        userSelection.text = "I Chose Paper!"
        when (cpuChoice) {
            0 -> cpuSelection.text = "The CPU Chose Rock"
            1 -> cpuSelection.text = "The CPU Chose Paper!"
            2 -> cpuSelection.text = "The CPU Chose Scissors!"
        }
        when (cpuChoice) {
            0 -> scoreboardView.text = "I Won!"
            1 -> scoreboardView.text = "It's a Tie Game."
            2 -> scoreboardView.text = "I Lost!"
        }

    }
    fun scissorsButtonPressed (view: View) {
        val cpuChoice = Random.nextInt(3)
        userSelection.text = "I Chose Scissors!"
        when (cpuChoice) {
            0 -> cpuSelection.text = "The CPU Chose Rock"
            1 -> cpuSelection.text = "The CPU Chose Paper!"
            2 -> cpuSelection.text = "The CPU Chose Scissors!"
        }
        when (cpuChoice) {
            0 -> scoreboardView.text = "I Lost!"
            1 -> scoreboardView.text = "I Won!"
            2 -> scoreboardView.text = "It's a Tie Game."
        }
    }
    fun resetButtonPressed (view: View) {
        val whereAmIGoing = Intent(this, StartActivity::class.java)
        startActivity(whereAmIGoing)
    }

}
