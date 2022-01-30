package com.wimonsiri.exercise4_1s6206021621147;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText  numberText;
    private Button btnChange;
    private TextView decimal;
    private TextView numBinary;
    private  TextView octal;
    private  TextView numHexa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void buttonClick(View view){

            numberText = (EditText) findViewById(R.id.numberText);
            decimal = (TextView) findViewById(R.id.decimal);
            numBinary = (TextView) findViewById(R.id.numBinary);
            octal = (TextView) findViewById(R.id.octal);
            numHexa = (TextView) findViewById(R.id.numHexa);

            char charsoctal [] = {'0' ,  '1' , '2' , '3' , '4' , '5' , '6' , '7'};
            char charsHexa [] = {'0' ,  '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9',
                                'A' , 'B' , 'C' , 'D' , 'E' , 'F'};

            int number , numOctal , Hexa , rem;
     String desToBin = "";
     String desToOct = "";
     String desToHexa = "";
     if (numberText.getText().toString().length() > 0){
         number = Integer.parseInt(numberText.getText().toString());
         numOctal = Integer.parseInt(numberText.getText().toString());
         Hexa = Integer.parseInt(numberText.getText().toString());

         while (number > 0){
         int num = number % 2;
             number = number / 2;
            desToBin =  num + desToBin;

         }
         while (numOctal > 0) {
             rem = numOctal % 8;
             desToOct = charsoctal[rem] + desToOct;
             numOctal = numOctal / 8;
         }
         while (Hexa > 0) {
             rem = Hexa % 16;
             desToHexa = charsHexa[rem] + desToHexa;
             Hexa = Hexa / 16;
         }

     }


     else Toast.makeText(this,"กรุณากรอกตัวเลข" , Toast.LENGTH_LONG).show();

     decimal.setText(numberText.getText().toString() + "");
     numBinary.setText(desToBin + "");
     octal.setText(desToOct + "");
     numHexa.setText(desToHexa + "");
    }

}