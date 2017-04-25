package com.example.Demo.View;

import com.example.Demo.Bean.TopicBean;
import com.example.Demo.Bean.UserBean;
import com.example.Demo.Presenter.MemberPresenter;
import com.example.Demo.View.Interface.MemberViewImpl;
import com.example.mvpdemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


import java.util.ArrayList;


public class MemberActivity extends Activity implements OnClickListener, MemberViewImpl {


    private MemberPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member);

        //findview


        //set listener


        presenter = new MemberPresenter(this);


        //load
        presenter.loadUser(1);
        presenter.loadTopicList(1);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            default:
                break;

        }
    }


    @Override
    public void showUserImfor(UserBean user) {

    }

    @Override
    public void showTopicList(ArrayList<TopicBean> list) {

    }


}
