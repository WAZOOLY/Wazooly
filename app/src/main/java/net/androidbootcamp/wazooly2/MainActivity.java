package net.androidbootcamp.wazooly2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    // Validate Login Credentials
    private void login() {
        Button button = findViewById(R.id.take_picture);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_to_view = new Intent(getApplicationContext(), Scan_Pickup_Activity.class);
                startActivity(activity_to_view);
            }
        });
    }
}
