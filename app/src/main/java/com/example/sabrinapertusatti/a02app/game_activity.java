package com.example.sabrinapertusatti.a02app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class game_activity extends AppCompatActivity {
    Integer contador = 0;
    Integer estadoH=0, estadoLi = 0, estadoNa = 0, estadoK = 0, estadoRb = 0, estadoCs = 0, estadoFr = 0,estadoBe = 0, estadoMg = 0,estadoCa = 0, estadoSr = 0, estadoBa = 0, estadoRa = 0;
    Integer simbH = 0,simbLi = 0,simbNa = 0,simbK = 0,simbRb = 0,simbCs = 0,simbFr = 0, simbBe = 0,simbMg = 0,simbCa = 0, simbSr = 0,simbBa = 0,simbRa=0;
    TextView respuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activityl);


        Button btnH = (Button) findViewById(R.id.btnH);
        Button btnLi = (Button) findViewById(R.id.btnLi);
        Button btnNa = (Button) findViewById(R.id.btnNa);
        Button btnK = (Button) findViewById(R.id.btnK);
        Button btnRb = (Button) findViewById(R.id.btnRb);
        Button btnCs = (Button) findViewById(R.id.btnCs);
        Button btnFr = (Button) findViewById(R.id.btnFr);
        Button btnBe = (Button) findViewById(R.id.btnBe);
        Button btnMg = (Button) findViewById(R.id.btnMg);
        Button btnCa = (Button) findViewById(R.id.btnCa);
        Button btnSr = (Button) findViewById(R.id.btnSr);
        Button btnBa = (Button) findViewById(R.id.btnBa);
        Button btnRa = (Button) findViewById(R.id.btnRa);
        Button btnHome = (Button) findViewById(R.id.back);
        Button sli = (Button) findViewById(R.id.li);
        Button sNa = (Button) findViewById(R.id.Na);
        Button sK = (Button) findViewById(R.id.K);
        Button sRb = (Button) findViewById(R.id.Rb);
        Button sCs = (Button) findViewById(R.id.Cs);
        Button sFr = (Button) findViewById(R.id.Fr);
        Button sBe = (Button) findViewById(R.id.Be);
        Button sMg = (Button) findViewById(R.id.Mg);
        Button sCa = (Button) findViewById(R.id.Ca);
        Button sSr = (Button) findViewById(R.id.Sr);
        Button sBa = (Button) findViewById(R.id.Ba);
        Button sRa = (Button) findViewById(R.id.Ra);
        Button sH = (Button) findViewById(R.id.H);

        btnHome.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intencio = new Intent(getApplicationContext(), ActivityPrincipal.class);
                startActivity(intencio);
            }
        });
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoH = estado(estadoH);
                resultado(estadoH,simbH);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoH=0;
                    simbH=0;
                    contador = 0;
                }

            }
        });

        sH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbH = estado(simbH);
                resultado(estadoH, simbH);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoH=0;
                    simbH=0;
                    contador = 0;
                }
            }
        });

        btnLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoLi = estado(estadoLi);
                resultado(estadoLi,simbLi);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoLi=0;
                    simbLi=0;
                    contador = 0;
                }

            }
        });

        sli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbLi = estado(simbLi);
                resultado(estadoLi, simbLi);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoLi=0;
                    simbLi=0;
                    contador = 0;
                }
            }
        });

        btnNa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoNa = estado(estadoNa);
                resultado(estadoNa,simbNa);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoNa=0;
                    simbNa=0;
                    contador = 0;
                }

            }
        });

        sNa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbNa = estado(simbNa);
                resultado(estadoNa, simbNa);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoNa=0;
                    simbNa=0;
                    contador = 0;
                }
            }
        });

        btnK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoK = estado(estadoK);
                resultado(estadoK,simbK);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoK=0;
                    simbK=0;
                    contador = 0;
                }

            }
        });

        sK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbK = estado(simbK);
                resultado(estadoK, simbK);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoK=0;
                    simbK=0;
                    contador = 0;
                }
            }
        });

        btnRb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoRb = estado(estadoRb);
                resultado(estadoRb,simbRb);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoRb=0;
                    simbRb=0;
                    contador = 0;
                }

            }
        });

        sRb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbRb = estado(simbRb);
                resultado(estadoRb, simbRb);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoRb=0;
                    simbRb=0;
                    contador = 0;
                }
            }
        });

        btnCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoCs = estado(estadoCs);
                resultado(estadoCs,simbCs);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoCs=0;
                    simbCs=0;
                    contador = 0;
                }

            }
        });

        sCs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbCs = estado(simbCs);
                resultado(estadoCs, simbCs);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoCs=0;
                    simbCs=0;
                    contador = 0;
                }
            }
        });

        btnFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoFr = estado(estadoFr);
                resultado(estadoFr,simbFr);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoFr=0;
                    simbFr=0;
                    contador = 0;
                }

            }
        });

        sFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbFr = estado(simbFr);
                resultado(estadoFr, simbFr);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoFr=0;
                    simbFr=0;
                    contador = 0;
                }
            }
        });

        btnBe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoBe = estado(estadoBe);
                resultado(estadoBe,simbBe);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoBe=0;
                    simbBe=0;
                    contador = 0;
                }

            }
        });

        sBe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbBe = estado(simbBe);
                resultado(estadoBe, simbBe);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoBe=0;
                    simbBe=0;
                    contador = 0;
                }
            }
        });

        btnMg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoMg = estado(estadoMg);
                resultado(estadoMg,simbMg);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoMg=0;
                    simbMg=0;
                    contador = 0;
                }

            }
        });

        sMg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbMg = estado(simbMg);
                resultado(estadoMg, simbMg);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoMg=0;
                    simbMg=0;
                    contador = 0;
                }
            }
        });

        btnCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoCa = estado(estadoCa);
                resultado(estadoCa,simbCa);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoCa=0;
                    simbCa=0;
                    contador = 0;
                }

            }
        });

        sCa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbCa = estado(simbCa);
                resultado(estadoCa, simbCa);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoCa=0;
                    simbCa=0;
                    contador = 0;
                }
            }
        });

        btnSr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoSr = estado(estadoSr);
                resultado(estadoSr,simbSr);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoSr=0;
                    simbSr=0;
                    contador = 0;
                }

            }
        });

        sSr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbSr = estado(simbSr);
                resultado(estadoSr, simbSr);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoSr=0;
                    simbSr=0;
                    contador = 0;
                }
            }
        });

        btnBa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoBa = estado(estadoBa);
                resultado(estadoBa,simbBa);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoBa=0;
                    simbBa=0;
                    contador = 0;
                }

            }
        });

        sBa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbBa = estado(simbBa);
                resultado(estadoBa, simbBa);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoBa=0;
                    simbBa=0;
                    contador = 0;
                }
            }
        });

        btnRa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estadoRa = estado(estadoRa);
                resultado(estadoRa,simbRa);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoRa=0;
                    simbRa=0;
                    contador = 0;
                }

            }
        });

        sRa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simbRa = estado(simbRa);
                resultado(estadoRa, simbRa);
                if (contador==1){
                    frase();
                }
                if (contador==2){
                    estadoRa=0;
                    simbRa=0;
                    contador = 0;
                }
            }
        });
    }

    private Integer estado(Integer nombre){

        if (contador<3) {
            contador = contador +1;
            nombre = 1;
        }
        return nombre;
    }

    private void frase (){
        respuesta = (TextView)findViewById(R.id.textView7);

        respuesta.setText("Haz otra seleccion");

    }
    private void resultado(Integer buttonE, Integer buttonS){
    respuesta = (TextView)findViewById(R.id.textView7);
        if(contador == 2) {
            if (buttonE == 1 && buttonS == 1) {
                respuesta.setText("Correcto!");

            } else {
                respuesta.setText("Incorrecto!, Vuelva a intentarlo");
            }
        }

    }
}