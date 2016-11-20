package com.example.sabrinapertusatti.a02app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class segona_activity extends AppCompatActivity {
    String link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.segona_activityl);

        TextView lblv0 = (TextView) findViewById(R.id.lblval0);
        TextView lblv1 = (TextView) findViewById(R.id.lblval1);
        TextView lblv2 = (TextView) findViewById(R.id.lblval2);
        TextView lblv3 = (TextView) findViewById(R.id.lblval3);
        TextView lblv4 = (TextView) findViewById(R.id.lblval4);
        TextView lblv5 = (TextView) findViewById(R.id.lblval5);
        TextView lblv6 = (TextView) findViewById(R.id.lblval6);

        Bundle b = getIntent().getExtras();
        lblv0.setText(b.getString("nom"));

        lblv1.setText(b.getString("Nsn"));

        lblv2.setText(b.getString("Sq"));

        lblv3.setText(b.getString("Gpb"));

        lblv4.setText(b.getString("Ma"));

        lblv5.setText(b.getString("Ce"));

        lblv6.setText(b.getString("EN"));

        link = b.getString("Link");


        final Button btnWiki = (Button) findViewById(R.id.btnWiki);

        btnWiki.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                btnWiki.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        //creamos el objeto intent y le decomos la URL a la que queremos ir
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(link));

                        //iniciamos el Intent
                        startActivity(i);

                    }
                });

            }

        });
    }
}