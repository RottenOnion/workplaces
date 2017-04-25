package com.example.Demo.View.Interface;

import com.example.Demo.Bean.TopicBean;
import com.example.Demo.Bean.UserBean;

import java.util.ArrayList;

public interface MemberViewImpl {

    void showUserImfor(UserBean user);

    void showTopicList(ArrayList<TopicBean> list);
}
