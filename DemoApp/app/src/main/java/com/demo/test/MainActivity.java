package com.demo.test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<OptionsModel> list = new ArrayList<OptionsModel>();
    private int currentIndex = 0;
    TextView textView;
    RadioButton optionAButton, optionBButton, optionCButton, optionDButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createData();

         textView = findViewById(R.id.textView);

        optionAButton = findViewById(R.id.optionAButton);
        optionBButton = findViewById(R.id.optionBButton);
        optionCButton = findViewById(R.id.optionCButton);
        optionDButton = findViewById(R.id.optionDButton);

        Button leftButton = findViewById(R.id.leftArrowButton);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Nothing to show", Toast.LENGTH_LONG).show();

                if(currentIndex <= 0){
                    //Toast.makeText(MainActivity.this, "Nothing to show", Toast.LENGTH_SHORT).show();
                    showMessage("Nothing to show");
                    return;
                }
                currentIndex--;
                setQuestionAndAnswers();
            }
        });

        Button rightButton = findViewById(R.id.rigtArrowButton);
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Right Arrow clicked", Toast.LENGTH_LONG).show();

                if(currentIndex >= list.size()-1){
                    //Toast.makeText(MainActivity.this, "No more questions", Toast.LENGTH_SHORT).show();
                    showMessage("No more questions");
                    return;
                }
                currentIndex++;
                setQuestionAndAnswers();
            }
        });

        Button buttonHelp = findViewById(R.id.buttonHelp);
        buttonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show help
                //Toast.makeText(MainActivity.this, "Show Help screen here", Toast.LENGTH_SHORT).show();
                showMessage("Show Help screen here");

            }
        });

        Button buttonDone = findViewById(R.id.buttonDone);
        buttonDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Done button click
               // Toast.makeText(MainActivity.this, "Take action on done click here..", Toast.LENGTH_SHORT).show();
                showMessage("Take action on done click here..");
            }
        });

        setQuestionAndAnswers();
    }

    private void setQuestionAndAnswers() {
        OptionsModel  currentPage = list.get(currentIndex);
        textView.setText(currentPage.getQuestion());
        optionAButton.setText(currentPage.getAnswerA());
        optionBButton.setText(currentPage.getAnswerB());
        optionCButton.setText(currentPage.getAnswerC());
        optionDButton.setText(currentPage.getAnswerD());
        optionAButton.setChecked(false);
        optionBButton.setChecked(false);
        optionCButton.setChecked(false);
        optionDButton.setChecked(false);

    }

    public void onEnvSelectorClicked(View view) {
        if (view instanceof RadioButton) {
            boolean checked = ((RadioButton) view).isChecked();
            switch (view.getId()) {
                case R.id.optionAButton: {
                    if (checked) {
                        Toast.makeText(MainActivity.this, "Option A Selected..", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case R.id.optionBButton: {
                    if (checked) {
                        Toast.makeText(MainActivity.this, "Option B Selected..", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case R.id.optionCButton :{
                    if (checked) {
                        Toast.makeText(MainActivity.this, "Option C Selected..", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                case R.id.optionDButton :{
                    if (checked) {
                        Toast.makeText(MainActivity.this, "Option D Selected..", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                default:{
                    //do nothing...
                }
            }
        }
    }

    private void createData() {
        list.add(new OptionsModel("First Question", "Answer A", "Answer B" , "Answer C", "Answer D"));
        list.add(new OptionsModel("Second Question", "Answer 1000", "Answer 1001" , "Answer 1002", "Answer 1003"));
        list.add(new OptionsModel("Third Question", "Answer 2000", "Answer 2001" , "Answer 2002", "Answer 2003"));
        list.add(new OptionsModel("Fourth Question", "Answer 3000", "Answer 3000" , "Answer 3001", "Answer 3003"));
        list.add(new OptionsModel("Fifth Question", "Answer 4000", "Answer 4001" , "Answer 4002", "Answer 4003"));
        list.add(new OptionsModel("Sixth Question", "Answer 5000", "Answer 5001" , "Answer 5002", "Answer 5003"));
    }

    private void showMessage(String message) {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(message);
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert11 = builder1.create();
        alert11.show();

    }
}