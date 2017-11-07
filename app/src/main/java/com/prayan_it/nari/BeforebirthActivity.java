package com.prayan_it.nari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BeforebirthActivity extends AppCompatActivity {
    ListView beforelv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beforebirth);

        beforelv = (ListView)findViewById(R.id.listView);

        final String[] pcs = {"খাদ্য ও পুষ্টি","প্রয়োজনীয় টিকা", "গর্ভকালীন জটিলতা", "ব্যায়াম",  "প্রয়োজনীয় তথ্য", "জরুরী যোগাযোগ",""};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.bforebirth_layout,R.id.txtid,pcs);

        beforelv.setAdapter(adapter);
        beforelv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked on" + pcs[position], Toast.LENGTH_LONG).show();

                if (pcs[position]=="প্রয়োজনীয় টিকা"){
                    Intent i = new Intent(BeforebirthActivity.this, TikaActivity.class);
                    startActivity(i);
                }
                else  if(pcs[position]=="খাদ্য ও পুষ্টি"){
                    Intent i = new Intent(BeforebirthActivity.this,KhaddhoActivity.class);
                    startActivity(i);
                }
                else if(pcs[position]=="ব্যায়াম"){
                    Intent i = new Intent(BeforebirthActivity.this, BiyamActivity.class);
                    startActivity(i);
                }
                else if(pcs[position]=="গর্ভকালীন জটিলতা"){
                    Intent i = new Intent(BeforebirthActivity.this, GorvokalinActivity.class);
                    startActivity(i);
                }
                else if(pcs[position]=="প্রয়োজনীয় তথ্য"){
                    Intent i = new Intent(BeforebirthActivity.this, proyojoniotoththo.class);
                    startActivity(i);

                }

                else if(pcs[position]=="জরুরী যোগাযোগ"){
                    Intent i = new Intent(BeforebirthActivity.this, JogajogActivity.class);
                    startActivity(i);

                }

            }




        });

    }
}
