package com.example.raschet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    Button bbraschet;
    EditText eSens;
    EditText ePlace;
    EditText eMassa;
    EditText eRes;
    double dSens, dPlace, dMassa, dRes;
    String sSens, sPlace, sMassa, sRes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bbraschet = (Button)findViewById(R.id.bbraschet);
        eSens = (EditText)findViewById(R.id.eSens);
        ePlace = (EditText)findViewById(R.id.ePlace);
        eMassa = (EditText)findViewById(R.id.eMassa);
        eRes = (EditText)findViewById(R.id.eRes);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sSens = eSens.getText().toString();
                dSens = Double.parseDouble(sSens);
                sMassa = eMassa.getText().toString();
                dMassa = Double.parseDouble(sMassa);
                sPlace = ePlace.getText().toString();
                dPlace = Double.parseDouble(sPlace);
                dRes = dMassa / dSens / dPlace;
                sRes = Double.toString(dRes);
                eRes.setText(sRes);

            }
        };
        bbraschet.setOnClickListener(onClickListener);

    }
}