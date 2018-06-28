package com.example.sarahjoseph.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
        //initialize scoreTeamA to zero
        int scoreTeamA = 0;
        //initial scoreteamB to zero
        int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displays score for team A
        displayForTeamA(0);
        //displays score for team B
        displayForTeamB(0);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // this adds items to the menu bar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

       int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    //increase score by 1 point
    public void addOneForTeamA(View v){

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    //increase score by 2 point
    public void addTwoForTeamA(View v){

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    //increase score by 3 points
    public void addThreeForTeamA(View v){

        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamB(View v) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB (View v) {

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeForTeamB (View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamB);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
