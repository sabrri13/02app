package com.example.sabrinapertusatti.a02app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityPrincipal extends AppCompatActivity {
    EditText txtNom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

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

        Button btnPlay = (Button) findViewById(R.id.btnPlay);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencio = new Intent(getApplicationContext(), game_activity.class);
                startActivity(intencio);
            }
        });{

        }
        btnH.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Hidrógeno");
                b.putString("Nsn", "Hidrógeno, H, 1");
                b.putString("Sq", "No metales");
                b.putString("Gpb", "1, 1, s");
                b.putString("Ma", "1,00794 u");
                b.putString("Ce", "1s^1");
                b.putString("EN", "1");
                b.putString("Link", "https://es.wikipedia.org/wiki/Hidr%C3%B3geno");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
        });

        btnLi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Litio");
                b.putString("Nsn", "Litio, Li, 3");
                b.putString("Sq", "Metales alcalinos");
                b.putString("Gpb", "1, 2, s");
                b.putString("Ma", "6,94174064 u");
                b.putString("Ce", "[He]2s^1");
                b.putString("EN", "2,1");
                b.putString("Link", "https://es.wikipedia.org/wiki/Litio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnNa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Sodio");
                b.putString("Nsn", "Sodio, Na, 11");
                b.putString("Sq", "Metales alcalinos");
                b.putString("Gpb", "1, 3, s");
                b.putString("Ma", "22,98976920(2)u");
                b.putString("Ce", "[NE]3s^1");
                b.putString("EN", "2,8,1");
                b.putString("Link", "https://es.wikipedia.org/wiki/Sodio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnK.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Potasio");
                b.putString("Nsn", "Potasio, K, 19");
                b.putString("Sq", "Metales alcalinos");
                b.putString("Gpb", "1, 4, s");
                b.putString("Ma", "39,0983 u");
                b.putString("Ce", "[Ar]4s^1");
                b.putString("EN", "2,8,8,1");
                b.putString("Link", "https://es.wikipedia.org/wiki/Potasio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnRb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Rubidio");
                b.putString("Nsn", "Rubidio, Rb, 37");
                b.putString("Sq", "Metales alcalinos");
                b.putString("Gpb", "1,5,s");
                b.putString("Ma", "85,4678 u");
                b.putString("Ce", "[Kr]5s^1");
                b.putString("EN", "2,8,18,8,1");
                b.putString("Link", "https://es.wikipedia.org/wiki/Rubidio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnCs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Cesio");
                b.putString("Nsn", "Cesio, Cs, 55");
                b.putString("Sq", "Metales alcalinos");
                b.putString("Gpb", "1,6,s");
                b.putString("Ma", "132,90545 u");
                b.putString("Ce", "[Xe]6s^1");
                b.putString("EN", "2,8,18,18,8,1");
                b.putString("Link", "https://es.wikipedia.org/wiki/Cesio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnFr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Francio");
                b.putString("Nsn", "Francio, Fr, 87");
                b.putString("Sq", "Metales alcalinos");
                b.putString("Gpb", "1,7,s");
                b.putString("Ma", "223 u");
                b.putString("Ce", "[Rn]7s^1");
                b.putString("EN", "2,8,18,32,18,8,1");
                b.putString("Link", "https://es.wikipedia.org/wiki/Francio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnBe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Berilio");
                b.putString("Nsn", "Berilio, Be, 4");
                b.putString("Sq", "Metales alcalinotérreos");
                b.putString("Gpb", "2,2,s");
                b.putString("Ma", "9.0122 u");
                b.putString("Ce", "[He]2s^2");
                b.putString("EN", "2,2");
                b.putString("Link", "https://es.wikipedia.org/wiki/Berilio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnMg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Magnesio");
                b.putString("Nsn", "Magnesio, Mg, 12");
                b.putString("Sq", "Metales alcalinotérreos");
                b.putString("Gpb", "2,3 s");
                b.putString("Ma", "24,31 u");
                b.putString("Ce", "[Ne]3s^2");
                b.putString("EN", "2,8,2");
                b.putString("Link", "https://es.wikipedia.org/wiki/Magnesio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnCa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Calcio");
                b.putString("Nsn", "Calcio, Ca, 20");
                b.putString("Sq", "Metales alcalinotérreos");
                b.putString("Gpb", "2,4,s");
                b.putString("Ma", "40,078 u");
                b.putString("Ce", "[Ar]4s^2");
                b.putString("EN", "2,8,8,2");
                b.putString("Link", "https://es.wikipedia.org/wiki/Calcio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnSr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Estroncio");
                b.putString("Nsn", "Estroncio, Sr, 38");
                b.putString("Sq", "Metales alcalinotérreos");
                b.putString("Gpb", "2,5,s");
                b.putString("Ma", "87,62 u");
                b.putString("Ce", "[Kr]5s^2");
                b.putString("EN", "2,8,18,8,2");
                b.putString("Link", "https://es.wikipedia.org/wiki/Estroncio");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnBa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Bario");
                b.putString("Nsn", "Bario, Ba, 56");
                b.putString("Sq", "Metales alcalinotérreos");
                b.putString("Gpb", "2,6,s");
                b.putString("Ma", "137,327 u");
                b.putString("Ce", "[Xe]6s^2");
                b.putString("EN", "2,8,18,18,8,2");
                b.putString("Link", "https://es.wikipedia.org/wiki/Bario");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

        btnRa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("nom", "Radio");
                b.putString("Nsn", "Radio, Ra, 88");
                b.putString("Sq", "Metales alcalinotérreos");
                b.putString("Gpb", "2,7,s");
                b.putString("Ma", "226,0254 u");
                b.putString("Ce", "[Rn]7s^2");
                b.putString("EN", "2,8,18,32,18,8,2");
                b.putString("Link", "https://es.wikipedia.org/wiki/Radio_(elemento)");

                Intent intencioA = new Intent(ActivityPrincipal.this, segona_activity.class);
                intencioA.putExtras(b);//el que s'enviarà sera un container
                startActivity(intencioA);


                //Origen            Desti
            }

            public void OnClick(View arg0) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Toast por defecto", Toast.LENGTH_SHORT);

                toast1.show();
            }
            public void premerBoto (View v){
                // hay que agregar el metodo al boton
                Intent intencio = new Intent(ActivityPrincipal.this, segona_activity.class);
                startActivity(intencio);
            }
        });

    }
}
