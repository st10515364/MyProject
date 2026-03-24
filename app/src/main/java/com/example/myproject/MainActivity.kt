package com.example.myproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat





class MainActivity : AppCompatActivity() {

    lateinit var txtTimeCal : EditText
    lateinit var showMessage : Button
    lateinit var btnClearInfo : Button
    lateinit var txtResult : TextView

          //val time = "Morning"
         // val timeT = "Mid Morning"
        // val timeR = "Afternoon"
       // val timeU = "Afternoon Snack"
      // val timeO = "After Dinner"
     // val timeP = "Dinner"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtTimeCal = findViewById(R.id.txtTimeCal)
        showMessage= findViewById(R.id.btnShowMessage)
        btnClearInfo = findViewById(R.id.btnClearInfo)
        txtResult = findViewById(R.id.txtResult)



        showMessage.setOnClickListener{
           val time = txtTimeCal.text.toString()



           if ( time ==(" Morning ")) {
               txtResult.text = " Send a 'Good morning ' text to a family member "

            }
            else
                if (  time == (" Mid Morning ")){
                  txtResult.text = " Reach out to a colleage "
                }
                else
                    if (time == (" Afternoon ")){
                        txtResult.text = " Share a funny meme or interesting link with a friend "
                    }
                    else
                        if (time == (" Afternoon Snack Time ")) {
                            txtResult.text = " Send a quick' Thinking of you' message "
                        }
                        else
                            if (time == (" Dinner ")){
                                txtResult.text = " Call a friend or relative for a 5-minute catch up "

                            }
                               else
                                 if  ( time == (" After Dinner/Night ")){
                                     txtResult.text=" Leave a thoughtful comment on a friend`s post "


                                     // if (timeP == txtTimeCal) ///////still understanding

                                    //Toast.makeText(this,"Leave a thoughtful comment on a friend`s post", Toast.LENGTH_LONG).show()
                                  }
                                  else
                                      if ( time.isEmpty()){
                                          txtResult.text = " Please enter a time "
                                      }
                                      else
                                          txtResult.text = " Error!! "


        }
        btnClearInfo.setOnClickListener {
          txtResult.text = ""
            txtTimeCal.text.clear()




        }






















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}