package com.example.android.courtcounter2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    static int team_a_score, team_a_shot, team_a_target, team_a_tackle, team_a_foul, team_a_corner = 0;
    static int team_b_score, team_b_shot, team_b_target, team_b_tackle, team_b_foul, team_b_corner = 0;
    static String teamA;
    static String teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        method to start the statistics activity
        Button stats = findViewById(R.id.show_stats);
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startStats = new Intent(MainActivity.this, Stats.class);
                teamA = ((EditText) findViewById(R.id.team_a_name)).getText().toString();
                teamB = ((EditText) findViewById(R.id.team_b_name)).getText().toString();
                startActivity(startStats);
            }
        });
    }

//    changeScore method increases the score and changes the textview of each team depending on the button tapped
    public void showScore(int v){
        TextView t;

        if (v == R.id.team_a_goal){
            t = (TextView) findViewById(R.id.team_a_score);
            t.setText(String.valueOf(team_a_score));
        } else if (v == R.id.team_b_goal) {
            t = (TextView) findViewById(R.id.team_b_score);
            t.setText(String.valueOf(team_b_score));
        }
    }

//    setGoal method increases the goal of the team tapped and displays it by calling the showScore method
    public void setGoal(View view){
        Toast score_warning = Toast.makeText(getApplicationContext(), "Score can't be more than shots!", Toast.LENGTH_SHORT);
        switch(view.getId()){
            case R.id.team_a_goal:

                if (team_a_score + 1 > team_a_shot) {
                    score_warning.show();
                } else if (team_a_score + 1 <= team_a_shot){
                    team_a_score++;
                }
                showScore(R.id.team_a_goal);
                break;

            case R.id.team_b_goal:

                if (team_b_score + 1 > team_b_shot){
                    score_warning.show();
                } else if (team_b_score + 1 <= team_b_shot){
                    team_b_score++;
                }
                showScore(R.id.team_b_goal);
                break;
        }
    }

//    setShot method increases the number of shots
//    should alter a textview in another layout xml file
    public void setShot(View view){
        switch(view.getId()){
            case R.id.team_a_shot:
                team_a_shot ++;
                break;

            case R.id.team_b_shot:
                team_b_shot ++;
                break;
        }
    }

//    setTarget method increases the number of shots on target
//    should alter a textview in another layout xml file
    public void setTarget(View view){
        Toast on_target_warning = Toast.makeText(getApplicationContext(), "On target can't be more than shots!", Toast.LENGTH_SHORT);;
        switch(view.getId()){

            case R.id.team_a_on_target:
                if (team_a_target + 1 <= team_a_shot){
                    team_a_target ++;
                } else if (team_a_target + 1 > team_a_shot){
                    on_target_warning.show();
                }
                break;

            case R.id.team_b_on_target:
                if (team_b_target +1 <= team_b_shot){
                    team_b_target++;
                } else if(team_b_target + 1 > team_b_shot){
                    on_target_warning.show();
                }
                break;
        }
    }

//    setTackle method increases the number of tackles on target
//    should alter a textview in another layout xml file
    public void setTackle(View view){
        switch(view.getId()){
            case R.id.team_a_tackle:
                team_a_tackle++;
                break;

            case R.id.team_b_tackle:
                team_b_tackle++;
                break;
        }
    }

//    setFoul method increases the number of fouls on target
//    should alter a textview in another layout xml file
    public void setFoul(View view){
        TextView t;
        switch (view.getId()){
            case R.id.team_a_foul:
                team_a_foul++;
//                t = findViewById(R.id.a_foul);
//                t.setText(String.valueOf(team_a_foul));
                break;

            case R.id.team_b_foul:
                team_b_foul++;
                break;
        }
    }


//    setCorner method increases the number of corners for the team
//    should alter a textview in another layout xml file
    public void setCorner(View view){
        switch (view.getId()){
            case R.id.team_a_corner:
                team_a_corner++;
                 break;

            case R.id.team_b_corner:
                team_b_corner++;
                break;
        }
    }

//    resets all variables and views to zero
    public void reset(View view){
        team_a_score = team_a_tackle = team_a_target = team_a_corner = team_a_foul = team_a_shot = 0;
        team_b_score = team_b_tackle = team_b_target = team_b_corner = team_b_foul = team_b_shot = 0;

        showScore(R.id.team_a_goal);
        showScore(R.id.team_b_goal);
    }



    /*
    incomplete
    I keep getting bugs when trying to update TextViews in the activity_stats layout
    going to watch videos now
     */

}
