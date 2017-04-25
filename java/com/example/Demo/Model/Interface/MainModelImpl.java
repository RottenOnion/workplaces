package com.example.Demo.Model.Interface;

import com.example.Demo.Bean.CommentBean;
import com.example.Demo.Bean.TopicBean;
import com.example.Demo.Bean.UserBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/25.
 */

public interface MainModelImpl {
    String getBackground(int uid);

    UserBean getImfor(int uid);

    ArrayList<TopicBean> getTopicList(int uid);

    void setLike(int uid, int tid);

    ArrayList<UserBean> getLikeList(int tid);

    void setComment(int uid, int tid, String comment);

    ArrayList<CommentBean> getComment(int tid);

}
