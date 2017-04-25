package com.example.Demo.Model;

import com.example.Demo.Model.Interface.PublishModelImpl;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/25.
 */

public class PublishModel implements PublishModelImpl {

    @Override
    public ArrayList<String> getSelectedImage() {
        ArrayList<String> imagelist = new ArrayList<String>();

        return imagelist;
    }

    @Override
    public void getLocation() {

    }

    @Override
    public void PublishTopic() {

    }
}
