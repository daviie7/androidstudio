package com.example.frasesnerds;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
            "Que a Força esteja com você!",
            "Na minha máquina o código funcionava perfeitamente...",
            "Eu nunca volto atrás na minha palavra, porque esse é o meu jeito ninja!"
        };
        int numero = new Random().nextInt(3);
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText(frases[numero]);
    }
}
