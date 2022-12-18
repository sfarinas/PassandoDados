package com.example.passandodados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView text_nome;
    private TextView text_idade;
    private TextView text_altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        text_nome = findViewById(R.id.textNome);
        text_idade = findViewById(R.id.textIdade);
        text_altura = findViewById(R.id.textAltura);

        String nome = (String) getIntent().getSerializableExtra("meu_nome");
        int idade = (Integer) getIntent().getSerializableExtra("minha_idade");
        double altura = (Double) getIntent().getSerializableExtra("minha_altura");

        text_nome.setText(nome);
        text_idade.setText(String.valueOf(idade));
        text_altura.setText(String.valueOf(altura));
    }
}