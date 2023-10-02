package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    TextView result,solution;
    MaterialButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bMultiply,bPlus,bMinus,bEqual,bDivide,bC,bDot,bAc,bRbracket,bLbracket,bZero;
    String math,oldValue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result_tv);
        solution=findViewById(R.id.solution_tv);
        b1=findViewById(R.id.button_1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String buttonText=b1.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);


            }
        });

        b2=findViewById(R.id.button_2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=b2.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        b3=findViewById(R.id.button_3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=b3.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        b4=findViewById(R.id.button_4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=b4.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        b5=findViewById(R.id.button_5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=b5.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        b6=findViewById(R.id.button_6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=b6.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        b7=findViewById(R.id.button_7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=b7.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        b8=findViewById(R.id.button_8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=b8.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        b9=findViewById(R.id.button_9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=b9.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        bC=findViewById(R.id.button_clear);
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String data=solution.getText().toString();
                    data=data.substring(0,data.length()-1);
                    if(!solution.getText().toString().equals("0")) solution.setText(data);
                }catch (Exception e){
                    solution.setText("0");
                }
            }
        });
        bMultiply=findViewById(R.id.button_multiply);
        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldValue=solution.getText().toString();
                String buttonText=bMultiply.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);
                math="*";
                solution.setText("*");


            }
        });
        bPlus=findViewById(R.id.button_plus);
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=bPlus.getText().toString();
                oldValue=solution.getText().toString();
                math="+";
                solution.setText("+");

            }
        });
        bMinus=findViewById(R.id.button_mius);
        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldValue=solution.getText().toString();
                String buttonText=bMinus.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);
                math="-";
                solution.setText("-");

            }
        });
        bDivide=findViewById(R.id.button_divide);
        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldValue=solution.getText().toString();
                String buttonText=bDivide.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);
                math="/";
                solution.setText("/");

            }
        });
        bDot=findViewById(R.id.button_dot);
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=bDot.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);
                datatocalculate+=buttonText;
                datatocalculate+=buttonText;
            }
        });
        bEqual=findViewById(R.id.button_equal);
        bEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=bEqual.getText().toString();
                float v1=Float.parseFloat(oldValue);
                float v2=Float.parseFloat(
                        solution.getText().toString()
                                .replace("+","")
                                .replace("-","")
                                .replace("/","")
                                .replace("*",""));
                if (math == "+") {
                    float ans=v1+v2;

                    result.setText(""+ans);
                }else if (math == "-") {
                    float ans=v1-v2;

                    result.setText(""+ans);
                }
                else if (math == "/") {
                    float ans=v1/v2;

                    result.setText(""+ans);
                }
                else if (math == "*") {
                    float ans=(v1*v2);

                    result.setText(""+ans);
                }



            }
        });
        bLbracket=findViewById(R.id.button_lbracket);
        bLbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=bLbracket.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        bRbracket=findViewById(R.id.button_rbracket);
        bRbracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=bRbracket.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
        bAc=findViewById(R.id.button_clear_a);
        bAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solution.setText(" ");
                result.setText("0");

            }
        });
        bZero=findViewById(R.id.button_zero);
        bZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttonText=bZero.getText().toString();
                String datatocalculate=solution.getText().toString();
                datatocalculate+=buttonText;
                solution.setText(datatocalculate);

            }
        });
    }

}