package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var number: Int = 0
    var op: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.but0.setOnClickListener {
            binding.result.text =  binding.result.text.toString() + "0"
        }






        binding.but1.setOnClickListener {
            binding.result.text =  binding.result.text.toString() + "1"
        }






        binding.but2.setOnClickListener {
            binding.result.text = binding.result.text.toString() + "2"
        }

        binding.but3.setOnClickListener {
            binding.result.text =  binding.result.text.toString() + "3"
        }

        binding.but4.setOnClickListener {
            binding.result.text = binding.result.text.toString() + "4"
        }

        binding.but5.setOnClickListener {
            binding.result.text =  binding.result.text.toString() + "5"
        }

        binding.but6.setOnClickListener {
            binding.result.text = binding.result.text.toString() + "6"
        }
            binding.but7.setOnClickListener {
                binding.result.text =  binding.result.text.toString() + "7"
            }

            binding.but8.setOnClickListener {
                binding.result.text =  binding.result.text.toString() + "8"
            }
            binding.but9.setOnClickListener {
                binding.result.text =  binding.result.text.toString() + "9"
            }
            binding.but0.setOnClickListener {
                binding.result.text = binding.result.text.toString() + "0"
            }


            binding.plus.setOnClickListener {
                number = (binding.result.text).toString().toInt()
                op = "+"
                binding.result.text = ""
            }



            binding.butdivider.setOnClickListener {
                number = (binding.result.text).toString().toInt()
                op = "-"
                binding.result.text = "0"
            }
            binding.x.setOnClickListener {
                binding.result.text = "0"


            }
            binding.n.setOnClickListener {
                number = (binding.result.text).toString().toInt()
                op = "/"
                binding.result.text = "0"
            }
        binding.AC.setOnClickListener {
            number = 0
            binding.result.text = ""
        }
        binding.eq.setOnClickListener {
            when(op) {
                "+" -> binding.result.text =
                    (number + binding.result.text.toString().toInt()).toString()

                "-" -> binding.result.text =
                    (number - binding.result.text.toString().toInt()).toString()

                "*" -> binding.result.text =
                    (number * binding.result.text.toString().toInt()).toString()

                "/" -> binding.result.text =
                    (number / binding.result.text.toString().toInt()).toString()


            }}




        }

}