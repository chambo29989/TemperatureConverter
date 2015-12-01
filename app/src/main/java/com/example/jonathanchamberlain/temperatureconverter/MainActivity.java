package com.example.jonathanchamberlain.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText textVal;
    RadioButton toP;
    RadioButton toM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textVal =(EditText)findViewById(R.id.ValueEditText);
        toP = (RadioButton)findViewById(R.id.toPintsRadBtn);
        toM = (RadioButton)findViewById(R.id.toMilRadBtn);

    }

    public void convert(View v){
        double value = new Double(textVal.getText().toString());

                if(toP.isChecked())

                    value = UnitConverter.mill2Pints(value);
                else
                    value = UnitConverter.pints2Mil(value);

        textVal.setText(new Double(value).toString());

    }
}
