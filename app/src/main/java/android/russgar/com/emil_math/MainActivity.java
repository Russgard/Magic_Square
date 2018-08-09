package android.russgar.com.emil_math;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView randomNumber;
    TextView totalLineOne;
    TextView totalLineTwo;
    TextView totalLineThree;
    TextView totalLineFour;
    TextView totalLineFive;
    TextView totalColOne;
    TextView totalColTwo;
    TextView totalColThree;
    TextView totalColFour;
    TextView totalColFive;
    TextView totalDiagUp;
    TextView totalDiagDown;
    TextView wellDone;
    EditText box1;
    EditText box2;
    EditText box3;
    EditText box4;
    EditText box5;
    EditText box6;
    EditText box7;
    EditText box8;
    EditText box9;
    EditText box10;
    EditText box11;
    EditText box12;
    EditText box13;
    EditText box14;
    EditText box15;
    EditText box16;
    EditText box17;
    EditText box18;
    EditText box19;
    EditText box20;
    EditText box21;
    EditText box22;
    EditText box23;
    EditText box24;
    EditText box25;
    Random rand;
    ImageView playOrStop;
    ColorStateList oldColors;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_scroll);
        mediaPlayer = MediaPlayer.create(this, R.raw.ring);
        randomNumber = (TextView) findViewById(R.id.ramdomNumber);
        totalLineOne = (TextView) findViewById(R.id.totalLineOne);
        totalLineTwo = (TextView) findViewById(R.id.totalLineTwo);
        totalLineThree = (TextView) findViewById(R.id.totalLineThree);
        totalLineFour = (TextView) findViewById(R.id.totalLineFour);
        totalLineFive = (TextView) findViewById(R.id.totalLineFive);
        totalColOne = (TextView) findViewById(R.id.totalColOne);
        totalColTwo = (TextView) findViewById(R.id.totalColTwo);
        totalColThree = (TextView) findViewById(R.id.totalColThree);
        totalColFour = (TextView) findViewById(R.id.totalColFour);
        totalColFive = (TextView) findViewById(R.id.totalColFive);
        totalDiagDown = (TextView) findViewById(R.id.totalDiagDown);
        totalDiagUp = (TextView) findViewById(R.id.totalDiagUp);
        wellDone = (TextView) findViewById(R.id.wellDone);
        oldColors = totalLineOne.getTextColors();
        box1 = (EditText) findViewById(R.id.box1);
        box2 = (EditText) findViewById(R.id.box2);
        box3 = (EditText) findViewById(R.id.box3);
        box4 = (EditText) findViewById(R.id.box4);
        box5 = (EditText) findViewById(R.id.box5);
        box6 = (EditText) findViewById(R.id.box6);
        box7 = (EditText) findViewById(R.id.box7);
        box8 = (EditText) findViewById(R.id.box8);
        box9 = (EditText) findViewById(R.id.box9);
        box10 = (EditText) findViewById(R.id.box10);
        box11 = (EditText) findViewById(R.id.box11);
        box12 = (EditText) findViewById(R.id.box12);
        box13 = (EditText) findViewById(R.id.box13);
        box14 = (EditText) findViewById(R.id.box14);
        box15 = (EditText) findViewById(R.id.box15);
        box16 = (EditText) findViewById(R.id.box16);
        box17 = (EditText) findViewById(R.id.box17);
        box18 = (EditText) findViewById(R.id.box18);
        box19 = (EditText) findViewById(R.id.box19);
        box20 = (EditText) findViewById(R.id.box20);
        box21 = (EditText) findViewById(R.id.box21);
        box22 = (EditText) findViewById(R.id.box22);
        box23 = (EditText) findViewById(R.id.box23);
        box24 = (EditText) findViewById(R.id.box24);
        box25 = (EditText) findViewById(R.id.box25);
        playOrStop = (ImageView) findViewById(R.id.playOrStop);
        rand = new Random();

        box1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(1,1, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        box2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(1, 2, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(1, 3, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(1, 4, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(1, 5, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(2, 1, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(2, 2, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(2, 3, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(2, 4, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box10.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(2, 5, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(3, 1, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(3, 2, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box13.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(3, 3, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box14.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(3, 4, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box15.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(3, 5, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(4, 1, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(4, 2, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box18.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(4, 3, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box19.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(4, 4, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box20.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(4, 5, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box21.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(5, 1, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box22.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(5, 2, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box23.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(5, 3, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box24.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(5, 4, charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        box25.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setTotal(5, 5, charSequence.toString());
            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }
    public static boolean isEmptyString( String txt ) {
        return (txt == null || txt.trim().equals("null") || txt.trim().length() <= 0);
    }
    public void buttonClicked(View view){
        StartAgain();
    }

    public void setTotal(int x, int y, String text){
        int lineTotalBefore = 0;
        int colTotalBefore = 0;
        int diagDownTotalBefore = 0;
        int diagUpTotalBefore = 0;
        switch (x){
            case 1:
                switch (y){
                    case 1:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box2.getText().toString()) ? "0" : box2.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box3.getText().toString()) ? "0" : box3.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box4.getText().toString()) ? "0" : box4.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box6.getText().toString()) ? "0" : box6.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box11.getText().toString()) ? "0" : box11.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box16.getText().toString()) ? "0" : box16.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString());
                        diagDownTotalBefore = Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        totalColOne.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        totalDiagDown.setText(""+(diagDownTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColOne();
                        CheckDiagDown();
                        break;
                    case 2:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box3.getText().toString()) ? "0" : box3.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box4.getText().toString()) ? "0" : box4.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box12.getText().toString()) ? "0" : box12.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box22.getText().toString()) ? "0" : box22.getText().toString()).toString());
                        totalColTwo.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColTwo();
                        break;
                    case 3:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box2.getText().toString()) ? "0" : box2.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box4.getText().toString()) ? "0" : box4.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box8.getText().toString()) ? "0" : box8.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box18.getText().toString()) ? "0" : box18.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box23.getText().toString()) ? "0" : box23.getText().toString()).toString());
                        totalColThree.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColThree();
                        break;
                    case 4:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box2.getText().toString()) ? "0" : box2.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box3.getText().toString()) ? "0" : box3.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box14.getText().toString()) ? "0" : box14.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box24.getText().toString()) ? "0" : box24.getText().toString()).toString());
                        totalColFour.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFour();
                        break;
                    default:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box2.getText().toString()) ? "0" : box2.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box3.getText().toString()) ? "0" : box3.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box4.getText().toString()) ? "0" : box4.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box10.getText().toString()) ? "0" : box10.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box15.getText().toString()) ? "0" : box15.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box20.getText().toString()) ? "0" : box20.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        totalColFive.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        diagUpTotalBefore = Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString());
                        totalDiagUp.setText(""+(diagUpTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFive();
                        CheckDiagUp();
                        break;
                }
                totalLineOne.setText(""+(lineTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                CheckLineOne();
                break;
            case 2:
                switch (y){
                    case 1:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box8.getText().toString()) ? "0" : box8.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box10.getText().toString()) ? "0" : box10.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box11.getText().toString()) ? "0" : box11.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box16.getText().toString()) ? "0" : box16.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString());
                        totalColOne.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColOne();
                        break;
                    case 2:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box6.getText().toString()) ? "0" : box6.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box8.getText().toString()) ? "0" : box8.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box10.getText().toString()) ? "0" : box10.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box2.getText().toString()) ? "0" : box2.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box12.getText().toString()) ? "0" : box12.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box22.getText().toString()) ? "0" : box22.getText().toString()).toString());
                        diagDownTotalBefore = Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        totalDiagDown.setText(""+(diagDownTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        totalColTwo.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColTwo();
                        CheckDiagDown();
                        break;
                    case 3:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box6.getText().toString()) ? "0" : box6.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box10.getText().toString()) ? "0" : box10.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box3.getText().toString()) ? "0" : box3.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box18.getText().toString()) ? "0" : box18.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box23.getText().toString()) ? "0" : box23.getText().toString()).toString());
                        totalColThree.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColThree();
                        break;
                    case 4:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box8.getText().toString()) ? "0" : box8.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box6.getText().toString()) ? "0" : box6.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box10.getText().toString()) ? "0" : box10.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box4.getText().toString()) ? "0" : box4.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box14.getText().toString()) ? "0" : box14.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box24.getText().toString()) ? "0" : box24.getText().toString()).toString());
                        totalColFour.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        diagUpTotalBefore = Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString());
                        totalDiagUp.setText(""+(diagUpTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFour();
                        CheckDiagUp();
                        break;
                    default:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box8.getText().toString()) ? "0" : box8.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box6.getText().toString()) ? "0" : box6.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box15.getText().toString()) ? "0" : box15.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box20.getText().toString()) ? "0" : box20.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        totalColFive.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFive();
                        break;
                }
                totalLineTwo.setText(""+(lineTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                CheckLineTwo();
                break;
            case 3:
                switch (y){
                    case 1:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box12.getText().toString()) ? "0" : box12.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box14.getText().toString()) ? "0" : box14.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box15.getText().toString()) ? "0" : box15.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box6.getText().toString()) ? "0" : box6.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box16.getText().toString()) ? "0" : box16.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString());
                        totalColOne.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColOne();
                        break;
                    case 2:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box11.getText().toString()) ? "0" : box11.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box14.getText().toString()) ? "0" : box14.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box15.getText().toString()) ? "0" : box15.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box2.getText().toString()) ? "0" : box2.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box22.getText().toString()) ? "0" : box22.getText().toString()).toString());
                        totalColTwo.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColTwo();
                        break;
                    case 3:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box11.getText().toString()) ? "0" : box11.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box12.getText().toString()) ? "0" : box12.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box14.getText().toString()) ? "0" : box14.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box15.getText().toString()) ? "0" : box15.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box3.getText().toString()) ? "0" : box3.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box8.getText().toString()) ? "0" : box8.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box18.getText().toString()) ? "0" : box18.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box23.getText().toString()) ? "0" : box23.getText().toString()).toString());
                        totalColThree.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        diagDownTotalBefore = Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        totalDiagDown.setText(""+(diagDownTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        diagUpTotalBefore = Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString());
                        totalDiagUp.setText(""+(diagUpTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColThree();
                        CheckDiagDown();
                        CheckDiagUp();
                        break;
                    case 4:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box11.getText().toString()) ? "0" : box11.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box12.getText().toString()) ? "0" : box12.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box15.getText().toString()) ? "0" : box15.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box4.getText().toString()) ? "0" : box4.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box24.getText().toString()) ? "0" : box24.getText().toString()).toString());
                        totalColFour.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFour();
                        break;
                    default:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box11.getText().toString()) ? "0" : box11.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box12.getText().toString()) ? "0" : box12.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box14.getText().toString()) ? "0" : box14.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box10.getText().toString()) ? "0" : box10.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box20.getText().toString()) ? "0" : box20.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        totalColFive.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFive();
                        break;
                }
                totalLineThree.setText(""+(lineTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                CheckLineThree();
                break;
            case 4:
                switch (y){
                    case 1:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box18.getText().toString()) ? "0" : box18.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box20.getText().toString()) ? "0" : box20.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box6.getText().toString()) ? "0" : box6.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box11.getText().toString()) ? "0" : box11.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString());
                        totalColOne.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColOne();
                        break;
                    case 2:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box16.getText().toString()) ? "0" : box16.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box18.getText().toString()) ? "0" : box18.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box20.getText().toString()) ? "0" : box20.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box2.getText().toString()) ? "0" : box2.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box12.getText().toString()) ? "0" : box12.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box22.getText().toString()) ? "0" : box22.getText().toString()).toString());
                        totalColTwo.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        diagUpTotalBefore = Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString());
                        totalDiagUp.setText(""+(diagUpTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColTwo();
                        CheckDiagUp();
                        break;
                    case 3:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box16.getText().toString()) ? "0" : box16.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box20.getText().toString()) ? "0" : box20.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box3.getText().toString()) ? "0" : box3.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box8.getText().toString()) ? "0" : box8.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box23.getText().toString()) ? "0" : box23.getText().toString()).toString());
                        totalColThree.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColThree();
                        break;
                    case 4:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box16.getText().toString()) ? "0" : box16.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box18.getText().toString()) ? "0" : box18.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box20.getText().toString()) ? "0" : box20.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box4.getText().toString()) ? "0" : box4.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box14.getText().toString()) ? "0" : box14.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box24.getText().toString()) ? "0" : box24.getText().toString()).toString());
                        diagDownTotalBefore = Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        totalDiagDown.setText(""+(diagDownTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        totalColFour.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFour();
                        CheckDiagDown();
                        break;
                    default:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box16.getText().toString()) ? "0" : box16.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box18.getText().toString()) ? "0" : box18.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box10.getText().toString()) ? "0" : box10.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box15.getText().toString()) ? "0" : box15.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        totalColFive.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFive();
                        break;
                }
                totalLineFour.setText(""+(lineTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                CheckLineFour();
                break;
            default:
                switch (y){
                    case 1:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box22.getText().toString()) ? "0" : box22.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box23.getText().toString()) ? "0" : box23.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box24.getText().toString()) ? "0" : box24.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box6.getText().toString()) ? "0" : box6.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box11.getText().toString()) ? "0" : box11.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box16.getText().toString()) ? "0" : box16.getText().toString()).toString());
                        totalColOne.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        diagUpTotalBefore = Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString());
                        totalDiagUp.setText(""+(diagUpTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColOne();
                        CheckDiagUp();
                        break;
                    case 2:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box23.getText().toString()) ? "0" : box23.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box24.getText().toString()) ? "0" : box24.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box2.getText().toString()) ? "0" : box2.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box12.getText().toString()) ? "0" : box12.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box17.getText().toString()) ? "0" : box17.getText().toString()).toString());
                        totalColTwo.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColTwo();
                        break;
                    case 3:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box22.getText().toString()) ? "0" : box22.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box24.getText().toString()) ? "0" : box24.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box3.getText().toString()) ? "0" : box3.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box8.getText().toString()) ? "0" : box8.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box18.getText().toString()) ? "0" : box18.getText().toString()).toString());
                        totalColThree.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColThree();
                        break;
                    case 4:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box22.getText().toString()) ? "0" : box22.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box23.getText().toString()) ? "0" : box23.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box25.getText().toString()) ? "0" : box25.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box4.getText().toString()) ? "0" : box4.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box9.getText().toString()) ? "0" : box9.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box14.getText().toString()) ? "0" : box14.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString());
                        totalColFour.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFour();
                        break;
                    default:
                        lineTotalBefore = Integer.parseInt((isEmptyString(box21.getText().toString()) ? "0" : box21.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box22.getText().toString()) ? "0" : box22.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box23.getText().toString()) ? "0" : box23.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box24.getText().toString()) ? "0" : box24.getText().toString()).toString());
                        colTotalBefore = Integer.parseInt((isEmptyString(box5.getText().toString()) ? "0" : box5.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box10.getText().toString()) ? "0" : box10.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box15.getText().toString()) ? "0" : box15.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box20.getText().toString()) ? "0" : box20.getText().toString()).toString());
                        diagDownTotalBefore = Integer.parseInt((isEmptyString(box1.getText().toString()) ? "0" : box1.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box7.getText().toString()) ? "0" : box7.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box13.getText().toString()) ? "0" : box13.getText().toString()).toString()) + Integer.parseInt((isEmptyString(box19.getText().toString()) ? "0" : box19.getText().toString()).toString());
                        totalDiagDown.setText(""+(diagDownTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        totalColFive.setText(""+(colTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                        CheckColFive();
                        CheckDiagDown();
                        break;

                }
                totalLineFive.setText(""+(lineTotalBefore + Integer.parseInt(isEmptyString(text) ? "0" : text)));
                CheckLineFive();
                break;
        }
    }
    public  void CheckColOne(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColOne.getText().toString())){
                totalColOne.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalColOne.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalColOne.setTextColor(oldColors);
                totalColOne.setTypeface(null,Typeface.NORMAL);
            }
        }
    }
    public  void CheckColTwo(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColTwo.getText().toString())){
                totalColTwo.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalColTwo.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalColTwo.setTextColor(oldColors);
                totalColTwo.setTypeface(null,Typeface.NORMAL);
            }
        }
    }
    public  void CheckColThree(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColThree.getText().toString())){
                totalColThree.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalColThree.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalColThree.setTextColor(oldColors);
                totalColThree.setTypeface(null,Typeface.NORMAL);
            }
        }
    }
    public  void CheckColFour(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColFour.getText().toString())){
                totalColFour.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalColFour.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalColFour.setTextColor(oldColors);
                totalColFour.setTypeface(null,Typeface.NORMAL);
            }
        }
    }
    public  void CheckColFive(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColFive.getText().toString())){
                totalColFive.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalColFive.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalColFive.setTextColor(oldColors);
                totalColFive.setTypeface(null,Typeface.NORMAL);
            }
        }
    }
    public void CheckLineOne(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineOne.getText().toString())){
                totalLineOne.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalLineOne.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalLineOne.setTextColor(oldColors);
                totalLineOne.setTypeface(null,Typeface.NORMAL);
            }
            CheckWellDone();
        }
    }
    public void CheckLineTwo(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineTwo.getText().toString())){
                totalLineTwo.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalLineTwo.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalLineTwo.setTextColor(oldColors);
                totalLineTwo.setTypeface(null,Typeface.NORMAL);
            }
            CheckWellDone();
        }
    }
    public void CheckLineThree(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineThree.getText().toString())){
                totalLineThree.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalLineThree.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalLineThree.setTextColor(oldColors);
                totalLineThree.setTypeface(null,Typeface.NORMAL);
            }
            CheckWellDone();
        }
    }
    public void CheckLineFour(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineFour.getText().toString())){
                totalLineFour.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalLineFour.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalLineFour.setTextColor(oldColors);
                totalLineFour.setTypeface(null,Typeface.NORMAL);
            }
            CheckWellDone();
        }
    }
    public void CheckLineFive(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineFive.getText().toString())){
                totalLineFive.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalLineFive.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalLineFive.setTextColor(oldColors);
                totalLineFive.setTypeface(null,Typeface.NORMAL);
            }
            CheckWellDone();
        }
    }
    public void CheckDiagUp(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalDiagUp.getText().toString())){
                totalDiagUp.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalDiagUp.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalDiagUp.setTextColor(oldColors);
                totalDiagUp.setTypeface(null,Typeface.NORMAL);
            }
        }
    }
    public void CheckDiagDown(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalDiagDown.getText().toString())){
                totalDiagDown.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                totalDiagDown.setTypeface(null,Typeface.BOLD);
            }
            else {
                totalDiagDown.setTextColor(oldColors);
                totalDiagDown.setTypeface(null,Typeface.NORMAL);
            }
        }
    }
    public  void CheckWellDone(){
        if (!isEmptyString(randomNumber.getText().toString())){
            if (Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalDiagDown.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalDiagUp.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineOne.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineTwo.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineThree.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineFour.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalLineFive.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColOne.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColTwo.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColThree.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColFour.getText().toString()) &&
                    Integer.parseInt(randomNumber.getText().toString()) == Integer.parseInt(totalColFive.getText().toString())){
                mediaPlayer.start();
                wellDone.setText("WELL DONE!");
                View view = this.getCurrentFocus();
                CloseKeybord();
            }
            else
                wellDone.setText("");
        }
    }
    public void CloseKeybord(){
        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
    public void StartAgain(){
        box1.setText(null);
        box2.setText(null);
        box3.setText(null);
        box4.setText(null);
        box5.setText(null);
        box6.setText(null);
        box7.setText(null);
        box8.setText(null);
        box9.setText(null);
        box10.setText(null);
        box11.setText(null);
        box12.setText(null);
        box13.setText(null);
        box14.setText(null);
        box15.setText(null);
        box16.setText(null);
        box17.setText(null);
        box18.setText(null);
        box19.setText(null);
        box20.setText(null);
        box21.setText(null);
        box22.setText(null);
        box23.setText(null);
        box24.setText(null);
        box25.setText(null);

        totalLineOne.setText("0");
        totalLineTwo.setText("0");
        totalLineThree.setText("0");
        totalLineFour.setText("0");
        totalLineFive.setText("0");
        totalDiagDown.setText("0");
        totalColOne.setText("0");
        totalColTwo.setText("0");
        totalColThree.setText("0");
        totalColFour.setText("0");
        totalColFive.setText("0");

        randomNumber.setText(""+ (rand.nextInt(88) + 12)*5);
    }
}
