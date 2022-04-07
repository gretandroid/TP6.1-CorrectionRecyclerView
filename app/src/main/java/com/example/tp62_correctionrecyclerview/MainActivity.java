package com.example.tp62_correctionrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tp62_correctionrecyclerview.Controller.DaoPerson;
import com.example.tp62_correctionrecyclerview.Model.Person;
import com.example.tp62_correctionrecyclerview.Model.PersonProvider;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editName, editFirstname;
    private MyAdapter myAdapter;
    DaoPerson daoPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        daoPerson = new DaoPerson();
        myAdapter = new MyAdapter(daoPerson.getAllPersons());
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        button = findViewById(R.id.button_add);
        button.setOnClickListener(v -> doAdd());
        editName = findViewById(R.id.edit_name);
        editFirstname = findViewById(R.id.edit_firstname);
    }

    private void doAdd() {
        String name = editName.getText().toString();
        String firstname = editFirstname.getText().toString();
        daoPerson.addPerson(new Person(name, firstname));
        myAdapter.notifyDataSetChanged();
    }


}