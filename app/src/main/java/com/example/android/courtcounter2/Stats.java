package com.example.android.courtcounter2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Stats extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // displaying the team names
        TextView team_a = findViewById(R.id.a_name);
        if (teamA.equals("")){
            team_a.setText(getString(R.string.team_a));
            Log.v("Team a count: ", String.valueOf(team_a.length()));
        } else {
            team_a.setText(teamA);
            team_a.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
            Log.v("Team a count: ", String.valueOf(team_a.length()));
            Log.v("Team a size: ", String.valueOf(((TextView)findViewById(R.id.a_name)).getTextSize()));
        }

        TextView team_b = findViewById(R.id.b_name);
        if (teamB.equals("")){
            team_b.setText(getString(R.string.team_b));
        } else {
            team_b.setText(teamB);
        }

//        displaying the scores and changing the color of "Goal"
        TextView score_a = findViewById(R.id.a_score);
        score_a.setText(String.valueOf(team_a_score));

        TextView score_b = findViewById(R.id.b_score);
        score_b.setText(String.valueOf(team_b_score));

        TextView goals = findViewById(R.id.goals);
        if(team_b_score > team_a_score){
            goals.setTextColor(Color.GREEN);
            score_b.setTextColor(Color.GREEN);
        } else if(team_a_score > team_b_score){
            goals.setTextColor(Color.GREEN);
            score_a.setTextColor(Color.GREEN);
        }

//        displaying the shots and changing the color of "Shots"
        TextView shots_a = findViewById(R.id.a_shot);
        shots_a.setText(String.valueOf(team_a_shot));

        TextView shots_b = findViewById(R.id.b_shot);
        shots_b.setText(String.valueOf(team_b_shot));

        TextView shots = findViewById(R.id.shots);
        if(team_b_shot > team_a_shot){
            shots_b.setTextColor(Color.GREEN);
            shots.setTextColor(Color.GREEN);
        } else if (team_a_shot > team_b_shot){
            shots_a.setTextColor(Color.GREEN);
            shots.setTextColor(Color.GREEN);
        }


//        displaying the shots on target and changing the color of "Shots On Target"
        TextView on_target_a = findViewById(R.id.a_on_target);
        on_target_a.setText(String.valueOf(team_a_target));

        TextView on_target_b = findViewById(R.id.b_on_target);
        on_target_b.setText(String.valueOf(team_b_target));

        TextView on_target = findViewById(R.id.target);
        if(team_b_target > team_a_target){
            on_target_b.setTextColor(Color.GREEN);
            on_target.setTextColor(Color.GREEN);
        } else if(team_a_target > team_b_target){
            on_target_a.setTextColor(Color.GREEN);
            on_target.setTextColor(Color.GREEN);
        }

//        displaying the number of tackles and changing the color of "Tackles"
        TextView tackle_a = findViewById(R.id.a_tackle);
        tackle_a.setText(String.valueOf(team_a_tackle));

        TextView tackle_b = findViewById(R.id.b_tackle);
        tackle_b.setText(String.valueOf(team_b_tackle));

        TextView tackles = findViewById(R.id.tackles);
        if(team_b_tackle > team_a_tackle){
            tackle_b.setTextColor(Color.GREEN);
            tackles.setTextColor(Color.GREEN);
        } else if(team_a_tackle > team_b_tackle){
            tackle_a.setTextColor(Color.GREEN);
            tackles.setTextColor(Color.GREEN);
        }

//        displaying the number of fouls and changing the color of "Fouls"
        TextView foul_a = findViewById(R.id.a_foul);
        foul_a.setText(String.valueOf(team_a_foul));

        TextView foul_b = findViewById(R.id.b_foul);
        foul_b.setText(String.valueOf(team_b_foul));

        TextView fouls = findViewById(R.id.fouls);
        if(team_b_foul > team_a_foul){
            foul_b.setTextColor(Color.GREEN);
            fouls.setTextColor(Color.GREEN);
        } else if(team_a_foul > team_b_foul){
            foul_a.setTextColor(Color.GREEN);
            fouls.setTextColor(Color.GREEN);
        }

//        displaying the number of corners and changing the color of "Corners
        TextView corner_a = findViewById(R.id.a_corner);
        corner_a.setText(String.valueOf(team_a_corner));

        TextView corner_b = findViewById(R.id.b_corner);
        corner_b.setText(String.valueOf(team_b_corner));

        TextView corners = findViewById(R.id.corners);
        if(team_b_corner > team_a_corner){
            corner_b.setTextColor(Color.GREEN);
            corners.setTextColor(Color.GREEN);
        } else if (team_a_corner > team_b_corner){
            corner_a.setTextColor(Color.GREEN);
            corners.setTextColor(Color.GREEN);
        }

    }

}
