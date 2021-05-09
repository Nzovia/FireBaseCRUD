package com.nicholas.firebasecrud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDataBase;
    private EditText editTextName, editTextNumber, editTextCourse;
    private Button button;
    List<StudentModel> studentsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize the database reference variable
        mDataBase= FirebaseDatabase.getInstance().getReference();
        //Don't pass any path if you want root of the tree
        //Note: setValue() method will fetch data from the object of the model Java Class that stores the reference data
        //setting value to the Database
        //StudentModel studentModel=new StudentModel(id, name, number, course)
        //datanaseReference.child(id).setValue(studentModel)


        //hooks to the widgets
        editTextName=findViewById(R.id.name);
        editTextNumber=findViewById(R.id.number);
        editTextCourse=findViewById(R.id.course);

        button=findViewById(R.id.button);

        //list to store students data
        studentsList=new ArrayList<>();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addStudent();
            }
        });
    }

    private void addStudent() {


    }
}