package net.androidbootcamp.wazooly2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Bad_Scan_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.badscan);

        Button button = findViewById(R.id.Done);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_to_view = new Intent(getApplicationContext(), Scan_Vehicle_Activity.class);
                startActivity(activity_to_view);
            }
        });
    }
}
