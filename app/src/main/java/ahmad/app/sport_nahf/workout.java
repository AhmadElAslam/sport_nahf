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

public class workout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
    }

    public void back (View view) {
        Intent intent = new Intent(workout.this, tfret.class);
        startActivity(intent);
    }

    public void hale5on (View view) {
        Intent intent = new Intent(workout.this, hale5onem.class);
        startActivity(intent);
    }

    public void alepti (View view) {
        Intent intent = new Intent(workout.this, aliptekal.class);
        startActivity(intent);
    }

    public void mshkolot (View view) {
        Intent intent = new Intent(workout.this, mshkolot.class);
        startActivity(intent);
    }

    public void multi (View view) {
        Intent intent = new Intent(workout.this, multitrainer.class);
        startActivity(intent);
    }

    public void ofne (View view) {
        Intent intent = new Intent(workout.this, ofnekosher.class);
        startActivity(intent);
    }

    public void sfot (View view) {
        Intent intent = new Intent(workout.this, sfotkosher.class);
        startActivity(intent);
    }

}