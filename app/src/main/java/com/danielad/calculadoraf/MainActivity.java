package com.danielad.calculadoraf;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Mi calculadora

    private Button bBorrar, bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete, bOcho, bNueve, bCero, bPunto, bMas, bMenos, bPor, bEntre, bIgual;
    private TextView tResultado;
    private String unir="";
    private Double numuno=0.0, numdos=0.0, resultado=0.0;
    private int bandera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bBorrar = (Button) findViewById(R.id.bBorrar);
        bUno = (Button) findViewById(R.id.bUno);
        bDos = (Button) findViewById(R.id.bDos);
        bTres = (Button) findViewById(R.id.bTres);
        bCuatro = (Button) findViewById(R.id.bCuatro);
        bCinco = (Button) findViewById(R.id.bCinco);
        bSeis = (Button) findViewById(R.id.bSeis);
        bSiete = (Button) findViewById(R.id.bSiete);
        bOcho = (Button) findViewById(R.id.bOcho);
        bNueve = (Button) findViewById(R.id.bNueve);
        bCero = (Button) findViewById(R.id.bCero);
        bPunto = (Button) findViewById(R.id.bPunto);
        bMas = (Button) findViewById(R.id.bMas);
        bMenos = (Button) findViewById(R.id.bMenos);
        bPor = (Button) findViewById(R.id.bPor);
        bEntre = (Button) findViewById(R.id.bEntre);
        bIgual = (Button) findViewById(R.id.bIgual);
        tResultado = (TextView) findViewById(R.id.tResultado);

        bUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="1";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });
        bDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="2";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });
        bTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="3";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });
        bCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="4";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });
        bCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="5";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });
        bSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="6";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });
        bSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="7";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });
        bOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="8";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });
        bNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="9";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });
        bCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+="0";
                tResultado.setText(unir);
                bMas.setEnabled(true);
                bPor.setEnabled(true);
                bEntre.setEnabled(true);
                bIgual.setEnabled(true);
                bMenos.setEnabled(true);
            }
        });

        bPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unir+=".";
                tResultado.setText(unir);
                bPunto.setEnabled(false);
            }
        });

        bBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(unir.length()!=0){
                    tResultado.setText(unir.substring(0, unir.length()-1));
                    unir=unir.substring(0, unir.length()-1);
                }
            }
        });

        bBorrar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                tResultado.setText("0");
                unir="";
                numuno=0.0;
                numdos=0.0;
                return false;
            }
        });

        bMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (numuno==0.0){
                    numuno = Double.parseDouble(unir);
                    unir = "";
                    bandera= 1;
                }else {
                    numuno+=Double.parseDouble(unir);
                    unir="";
                    bandera=1;
                }
                bMenos.setEnabled(false);
                bMas.setEnabled(false);
                bPor.setEnabled(false);
                bEntre.setEnabled(false);
                bIgual.setEnabled(false);
                bPunto.setEnabled(true);
            }
        });
        bMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (unir.equals("")){
                    unir+="-";
                    tResultado.setText(unir);
                }else {
                    if (numuno==0.0){
                        numuno = Double.parseDouble(unir);
                        unir = "";
                        bandera= 2;

                    }else {
                        numuno= numuno - Double.parseDouble(unir);
                        unir="";
                        bandera=2;

                    }


                }
                bMenos.setEnabled(false);
                bMas.setEnabled(false);
                bPor.setEnabled(false);
                bEntre.setEnabled(false);
                bIgual.setEnabled(false);
                bPunto.setEnabled(true);

            }
        });

        bPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (numuno==0.0){
                    numuno = Double.parseDouble(unir);
                    unir = "";
                    bandera= 3;

                }else{
                    numuno = numuno * Double.parseDouble(unir);
                    unir="";
                    bandera=3;

                }
                bMenos.setEnabled(false);
                bMas.setEnabled(false);
                bPor.setEnabled(false);
                bEntre.setEnabled(false);
                bIgual.setEnabled(false);
                bPunto.setEnabled(true);
            }
        });
        bEntre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (numuno==0.0){
                    numuno = Double.parseDouble(unir);
                    unir = "";
                    bandera= 4;

                }else{
                    numuno = numuno / Double.parseDouble(unir);
                    unir="";
                    bandera=4;

                }

                bMenos.setEnabled(false);
                bMas.setEnabled(false);
                bPor.setEnabled(false);
                bEntre.setEnabled(false);
                bIgual.setEnabled(false);
                bPunto.setEnabled(true);
            }
        });
        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numdos = Double.parseDouble(unir);
                if (numuno==0.0){
                    if (bandera==2){
                        numdos=-numdos;
                        tResultado.setText(numdos.toString());
                    }
                    if (bandera==4){
                        tResultado.setText("0");
                    }
                    else{
                        tResultado.setText(numdos.toString());
                    }

                    numuno = 0.0;
                    numdos = 0.0;
                    unir = "";
                    bMas.setEnabled(false);
                    bPor.setEnabled(false);
                    bEntre.setEnabled(false);
                    bIgual.setEnabled(false);
                    bPunto.setEnabled(true);
                    bandera=0;
                }else {
                    if (bandera == 1) {
                        resultado = numuno + numdos;
                        tResultado.setText(resultado.toString());
                        numuno = 0.0;
                        numdos = 0.0;
                        unir = "";
                        bMas.setEnabled(false);
                        bPor.setEnabled(false);
                        bEntre.setEnabled(false);
                        bIgual.setEnabled(false);
                        bandera=0;
                    }
                    if (bandera == 2) {
                        resultado = numuno - numdos;
                        tResultado.setText(resultado.toString());
                        numuno = 0.0;
                        numdos = 0.0;
                        unir = "";
                        bMas.setEnabled(false);
                        bPor.setEnabled(false);
                        bEntre.setEnabled(false);
                        bIgual.setEnabled(false);
                        bandera=0;

                    }
                    if (bandera == 3) {
                        resultado = numuno * numdos;
                        tResultado.setText(resultado.toString());
                        numuno = 0.0;
                        numdos = 0.0;
                        unir = "";
                        bMas.setEnabled(false);
                        bPor.setEnabled(false);
                        bEntre.setEnabled(false);
                        bIgual.setEnabled(false);
                        bandera=0;
                    }
                    if (bandera == 4) {
                        resultado = numuno / numdos;
                        tResultado.setText(resultado.toString());
                        unir = "";
                        numuno = 0.0;
                        numdos = 0.0;
                        bMas.setEnabled(false);
                        bPor.setEnabled(false);
                        bEntre.setEnabled(false);
                        bIgual.setEnabled(false);
                        bandera=0;
                    }
                }
            }
        });

    }
}

