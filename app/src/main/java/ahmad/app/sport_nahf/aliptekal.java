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

public class aliptekal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aliptekal);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList alepti =new ArrayList();

        alepti.add("UNO           ₪ 1,399");
        alepti.add("YORK 101           ₪ 1,799");
        alepti.add("SOLO          ₪ 1,799");
        alepti.add("BX200          ₪ 2,749");
        alepti.add("YORK 902            ₪ 2,299");
        alepti.add("Expo          ₪ 2,799");
        alepti.add("SKILINE        ₪ 3,999");
        alepti.add("E7000          ₪ 4,599");
        alepti.add("DOUBLE WHEEL          ₪ 5,799");
        alepti.add("Bowflex Max Trainer M3                ₪ 6,899");
        alepti.add("Bowflex Max Trainer M6                ₪ 9,949");
        alepti.add("E-GLIDE           ₪ 10,499");
        alepti.add("SPIRIT CE800                ₪ 10,599");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alepti);

        myListView.setAdapter(arrayAdapter);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                switch (i) {
                    case 0:
                        Intent intent0 = new Intent(aliptekal.this, uno.class);
                        startActivity(intent0);
                        return;
                    case 1:
                        Intent intent1 = new Intent(aliptekal.this, aa101.class);
                        startActivity(intent1);
                        return;

                    case 2:
                        Intent intent2 = new Intent(aliptekal.this, solo.class);
                        startActivity(intent2);
                        return;

                    case 3:
                        Intent intent3 = new Intent(aliptekal.this, bx200.class);
                        startActivity(intent3);
                        return;

                    case 4:
                        Intent intent4 = new Intent(aliptekal.this, york902.class);
                        startActivity(intent4);
                        return;

                    case 5:
                        Intent intent5 = new Intent(aliptekal.this, expo.class);
                        startActivity(intent5);
                        return;

                    case 6:
                        Intent intent6 = new Intent(aliptekal.this, skyline.class);
                        startActivity(intent6);
                        return;

                    case 7:
                        Intent intent7 = new Intent(aliptekal.this, e7000.class);
                        startActivity(intent7);
                        return;

                    case 8:
                        Intent intent8 = new Intent(aliptekal.this, doublewheel.class);
                        startActivity(intent8);
                        return;

                    case 9:
                        Intent intent9 = new Intent(aliptekal.this, bowflexm3.class);
                        startActivity(intent9);
                        return;

                    case 10:
                        Intent intent10 = new Intent(aliptekal.this, bowflexm6.class);
                        startActivity(intent10);
                        return;

                    case 11:
                        Intent intent11 = new Intent(aliptekal.this, eglide.class);
                        startActivity(intent11);
                        return;

                    case 12:
                        Intent intent12 = new Intent(aliptekal.this, spiritce800.class);
                        startActivity(intent12);
                        return;
                }
            }
        });
    }
}