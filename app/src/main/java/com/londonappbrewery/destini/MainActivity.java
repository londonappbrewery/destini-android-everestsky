package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mLeftButton;
    Button mRightButton;
    TextView mStoryView;
    int mStoryIndex = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mLeftButton = (Button) findViewById(R.id.buttonTop);
        mRightButton = (Button) findViewById(R.id.buttonBottom);
        mStoryView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryView.setText(R.string.T3_Story);
                    mLeftButton.setText(R.string.T3_Ans1);
                    mRightButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if(mStoryIndex == 3) {
                    mStoryView.setText(R.string.T6_End);
                    mLeftButton.setVisibility(View.GONE);
                    mRightButton.setVisibility(View.GONE);
                }

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


        mRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex ==1) {
                    mStoryView.setText(R.string.T2_Story);
                    mLeftButton.setText(R.string.T2_Ans1);
                    mRightButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mStoryView.setText(R.string.T4_End);
                    mLeftButton.setVisibility(View.GONE);
                    mRightButton.setVisibility(View.GONE);
                } else if (mStoryIndex == 3) {
                    mStoryView.setText(R.string.T5_End);
                    mLeftButton.setVisibility(View.GONE);
                    mRightButton.setVisibility(View.GONE);
                }

            }
        });
    }
}
