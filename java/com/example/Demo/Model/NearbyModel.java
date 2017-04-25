package com.example.Demo.Model;

import com.example.Demo.Bean.UserBean;
import com.example.Demo.Model.Interface.NearbyModelImpl;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/25.
 */

public class NearbyModel implements NearbyModelImpl {
    @Override
    public ArrayList<UserBean> getNearby() {
        //向服务器请求获取附近的人列表
        return null;
    }
}
