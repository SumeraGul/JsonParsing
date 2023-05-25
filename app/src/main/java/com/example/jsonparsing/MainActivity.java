package com.example.jsonparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    String JSON_STRING = "{\"employee\":{\"name\":\"Sumera Gul\",\"salary\":65000}}";
    String name, salary;
    TextView txtname,txtslry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname = findViewById(R.id.nametxt);
        txtslry = findViewById(R.id.salrytxt);
        try{
            // get json object from json file which is string in this case
            JSONObject obj = new JSONObject (JSON_STRING);
            // fetch json object named employee
            JSONObject employee = obj.getJSONObject("employee");
            //get employee name and salary
            name = employee.getString("name");
            salary = employee.getString("salary");
            txtname.setText("name"+name);
            txtslry.setText("salary"+salary);


        } catch (JSONException e) {
            throw new RuntimeException(e);
        } ;


    }
}