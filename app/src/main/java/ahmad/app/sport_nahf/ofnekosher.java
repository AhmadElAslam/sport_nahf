package ahmad.app.sport_nahf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ofnekosher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hale5onem);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList ofnaym =new ArrayList();

        ofnaym.add("X-FIT                 ₪ 799");
        ofnaym.add("MOBILE PLUS           ₪ 899");
        ofnaym.add("LIFEGEAR 20065        ₪ 899");
        ofnaym.add("Spacer Plus           ₪ 1,299");
        ofnaym.add("BASIC                 ₪ 1,399");
        ofnaym.add("york 686              ₪ 1,599");
        ofnaym.add("NOVO                  ₪ 1,999");
        ofnaym.add("YORK 19090            ₪ 1,999");
        ofnaym.add("STYLE PRO             ₪ 1,999");
        ofnaym.add("SPIN-FIT              ₪ 1,999");
        ofnaym.add("TOTAL BODY            ₪ 2,299");
        ofnaym.add("AD2                   ₪ 2,799");
        ofnaym.add("CX-630 PRO            ₪ 3,499");
        ofnaym.add("SCHWINN 570U          ₪ 3,599");
        ofnaym.add("SCHWINN 570R          ₪ 4,999");
        ofnaym.add("SCHWINN IC7           ₪ 4,999");
        ofnaym.add("C510                  ₪ 5,999");
        ofnaym.add("SCHWINN IC8           ₪ 6,999");
        ofnaym.add("SPIRIT CU800          ₪ 6,999");
        ofnaym.add("CR800                 ₪ 8,999");




        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ofnaym);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i) {
                    case 0:
                        Intent intent0 =new Intent(ofnekosher.this, xfit.class);
                        startActivity(intent0);
                        return;

                    case 1:
                        Intent intent1 =new Intent(ofnekosher.this, mobileplus.class);
                        startActivity(intent1);
                        return;

                    case 2:
                        Intent intent2 =new Intent(ofnekosher.this, lifegear.class);
                        startActivity(intent2);
                        return;

                    case 3:
                        Intent intent3 =new Intent(ofnekosher.this, spacerplus.class);
                        startActivity(intent3);
                        return;

                    case 4:
                        Intent intent4 =new Intent(ofnekosher.this, basic.class);
                        startActivity(intent4);
                        return;

                    case 5:
                        Intent intent5 =new Intent(ofnekosher.this, a686.class);
                        startActivity(intent5);
                        return;

                    case 6:
                        Intent intent6 =new Intent(ofnekosher.this, novo.class);
                        startActivity(intent6);
                        return;

                    case 7:
                        Intent intent7 =new Intent(ofnekosher.this, a19090.class);
                        startActivity(intent7);
                        return;

                    case 8:
                        Intent intent8 =new Intent(ofnekosher.this, stylepro.class);
                        startActivity(intent8);
                        return;

                    case 9:
                        Intent intent9 =new Intent(ofnekosher.this, spinfit.class);
                        startActivity(intent9);
                        return;

                    case 10:
                        Intent intent10 =new Intent(ofnekosher.this, totalbody.class);
                        startActivity(intent10);
                        return;

                    case 11:
                        Intent intent11 =new Intent(ofnekosher.this, ad2.class);
                        startActivity(intent11);
                        return;

                    case 12:
                        Intent intent12 =new Intent(ofnekosher.this, cx630pro.class);
                        startActivity(intent12);
                        return;

                    case 13:
                        Intent intent13 =new Intent(ofnekosher.this, schwinn570u.class);
                        startActivity(intent13);
                        return;

                    case 14:
                        Intent intent14 =new Intent(ofnekosher.this, schwinn570r.class);
                        startActivity(intent14);
                        return;

                    case 15:
                        Intent intent15 =new Intent(ofnekosher.this, schwinnic7.class);
                        startActivity(intent15);
                        return;

                    case 16:
                        Intent intent16 =new Intent(ofnekosher.this, c510.class);
                        startActivity(intent16);
                        return;

                    case 17:
                        Intent intent17 =new Intent(ofnekosher.this, schwinnic8.class);
                        startActivity(intent17);
                        return;

                    case 18:
                        Intent intent18 =new Intent(ofnekosher.this, spiritcu800.class);
                        startActivity(intent18);
                        return;

                    case 19:
                        Intent intent19 =new Intent(ofnekosher.this, cr800.class);
                        startActivity(intent19);
                        return;
                }
            }
        });
    }
}