package com.example.Demo.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.Demo.Presenter.SelectPhotoPresenter;
import com.example.Demo.View.Interface.SelectPhotoViewImpl;
import com.example.mvpdemo.R;

/**
 * Created by Administrator on 2017/4/25.
 */

public class SelectPhotoActivity extends Activity implements View.OnClickListener, SelectPhotoViewImpl {


    //private Button select;
    private SelectPhotoPresenter presenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member);

        //findview

        //setlistener

        presenter = new SelectPhotoPresenter(this);

        presenter.loadImage();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    @Override
    public void showImage() {

    }
}
