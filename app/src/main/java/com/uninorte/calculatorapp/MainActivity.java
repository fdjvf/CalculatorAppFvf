package com.uninorte.calculatorapp;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float Operator1;
    float Operator2;
    int NumberOfOperators=0;
    int Decimal=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CalculatorAction(View view) {
        Button MyButton=(Button)view;
        TextView Txt=(TextView)findViewById(R.id.Result);
       String Action=MyButton.getText().toString();
        String T=Txt.getText().toString();
        switch (Action)

        {
            case "0":
                Txt.setText(Txt.getText()+"0");
                break;
            case ".":
              if (Decimal==0)
              {
                  Txt.setText(Txt.getText()+".");
                  Decimal++;
              }




                break;
            case "1":
                Txt.setText(Txt.getText()+"1");

                break;
            case "2":
                Txt.setText(Txt.getText()+"2");
                break;
            case "3":
                Txt.setText(Txt.getText()+"3");
                break;
            case "4":
                Txt.setText(Txt.getText()+"4");
                break;
            case "5":
                Txt.setText(Txt.getText()+"5");
                break;
            case "6":
                Txt.setText(Txt.getText()+"6");
                break;
            case "7":
                Txt.setText(Txt.getText()+"7");
                break;
            case "8":
                Txt.setText(Txt.getText()+"8");
                break;
            case "9":
                Txt.setText(Txt.getText()+"9");
                break;
            case "=":
                String[]Operators;
                Float Result=0f;
                if (T.contains("+"))
                {
                    Operators= T.split("\\+");
                    Operator1=Float.parseFloat(Operators[0]);
                    Operator2= Float.parseFloat(Operators[1]);
                    Result=Operator1+Operator2;
                }else
                {
                    Operators= T.split("/");
                    Operator1=Float.parseFloat(Operators[0]);
                    Operator2= Float.parseFloat(Operators[1]);
                    if (Operator2==0f)
                    {
                        Toast.makeText(getApplicationContext(),"Division por cero",Toast.LENGTH_LONG).show();
                        return;
                    }

                    Result=Operator1/Operator2;


                }
                Txt.setText(Result+"");
                NumberOfOperators=0;
                Decimal=1;
                    //TODO CALCULAR
                break;
            case "+":

                if (NumberOfOperators==0)
                {
                    Txt.setText(Txt.getText()+"+");
                    NumberOfOperators++;
                    Decimal=0;
                }


                break;
            case "/":

                if (NumberOfOperators==0)
                {
                    Txt.setText(Txt.getText()+"/");
                    NumberOfOperators=0;
                }
                break;
            case "CE":
                Txt.setText("0");
                NumberOfOperators=0;
                Decimal=0;
                break;

        }
                }
}
