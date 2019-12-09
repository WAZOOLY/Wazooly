package net.androidbootcamp.wazooly2;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Pickup_Activity extends AppCompatActivity implements Pickup_Interface {
    private static ArrayList<Students_Information> studentList = Students_Information.getStudentList();
    private static int pos;
    private Pickup_Adapter mAdapter;

    public static int getPos() {
        return pos;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pickup_list);

        RecyclerView recyclerView = findViewById(R.id.students_pickup_list);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new Pickup_Adapter(studentList, this);
        recyclerView.setAdapter(mAdapter);

    }

    @Override
    public void userItemClick(int pos) {
        Pickup_Activity.pos = pos;
        Intent activity_to_view = new Intent(getApplicationContext(),
                student_info_for_pickup.class);
        startActivity(activity_to_view);
    }
}
