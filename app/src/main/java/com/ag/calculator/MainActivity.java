package com.ag.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    TextView result,operation;
    Button add,subtract,multiply,division,clear,use;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        result=findViewById(R.id.result);
        operation=findViewById(R.id.operation);
        add=findViewById(R.id.add);
        subtract=findViewById(R.id.sub);
        multiply=findViewById(R.id.mul);
        division=findViewById(R.id.div);
        clear=findViewById(R.id.clear);
        use=findViewById(R.id.use);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub();
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mul();
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

        operation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                use();
            }
        });

    }

    public void add(){
        if (num1.getText().length()==0 || num2.getText().length()==0){
            Toast.makeText(this, "Please Enter Values", Toast.LENGTH_SHORT).show();
        }
        else {
            String x = num1.getText().toString();
            String y = num2.getText().toString();

            float z = Float.parseFloat(x) + Float.parseFloat(y);

            String res = Float.toString(z);
            result.setText(res);
            operation.setText("+");
        }

    }

    public void sub(){
       if (num1.getText().length()==0 || num2.getText().length()==0){
           Toast.makeText(this, "Please Enter Values", Toast.LENGTH_SHORT).show();
       }
       else {
           String x = num1.getText().toString();
           String y = num2.getText().toString();

           float z = Float.parseFloat(x) - Float.parseFloat(y);

           String res = Float.toString(z);
           result.setText(res);
           operation.setText("-");
       }

    }

    public void mul(){
        if (num1.getText().length()==0 || num2.getText().length()==0){
            Toast.makeText(this, "Please Enter Values", Toast.LENGTH_SHORT).show();
        }
        else {
            String x = num1.getText().toString();
            String y = num2.getText().toString();

            float z = Float.parseFloat(x) * Float.parseFloat(y);

            String res = Float.toString(z);
            result.setText(res);
            operation.setText("X");
        }

    }

    public void div(){
        if (num1.getText().length()==0 || num2.getText().length()==0){
            Toast.makeText(this, "Please Enter Values", Toast.LENGTH_SHORT).show();
        }
        else {
            String x = num1.getText().toString();
            String y = num2.getText().toString();

            float z = Float.parseFloat(x) / Float.parseFloat(y);

            String res = Float.toString(z);
            result.setText(res);

            operation.setText("/");
        }

    }

    public void clear(){
        num1.setText("");
        num2.setText("");
        result.setText("");
        operation.setText("");
    }

    public void use(){
        if (result.getText().length()>0){
           String a= result.getText().toString();
           num1.setText(a);
           num2.setText("");
           operation.setText("");
           result.setText("");
        }
        else {
            Toast.makeText(this, "There is no Result to use", Toast.LENGTH_SHORT).show();
        }

    }


}