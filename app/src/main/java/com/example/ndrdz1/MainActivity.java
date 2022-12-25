package com.example.ndrdz1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btnSecondActivity;
    EditText editText;
    String text1 = "WhatsApp";
    String text2 = "YouTube";
    String text3 = "Google";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSecondActivity = findViewById(R.id.btn_to_second_activity);
        editText = findViewById(R.id.edit_text);

        btnSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString().trim();
                if (text.isEmpty()) {
                    editText.setError("Заполните поле!");
                }
//                 else if (!editText.equals(text1) && !editText.equals(text2) && !editText.equals(text3)){
//                     editText.setError("Не правильный ввод текста");
//                 }
                else{
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                        intent.putExtra("text", text);
                        startActivity(intent);
                }
//                if (!editText.equals(text1)) {
//                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                } else if (!editText.equals(text2)) {
//                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                    startActivity(intent);
//                } else if  (!editText.equals(text3)) {
//                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                    intent.putExtra("text", text);
//                    startActivity(intent);
            }
        });
    }
}
