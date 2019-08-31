package com.example.caltest;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textChar;
    EditText editText2;
    private DecimalFormat myFormatter = new DecimalFormat("###,###");
    //ArrayList arrayList = new ArrayList();
    private String formattedStringPrice;
    int count = 0;

    ArrayList<String> list = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonclear = (Button) findViewById(R.id.buttonclear);
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                try {
                    textView.setText("");
                    editText2.setText("");

                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "값이 존재 하지 않습니다", Toast.LENGTH_SHORT).show();

                }
            }
        });
        Button buttondel = (Button) findViewById(R.id.buttondel);
        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    String s = textView.getText().toString();
                    if (s.length() > 0) {
                        textView.setText(s.substring(0, s.length() - 1));
                        editText2.setText(s.substring(0, s.length() - 1));
                    } else {
                        Toast.makeText(MainActivity.this, "값이 존재 하지 않습니다", Toast.LENGTH_SHORT).show();
                    }


                } catch (Exception e) {
                    e.printStackTrace();

                }

            }
        });


        final Button button1 = (Button) findViewById(R.id.button1);
        /*button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textView.getText().toString() + "1");
            }
        });*/
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final Button button4 = (Button) findViewById(R.id.button4);
        final Button button5 = (Button) findViewById(R.id.button5);
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button0 = (Button) findViewById(R.id.button0);
        final Button button00 = (Button) findViewById(R.id.button00);
        final Button buttonAdd = (Button) findViewById(R.id.buttonAdd);
        /*buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=1;
                textChar.setText("+");
            }
        });*/
        final Button ButtonSub = (Button) findViewById(R.id.ButtonSub);

        final Button buttonmul = (Button) findViewById(R.id.buttonmul);

        final Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        final Button buttonPoint = (Button) findViewById(R.id.buttonPoint);
        final Button buttonequal = (Button) findViewById(R.id.buttonequal);
        textView = (TextView) findViewById(R.id.textView);
        //textChar = (TextView) findViewById(R.id.textChar);
        editText2 = (EditText) findViewById(R.id.editText2);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(v.getContext(), ((Button)v).getText(), Toast.LENGTH_SHORT).show(); 버튼 입력시 토스트 확인


                switch (v.getId()) {

                    case R.id.button0:
                        textView.setText(textView.getText().toString() + "0");
                        editText2.setText(textView.getText().toString());

                        break;

                    case R.id.button00:
                        textView.setText(textView.getText().toString() + "00");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.button1:
                        textView.setText(textView.getText().toString() + "1");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.button2:
                        textView.setText(textView.getText().toString() + "2");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.button3:
                        textView.setText(textView.getText().toString() + "3");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.button4:
                        textView.setText(textView.getText().toString() + "4");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.button5:
                        textView.setText(textView.getText().toString() + "5");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.button6:
                        textView.setText(textView.getText().toString() + "6");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.button7:
                        textView.setText(textView.getText().toString() + "7");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.button8:
                        textView.setText(textView.getText().toString() + "8");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.button9:
                        textView.setText(textView.getText().toString() + "9");
                        editText2.setText(textView.getText().toString());
                        break;

                    case R.id.buttonAdd:
                        //arrayList.add(textView.getText().toString());
                        //textChar.setText(((Button) v).getText().toString());
                        textView.setText(textView.getText().toString() + "+");
                        editText2.setText(textView.getText().toString());


                        //textView.setText("");
                        count = 1;
                        break;

                    case R.id.ButtonSub:

                        //textChar.setText(((Button) v).getText().toString());
                        textView.setText(textView.getText().toString() + "-");
                        editText2.setText(textView.getText().toString());
                        //value1 = getTextValueFloat();
                        count = 2;
                        break;

                    case R.id.buttonmul:

                        //textChar.setText(((Button) v).getText().toString());
                        textView.setText(textView.getText().toString() + "*");
                        editText2.setText(textView.getText().toString());

                        count = 3;
                        break;

                    case R.id.buttonDiv:

                        //textChar.setText(((Button) v).getText().toString());
                        textView.setText(textView.getText().toString() + "/");
                        editText2.setText(textView.getText().toString());

                        count = 4;
                        break;

                    case R.id.buttonPoint:

                        textView.setText(textView.getText().toString() + ".");
                        editText2.setText(textView.getText().toString());

                        break;

                    case R.id.buttonequal:
                        try {
                            showResult(calculate(textView.getText().toString()));
                        } catch (Exception e) {
                            e.printStackTrace();
                            Toast.makeText(MainActivity.this, "값이 존재 하지 않습니다", Toast.LENGTH_SHORT).show();
                        }


                        break;

                }//스위치문 종료


            }
        };

        button0.setOnClickListener(clickListener);
        button00.setOnClickListener(clickListener);
        button1.setOnClickListener(clickListener);
        button2.setOnClickListener(clickListener);
        button3.setOnClickListener(clickListener);
        button4.setOnClickListener(clickListener);
        button5.setOnClickListener(clickListener);
        button6.setOnClickListener(clickListener);
        button7.setOnClickListener(clickListener);
        button8.setOnClickListener(clickListener);
        button9.setOnClickListener(clickListener);
        buttonAdd.setOnClickListener(clickListener);
        ButtonSub.setOnClickListener(clickListener);
        buttonmul.setOnClickListener(clickListener);
        buttonDiv.setOnClickListener(clickListener);
        buttonequal.setOnClickListener(clickListener);
        buttonPoint.setOnClickListener(clickListener);

    } //onCreate문 종료

    @Override
    public void onBackPressed() {

        // Alert을 이용해 종료시키기

        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

        dialog.setTitle("종료 알림")

                .setMessage("정말 종료하시겠습니까?")

                .setPositiveButton("종료합니다", new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialog, int which) {

                        finish();

                    }

                })

                .setNegativeButton("아니요", new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(MainActivity.this, "종료하지 않습니다", Toast.LENGTH_SHORT).show();

                    }

                }).create().show();

    }

    //메인클래스종료


    public String calculate(String str) {

        String split[] = str.split("(?<=[*/+-])|(?=[*/+-])"); // 기호( +, -, *, / ) 를 구분하는 정규표현식

        list = new ArrayList<String>(); //숫자 , 기호로 나누어 담을 ArrayList생성

        int i = 0;
        for (i = 0; i < split.length; i++) {
            list.add(i, split[i]);  // 수식을 숫자부분과 기호부분으로 나누어 ArrayList에 담는다.
        }

        Log.d("TAG", "str , 제거전전 값 : " + list.get(0));

        double pre = 0, suf = 0; // 수식의 앞숫자(pre) 와 뒷숫자 (suf)
        double result = 0;

        Double.parseDouble(list.get(0).replaceAll(",", ""));
        Log.d("TAG", "str , 제거후 값 : " + list.get(0));

        //곱셈
        for (i = 0; i < list.size(); i++) {

            Log.d("TAG", "str , 제거후 값 : " + list.get(0));
            //
            if (list.get(i).equals("*")) {
                //Log.d("TAG", "list.get(i) : " + list.get(i));
                pre = Double.parseDouble(list.get(i - 1).replaceAll(",", ""));
                //pre = Double.parseDouble(list.get(i-1)); // 기호의 앞숫자(pre)와
                //Log.d("TAG", "첫번째 숫자 : " + pre);
                suf = Double.parseDouble(list.get(i + 1)); // 기호의 뒷숫자(suf)를
                //Log.d("TAG", "두번째 숫자 : " + suf);
                result = pre * suf; //곱해준다
                formattedStringPrice = myFormatter.format(result);
                //Log.d("TAG", "변환된 값 :  " + formattedStringPrice);
                //list.set(i, result+""); //*기호를 곱하기의 결과로 바꿔준다.
                list.set(i, formattedStringPrice + "");
                list.remove(i - 1); //pre를 제거한다.
                list.remove(i); // suf를 제거한다.
            }
        }
        // 나눗셈(나누기)
        for (i = 0; i < list.size(); i++) {
            if (list.get(i).equals("/")) {

                //Log.d("TAG", "list.get(i) : " + list.get(i));
                pre = Double.parseDouble(list.get(i - 1).replaceAll(",", ""));
                //pre = Double.parseDouble(list.get(i-1)); // 기호의 앞숫자(pre)와
                //Log.d("TAG", "첫번째 숫자 : " + pre);
                suf = Double.parseDouble(list.get(i + 1)); // 기호의 뒷숫자(suf)를
                //Log.d("TAG", "두번째 숫자 : " + suf);
                result = pre / suf; //나눠준다
                formattedStringPrice = myFormatter.format(result);
                //Log.d("TAG", "변환된 값 :  " + formattedStringPrice);
                //list.set(i, result+""); // /기호를 나누기 결과로 바꿔준다.
                list.set(i, formattedStringPrice + "");
                list.remove(i - 1); //pre를 제거한다.
                list.remove(i); // suf를 제거한다.
            }
        }


        // 덧셈(더하기)
        for (i = 0; i < list.size(); i++) {
            if (list.get(i).equals("+")) {
                Log.d("TAG", "list.get(i) : " + list.get(i));
                pre = Double.parseDouble(list.get(i - 1).replaceAll(",", ""));
                //pre = Double.parseDouble(list.get(i-1)); // 기호의 앞숫자(pre)와
                //Log.d("TAG", "첫번째 숫자 : " + pre);
                suf = Double.parseDouble(list.get(i + 1)); // 기호의 뒷숫자(suf)를
                //Log.d("TAG", "두번째 숫자 : " + suf);
                result = pre + suf; //더해준다
                formattedStringPrice = myFormatter.format(result);
                //Log.d("TAG", "변환된 값 :  " + formattedStringPrice);
                //list.set(i, result+""); //+기호를 더하기 결과로 바꿔준다.
                list.set(i, formattedStringPrice + "");
                list.remove(i - 1); //pre를 제거한다.
                list.remove(i); // suf를 제거한다.
            }
        }


        // 뺄셈(빼기)
        for (i = 0; i < list.size(); i++) {
            if (list.get(i).equals("-")) {
                //Log.d("TAG", "list.get(i) : " + list.get(i));
                pre = Double.parseDouble(list.get(i - 1).replaceAll(",", ""));
                //pre = Double.parseDouble(list.get(i-1)); // 기호의 앞숫자(pre)와
                //Log.d("TAG", "첫번째 숫자 : " + pre);
                suf = Double.parseDouble(list.get(i + 1)); // 기호의 뒷숫자(suf)를
                //Log.d("TAG", "두번째 숫자 : " + suf);
                result = pre - suf; //빼준다
                formattedStringPrice = myFormatter.format(result);
                //Log.d("TAG", "변환된 값 :  " + formattedStringPrice);
                //list.set(i, result+""); //-기호를 빼기 결과로 바꿔준다.
                list.set(i, formattedStringPrice + "");
                list.remove(i - 1); //pre를 제거한다.
                list.remove(i); // suf를 제거한다.
            }
        }

        return list.get(0); //결과 리턴

    }

    public void showResult(String str) {
        Log.d("TAG", "str , 제거전 값 : " + str);

        textView.setText(str);
    }


}

