package com.example.math2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GamePage : AppCompatActivity() {


    lateinit var one: Button
    lateinit var two: Button
    lateinit var three: Button
    lateinit var four: Button
    lateinit var five: Button
    lateinit var six: Button
    lateinit var seven: Button
    lateinit var eight: Button
    lateinit var nine: Button
    lateinit var zero: Button
    lateinit var textscreen: TextView
    lateinit var clear: ImageView
    lateinit var submit: Button
    lateinit var puzzles: ImageView
    lateinit var level: TextView
    lateinit var next: ImageView



    var levelcomplete=false

    var levels = arrayOf(
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.p5,
        R.drawable.p6,
        R.drawable.p7,
        R.drawable.p8,
        R.drawable.p9,
        R.drawable.p10,
        R.drawable.p11,
        R.drawable.p12,
        R.drawable.p13,
        R.drawable.p14,
        R.drawable.p15
    )

    var answers =
        arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gamepage)


        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        zero = findViewById(R.id.zero)
        clear = findViewById(R.id.clear)
        textscreen = findViewById(R.id.textscreen)
        submit = findViewById(R.id.submit)
        puzzles = findViewById(R.id.puzzles)
        level = findViewById(R.id.level)
        next=findViewById(R.id.next)



        one.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '1')
        }
        two.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '2')
        }
        three.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '3')
        }
        four.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '4')
        }
        five.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '5')
        }
        six.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '6')
        }
        seven.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '7')
        }
        eight.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '8')
        }
        nine.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '9')
        }
        zero.setOnClickListener {
            textscreen.setText(textscreen.text.toString() + '0')
        }



        var puzzleindex = intent.getIntExtra("puzzleindex", 0)
        level.setText("Level ${puzzleindex}")

        puzzles.setImageResource(levels[puzzleindex-1])

        clear.setOnClickListener {
            try {
                textscreen.setText(
                    textscreen.text.toString().substring(0, textscreen.text.toString().length - 1)
                )
            } catch (except: Exception) {
            }
        }

        submit.setOnClickListener {

            if (textscreen.text.toString().equals(answers[puzzleindex - 1])) {

                var intent = Intent(this@GamePage, WinningPage::class.java)
                HomePage.edit.putString("level${puzzleindex-1}",HomePage.complete)
                puzzleindex++
                HomePage.edit.putInt("levelboard", puzzleindex)
                HomePage.edit.apply()
                intent.putExtra("puzzleindex", puzzleindex)
                startActivity(intent)


            } else if (textscreen.text.toString().equals("")) {
                Toast.makeText(this@GamePage, "Please Enter Answer", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@GamePage, "Wrong", Toast.LENGTH_SHORT).show()
                textscreen.setText("")
            }
        }
        next.setOnClickListener {


            if(HomePage.sp.getString("level${puzzleindex-1}",HomePage.complete).equals(HomePage.lock)) {

                var intent = Intent(this@GamePage, this@GamePage::class.java)

                HomePage.edit.putString("level${puzzleindex - 1}", HomePage.skip)

                puzzleindex++
                HomePage.edit.putInt("levelboard",puzzleindex)
                HomePage.edit.apply()
                intent.putExtra("puzzleindex",puzzleindex)
                startActivity(intent)
            }

        }

    }
}