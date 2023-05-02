package com.example.lab3b;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        this.fillListview();
    }

    public ArrayList<Person> getAllData() {
        ArrayList<Person> People = new ArrayList<>();
        SQLiteManager dbHelper = new SQLiteManager(getApplicationContext());

        SQLiteDatabase db = dbHelper.getWritableDatabase();

        Cursor res = db.rawQuery("select * from Contact",null);

        while(res.moveToNext()) {
            String name = res.getString(1);   //0 is the number of id column in your database table
            String number = res.getString(2);

            Person newPerson = new Person(name, number);
            People.add(newPerson);
        }
        return People;
    }

    public void fillListview() {
        ListView myListview = findViewById(R.id.contactListView);
        SQLiteManager dbHelper = new SQLiteManager(getApplicationContext());

        ArrayList<Person> People = this.getAllData();

        CustomAdapter myAdapter = new CustomAdapter(People, this);
        myListview.setAdapter(myAdapter);
    }
}