package com.example.lab3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    Button reviewButton = findViewById(R.id.review_button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent myIntent = new Intent(this, result.class);
//        myIntent.putExtra("key", value); //Optional parameters

//        reviewButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MainActivity.this.startActivity(myIntent);
//            }
//        });
    }
    public void addEntry(View view) {
        // add to database
        // Gets the data repository in write mode

        SQLiteManager dbHelper = new SQLiteManager(getApplicationContext());

        SQLiteDatabase db = dbHelper.getWritableDatabase();

        EditText editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        String title = editTextTextPersonName.getText().toString();

        EditText editTextPhone = findViewById(R.id.editTextPhone);
        String subtitle = editTextPhone.getText().toString();
        // System.out.println(subtitle);

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_TITLE, title);
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_SUBTITLE, subtitle);

        // Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values);
    }

    public void readDatabase(View view) {
        Intent intent = new Intent(this, Result.class);
        startActivity(intent);
    }
}
