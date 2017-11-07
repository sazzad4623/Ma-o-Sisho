package com.prayan_it.nari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AfterbirthActivity extends AppCompatActivity {
    ListView afterlv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterbirth);

        afterlv = (ListView)findViewById(R.id.listView1);

        final String[] pcs = {"খাদ্য ও পুষ্টি","মা ও শিশুর প্রয়োজনীয় টিকা", "মায়ের ব্যায়াম","শিশুর স্বাস্থ্য","সিজারকৃত মায়ের যত্ন", "শিশুদের সুন্দর নাম","শিশুর রাশি"};

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.afterbirth_layout,R.id.txtid1,pcs);

        afterlv.setAdapter(adapter);
        afterlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getApplicationContext(), "Clicked on" + pcs[position], Toast.LENGTH_LONG).show();

                if (pcs[position] == "খাদ্য ও পুষ্টি") {
                    Intent i = new Intent(AfterbirthActivity.this, afterKhaddo.class);
                    startActivity(i);
                } else if (pcs[position] == "মা ও শিশুর প্রয়োজনীয় টিকা") {
                    Intent i = new Intent(AfterbirthActivity.this, afterTika.class);
                    startActivity(i);
                } else if (pcs[position] == "মায়ের ব্যায়াম") {
                    Intent i = new Intent(AfterbirthActivity.this, afterbeyam.class);
                    startActivity(i);
                } else if (pcs[position] == "শিশুর স্বাস্থ্য") {
                    Intent i = new Intent(AfterbirthActivity.this, afterSasthoPorikhkha.class);
                    startActivity(i);
                } else if (pcs[position] == "শিশুদের সুন্দর নাম") {
                    Intent i = new Intent(AfterbirthActivity.this, sisurNam.class);
                    startActivity(i);

                } else if (pcs[position] == "শিশুর রাশি") {
                    Intent i = new Intent(AfterbirthActivity.this, sisurRasi.class);
                    startActivity(i);

                }
                 else if (pcs[position] == "সিজারকৃত মায়ের যত্ন") {
                Intent i = new Intent(AfterbirthActivity.this, SissorActivity.class);
                startActivity(i);

            }



            }


        });

    }
}
