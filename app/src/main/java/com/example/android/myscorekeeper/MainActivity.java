package com.example.android.myscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamStars = 0;
    int scoreTeamGems = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * scores for TeamStars
     */

    public void addThreeForStars (View v) {
        scoreTeamStars = scoreTeamStars + 3;
        displayTeamStars(scoreTeamStars);
    }

    public void addTwoForStars (View v) {
        scoreTeamStars = scoreTeamStars + 2;
        displayTeamStars(scoreTeamStars);
    }

    public void addOneForStars (View v) {
        scoreTeamStars = scoreTeamStars + 1;
        displayTeamStars(scoreTeamStars);
    }

    /**
     * scores for TeamStars
     */
     public void  addThreeForGems (View v) {
         scoreTeamGems = scoreTeamGems + 3;
         displayTeamGems(scoreTeamGems);

     }

    public void  addTwoForGems (View v) {
        scoreTeamGems = scoreTeamGems + 2;
        displayTeamGems(scoreTeamGems);

     }

    public void  addOneForGems (View v) {
        scoreTeamGems = scoreTeamGems + 1;
        displayTeamGems(scoreTeamGems);

    }

    /**
     * reset score button
     */

    public void reset (View v) {
        scoreTeamStars = 0;
        scoreTeamGems = 0;
        displayTeamStars(scoreTeamStars);
        displayTeamGems(scoreTeamGems);
    }


    /**
     * display for TeamStars
     */

    public  void  displayTeamStars (int score) {
        TextView scoreView = (TextView) findViewById(R. id.TeamStars_score);
        scoreView.setText (String.valueOf(score));
    }

    /**
     * display for TeamGems
     */
    public  void  displayTeamGems (int score) {
        TextView scoreView = (TextView) findViewById(R. id.TeamGems_score);
        scoreView.setText (String.valueOf(score));
    }


}
