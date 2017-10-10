package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StoryActivity extends AppCompatActivity {
    @Bind(R.id.story1) TextView mStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        ButterKnife.bind(this);


        Intent intent = getIntent();
        String noun1 = intent.getStringExtra("noun1");
        String adjective1 = intent.getStringExtra("adjective1");
        String noun2 = intent.getStringExtra("noun2");
        String adverb1 = intent.getStringExtra("adverb1");
        String verb1 = intent.getStringExtra("verb1");
        String name1 = intent.getStringExtra("name1");
        String adjective2 = intent.getStringExtra("adjective2");
        String verb2 = intent.getStringExtra("verb2");


        mStory.setText(String.format("The captain was shouting out orders over the crashing sounds of the lightning and the waves tearing our ship a part. It was no use. In an instance we were all fighting for our lives in the roiling waters; everything went dark. I woke up to clear, sunny skies all alone. The island that I'd washed up on had a huge %s a little further inland. The %s air felt felt amazing on my skin. I decided the first thing I needed to do if I wanted to get off this island was find a %s. I %s %s to the bits of wreckage that had washed ashore. I dared not hope for a companion, but I couldn't help but look to see if %s had survived the wreck. No luck. I started out toward the center of the island to try and find some drinkable water. I felt a %s thirst that made me want to %s",noun1,adjective1,noun2,adverb1,verb1,name1,adjective2,verb2));

    }
}
