package com.example.lab

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.lab.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.button.setOnClickListener({
          var num=  binding.num.text.toString().toInt();

            Toast.makeText(MainActivity@this,"FACTORIAL= "+getFactorial(num) +"SQUARE= "+(num*num),Toast.LENGTH_LONG).show()


        })





       }


      fun getFactorial(num:Int):Int{
          var i=num
          var fac=1;

          while(i>1)
          {
              fac=fac*i
              --i
          }

          return fac;
      }






    }


