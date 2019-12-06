package net.androidbootcamp.wazooly2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Pickup_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pickup_list);
        showStudents();
    }

    private void showStudents() {
        System.out.println();
    }
}
