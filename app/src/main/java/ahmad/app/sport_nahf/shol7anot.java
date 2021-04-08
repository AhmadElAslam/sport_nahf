package ahmad.app.sport_nahf;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class shol7anot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aliptekal);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList shol7an =new ArrayList();

        shol7an.add("");
        shol7an.add("DOUBLE FIS E1 children               ₪ 849");
        shol7an.add("PHOENIX-301                          ₪ 1,349");
        shol7an.add("PHOENIX-203                          ₪ 1,899");
        shol7an.add("SMC OUTDOOR                          ₪ 1,999");
        shol7an.add("ALL WEATHER                          ₪ 2,249");
        shol7an.add("PHOINEX-203C                         ₪ 2,299");
        shol7an.add("RAINBOW OUTDOOR                      ₪ 2,599");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,shol7an);

        myListView.setAdapter(arrayAdapter);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i) {
                    case 1:
                        Intent intent1 = new Intent(shol7anot.this, fise1.class);
                        startActivity(intent1);
                        return;
                    case 2:
                        Intent intent2 = new Intent(shol7anot.this, a301.class);
                        startActivity(intent2);
                        return;

                    case 3:
                        Intent intent3 = new Intent(shol7anot.this, a203.class);
                        startActivity(intent3);
                        return;

                    case 4:
                        Intent intent4 = new Intent(shol7anot.this, smc.class);
                        startActivity(intent4);
                        return;

                    case 5:
                        Intent intent5 = new Intent(shol7anot.this, allweather.class);
                        startActivity(intent5);
                        return;

                    case 6:
                        Intent intent6 = new Intent(shol7anot.this, a203c.class);
                        startActivity(intent6);
                        return;

                    case 7:
                        Intent intent7 = new Intent(shol7anot.this, rainbow.class);
                        startActivity(intent7);
                        return;
                }
            }
        });
    }
}