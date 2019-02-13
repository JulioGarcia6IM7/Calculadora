package com.example.julio.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    double no1 = 0;
    double no2 = 0;
    int opera = 0;
    public void Uno(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "1";
        vi.setText(numero);
    }

    public void Dos(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "2";
        vi.setText(numero);
    }

    public void Tres(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "3";
        vi.setText(numero);
    }

    public void Cuatro(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "4";
        vi.setText(numero);
    }

    public void Cinco(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "5";
        vi.setText(numero);
    }

    public void Seis(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "6";
        vi.setText(numero);
    }

    public void Siete(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "7";
        vi.setText(numero);
    }

    public void Ocho(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "8";
        vi.setText(numero);
    }

    public void Nueve(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "9";
        vi.setText(numero);
    }

    public void Cero(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += "0";
        vi.setText(numero);
    }
    public void Punto(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        numero += ".";
        vi.setText(numero);
    }

    public void Borrar(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String numero = (String) vi.getText();
        int x = numero.length();
        if(x == 0){

        }
        else{
            numero = numero.substring(0,x-1);
        }
        vi.setText(numero);
    }

    private void obtenN(String numeroF){
        if(opera == 0 && !numeroF.equals("")){
            no1 = Double.parseDouble(numeroF);
        }
        else{
            if(!numeroF.equals("")) {
                no2 = Double.parseDouble(numeroF);
            }
            else{

            }
        }
    }

    public void suma(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String n = (String) vi.getText();
        obtenN(n);
        vi.setText("");
        opera = 1;
    }

    public void resta(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String n = (String) vi.getText();
        obtenN(n);
        vi.setText("");
        opera = 2;
    }

    public void multiplica(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String n = (String) vi.getText();
        obtenN(n);
        vi.setText("");
        opera = 3;
    }

    public void divide(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        String n = (String) vi.getText();
        obtenN(n);
        vi.setText("");
        opera = 4;
    }

    public void Limpia(View VISTA){
        no1 = 0;
        no2 = 0;
        opera = 0;
        TextView vi = findViewById(R.id.resultado);
        vi.setText("");
    }

    public void igual(View VISTA){
        TextView vi = findViewById(R.id.resultado);
        obtenN((String) vi.getText());
        if(opera == 0){

        }
        else {
            if (opera == 1) {
                no1 += no2;
                opera = 0;
            } else {
                if (opera == 2) {
                    no1 -= no2;
                    opera = 0;
                } else {
                    if (opera == 3) {
                        no1 *= no2;
                        opera = 0;
                    } else {
                        if (opera == 4) {
                            no1 /= no2;
                            opera = 0;
                        }
                    }
                }
            }
            vi.setText(String.valueOf(no1));
        }
    }
}
