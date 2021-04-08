package ahmad.app.sport_nahf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class multitrainer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multitrainer);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList multitrainer =new ArrayList();

        multitrainer.add("COBRA                  ₪ 2,099");
        multitrainer.add("TIGER                   ₪ 2,199");
        multitrainer.add("CONAN PRO                   ₪ 2,999");
        multitrainer.add("Grizzley                    ₪ 3,999");
        multitrainer.add("PR1000                     ₪ 4,999");
        multitrainer.add("York 9101                  ₪ 5,699");
        multitrainer.add("WB-LS-Y                     ₪ 7,899");
        multitrainer.add("EXM-2000                   ₪ 8,999");
        multitrainer.add("WB-MS-Y                    ₪ 11,899");
        multitrainer.add("F-500                      ₪ 11,899");
        multitrainer.add("Combo                      ₪ 13,949");
        multitrainer.add("SGS-348Q                   ₪ 15,249");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,multitrainer);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i) {
                    case 0:
                        Intent intent0 =new Intent(multitrainer.this, cobra.class);
                        startActivity(intent0);
                        return;

                    case 1:
                        Intent intent1 =new Intent(multitrainer.this, tiger.class);
                        startActivity(intent1);
                        return;

                    case 2:
                        Intent intent2 =new Intent(multitrainer.this, conanpro.class);
                        startActivity(intent2);
                        return;

                    case 3:
                        Intent intent3 =new Intent(multitrainer.this, grizzley.class);
                        startActivity(intent3);
                        return;

                    case 4:
                        Intent intent4 =new Intent(multitrainer.this, pr1000.class);
                        startActivity(intent4);
                        return;

                    case 5:
                        Intent intent5 =new Intent(multitrainer.this, a9101.class);
                        startActivity(intent5);
                        return;

                    case 6:
                        Intent intent6 =new Intent(multitrainer.this, wblsy.class);
                        startActivity(intent6);
                        return;

                    case 7:
                        Intent intent7 =new Intent(multitrainer.this, exm2000.class);
                        startActivity(intent7);
                        return;

                    case 8:
                        Intent intent8 =new Intent(multitrainer.this, wbmsy.class);
                        startActivity(intent8);
                        return;

                    case 9:
                        Intent intent9 =new Intent(multitrainer.this, f500.class);
                        startActivity(intent9);
                        return;

                    case 10:
                        Intent intent10 =new Intent(multitrainer.this, combo.class);
                        startActivity(intent10);
                        return;

                    case 11:
                        Intent intent11 =new Intent(multitrainer.this, sgs.class);
                        startActivity(intent11);
                        return;
                }
            }
        });

        }
    }