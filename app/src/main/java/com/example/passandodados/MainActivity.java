package com.example.passandodados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editIdade;
    private EditText editAltura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.edit_Nome);
        editIdade = findViewById(R.id.edit_Idade);
        editAltura = findViewById(R.id.edit_Altura);

        findViewById(R.id.botaoEnviar).setOnClickListener(view -> {

            //coleta digitada
            String nome = editNome.getText().toString();
            int idade = Integer.parseInt(editIdade.getText().toString());
            double altura = Double.parseDouble(editAltura.getText().toString());

            //Envio dos dados.
            Intent intent = new Intent(this, SegundaActivity.class);
            intent.putExtra("meu_nome",nome);
            intent.putExtra("minha_idade",idade);
            intent.putExtra("minha_altura",altura);

            startActivity(intent);


        });
    }
}