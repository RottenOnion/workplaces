package com.example.Demo.Model.Interface;

import java.util.ArrayList;

import com.example.Demo.Bean.TopicBean;
import com.example.Demo.Bean.UserBean;

public interface MemberModelImpl {

    void setUid(int id);

    void setUserName(String name);

    void setHead(String head);

    void setSex(String sex);

    void setLocation(String location);

    void setPhone(String phone);

    UserBean getUser(int id);

    ArrayList<TopicBean> getTopicList(int uid);

}
