package com.example.katarzkubat.artquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score;

    private int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClickedOne(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer1_1:
                if (checked) {
                    score1 = 0;
                }
                break;
            case R.id.answer1_2:
                if (checked) {
                    score1 = 1;
                }
                break;
            case R.id.answer1_3:
                if (checked) {
                    score1 = 0;
                }
                break;
            case R.id.answer1_4:
                if (checked) {
                    score1 = 0;
                }
        }
    }

    public void onRadioButtonClickedTwo(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer2_1:
                if (checked) {
                    score2 = 1;
                }
                break;
            case R.id.answer2_2:
                if (checked) {
                    score2 = 0;
                }
                break;
            case R.id.answer2_3:
                if (checked) {
                    score2 = 0;
                }
                break;
            case R.id.answer2_4:
                if (checked) {
                    score2 = 0;
                }
        }
    }

    public void onRadioButtonClickedThree(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer3_1:
                if (checked) {
                    score3 = 1;
                }
                break;
            case R.id.answer3_2:
                if (checked) {
                    score3 = 0;
                }
                break;
            case R.id.answer3_3:
                if (checked) {
                    score3 = 0;
                }
                break;
            case R.id.answer3_4:
                if (checked) {
                    score3 = 0;
                }
        }
    }

    public void onRadioButtonClickedFour(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer4_1:
                if (checked) {
                    score4 = 0;
                }
                break;
            case R.id.answer4_2:
                if (checked) {
                    score4 = 0;
                }
                break;
            case R.id.answer4_3:
                if (checked) {
                    score4 = 1;
                }
                break;
            case R.id.answer4_4:
                if (checked) {
                    score4 = 0;
                }
        }
    }

    public void onRadioButtonClickedFive(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.answer5_1:
                if (checked) {
                    score5 = 0;
                }
                break;
            case R.id.answer5_2:
                if (checked) {
                    score5 = 0;
                }
                break;
            case R.id.answer5_3:
                if (checked) {
                    score5 = 0;
                }
                break;
            case R.id.answer5_4:
                if (checked) {
                    score5 = 1;
                }
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox1:
                if (checked) {
                    score8 = 1;
                } else {
                    score8 = 0;
                }
                break;
            case R.id.checkbox2:
                if (checked) {
                    score9 = 1;
                } else {
                    score9 = 0;
                }
                break;
            case R.id.checkbox3:
                if (checked) {
                    score10 = 0;
                }
                break;
            case R.id.checkbox4:
                if (checked) {
                    score10 = 0;
                }
                break;
            case R.id.checkbox5:
                if (checked) {
                    score11 = 0;
                }
                break;
            case R.id.checkbox6:
                if (checked) {
                    score12 = 0;
                }
                break;
            case R.id.checkbox7:
                if (checked) {
                    score13 = 1;
                } else {
                    score13 = 0;
                }
                break;
            case R.id.checkbox8:
                if (checked) {
                    score14 = 1;
                } else {
                    score14 = 0;
                }
                break;
            case R.id.checkbox9:
                if (checked) {
                    score15 = 1;
                } else {
                    score15 = 0;
                }
                break;
            case R.id.checkbox10:
                if (checked) {
                    score16 = 0;
                }
                break;
            case R.id.checkbox11:
                if (checked) {
                    score17 = 0;
                }
                break;
            case R.id.checkbox12:
                if (checked) {
                    score18 = 1;
                } else {
                    score18 = 0;
                }
                break;
        }
    }

    public void submit(View view) {
        EditText answer6Field = (EditText) findViewById(R.id.answer6);
        String answer6 = answer6Field.getText().toString().toLowerCase();
        if (answer6.contains("michelangelo")) {
            score19 = 1;
        } else {
            score19 = 0;
        }

        EditText answer7Field = (EditText) findViewById(R.id.answer7);
        String answer7 = answer7Field.getText().toString().toLowerCase();
        if (answer7.contains("warhol")) {
            score20 = 1;
        } else {
            score20 = 0;
        }

        result = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10 +
                score11 + score12 + score13 + score14 + score15 + score16 + score17 + score18 + score19 + score20;

        String communicate = "You got " + result + " out of 13 points";
        Toast.makeText(this, communicate, Toast.LENGTH_LONG).show();
        reset();
        return;
    }

    private void reset() {
        score1 = score2 = score3 = score4 = score5 = score6 = score7 = score8 = score9 = score10 =
                score11 = score12 = score13 = score14 = score15 = score16 = score17 = score18 = score19 = score20 = 0;

        ((RadioButton) findViewById(R.id.answer1_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer1_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer1_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer1_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer2_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer2_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer2_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer2_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer3_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer3_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer3_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer3_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer4_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer4_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer4_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer4_4)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer5_1)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer5_2)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer5_3)).setChecked(false);
        ((RadioButton) findViewById(R.id.answer5_4)).setChecked(false);
        ((EditText) findViewById(R.id.answer6)).setText("");
        ((EditText) findViewById(R.id.answer7)).setText("");
        ((CheckBox) findViewById(R.id.checkbox1)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox2)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox3)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox4)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox5)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox6)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox7)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox8)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox9)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox10)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox11)).setChecked(false);
        ((CheckBox) findViewById(R.id.checkbox12)).setChecked(false);
    }
}

