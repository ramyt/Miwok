package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the view that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // set a clickListener on that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent i = new Intent(getApplicationContext(), NumbersActivity.class);

                // Start the new activity
                startActivity( i );
            }
        });

        // find the view that shows the numbers category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // set a clickListener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent i = new Intent(getApplicationContext(), PhrasesActivity.class);

                // Start the new activity
                startActivity( i );
            }
        });

        // find the view that shows the numbers category
        TextView family = (TextView) findViewById(R.id.family);

        // set a clickListener on that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent i = new Intent(getApplicationContext(), FamilyActivity.class);

                // Start the new activity
                startActivity( i );
            }
        });

        // find the view that shows the numbers category
        TextView colors = (TextView) findViewById(R.id.colors);

        // set a clickListener on that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent i = new Intent(getApplicationContext(), ColorsActivity.class);

                // Start the new activity
                startActivity( i );
            }
        });
    }

}
