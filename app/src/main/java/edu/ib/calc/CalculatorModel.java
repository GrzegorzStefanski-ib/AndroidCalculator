package edu.ib.calc;

import android.widget.TextView;

import java.util.regex.Pattern;
import org.mariuszgromada.math.mxparser.Expression;

import java.util.regex.Pattern;

public class CalculatorModel {
    private String regexNumberEnding = ".*[.\\d]$";
    private String regexZeroAsNumber = ".*[^.\\d]0$|^0$";
    private String regexDot = ".*[^.\\d-E]\\d+$|^\\d+$";

    public void appendNumber(String number, TextView display){

        if(number.compareTo("0") == 0){
            if( !Pattern.matches(regexZeroAsNumber, display.getText() )) {
                display.append("0");
            }

            //display.end();
            return;
        }

        if( Pattern.matches(regexZeroAsNumber, display.getText() )) {
            display.setText(number.toCharArray(), display.length() - 1 , 1);
        }
        else {
            display.append(number);
        }

        //display.end();
    }

    public void appendOperation(String operation, TextView display){
        if( Pattern.matches(regexNumberEnding, display.getText() )) {
            if(display.getText().toString().endsWith(".")) display.append("0");
            display.append(" " + operation + " ");
        }
        else {
            display.setText(operation.toCharArray(), display.length() - 2 , 1);
        }

        //display.end();
    }

    public void plusMinus(TextView display){
        if( Pattern.matches(regexNumberEnding, display.getText() )) {

            if (!display.getText().toString().contains(" ")){

                Double n = Double.parseDouble(display.getText().toString()) * -1;
                display.setText(n.toString());
                //display.end();
                return;

            }

            int i = display.getText().toString().lastIndexOf(" ");

            if( display.getText().toString().substring(i + 1, i + 2).compareTo("-") == 0 ) {
                display.setText("".toCharArray(), i + 1, 1);
            }
            else {
                display.setText(" -".toCharArray(), i , 1);
            }

            //display.end();

        }
    }

    public void percent(TextView display){

        if( Pattern.matches(regexNumberEnding, display.getText() )) {

            int i = display.getText().toString().lastIndexOf(" ") + 1;
            Double n = Double.parseDouble(display.getText().toString().substring( i )) / 100;
            //display.setText(n.toString().toCharArray(), i, display.length());

            String part1 = display.getText().toString().substring(0, i);
            //String part2 = display.getText().toString().substring(i + n.toString().length() - 1);
            display.setText(part1 + n.toString());

        }

        //display.end();
    }

    public void equals(TextView display){
        if(display.getText().toString().endsWith(".")) display.append("0");

        Expression e = new Expression(display.getText().toString());
        if(e.checkSyntax()) {
            display.setText(Double.toString(e.calculate()));
        }
    }

    public void dot(TextView display) {
        if( Pattern.matches(regexDot, display.getText() )) {
            display.append(".");
        }

        //display.end();
    }

    public void CE(TextView display){
        if(!display.getText().toString().isEmpty()){

            if(display.getText().toString().endsWith(" ")){
                display.setText(
                        display.getText().toString().substring(0, display.length() - 3)
                );
            }
            else {
                display.setText(
                        display.getText().toString().substring(0, display.length() - 1)
                );
            }

        }

        //display.end();
    }

    public void C(TextView display){
        display.setText("0");
    }
}

