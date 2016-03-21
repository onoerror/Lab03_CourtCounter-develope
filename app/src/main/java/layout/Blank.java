package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.melvin.lab03_courtcounter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Blank extends Fragment {

    private TextView m_tv_team_name;
    private TextView m_tv_team_score;


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
    }

}
