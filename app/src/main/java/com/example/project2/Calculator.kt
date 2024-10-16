package com.example.project2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Calculator : AppCompatActivity() {

    private var firstNumber: Double = 0.0
    private var secondNumber: Double = 0.0
    private var operator: String = ""
    private var isOperatorPressed: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)

        val txtvw = findViewById<TextView>(R.id.textView2)

        // Number buttons
        val numberButtons = arrayOf(
            findViewById<Button>(R.id.button5), // 1
            findViewById<Button>(R.id.button6), // 2
            findViewById<Button>(R.id.button7), // 3
            findViewById<Button>(R.id.button9), // 4
            findViewById<Button>(R.id.button10), // 5
            findViewById<Button>(R.id.button11), // 6
            findViewById<Button>(R.id.button13), // 7
            findViewById<Button>(R.id.button14), // 8
            findViewById<Button>(R.id.button15), // 9
            findViewById<Button>(R.id.button18)  // 0
        )

        // Operator buttons
        val addButton = findViewById<Button>(R.id.button8)
        val subtractButton = findViewById<Button>(R.id.button12)
        val multiplyButton = findViewById<Button>(R.id.button16)
        val divisonButton = findViewById<Button>(R.id.button19)
        val equalsButton = findViewById<Button>(R.id.button20)

        // Set number button listeners
        for (button in numberButtons) {
            button.setOnClickListener {
                val number = (it as Button).text.toString()
                if (isOperatorPressed) {
                    txtvw.text = number
                    isOperatorPressed = false
                } else {
                    txtvw.append(number)
                }
            }
        }

        // Operator button listeners
        addButton.setOnClickListener { handleOperator("+", txtvw) }
        subtractButton.setOnClickListener { handleOperator("-", txtvw) }
        multiplyButton.setOnClickListener { handleOperator("*", txtvw) }
        divisonButton.setOnClickListener { handleOperator("/", txtvw) }

        // Equals button listener
        equalsButton.setOnClickListener {
            secondNumber = txtvw.text.toString().toDouble()
            val result = when (operator) {
                "+" -> firstNumber + secondNumber
                "-" -> firstNumber - secondNumber
                "*" -> firstNumber * secondNumber
                "/" -> if (secondNumber != 0.0) firstNumber / secondNumber else "Error"
                else -> 0.0
            }
            txtvw.text = result.toString()
        }

    }

    private fun handleOperator(op: String, txtvw: TextView) {
        firstNumber = txtvw.text.toString().toDouble()
        operator = op
        isOperatorPressed = true
    }
}
