package com.example.Demo.Presenter.Interface;

import com.example.Demo.Bean.UserBean;

/**
 * Created by Administrator on 2017/4/25.
 */

public interface UpdateImforPresenterImpl {
    /*初始化用户信息*/
    void loadImfor(int uid);

    /*更新用户信息*/
    void UpdateImfor(UserBean user);
}
