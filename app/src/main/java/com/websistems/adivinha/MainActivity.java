package com.websistems.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtNumero;
    private Button btnJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero = findViewById(R.id.txtNumero);
        findViewById(R.id.btnJogar).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Random random = new Random();

        int numero = random.nextInt(10);

        txtNumero.setText("Número sorteado: " + numero);
    }
}
