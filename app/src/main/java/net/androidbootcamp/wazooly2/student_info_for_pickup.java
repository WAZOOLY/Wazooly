package net.androidbootcamp.wazooly2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class student_info_for_pickup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_info_for_pickup);

        int pos = Pickup_Activity.getPos();
        ArrayList<Students_Information> studentList = Students_Information.getStudentList();

        final TextView student_name = findViewById(R.id.student_name);
        student_name.setText(studentList.get(pos).getStudentFName() + " " + studentList.get(pos).getStudentLName());

        final TextView student_id = findViewById(R.id.student_id);
        student_id.setText(studentList.get(pos).getStudentId());

        final TextView vehicle_tag_number = findViewById(R.id.vehicle_tag_number);
        vehicle_tag_number.setText(studentList.get(pos).getVehicleTagNumber());

        final TextView vehicle_tag_state = findViewById(R.id.vehicle_tag_state);
        vehicle_tag_state.setText(studentList.get(pos).getVehicleTagState());

        final TextView vehicle_year = findViewById(R.id.vehicle_year);
        vehicle_year.setText(Integer.toString(studentList.get(pos).getVehicleYear()));

        final TextView vehicle_color = findViewById(R.id.vehicle_color);
        vehicle_color.setText(studentList.get(pos).getVehicleColor());

        final TextView vehicle_make = findViewById(R.id.vehicle_make);
        vehicle_make.setText(studentList.get(pos).getVehicleMake());

        final TextView vehicle_model = findViewById(R.id.vehicle_model);
        vehicle_model.setText(studentList.get(pos).getVehicleModel());

        deleteStudent(pos);
    }

    private void deleteStudent(final int pos) {
        Button button = findViewById(R.id.pick_up_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Students_Information.removeStudent(pos);

                Intent activity_to_view = new Intent(getApplicationContext(), Pickup_Activity.class);
                startActivity(activity_to_view);
            }
        });
    }
}