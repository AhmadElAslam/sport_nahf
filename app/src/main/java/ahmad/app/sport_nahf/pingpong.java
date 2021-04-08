package ahmad.app.sport_nahf;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class pingpong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pingpong);
    }

    public void back (View view) {
        Intent intent = new Intent(pingpong.this, tfret.class);
        startActivity(intent);
    }

    public void tawlat (View view) {
        Intent intent = new Intent(pingpong.this, shol7anot.class);
        startActivity(intent);
    }

}