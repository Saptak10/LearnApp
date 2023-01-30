package com.example.learnapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        TextView txtHello = findViewById(R.id.txtMessage);
//        Button btnHello = findViewById(R.id.btnHello);
//        EditText editText = findViewById(R.id.editTxt);
//
//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String newTxt;
//                newTxt=editText.getText().toString();
//
////                if(txtHello.getText() == "Saptak calling Rini!") txtHello.setText("Rini calling Saptak!");
////                else txtHello.setText("Saptak calling Rini!");
//                txtHello.setText(newTxt);
//            }
//        }
//        );

        val txtHello = findViewById<TextView>(R.id.txtMessage)
        val btnHello = findViewById<Button>(R.id.btnHello)
        val editText = findViewById<EditText>(R.id.editTxt)

        var newTxt: String

        newTxt = ""

        btnHello.setOnClickListener {
            newTxt = editText.text.toString()

//            if(txtHello.text == "Saptak calling Rini!") txtHello.text = "Rini calling Saptak!";
//            else txtHello.text = "Saptak calling Rini!";
            if (newTxt == "") {
//                txtHello.text = ""
                    Toast.makeText(
                        this,
                        "Doya kore kichu akta lekh, paye porchi",
                    Toast.LENGTH_LONG
                ).show()
//                btnHello.visibility = INVISIBLE
            }else {
                txtHello.text = "The message is : $newTxt"
                editText.text.clear()
            }
        }

        val changePage = findViewById<Button>(R.id.changePageBtn)

        changePage.setOnClickListener {
            val intent = Intent(this, IntentPage2::class.java)
            intent.putExtra("TEXT", newTxt)
            startActivity(intent)
        }
//        class obj=new class
//        val obj=class()

    }
}