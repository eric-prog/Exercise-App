package com.example.myexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int num_reps = 0;
    int num_rounds = 0;

    public void add_exercise(View view) {
        TextView ename = (TextView) findViewById(R.id.exercise_name);
        EditText input = (EditText)findViewById(R.id.input);
        String name = input.getText().toString();
        ename.setText(name);
    }

    public void increment(View view){
        num_reps++;
        display_reps(num_reps);
    }

    public void reset(View view){
        num_reps=0;
        num_rounds++;
        display_rounds(num_rounds);
        display_reps(num_reps);
    }

    private void display_reps(int num_reps) {
        TextView rep = (TextView) findViewById(R.id.reps);
        rep.setText("" + num_reps);
    }

    private void display_rounds(int set) {
        TextView round = (TextView) findViewById(R.id.rounds);
        round.setText("" + set);
    }
}
