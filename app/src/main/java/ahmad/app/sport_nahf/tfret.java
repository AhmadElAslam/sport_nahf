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

public class tfret extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tfret);
    }

    public void pingpong (View view) {
        Intent intent = new Intent(tfret.this, shol7anot.class);
        startActivity(intent);
    }

    public void workout (View view) {
        Intent intent = new Intent(tfret.this, workout.class);
        startActivity(intent);
    }

    public void hzmanot (View view) {
        Intent intent = new Intent(tfret.this, hzmanot.class);
        startActivity(intent);
    }
}