package com.prayan_it.nari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class proyojoniotoththo extends AppCompatActivity {
    ListView projoniyolv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyojoniotoththo);
        projoniyolv = (ListView)findViewById(R.id.listView3);

        final String[] pcs = {"তথ্য চিত্র","ডে কেয়ার সেন্টার", "অনলাইন কেনাকাটা", "সরকারী সুযোগ-সুবিধা",  "বর্জনীয়"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.bforebirth_layout,R.id.txtid,pcs);

        projoniyolv.setAdapter(adapter);
        projoniyolv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked on" + pcs[position], Toast.LENGTH_LONG).show();

                if (pcs[position]=="তথ্য চিত্র"){
                    Intent i = new Intent(proyojoniotoththo.this, toththochitro.class);
                    startActivity(i);
                }
                else  if(pcs[position]=="ডে কেয়ার সেন্টার"){
                    Intent i = new Intent(proyojoniotoththo.this,datCare.class);
                    startActivity(i);
                }
                else if(pcs[position]=="অনলাইন কেনাকাটা"){
                    Intent i = new Intent(proyojoniotoththo.this, onlineShopping.class);
                    startActivity(i);
                }
                else if(pcs[position]=="সরকারী সুযোগ-সুবিধা"){
                    Intent i = new Intent(proyojoniotoththo.this, Opportuniyty.class);
                    startActivity(i);
                }
                else if(pcs[position]=="বর্জনীয়"){
                    Intent i = new Intent(proyojoniotoththo.this, borjonio.class);
                    startActivity(i);

                }

            }




        });
    }
}
