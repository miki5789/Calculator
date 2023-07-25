package com.websarva.wings.android.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタンビューを3つ取得
        //Buttonオブジェクトを取得
        Button btClick00 = findViewById(R.id.bt00);
        Button btClick0 = findViewById(R.id.bt0);
        Button btClick1 = findViewById(R.id.bt1);
        Button btClick2 = findViewById(R.id.bt2);
        Button btClick3 = findViewById(R.id.bt3);
        Button btClick4 = findViewById(R.id.bt4);
        Button btClick5 = findViewById(R.id.bt5);
        Button btClick6 = findViewById(R.id.bt6);
        Button btClick7 = findViewById(R.id.bt7);
        Button btClick8 = findViewById(R.id.bt8);
        Button btClick9 = findViewById(R.id.bt9);
        Button btClickPeriod = findViewById(R.id.btperiod);
        Button btClickPercent = findViewById(R.id.btPercent);
        Button btClickPlus = findViewById(R.id.btPlus);
        Button btClickMinus = findViewById(R.id.btMinus);
        Button btClickDivision = findViewById(R.id.btDivision);
        Button btClickMulti = findViewById(R.id.btMulti);
        Button btClickDelete = findViewById(R.id.btDelete);
        Button btClickClear = findViewById(R.id.btClear);
        Button btClickEqual = findViewById(R.id.btEqual);

        //リスナクラスのインスタンスを作成
        ButtonClickListener listener = new ButtonClickListener();

        //ボタンにButtonClickListenerインスタンスをセット
        btClick00.setOnClickListener(listener);
        btClick0.setOnClickListener(listener);
        btClick1.setOnClickListener(listener);
        btClick2.setOnClickListener(listener);
        btClick3.setOnClickListener(listener);
        btClick4.setOnClickListener(listener);
        btClick5.setOnClickListener(listener);
        btClick6.setOnClickListener(listener);
        btClick7.setOnClickListener(listener);
        btClick8.setOnClickListener(listener);
        btClick9.setOnClickListener(listener);

        btClickPeriod.setOnClickListener(listener);
        btClickPercent.setOnClickListener(listener);
        btClickPlus.setOnClickListener(listener);
        btClickMinus.setOnClickListener(listener);
        btClickDivision.setOnClickListener(listener);
        btClickMulti.setOnClickListener(listener);
        btClickDelete.setOnClickListener(listener);
        btClickClear.setOnClickListener(listener);
        btClickEqual.setOnClickListener(listener);
        }

    int num_list[] = { 0,1,2,3,4,5,6,7,8,9 };
    String str_list[] = {"÷", "×", "+", "-", "="};
    List<String> l = Arrays.asList(str_list);
    boolean defaultFlg;

    //ボタンがタップされたときのリスナクラス
    private class ButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            //現在の表示を出力するテキストビューを取得
            TextView output = findViewById(R.id.tvResult);
            //サブ画面のテキストビューを取得
            TextView sub = findViewById(R.id.tvSub);

            //押されたボタンのidを取得
            int input = view.getId();

            String str = output.getText().toString();
            /*
            //初期値に文字を追加する場合
            if (str.equals("0")){
                defaultFlg = false;
                str = "";
            }
            else{
                defaultFlg = true;
            }
            */

            //int now = Integer.parseInt(str);
            //押されたボタンのidによって条件分岐
            switch (input) {

                case R.id.btperiod:
                    //テキスト『』を表示
                    output.setText(str + ".");
                    break;

                //00ボタンの時
                case R.id.bt00:
                    //テキスト『』を表示
                    if (str.equals("0")){
                    }
                    else {
                        output.setText(str + "00");
                    }
                    break;

                //0-9ボタンの時
                case R.id.bt0:
                    if (str.equals("0")){
                    }
                    else {
                        output.setText(str + "0");
                    }
                    break;

                case R.id.bt1:
                    //テキスト『』を表示
                    if (str.equals("0")){
                        output.setText("1");
                    }
                    else {
                        output.setText(str + "1");
                    }

                    break;

                case R.id.bt2:
                    //テキスト『』を表示
                    if (str.equals("0")){
                        output.setText("2");
                    }
                    else {
                        output.setText(str + "2");
                    }
                    break;
                case R.id.bt3:
                    //テキスト『』を表示
                    if (str.equals("0")){
                        output.setText("3");
                    }
                    else {
                        output.setText(str + "3");
                    }
                    break;
                case R.id.bt4:
                    //テキスト『』を表示
                    if (str.equals("0")){
                        output.setText("4");
                    }
                    else {
                        output.setText(str + "4");
                    }
                    break;
                case R.id.bt5:
                    //テキスト『』を表示
                    if (str.equals("0")){
                        output.setText("5");
                    }
                    else {
                        output.setText(str + "5");
                    }
                    break;
                case R.id.bt6:
                    //テキスト『』を表示
                    if (str.equals("0")){
                        output.setText("6");
                    }
                    else {
                        output.setText(str + "6");
                    }
                    break;
                case R.id.bt7:
                    //テキスト『』を表示
                    if (str.equals("0")){
                        output.setText("7");
                    }
                    else {
                        output.setText(str + "7");
                    }
                    break;
                case R.id.bt8:
                    //テキスト『』を表示
                    if (str.equals("0")){
                        output.setText("8");
                    }
                    else {
                        output.setText(str + "8");
                    }
                    break;
                case R.id.bt9:
                    //テキスト『』を表示
                    if (str.equals("0")){
                        output.setText("9");
                    }
                    else {
                        output.setText(str + "9");
                    }
                    break;
                case R.id.btPercent:
                    //テキスト『』を表示

                    output.setText(str + "%");
                    break;

                case R.id.btDivision:
                    //最後の一文字が記号で記号を入力した場合、末尾の古い記号を消す
                    if (l.contains(str.substring(0, str.length() - 1))){
                        str = str.substring(0, str.length() - 1);
                    }
                    //テキスト『』を表示
                    output.setText(str + "÷");
                    break;
                case R.id.btMulti:
                    //最後の一文字が記号で記号を入力した場合、末尾の古い記号を消す
                    if (l.contains(str.substring(0, str.length() - 1))) {
                        str = str.substring(0, str.length() - 1);
                    }

                    //テキスト『』を表示
                    output.setText(str + "×");
                    break;
                case R.id.btPlus:
                    //最後の一文字が記号で記号を入力した場合、末尾の古い記号を消す
                    if (l.contains(str.substring(0, str.length() - 1))) {
                        str = str.substring(0, str.length() - 1);
                    }
                    //テキスト『』を表示
                    output.setText(str + "+");
                    break;
                case R.id.btMinus:
                    //最後の一文字が記号で記号を入力した場合、末尾の古い記号を消す
                    if (l.contains(str.substring(0, str.length() - 1))) {
                        str = str.substring(0, str.length() - 1);
                    }
                    //テキスト『』を表示
                    output.setText(str + "-");
                    break;


                case R.id.btClear:
                    //テキスト『』を表示
                    output.setText("0");
                    break;
                case R.id.btDelete:
                    //もともとが1文字しかなければ0を出力
                    if (str.length()==1){
                        str = "0";
                    }
                    else { //1文字消す
                        str = str.substring(0, str.length() - 1);
                    }
                    output.setText(str);
                    break;
                case R.id.btEqual:
                    //最後の一文字が記号で記号を入力した場合、末尾の古い記号を消す
                    if (l.contains(str.substring(0, str.length() - 1))) {
                        str = str.substring(0, str.length() - 1);
                    }

                    String calcStr = output.getText().toString();
                    double calc = calcCheck(calcStr);
                    //整数ならIntegerにした上でStringにする
                    if (calc%1 == 0.0){
                        int intCalc = (int)calc;
                        str = String.valueOf(intCalc);
                    }
                    else{//小数点ならそのままStringにする
                        str = String.valueOf(calc);
                    }

                    output.setText(str);
                    break;
                default:
                    sub.setText("数式エラー");
                }//switch
            } //onClick
        }//View on ClickListener



    public static Double calcCheck(String calcStr) { //calcStrがユーザーが入力した計算式

        //空のストリング、カウント、フラグ、リストをつくっておく
        String str = ""; //１文字退避用
        String astr = ""; //数字が続いた場合に退避させる数字保管用

        int cnt = 0; //記号の数をカウント
        int flg = 0;
        List<String> bstr = new ArrayList<>();

        while (calcStr.length() != 0) { //calcstr内にすでにデータがある場合→２文字目以降の入力なら
            //substringメソッドを利用することで、文字列のbegin+1～end文字目を抜き出すことができます。
            str = calcStr.substring(0, 1);
            if (str.equals("0") || str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8") || str.equals("9") || str.equals(".") || str.equals("%")) {
                //数字もしくはピリオドなら、astrリストにたしていく
                astr = astr + str;
                //最後の一文字が%の場合、1/100の値にする
                if (astr.substring(astr.length() - 1, astr.length()).equals("%")){
                    String a = astr.substring(0, astr.length() - 1);
                    double kazu = Double.parseDouble(astr.substring(0, astr.length() - 1));
                    kazu = kazu / 100;
                    astr = String.valueOf(kazu);
                }
            }
            //数字でないなら（記号なら）
            else if (str.equals("+") || str.equals("-") || str.equals("×") || str.equals("÷")) {
                cnt += 2;

                //bstrリストに追加

                bstr.add(astr);
                bstr.add(str);
                astr = "";
            }


            calcStr = calcStr.substring(1);
        }

        if (cnt != 0) { //記号がいっこでもあれば
            //astrをbstrに追加
            bstr.add(astr);
        }

    /*
    for (int i = 0; i < bstr.size(); i++) {
        System.out.println(bstr.get(i));
    }


    */

        double cint = 0.0;
        String estr = "";
        double total = 0.0;

        total = Double.parseDouble(bstr.get(0));

        for (int i = 1; i < bstr.size(); i = i + 2) {
            estr = bstr.get(i);
            cint = Double.parseDouble(bstr.get(i + 1));

            if (estr.equals("+")) {
                total = total + cint;
            }
            else if (estr.equals("-")) {
                total = total - cint;
            }
            else if (estr.equals("×")) {
                total = total * cint;
            }
            else if (estr.equals("÷")) {
                total = total / cint;
            }
        }

        return total;
    }
}