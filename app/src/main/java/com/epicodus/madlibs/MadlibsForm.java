package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MadlibsForm extends AppCompatActivity implements View.OnClickListener{
    @Bind(R.id.noun1) EditText mNoun1;
    @Bind(R.id.adjective1) EditText mAdjective1;
    @Bind(R.id.noun2) EditText mNoun2;
    @Bind(R.id.adverb1) EditText mAdverb1;
    @Bind(R.id.button) Button mSubmit;

    @Bind(R.id.verb1) EditText mVerb1;
    @Bind(R.id.name1) EditText mName1;
    @Bind(R.id.adjective2) EditText mAdjective2;
    @Bind(R.id.verb2) EditText mVerb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlibs_form);
        ButterKnife.bind(this);
        mSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mSubmit) {
            String noun1 = mNoun1.getText().toString();
            String adjective1 = mAdjective1.getText().toString();
            String noun2 = mNoun2.getText().toString();
            String adverb1 = mAdverb1.getText().toString();
            String verb1 = mVerb1.getText().toString();
            String name1 = mName1.getText().toString();
            String adjective2 = mAdjective2.getText().toString();
            String verb2 = mVerb2.getText().toString();
            if(noun1.equals("") || adjective1.equals("") || noun2.equals("") || adverb1.equals("") || verb1.equals("") || name1.equals("") || adjective2.equals("") || verb2.equals("")) {
                Toast.makeText(MadlibsForm.this, "Please fill out all fields", Toast.LENGTH_LONG).show();
            } else {
                Intent intent = new Intent(MadlibsForm.this, StoryActivity.class);
                Bundle extras = new Bundle();
                extras.putString("noun1", noun1);
                extras.putString("adjective1", adjective1);
                extras.putString("noun2", noun2);
                extras.putString("adverb1", adverb1);
                extras.putString("verb1", verb1);
                extras.putString("name1", name1);
                extras.putString("adjective2", adjective2);
                extras.putString("verb2", verb2);
                intent.putExtras(extras);
                startActivity(intent);
            }
        }
    }


}
