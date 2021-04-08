package ahmad.app.sport_nahf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class sfotkosher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hale5onem);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList sfot =new ArrayList();

        sfot.add("YORK 1011            ₪ 279");
        sfot.add("york 340             ₪ 639");
        sfot.add("YORK B-180           ₪ 649");
        sfot.add("PRCTZ 8216           ₪ 699");
        sfot.add("YORK B-SU            ₪ 699");
        sfot.add("TARGET 104           ₪ 749");
        sfot.add("7IN1                 ₪ 799");
        sfot.add("YORK 1077            ₪ 849");
        sfot.add("GFB-350              ₪ 849");
        sfot.add("GST-20               ₪ 949");
        sfot.add("TARGET 2050          ₪ 999");
        sfot.add("PRCTZ 7846           ₪ 1,099");
        sfot.add("PRCTZ 7862           ₪ 1,099");
        sfot.add("Ninja                ₪ 1,099");
        sfot.add("GAB-60               ₪ 1,099");
        sfot.add("YORK B-90            ₪ 1,299");
        sfot.add("GHYP-45              ₪ 1,349");
        sfot.add("YORK 9201            ₪ 1,399");
        sfot.add("YORK 797             ₪ 1,499");
        sfot.add("YORK 1076            ₪ 1,499");
        sfot.add("BOWFLEX 4.1          ₪ 1,499");
        sfot.add("TARGET 2051          ₪ 1,499");
        sfot.add("GFI-21               ₪ 1,499");
        sfot.add("GPCB-329             ₪ 1,599");
        sfot.add("GRCH-322             ₪ 1,649");
        sfot.add("WB-UBS               ₪ 1,749");
        sfot.add("GFID-71              ₪ 2,049");
        sfot.add("BEST                 ₪ 2,099");
        sfot.add("B-3060               ₪ 2,199");
        sfot.add("WB-UB                ₪ 2,199");
        sfot.add("GDIB-46              ₪ 2,199");
        sfot.add("WB-OB                ₪ 2,399");
        sfot.add("P-HC                 ₪ 2,849");
        sfot.add("WB-MP                ₪ 3,999");



        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sfot);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i) {
                    case 0:
                        Intent intent0 =new Intent(sfotkosher.this, a1011.class);
                        startActivity(intent0);
                        return;

                    case 1:
                        Intent intent1 =new Intent(sfotkosher.this, a340.class);
                        startActivity(intent1);
                        return;

                    case 2:
                        Intent intent2 =new Intent(sfotkosher.this, b180.class);
                        startActivity(intent2);
                        return;

                    case 3:
                        Intent intent3 =new Intent(sfotkosher.this, prctz8216.class);
                        startActivity(intent3);
                        return;

                    case 4:
                        Intent intent4 =new Intent(sfotkosher.this, bsu.class);
                        startActivity(intent4);
                        return;

                    case 5:
                        Intent intent5 =new Intent(sfotkosher.this, target104.class);
                        startActivity(intent5);
                        return;

                    case 6:
                        Intent intent6 =new Intent(sfotkosher.this, a7in1.class);
                        startActivity(intent6);
                        return;

                    case 7:
                        Intent intent7 =new Intent(sfotkosher.this, a1077.class);
                        startActivity(intent7);
                        return;

                    case 8:
                        Intent intent8 =new Intent(sfotkosher.this, gfb350.class);
                        startActivity(intent8);
                        return;

                    case 9:
                        Intent intent9 =new Intent(sfotkosher.this, gst20.class);
                        startActivity(intent9);
                        return;

                    case 10:
                        Intent intent10 =new Intent(sfotkosher.this, target2050.class);
                        startActivity(intent10);
                        return;

                    case 11:
                        Intent intent11 =new Intent(sfotkosher.this, prctz7846.class);
                        startActivity(intent11);
                        return;

                    case 12:
                        Intent intent12 =new Intent(sfotkosher.this, prctz7862.class);
                        startActivity(intent12);
                        return;

                    case 13:
                        Intent intent13 =new Intent(sfotkosher.this, ninja.class);
                        startActivity(intent13);
                        return;

                    case 14:
                        Intent intent14 =new Intent(sfotkosher.this, gab60.class);
                        startActivity(intent14);
                        return;

                    case 15:
                        Intent intent15 =new Intent(sfotkosher.this, b90.class);
                        startActivity(intent15);
                        return;

                    case 16:
                        Intent intent16 =new Intent(sfotkosher.this, ghyp45.class);
                        startActivity(intent16);
                        return;

                    case 17:
                        Intent intent17 =new Intent(sfotkosher.this, a9201.class);
                        startActivity(intent17);
                        return;

                    case 18:
                        Intent intent18 =new Intent(sfotkosher.this, a797.class);
                        startActivity(intent18);
                        return;

                    case 19:
                        Intent intent19 =new Intent(sfotkosher.this, a1076.class);
                        startActivity(intent19);
                        return;

                    case 20:
                        Intent intent20 =new Intent(sfotkosher.this, bowflex41.class);
                        startActivity(intent20);
                        return;

                    case 21:
                        Intent intent21 =new Intent(sfotkosher.this, target2051.class);
                        startActivity(intent21);
                        return;

                    case 22:
                        Intent intent22 =new Intent(sfotkosher.this, gfi21.class);
                        startActivity(intent22);
                        return;

                    case 23:
                        Intent intent23 =new Intent(sfotkosher.this, gpcb329.class);
                        startActivity(intent23);
                        return;

                    case 24:
                        Intent intent24 =new Intent(sfotkosher.this, grch322.class);
                        startActivity(intent24);
                        return;

                    case 25:
                        Intent intent25 =new Intent(sfotkosher.this, wbubs.class);
                        startActivity(intent25);
                        return;

                    case 26:
                        Intent intent26 =new Intent(sfotkosher.this, gfid71.class);
                        startActivity(intent26);
                        return;

                    case 27:
                        Intent intent27 =new Intent(sfotkosher.this, best.class);
                        startActivity(intent27);
                        return;

                    case 28:
                        Intent intent28 =new Intent(sfotkosher.this, b3060.class);
                        startActivity(intent28);
                        return;

                    case 29:
                        Intent intent29 =new Intent(sfotkosher.this, wbub.class);
                        startActivity(intent29);
                        return;

                    case 30:
                        Intent intent30 =new Intent(sfotkosher.this, gdib46.class);
                        startActivity(intent30);
                        return;

                    case 31:
                        Intent intent31 =new Intent(sfotkosher.this, wbob.class);
                        startActivity(intent31);
                        return;

                    case 32:
                        Intent intent32 =new Intent(sfotkosher.this, phc.class);
                        startActivity(intent32);
                        return;

                    case 33:
                        Intent intent33 =new Intent(sfotkosher.this, wbmp.class);
                        startActivity(intent33);
                        return;

                }
            }
        });
    }
}