package com.example.Demo.View;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;

import com.example.Demo.Bean.UserBean;
import com.example.Demo.Presenter.NearbyPresenter;
import com.example.Demo.View.Interface.NearbyViewImpl;
import com.example.mvpdemo.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/25.
 */

public class NearbyActivity extends Activity implements DialogInterface.OnClickListener, NearbyViewImpl {

    private NearbyPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member);

        //findview


        //set listener


        presenter = new NearbyPresenter(this);


        //load
        presenter.loadNearby();

    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }

    @Override
    public void showNearby(ArrayList<UserBean> list) {

    }
}
