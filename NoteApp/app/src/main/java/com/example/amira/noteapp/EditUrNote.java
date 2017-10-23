package com.example.amira.noteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import static com.example.amira.noteapp.MainActivity.mylist;

public class EditUrNote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_ur_note);
        Intent i=getIntent();
        int Id=i.getIntExtra("NoteId",0);
        EditText editText=(EditText)findViewById(R.id.editText);
        if(Id!=-1){
            editText.setText(MainActivity.mylist.get(Id));
        }


    }
}
