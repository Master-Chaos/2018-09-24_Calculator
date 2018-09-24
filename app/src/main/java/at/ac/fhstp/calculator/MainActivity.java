package at.ac.fhstp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";

    //CREATE ALL BUTTONS OBJECTS FOR USER OPERATIONS
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_add;
    Button btn_sub;
    Button btn_mul;
    Button btn_div;
    Button btn_calc;
    Button btn_dec;
    Button btn_clear;
    Button btn_mod;
    Button btn_sign;

    //CREATE OBJECTS EDIT TEXT
    EditText ed1;
    TextView textView1; //TEXTVIEW FOR DISPLAY CALCULATION

    //CREATE FLOAT OBJECTS FOR STORE DIGITS
    float flo_value1;
    float flo_value2;

    //CREATE BOOLEAN OBJECTS FOR OPERATION CHECK
    boolean bool_addition;
    boolean bool_subtract;
    boolean bool_multiplication;
    boolean bool_division;
    boolean bool_mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //CREATE APP INSTANT
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate()"); //OUTPUT MESSAGE TO LOGCAT FOR LOG IT - LOGLEVELTYPE: i = INFO

        //FETCH ALL VALUES FROM DESIGN AND ASSIGN IT TO THE CREATED OBJECTS
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_add = findViewById(R.id.btn_Add);
        btn_sub = findViewById(R.id.btn_Sub);
        btn_mul = findViewById(R.id.btn_Mul);
        btn_div = findViewById(R.id.btn_Div);
        btn_dec = findViewById(R.id.btn_dec);
        btn_calc = findViewById(R.id.btn_calc);
        btn_clear = findViewById(R.id.btn_clear);
        btn_mod = findViewById(R.id.btn_mod);
        btn_sign = findViewById(R.id.btn_sign);
        ed1 = findViewById(R.id.edText1);
        textView1 = findViewById(R.id.textView);

        //CHANGE VALUE OF EDITTEXT BY PRESSING THE BUTTON
        btn_0.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 0
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 0
                ed1.setText(ed1.getText()+"0"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 0
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 1
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 1
                ed1.setText(ed1.getText()+"1"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 1
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 2
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 2
                ed1.setText(ed1.getText()+"2"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 2
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 3
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 3
                ed1.setText(ed1.getText()+"3"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 3
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 4
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 4
                ed1.setText(ed1.getText()+"4"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 4
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 5
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 5
                ed1.setText(ed1.getText()+"5"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 5
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 6
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 6
                ed1.setText(ed1.getText()+"6"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 6
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 7
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 7
                ed1.setText(ed1.getText()+"7"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 7
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 8
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 8
                ed1.setText(ed1.getText()+"8"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 8
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON 9
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON 9
                ed1.setText(ed1.getText()+"9"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD 9
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON .
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON .
                ed1.setText(ed1.getText()+"."); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD .
            }
        });

        btn_sign.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON (-)
            @Override
            public void onClick(View v) { //FUNCTION FOR PRESSING BUTTON (-)
                ed1.setText(ed1.getText()+"-"); //ADD A DIGIT TO NUMBER; AT STARTVALUE IS NULL AND THEN ADD (-)
            }
        });

        //CREATE FUNTIONAL BUTTONS
        btn_add.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON +
            @Override
            public void onClick(View v) {
                flo_value1 = Float.parseFloat(ed1.getText() + ""); //SAVE FIRST NUMBER TO VARIABLE
                textView1.setText(flo_value1 + " + "); //DISPLAY CALCULATION
                bool_addition = true ; //SET ADDITION TO TRUE; BECAUSE THE ADDITION BUTTON WAS PRESSED
                ed1.setText(null); //CLEAR EDITTEXT FOR READ IN THE SECOND NUMBER
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON -
            @Override
            public void onClick(View v) {
                flo_value1 = Float.parseFloat(ed1.getText() + ""); //SAVE FIRST NUMBER TO VARIABLE
                textView1.setText(flo_value1 + " - "); //DISPLAY CALCULATION
                bool_subtract = true ; //SET SUBTRACTION TO TRUE; BECAUSE THE SUBTRACTION BUTTON WAS PRESSED
                ed1.setText(null); //CLEAR EDITTEXT FOR READ IN THE SECOND NUMBER
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON *
            @Override
            public void onClick(View v) {
                flo_value1 = Float.parseFloat(ed1.getText() + ""); //SAVE FIRST NUMBER TO VARIABLE
                textView1.setText(flo_value1 + " * "); //DISPLAY CALCULATION
                bool_multiplication = true ; //SET MULTIPLICATION TO TRUE; BECAUSE THE MULTIPLICATION BUTTON WAS PRESSED
                ed1.setText(null); //CLEAR EDITTEXT FOR READ IN THE SECOND NUMBER
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON /
            @Override
            public void onClick(View v) {
                flo_value1 = Float.parseFloat(ed1.getText() + ""); //SAVE FIRST NUMBER TO VARIABLE
                textView1.setText(flo_value1 + " / "); //DISPLAY CALCULATION
                bool_division = true ; //SET DIVISION TO TRUE; BECAUSE THE DIVISION BUTTON WAS PRESSED
                ed1.setText(null); //CLEAR EDITTEXT FOR READ IN THE SECOND NUMBER
            }
        });

        btn_mod.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON MOD
            @Override
            public void onClick(View v) {
                flo_value1 = Float.parseFloat(ed1.getText() + ""); //SAVE FIRST NUMBER TO VARIABLE
                textView1.setText(flo_value1 + " MOD "); //DISPLAY CALCULATION
                bool_mod = true ; //SET MODULO TO TRUE; BECAUSE THE MODULO BUTTON WAS PRESSED
                ed1.setText(null); //CLEAR EDITTEXT FOR READ IN THE SECOND NUMBER
            }
        });

        //CALCULATING THE FUNCTIONALITY OF THE CALCULATOR
        btn_calc.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON =
            @Override
            public void onClick(View v) {
                flo_value2 = Float.parseFloat(ed1.getText() + "");  //SAVE FIRST SECOND TO VARIABLE

                if (bool_addition == true){ //CHECK IF ADDITION BUTTON WAS PRESSED
                    textView1.setText(flo_value1 + " + " + flo_value2 + " = "); //DISPLAY CALCULATION
                    ed1.setText(flo_value1 + flo_value2 +""); //DO ADDITION OPERATION OF FIRST NUMBER AND SECOND NUMBER
                    bool_addition = false;
                }

                if (bool_subtract == true){ //CHECK IF SUBTRACTION BUTTON WAS PRESSED
                    textView1.setText(flo_value1 + " - " + flo_value2 + " = "); //DISPLAY CALCULATION
                    ed1.setText(flo_value1 - flo_value2 +""); //DO SUBTRACTION OPERATION OF FIRST NUMBER AND SECOND NUMBER
                    bool_subtract = false;
                }

                if (bool_multiplication == true){ //CHECK IF MULTIPLICATION BUTTON WAS PRESSED
                    textView1.setText(flo_value1 + " * " + flo_value2 + " = "); //DISPLAY CALCULATION
                    ed1.setText(flo_value1 * flo_value2 +""); //DO MULTIPLICATION OPERATION OF FIRST NUMBER AND SECOND NUMBER
                    bool_multiplication = false;
                }

                if (bool_division == true){ //CHECK IF DIVISION BUTTON WAS PRESSED
                    textView1.setText(flo_value1 + " / " + flo_value2 + " = "); //DISPLAY CALCULATION
                    ed1.setText(flo_value1 / flo_value2 +""); //DO DIVISION OPERATION OF FIRST NUMBER AND SECOND NUMBER
                    bool_division = false;
                }

                if (bool_mod == true){ //CHECK IF MODULO BUTTON WAS PRESSED
                    textView1.setText(flo_value1 + " / " + flo_value2 + " = "); //DISPLAY CALCULATION
                    ed1.setText(flo_value1 % flo_value2 +""); //DO MODULO OPERATION OF FIRST NUMBER AND SECOND NUMBER
                    bool_mod = false;
                }
            }
        });

        //FUNCTION FOR CLEAR
        btn_clear.setOnClickListener(new View.OnClickListener() { //CREATE A ONCLICKLISTENER FOR BUTTON CLEAR
            @Override
            public void onClick(View v) {
                textView1.setText(""); //CLEAR CALCULATION ON DISPLAY
                ed1.setText(""); //CLEAR EDITTEXT
                flo_value1 = 0.0f; //SET FIRST NUMBER TO 0.0
                flo_value2 = 0.0f; //SET SECOND NUMBER TO 0.0
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume(); //GO BACK TO APP INSTANT
        Log.i(TAG, "onResume"); //OUTPUT MESSAGE TO LOGCAT FOR LOG IT - LOGLEVELTYPE: i = INFO
    }

    @Override
    protected void onDestroy() {
        super.onDestroy(); //END THE APP INSTANT IS STOP IT
        Log.i(TAG, "onDestroy()"); //OUTPUT MESSAGE TO LOGCAT FOR LOG IT - LOGLEVELTYPE: i = INFO
    }
}