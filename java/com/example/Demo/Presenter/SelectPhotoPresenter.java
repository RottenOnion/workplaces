package com.example.Demo.Presenter;

import com.example.Demo.Model.Interface.SelectPhotoModelImpl;
import com.example.Demo.Model.SelectPhotoModel;
import com.example.Demo.Presenter.Interface.SelectPhotoPresenterImpl;
import com.example.Demo.View.Interface.SelectPhotoViewImpl;

/**
 * Created by Administrator on 2017/4/25.
 */

public class SelectPhotoPresenter implements SelectPhotoPresenterImpl {
    private SelectPhotoViewImpl sView;
    private SelectPhotoModelImpl sModel;

    public SelectPhotoPresenter(SelectPhotoViewImpl view) {
        sView = view;
        sModel = new SelectPhotoModel();
    }


    @Override
    public void loadImage() {
        sModel.getImage();
        //show
        sView.showImage();

    }

    @Override
    public void selectImage() {
        //获取已选择的图片路径，传入下一个页面
    }
}
