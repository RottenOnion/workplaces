package com.example.Demo.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.Demo.Bean.CommentBean;
import com.example.Demo.Bean.TopicBean;
import com.example.Demo.Bean.UserBean;
import com.example.Demo.Presenter.MainPresenter;
import com.example.Demo.View.Interface.MainViewImpl;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/25.
 */

public class MainActivity extends Activity implements MainViewImpl, View.OnClickListener {
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //findview

        //listener

        init();
    }

    private void init() {
        presenter.loadBackground(1);
        presenter.loadImfor(1);
        presenter.loadTopicList(1);
    }

    @Override
    public void onClick(View v) {

    }


    @Override
    public void showBackground(String url) {

    }

    @Override
    public void showImfor(UserBean user) {

    }

    @Override
    public void showTopicList(ArrayList<TopicBean> list) {

    }

    @Override
    public void showComment(ArrayList<CommentBean> list) {

    }
}
