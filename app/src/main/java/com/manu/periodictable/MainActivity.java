package com.manu.periodictable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9, calculate, reset;
    private EditText et;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        calculate = (Button) findViewById(R.id.calculate);
        reset = (Button) findViewById(R.id.reset);

        et = (EditText) findViewById(R.id.et);
        display = (TextView) findViewById(R.id.display);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(et.getText().toString() + btn1.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(et.getText().toString() + btn2.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(et.getText().toString() + btn3.getText().toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(et.getText().toString() + btn4.getText().toString());
            }
        });

        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(et.getText().toString() + btn5.getText().toString());
            }
        });

        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(et.getText().toString() + btn6.getText().toString());
            }
        });

        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(et.getText().toString() + btn7.getText().toString());
            }
        });

        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(et.getText().toString() + btn8.getText().toString());
            }
        });

        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(et.getText().toString() + btn9.getText().toString());
            }
        });

        calculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String str = et.getText().toString();
                for (int i=0; i<= str.length(); i++)
                {
                    int count = 1;
                    if (str.charAt(i) == str.charAt(i+1))
                    {
                        count = count++;
                    }
                }
                display.setText(str );
            }
        });

        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                et.setText(null);
            }
        });
    }
}
