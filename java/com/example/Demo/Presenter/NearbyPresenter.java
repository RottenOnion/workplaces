package com.example.Demo.Presenter;

import com.example.Demo.Model.Interface.NearbyModelImpl;
import com.example.Demo.Model.NearbyModel;
import com.example.Demo.Presenter.Interface.NearbyPresenterImpl;
import com.example.Demo.View.Interface.NearbyViewImpl;

/**
 * Created by Administrator on 2017/4/25.
 */

public class NearbyPresenter implements NearbyPresenterImpl {
    private NearbyViewImpl nView;
    private NearbyModelImpl nModel;

    public NearbyPresenter(NearbyViewImpl view) {
        nView = view;
        nModel = new NearbyModel();
    }

    @Override
    public void loadNearby() {
        nView.showNearby(nModel.getNearby());
    }

    @Override
    public void Block() {

    }

    @Override
    public void Like() {

    }
}
