package ahmad.app.sport_nahf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class hale5onem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hale5onem);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList halechon =new ArrayList();

        halechon.add("Omega 7          ₪2,399");
        halechon.add("Austin           ₪2,999");
        halechon.add("Silver Pro       ₪3,199");
        halechon.add("Excel+           ₪3,199");
        halechon.add("Gel Master       ₪3,599");
        halechon.add("Reflex+          ₪3,799");
        halechon.add("Blazer+          ₪3,899");
        halechon.add("Gel Target       ₪3,899");
        halechon.add("Gel Runner       ₪3,999");
        halechon.add("Apollo           ₪4,299");
        halechon.add("Edison           ₪4,599");
        halechon.add("Gel Platinum     ₪4,599");
        halechon.add("Malibu           ₪4,799");
        halechon.add("Universe         ₪4,999");
        halechon.add("Matador          ₪5,699");
        halechon.add("Supreme          ₪5,699");
        halechon.add("Olympic          ₪5,899");
        halechon.add("Legacy           ₪5,999");
        halechon.add("Record Pro       ₪5,999");
        halechon.add("Mercury Plus     ₪5,999");
        halechon.add("Polaris          ₪8,499");
        halechon.add("Jumbo            ₪8,699");
        halechon.add("Ultra Plus       ₪8,999");
        halechon.add("AC SOLE          ₪9,999");
        halechon.add("AC 2000          ₪11,499");
        halechon.add("CT800            ₪17,799");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,halechon);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i) {
                    case 0:
                        Intent intent0 =new Intent(hale5onem.this, omega7.class);
                        startActivity(intent0);
                        return;

                    case 1:
                        Intent intent1 =new Intent(hale5onem.this, Austin.class);
                        startActivity(intent1);
                        return;

                    case 2:
                        Intent intent2 =new Intent(hale5onem.this, SilverPro.class);
                        startActivity(intent2);
                        return;

                    case 3:
                        Intent intent3 =new Intent(hale5onem.this, Excel.class);
                        startActivity(intent3);
                        return;

                    case 4:
                        Intent intent4 =new Intent(hale5onem.this, GelMaster.class);
                        startActivity(intent4);
                        return;

                    case 5:
                        Intent intent5 =new Intent(hale5onem.this, Reflex.class);
                        startActivity(intent5);
                        return;

                    case 6:
                        Intent intent6 =new Intent(hale5onem.this, Blazer.class);
                        startActivity(intent6);
                        return;

                    case 7:
                        Intent intent7 =new Intent(hale5onem.this, GelTarget.class);
                        startActivity(intent7);
                        return;

                    case 8:
                        Intent intent8 =new Intent(hale5onem.this, GelRunner.class);
                        startActivity(intent8);
                        return;

                    case 9:
                        Intent intent9 =new Intent(hale5onem.this, Apollo.class);
                        startActivity(intent9);
                        return;

                    case 10:
                        Intent intent10 =new Intent(hale5onem.this, Edison.class);
                        startActivity(intent10);
                        return;

                    case 11:
                        Intent intent11 =new Intent(hale5onem.this, GelPlatinum.class);
                        startActivity(intent11);
                        return;

                    case 12:
                        Intent intent12 =new Intent(hale5onem.this, Malibu.class);
                        startActivity(intent12);
                        return;

                    case 13:
                        Intent intent13 =new Intent(hale5onem.this, Universe.class);
                        startActivity(intent13);
                        return;

                    case 14:
                        Intent intent14 =new Intent(hale5onem.this, Matador.class);
                        startActivity(intent14);
                        return;

                    case 15:
                        Intent intent15 =new Intent(hale5onem.this, Supreme.class);
                        startActivity(intent15);
                        return;

                    case 16:
                        Intent intent16 =new Intent(hale5onem.this, Olympic.class);
                        startActivity(intent16);
                        return;

                    case 17:
                        Intent intent17 =new Intent(hale5onem.this, Legacy.class);
                        startActivity(intent17);
                        return;

                    case 18:
                        Intent intent18 =new Intent(hale5onem.this, RecordPro.class);
                        startActivity(intent18);
                        return;

                    case 19:
                        Intent intent19 =new Intent(hale5onem.this, MercuryPlus.class);
                        startActivity(intent19);
                        return;

                    case 20:
                        Intent intent20 =new Intent(hale5onem.this, Polaris.class);
                        startActivity(intent20);
                        return;

                    case 21:
                        Intent intent21 =new Intent(hale5onem.this, Jumbo.class);
                        startActivity(intent21);
                        return;

                    case 22:
                        Intent intent22 =new Intent(hale5onem.this, UltraPlus.class);
                        startActivity(intent22);
                        return;

                    case 23:
                        Intent intent23 =new Intent(hale5onem.this, AcSole.class);
                        startActivity(intent23);
                        return;

                    case 24:
                        Intent intent24 =new Intent(hale5onem.this, AC2000.class);
                        startActivity(intent24);
                        return;

                    case 25:
                        Intent intent25 =new Intent(hale5onem.this, Ct800.class);
                        startActivity(intent25);
                        return;
                }
            }
        });
    }
}