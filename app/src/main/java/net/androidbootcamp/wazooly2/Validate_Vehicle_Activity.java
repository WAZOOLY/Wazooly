package net.androidbootcamp.wazooly2;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Validate_Vehicle_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validate_vehicle);

        EditText plateNumberText = findViewById(R.id.plateNum);
        plateNumberText.setText(Scan_Vehicle_Activity.getPlateNumber());

        EditText plateStateText = findViewById(R.id.plateState);
        plateStateText.setText(Scan_Vehicle_Activity.getPlateState());

        Button button = findViewById(R.id.okButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent activity_to_view = new Intent(getApplicationContext(), Scan_Pickup_Activity.class);
                //startActivity(activity_to_view);
                System.out.print("");
            }
        });
    }
}
