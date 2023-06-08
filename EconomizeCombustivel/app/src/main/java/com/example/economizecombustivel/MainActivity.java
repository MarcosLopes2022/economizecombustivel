package com.example.economizecombustivel;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private EditText editPrecoGas;
    private EditText editPrecoEta;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPrecoGas = findViewById(R.id.editPrecoGasolina);
        editPrecoEta = findViewById(R.id.editPrecoEtanol);
        textResult = findViewById(R.id.textResultado);
    }
    public void calcularResultado(View view){
        Double precoGasolina = Double.parseDouble(editPrecoGas.getText().toString());
        Double precoEtanol = Double.parseDouble(editPrecoEta.getText().toString());
        Double resultado = precoEtanol/precoGasolina;

        if ( resultado >= 0.7 ){
            textResult.setText("=== Abasteça com GASOLINA ===");
        }else {
            textResult.setText("=== Abasteça com ETANOL ===");
        }
    }
    public void limpar(View view){
        editPrecoGas.setText("");
        editPrecoEta.setText("");
        textResult.setText("Resultado");
        editPrecoGas.requestFocus();
    }
}

