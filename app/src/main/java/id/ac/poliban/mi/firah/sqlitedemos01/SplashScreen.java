package id.ac.poliban.mi.firah.sqlitedemos01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView logo = findViewById(R.id.logo);

        Glide.with(this)
                .load(Uri.parse("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTnckoiyptFWczetrWckycg4jqehRHcWPict41w4gqP_o7morn0"))
                .into(logo);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }, 3000);
    }
}
