package com.example.Demo.Presenter;

import java.util.ArrayList;

import com.example.Demo.Bean.TopicBean;
import com.example.Demo.Bean.UserBean;
import com.example.Demo.Model.MemberModel;
import com.example.Demo.Model.Interface.MemberModelImpl;
import com.example.Demo.Presenter.Interface.MemberPresenterImpl;
import com.example.Demo.View.Interface.MemberViewImpl;

public class MemberPresenter implements MemberPresenterImpl {
    private MemberViewImpl mView;
    private MemberModelImpl mModel;

    public MemberPresenter(MemberViewImpl view) {
        mView = view;
        mModel = new MemberModel();
    }

    @Override
    public void loadUser(int id) {

        UserBean user = mModel.getUser(id);

        mView.showUserImfor(user);
    }

    @Override
    public void loadTopicList(int uid) {
        ArrayList<TopicBean> list = mModel.getTopicList(uid);

        mView.showTopicList(list);
    }


}
