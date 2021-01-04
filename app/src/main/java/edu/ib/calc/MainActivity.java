package edu.ib.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CalculatorModel cm = new CalculatorModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick0(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("0", tv);
    }

    public void onClick1(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("1", tv);
    }

    public void onClick2(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("2", tv);
    }

    public void onClick3(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("3", tv);
    }

    public void onClick4(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("4", tv);
    }

    public void onClick5(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("5", tv);
    }

    public void onClick6(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("6", tv);
    }

    public void onClick7(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("7", tv);
    }

    public void onClick8(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("8", tv);
    }

    public void onClick9(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendNumber("9", tv);
    }

    public void onClickC(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.C(tv);
    }

    public void onClickPM(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.plusMinus(tv);
    }

    public void onClickPercent(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.percent(tv);
    }

    public void onClickDivide(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendOperation("/", tv);
    }

    public void onClickMultiply(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendOperation("*", tv);
    }

    public void onClickMinus(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendOperation("-", tv);
    }

    public void onClickPlus(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.appendOperation("+", tv);
    }

    public void onClickDot(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.dot( tv);
    }

    public void onClickEquals(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        cm.equals(tv);
    }

}