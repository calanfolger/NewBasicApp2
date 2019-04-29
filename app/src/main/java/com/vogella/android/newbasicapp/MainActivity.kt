package com.vogella.android.newbasicapp

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        hidetxt.text = "Hide Text"
        backcolor.text = "Color Backing"
        textDescription.text = "Wait for it..."

        hidetxt.setOnClickListener {
            if (textDescription.getVisibility() == View.VISIBLE) {textDescription.visibility = View.INVISIBLE }
            else {textDescription.visibility = View.VISIBLE }
        }

        backcolor.setOnClickListener {
            if (backcolor.isChecked == true){textDescription.setBackgroundColor(Color.CYAN)}
            else{textDescription.setBackgroundColor(Color.WHITE)}
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            R.id.help_settings -> {
                val string1 = "This app is designed to hide and show text\n" +
                        "          and change background color."
                textDescription.text = string1
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
