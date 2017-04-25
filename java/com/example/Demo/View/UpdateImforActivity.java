package com.example.Demo.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.Demo.Bean.UserBean;
import com.example.Demo.Presenter.UpdateImforPresenter;
import com.example.Demo.View.Interface.UpdateImforViewImpl;
import com.example.mvpdemo.R;

/**
 * Created by Administrator on 2017/4/25.
 */

public class UpdateImforActivity extends Activity implements View.OnClickListener, UpdateImforViewImpl {

    private UpdateImforPresenter presenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member);

        //findview


        //set listener


        presenter = new UpdateImforPresenter(this);


        //load
        presenter.loadImfor(1);

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void showImfor(UserBean user) {

    }

    @Override
    public void saveImfor() {
        //gettext from editview
    }
}
