package sg.edu.rp.c346.id19018582.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvEmpInfo;
    ArrayList<Employee> alEmp;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvEmpInfo = findViewById(R.id.listViewEmployeeInfo);

        alEmp = new ArrayList<>();
        alEmp.add(new Employee("John", "Software Technical Leader", 3400.0));
        alEmp.add(new Employee("May", "Programmer", 2200.0));

        adapter = new CustomAdapter(this, R.layout.row, alEmp);
        lvEmpInfo.setAdapter(adapter);
    }
}
