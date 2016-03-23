package com.example.melvin.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import layout.Blank;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA;
    private int scoreTeamB;

    private Blank m_fragment_team_a;
    private Blank m_fragment_team_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    @Override
    protected void onStart() {//畫面建立後執行
        super.onStart();
        setFragmentTeamName();
    }
    private void setFragmentTeamName(){
        m_fragment_team_a =
                (Blank)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
        m_fragment_team_b =
                (Blank)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
        m_fragment_team_a.setTeamName("黃蜂");
        m_fragment_team_b.setTeamName("火箭");
    }

    public void resetScoreView(View view) {
        if(view.getId() == R.id.reset){
            scoreTeamA = 0;
            scoreTeamB = 0;
            //重設Fragment Score 為 0
//            Blank fragment_team_a =
//                    (Blank)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
//            Blank fragment_team_b =
//                    (Blank)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
//            fragment_team_a.restScore();
//            fragment_team_b.restScore();
            m_fragment_team_a.restScore();
            m_fragment_team_b.restScore();
        }
    }




}
