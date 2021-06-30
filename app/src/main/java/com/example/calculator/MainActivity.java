package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import java.text.DecimalFormat;

import static java.lang.String.valueOf;

public class MainActivity extends AppCompatActivity {
    public Button button18,button17,button16,button15,button19,button14,button3,
    button2,button13,button12,button11,button,button10,button9,button8,button7,button6,button4,button5,button22;
    public  TextView textView;
    public TextView textView2;
    public TextView textView3;
    public  TextView textView4;
    String Symbol = "";
    String A ="";
    String B ="";
    String answer = "";

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button18 = findViewById(R.id.button18);
        button17 = findViewById(R.id.button17);
        button16 = findViewById(R.id.button16);
        button15 = findViewById(R.id.button15);
        button19 = findViewById(R.id.button19);
        button14 = findViewById(R.id.button14);
        button3 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);
        button13 = findViewById(R.id.button13);
        button12 = findViewById(R.id.button12);
        button11 = findViewById(R.id.button11);
        button10 = findViewById(R.id.button10);
        button9 = findViewById(R.id.button9);
        button8 = findViewById(R.id.button8);
        button7 = findViewById(R.id.button7);
        button6 = findViewById(R.id.button6);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button22 = findViewById(R.id.button22);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
    }

//    onClick listner for button '1'

    public void get1(View view){
        if(Symbol.isEmpty()) A+=button7.getText().toString();textView.setText(A); //if symbol is empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button7.getText().toString();textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//    onClick listner for button '2'
    public void get2(View view){
        if(Symbol.isEmpty()) A+=button8.getText().toString();textView.setText(A);//if symbol is empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button8.getText().toString();textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//       onClick listner for button '3'
    public void get3(View view){
        if(Symbol.isEmpty()) A+=button9.getText().toString();textView.setText(A);//if symbol is empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button9.getText().toString();textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//       onClick listner for button '4'
    public void get4(View view){
        if(Symbol.isEmpty()) A+=button11.getText().toString();textView.setText(A);//if symbol is empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button11.getText().toString();textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//    onClick listner for button '5'
    public void get5(View view){
        if(Symbol.isEmpty()) A+=button22.getText().toString();textView.setText(A);//if symbol is empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button22.getText().toString();textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//       onClick listner for button '6'
    public void get6(View view){
        if(Symbol.isEmpty()) A+=button14.getText().toString();textView.setText(A);//if symbol is empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button14.getText().toString();textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//       onClick listner for button '7'
    public void get7(View view){
        if(Symbol.isEmpty()) A+=button2.getText().toString();textView.setText(A);//if symbol is  empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button2.getText().toString();textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//    onClick listner for button '8'
    public void get8(View view){
        if(Symbol.isEmpty()) A+=button3.getText().toString(); textView.setText(A);//if symbol is empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button3.getText().toString(); textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//    onClick listner for button '9'
    public void get9(View view){
        if(Symbol.isEmpty()) A+=button12.getText().toString(); textView.setText(A);//if symbol is empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button12.getText().toString(); textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//    onClick listner for button '0'
    public void get0(View view){
        if(Symbol.isEmpty()) A+=button4.getText().toString(); textView.setText(A);//if symbol is empty then value goes to A//
        if(!Symbol.isEmpty()) B+=button4.getText().toString(); textView3.setText(B);//if symbol is not empty then value goes to B//

    }
//    onClick listner for button '.'
    public void get11(View view) {
        if (Symbol.isEmpty()) A += button5.getText().toString();textView.setText(A);//if symbol is empty then value goes to A//
        if (!Symbol.isEmpty()) B += button5.getText().toString();textView3.setText(B);//if symbol is not empty then value goes to B//

    }
    //  onClick listner for button 'AC'
    public void get12(View view){

        if(!A.isEmpty()){
            A = "";                  //it makes A empty
            textView.setText(A);
        }
        if(!B.isEmpty()){
            B = "";                 //  //it makes B empty
            textView3.setText(B);
        }
        if(!Symbol.isEmpty()){
            Symbol = "";            //  //it makes Symbol empty
            textView2.setText(Symbol);
        }
        if(!answer.isEmpty()){          //it makes answer empty
            answer = "";
            textView4.setText(answer);
        }
    }

    //   onClick listner for +/-
    //currently this function doesn't work
    public void get13(View view){

        if(Symbol.isEmpty()) A+=button17.getText().toString(); textView.setText(A);
        if(!Symbol.isEmpty()) B+=button17.getText().toString(); textView3.setText(B);

    }

    //         for %
    public void get14(View view){
        if(!A.isEmpty() && !B.isEmpty()){
            answer = getResult(A,B,Symbol);
            String temp = answer;
            textView4.setText(answer);
            A =  "";                          //if A and B is not empty and someone click this button
            A = temp;
            textView.setText(A);
            B = "";
            textView3.setText(B);
        }
        Symbol = button18.getText().toString();
        textView2.setText(Symbol);
    }

    //        for division
    public void get15(View view){
        if(!A.isEmpty() && !B.isEmpty()){
            answer = getResult(A,B,Symbol);
            String temp = answer;
            textView4.setText(answer);
            A =  "";
            A = temp;                         //if A and B is not empty and someone click this button
            textView.setText(A);
            B = "";
            textView3.setText(B);
        }
        Symbol = button19.getText().toString();
        textView2.setText(Symbol);
    }

    //        for multiplication
    public void get16(View view){
        if(!A.isEmpty() && !B.isEmpty()){
            answer = getResult(A,B,Symbol);
            String temp = answer;
            textView4.setText(answer);
            A =  "";
            A = temp;                       //if A and B is not empty and someone click this button
            textView.setText(A);
            B = "";
            textView3.setText(B);
        }
        Symbol = button15.getText().toString();
        textView2.setText(Symbol);
    }

    //        for -
    public void get17(View view){
        if(!A.isEmpty() && !B.isEmpty()){
            answer = getResult(A,B,Symbol);
            String temp = answer;
            textView4.setText(answer);
            A =  "";
            A = temp;                 //if A and B is not empty and someone click this button
            textView.setText(A);
            B = "";
            textView3.setText(B);
        }
        Symbol = button13.getText().toString();
        textView2.setText(Symbol);

    }
    //        for +
    public void get18(View view){
        if(!A.isEmpty() && !B.isEmpty()){
            answer = getResult(A,B,Symbol);
            String temp = answer;
            textView4.setText(answer);
            A =  "";                          //if A and B is not empty and someone click this button
            A = temp;
            textView.setText(A);
            B = "";
            textView3.setText(B);
        }
        Symbol = button10.getText().toString();
        textView2.setText(Symbol);

    }

    //        for =
    public void get19(View view){
        if (!A.isEmpty() && !B.isEmpty() && !Symbol.isEmpty()){    //if A, B and Symbol is not empty and someone click this button
            answer = getResult(A, B, Symbol);                      // this line will call the method getResult
            textView4.setText(answer);}
//        if(!A.isEmpty() && !B.isEmpty()){
//            answer = getResult(A,B,Symbol);
            String temp = answer;
//            textView4.setText(answer);
            A =  "";
            A = temp;                          //if A and B is not empty and someone click this button
            textView.setText(A);
            B = "";
            textView3.setText(B);
//        }
    }

    //            for ⌫
    public void get20(View view){
        if(!answer.isEmpty()){                  // if answer is  not empty
            if(B.isEmpty()) {                      // and then if B is empty
                int len = answer.length();         // then it will remove last element from answer and A
                answer = answer.substring(0, len - 1);
                textView4.setText(answer);
                A = A.substring(0, len - 1);
                textView.setText(A);
            }
            if(!B.isEmpty()){                       // and B is not empty
                int len = B.length();               //then it will remove last element from B
                B = B.substring(0,len-1);
                textView3.setText(B);
            }
        }
        if(answer.isEmpty() && !B.isEmpty()){
            int len = B.length();                   //if answer is empty and B is not empty
            B = B.substring(0,len-1);               // then it will remove last element from B
            textView3.setText(B);
        }
        if(answer.isEmpty() && B.isEmpty() && !Symbol.isEmpty()){
            Symbol = "";                                           //if answer and B is empty but Symbol is not empty
            textView2.setText(Symbol);                             // then it will remove symbol
        }
        if(answer.isEmpty() && B.isEmpty() && Symbol.isEmpty() && !A.isEmpty()){
            int len = A.length();                                    // if answer,B and Symbol is empty then it will remove element from A
            A = A.substring(0,len-1);
            textView.setText(A);
        }

    }


    //when you click = button then this method get called
    static  String getResult(String A, String B, String Symbol){
        String result = "";
        double result1;
        long result2;

        //if A or B both are double
        try {
            if (A.contains(".") || B.contains(".")) {
                double val1 = Double.parseDouble(valueOf(A));  // covering to string to double
                double val2 = Double.parseDouble(valueOf(B));

                try {

                    switch (Symbol) {
                        case "+":
                            try {
                                result1 = val1 + val2;
                                result = valueOf(result1);
//                textView4.setText(result);
                                break;
                            } catch (Exception e) {
                                result = "Invalid";
                            }

                        case "-":
                            try {
                                result1 = val1 - val2;
                                result = valueOf(result1);
//                textView4.setText(result);
                                break;
                            } catch (Exception e) {
                                result = "Invalid";
                            }
                        case "×":
                            try {
                                result1 = val1 * val2;
                                result = valueOf(result1);
//                textView4.setText(result);
                                break;
                            } catch (Exception e) {
                                result = "Invalid";
                            }
                        case "÷":
                            try {
                                result1 = val1 / val2;
                                result = valueOf(result1);
//                textView4.setText(result);
                                break;
                            } catch (Exception e) {
                                result = "Invalid";
                            }
                        case "%":
                            try {
                                result1 = val1 % val2;
                                result = valueOf(result1);
//                textView4.setText(result);
                                break;
                            } catch (Exception e) {
                                result = "Invalid";
                            }
                    }
                } catch (Exception e) {
                    result = "Invalid";
                }
            }
        }
        catch (Exception e){
            result = "Invalid";
        }

        //if A and B both are int value
        try {
            if (!A.contains(".") && !B.contains(".")) {
                long val1 = Long.parseLong(valueOf(A));
                long val2 = Long.parseLong(valueOf(B));

                try {
                    switch (Symbol) {

                        case "+":
                            try {
                                result2 = val1 + val2;
                                result = valueOf(result2);
//                textView4.setText(result);
                                break;
                            } catch (Exception e) {
                                result = "Invalid";
                            }

                        case "-":
                            try {
                                result2 = val1 - val2;
                                result = valueOf(result2);
//                textView4.setText(result);
                            } catch (Exception e) {
                                result = "Invalid";
                            }
                            break;
                        case "×":
                            try {
                                result2 = val1 * val2;
                                result = valueOf(result2);
//                textView4.setText(result);
                            } catch (Exception e) {
                                result = "Invalid";
                            }
                            break;
                        case "÷":
                            try {
                                if (val1 > 0 && val2 > 0 && val1 % val2 == 0) {
                                    result2 = val1 / val2;
                                    result = valueOf(result2);
                                }
                                if (val1 > 0 && val2 > 0 && val1 % val2 != 0) {
                                    result1 = (double) val1 / val2;
                                    df2.format(result1);
                                    result = valueOf(result1);
                                } else result = "Invalid";
//                textView4.setText(result);
                                break;
                            } catch (Exception e) {
                                result = "Invalid";
                            }
                        case "%":
                            try {
                                if (val1 > 0 & val2 > 0) {
                                    result2 = val1 % val2;
                                    result = valueOf(result2);
                                } else result = "Invalid";
//                textView4.setText(result);
                                break;
                            } catch (Exception e) {
                                result = "Invalid";
                            }
                    }
                } catch (Exception e) {
                    result = "Invalid";
                }
            }
        }
        catch (Exception e){
            result = "Invalid";
        }

        // this to round off value after "."
        try {
            int dotIn = result.indexOf(".");
            if (result.length() > 4 && result.contains(".") && result.length() == dotIn+2){
                result = result.substring(0, dotIn + 2);
            }
            else if (result.length() > 4 && result.contains(".")) {
                result = result.substring(0, dotIn + 3);
            }
        }
        catch (Exception e){
            result = "Invalid";
        }
        return result;
    }

}