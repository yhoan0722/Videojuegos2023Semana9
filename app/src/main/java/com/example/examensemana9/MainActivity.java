package com.example.examensemana9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private TextView jugador1t;
    private TextView jugador2t;
    private TextView resultadot;
    private Button aleatoriob;
    private Button resetb;

    private Random random;
    private int number1;
    private int number2;




        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            jugador1t = findViewById(R.id.jugador1);
            jugador2t = findViewById(R.id.jugador2);
            resultadot = findViewById(R.id.resultado);
            aleatoriob = findViewById(R.id.aleatorio);
            resetb = findViewById(R.id.reset);

            random = new Random();

            aleatoriob.setOnClickListener(new View.OnClickListener() {



                @Override
                public void onClick(View v) {
                    number1 = random.nextInt(10);
                    number2 = random.nextInt(10);

                    jugador1t.setText(String.valueOf(number1));
                    jugador2t.setText(String.valueOf(number2));

                    compareNumbers(resultadot);
                }
            });

            resetb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    jugador1t.setText("");
                    jugador2t.setText("");
                    resultadot.setText("");
                }
            });
        }

        public void compareNumbers (View view){
            if (number1 > number2) {
                resultadot.setText("Jugador 1 gano");
            } else if (number1 < number2) {
                resultadot.setText("Jugador 2 gano");
            } else {
                resultadot.setText("Ambos jugadores son iguales");
            }

        }

}
