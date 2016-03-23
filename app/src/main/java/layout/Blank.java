package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.melvin.lab03_courtcounter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Blank extends Fragment implements  View.OnClickListener{

    private TextView m_tv_team_name;
    private TextView m_tv_team_score;
    private Button m_btn_three_points;
    private Button m_btn_two_points;
    private Button m_btn_one_points;
    private int score;


    public Blank() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment(產生 Fragment 傳回給 Activity)
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onStart(){ // Fragment 畫面建立後執行
        super.onStart();

        m_tv_team_name = (TextView)getView().findViewById(R.id.tv_team_name);
        m_tv_team_score = (TextView)getView().findViewById(R.id.tv_team_score);
        m_btn_three_points = (Button)getView().findViewById(R.id.btn_three_points);
        m_btn_three_points.setOnClickListener(this);
        m_btn_two_points = (Button)getView().findViewById(R.id.btn_two_points);
        m_btn_two_points.setOnClickListener(this);
        m_btn_one_points = (Button)getView().findViewById(R.id.btn_free_points);
        m_btn_one_points.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_three_points:
                score += 3;
                break;
            case R.id.btn_two_points:
                score += 2;
                break;
            case R.id.btn_free_points:
                ++score;
                break;
        }
        m_tv_team_score.setText(String.valueOf(score));
    }
    //將分數歸零
    public void restScore(){
        m_tv_team_score.setText("0");
    }
    //設定隊五名子
    public void setTeamName(CharSequence teamName){
        m_tv_team_name.setText(teamName);
    }
}
