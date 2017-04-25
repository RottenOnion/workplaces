package com.example.Demo.Presenter;

import com.example.Demo.Bean.UserBean;
import com.example.Demo.Model.Interface.UpdateImforModelImpl;
import com.example.Demo.Model.UpdateImforModel;
import com.example.Demo.Presenter.Interface.UpdateImforPresenterImpl;
import com.example.Demo.View.Interface.UpdateImforViewImpl;

/**
 * Created by Administrator on 2017/4/25.
 */

public class UpdateImforPresenter implements UpdateImforPresenterImpl {
    private UpdateImforModelImpl uModel;
    private UpdateImforViewImpl uView;

    public UpdateImforPresenter(UpdateImforViewImpl view) {
        this.uView = view;
        uModel = new UpdateImforModel();
    }

    @Override
    public void loadImfor(int uid) {
        uView.showImfor(uModel.getUser(uid));
    }

    @Override
    public void UpdateImfor(UserBean user) {
        uModel.setUser(user);
    }
}
