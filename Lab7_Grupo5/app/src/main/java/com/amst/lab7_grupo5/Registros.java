package com.amst.lab7_grupo5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;

import java.util.Map;

public class Registros extends AppCompatActivity {

        public BarChart graficoBarras;
        private RequestQueue ListaRequest = null;
        private String token = "eyJ0eXAi...........................-mMIArvMc"; //Generar un token propio private
        LinearLayout contenedorTemperaturas;
        private Map<String, TextView> temperaturasTVs;
        private Map<String, TextView> fechasTVs;
        private Registros contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);
    }
}