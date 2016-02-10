package com.example.jayath1.fivethings;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getFiveSteps(View view) {


        CheckBox checkbx = (CheckBox) findViewById(R.id.checkbox);
        boolean chckbxChecked = checkbx.isChecked();
        Button btn = (Button) findViewById(R.id.btn);
        ToggleButton tgl = (ToggleButton) findViewById(R.id.toggleButton1);
        EditText etext = (EditText) findViewById(R.id.edittext);
        String str = etext.getText().toString();
        if (chckbxChecked == true && tgl.isChecked() == true && str.length() != 0) {

            if (btn.isPressed()) {
                Uri uri = Uri.parse("http://work.chron.com/five-steps-follow-obtain-perfect-job-12267.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                Toast.makeText(getBaseContext(), str, Toast.LENGTH_SHORT).show();


           /*     {
                    Toast.makeText(getBaseContext(), "Enter a string the in the text field" , Toast.LENGTH_SHORT ).show();

                }
else{

                }   */
            }
        } else if (chckbxChecked == true && tgl.isChecked()!=true && str.length()==0) {

            Toast.makeText(getBaseContext(), "Check the  toggle button and enter a name  for tips", Toast.LENGTH_SHORT).show();

        } else if (chckbxChecked == true && tgl.isChecked() == true) {

            Toast.makeText(getBaseContext(), " enter a name  for tips", Toast.LENGTH_SHORT).show();

        } else if (chckbxChecked == true && str.length() != 0) {

            Toast.makeText(getBaseContext(), " Check the toggle  for tips", Toast.LENGTH_SHORT).show();

        } else if (tgl.isChecked() == true) {

            Toast.makeText(getBaseContext(), " Check the check box and enter a name  for tips", Toast.LENGTH_SHORT).show();

        } else if (str.length() != 0) {

            Toast.makeText(getBaseContext(), " Check the check box and toggle  for tips", Toast.LENGTH_SHORT).show();

        } else if (str.length() != 0 && tgl.isChecked() == true) {

            Toast.makeText(getBaseContext(), " Check the check box   for tips", Toast.LENGTH_SHORT).show();

        } else {

            Toast.makeText(getBaseContext(), "Check the box , toggle and enter a name  for tips", Toast.LENGTH_SHORT).show();

        }


    }

}





