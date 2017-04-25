package com.example.Demo.View.Interface;

import com.example.Demo.Bean.CommentBean;
import com.example.Demo.Bean.TopicBean;
import com.example.Demo.Bean.UserBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/25.
 */

public interface MainViewImpl {

    void showBackground(String url);

    void showImfor(UserBean user);

    void showTopicList(ArrayList<TopicBean> list);

    void showComment(ArrayList<CommentBean> list);
}
