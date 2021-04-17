package com.mc.termproject.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner fromSpinner =  findViewById(R.id.spinner_from);
        Spinner toSpinner = findViewById(R.id.spinner_to);



        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Wei, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);

    }

    public void convert(View view) {
        Spinner fromSpinner, toSpinner;
        EditText fromEditText, toEditText, detailField;

        fromSpinner = findViewById(R.id.spinner_from);
        toSpinner = findViewById(R.id.spinner_to);
        fromEditText = (EditText) findViewById(R.id.editText_from);
        toEditText = (EditText) findViewById(R.id.editText_to);
        detailField = (EditText) findViewById(R.id.d);

        String fromString = (String) fromSpinner.getSelectedItem();
        String toString = (String) toSpinner.getSelectedItem();
        double input = Double.valueOf(fromEditText.getText().toString());



        WeightConverter converter = new WeightConverter();


        NumberFormat formatter = new DecimalFormat("###,###.#####");
        double result = converter.convert(input, fromString, toString);
        toEditText.setText(String.valueOf(formatter.format(result)));

        detailField.setText(fromEditText.getText().toString()+" "+fromString+" = "+toEditText.getText().toString()+" "+toString);
    }


}