/*
                    case R.id.buttonequal :
                    {

                        switch (count) {
                            case 1 :
                                value1 = value1 + value2;
                                break;
                            case 2 :
                                value1 = value1 - value2;
                                break;
                            case 3 :
                                value1 = value1 * value2;
                                break;
                            case 4 :
                                value1 = value1 / value2;
                                break;
                        }
                        String strText = Float.toString(value1);

                        textView.setText(strText);

                        calcMode = 0;

                        break;
                    }
*/

                    /*case R.id.buttonequal :
                        int sum1 = 0, sum2 = 0 , sum3, count2=0;
                        double fsum1 = 0, fsum2 = 0, fsum3 = 0;

                        if (arrayList.isEmpty()) {
                            //textView.setText("");
                        } else {

                            Object obj = arrayList.get(0);
                            String num1 = (String) obj;
                            String num2 = textView.getText().toString();

                            if(num1.contains(".") || num2.contains(".")) {

                                count2 = 1;
                                fsum1 = Float.parseFloat(num1);
                                fsum2 = Float.parseFloat(num2);
                            } else {
                                sum1 = Integer.parseInt(num1);
                                sum2 = Integer.parseInt(num2);
                                //sum3 = 0;
                            }

                            String val = "";

                            switch (count) {
                                case 0 :
                                    textView.setText("");

                                case 1 :

                                    if (count2 ==1) {

                                        fsum3 = fsum1 + fsum2;

                                        val = String.valueOf(fsum3);
                                    } else {
                                        sum3 = sum1 + sum2;
                                        val = String.valueOf(sum3);
                                    }
                                    textView.setText(val);
                                    arrayList.clear();
                                    break;

                                case 2 :

                                    if (count2 ==1) {
                                        fsum3 = fsum1 - fsum2;
                                        val = String.valueOf(fsum3);

                                    } else {
                                        sum3 = sum1 - sum2;
                                        val = String.valueOf(sum3);
                                    }
                                    textView.setText(val);
                                    arrayList.clear();
                                    break;

                                case 3 :

                                    if (count2 ==1) {
                                       fsum3 = fsum1 * fsum2;
                                       val = String.valueOf(fsum3);
                                    } else {
                                        sum3 = sum1 * sum2;
                                        val = String.valueOf(sum3);
                                    }
                                    textView.setText(val);
                                    arrayList.clear();
                                    break;

                                case 4 :

                                    if (count2 ==1) {
                                        fsum3 = fsum1 / fsum2;
                                        val = String.valueOf(fsum3);
                                    } else {
                                        sum3 = sum1 / sum2;
                                        val = String.valueOf(sum3);
                                    }
                                    textView.setText(val);
                                    arrayList.clear();
                                    break;
                            }
                        }*/
// break;





