package com.example.Demo.Presenter;

import com.example.Demo.Model.Interface.MainModelImpl;
import com.example.Demo.Model.MainModel;
import com.example.Demo.Presenter.Interface.MainPresenterImpl;
import com.example.Demo.View.Interface.MainViewImpl;

/**
 * Created by Administrator on 2017/4/25.
 */

public class MainPresenter implements MainPresenterImpl {

    private MainViewImpl mView;
    private MainModelImpl mModel;

    public MainPresenter(MainViewImpl view) {
        mView = view;
        mModel = new MainModel();
    }

    @Override
    public void loadBackground(int uid) {

        mView.showBackground(mModel.getBackground(uid));
    }


    @Override
    public void loadImfor(int uid) {

        mView.showImfor(mModel.getImfor(uid));
    }

    @Override
    public void loadTopicList(int uid) {

        mView.showTopicList(mModel.getTopicList(uid));
    }

    @Override
    public void LikeTopic(int uid, int tid) {
        mModel.setLike(uid, tid);
        mModel.getLikeList(tid);

    }

    @Override
    public void CommentTopic(int uid, int tid, String comment) {
        mModel.setComment(uid, tid, comment);

        mView.showComment(mModel.getComment(tid));
    }
}
