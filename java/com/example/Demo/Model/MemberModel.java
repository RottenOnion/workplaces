package com.example.Demo.Model;

import java.util.ArrayList;

import com.example.Demo.Bean.TopicBean;
import com.example.Demo.Bean.UserBean;
import com.example.Demo.Model.Interface.MemberModelImpl;

public class MemberModel implements MemberModelImpl {

    @Override
    public void setUid(int id) {

    }

    @Override
    public void setHead(String head) {

    }

    @Override
    public void setUserName(String name) {

    }

    @Override
    public void setSex(String sex) {

    }

    @Override
    public void setLocation(String location) {

    }

    @Override
    public void setPhone(String phone) {

    }

    @Override
    public UserBean getUser(int id) {

        //http请求，返回一个json，解析出来一个user对象
        UserBean test = new UserBean(id);
        test.setLocation("scut");
        test.setSex("male");
        test.setUsername("testfor1");
        test.setPhone("12312313");

        return test;
    }

    public ArrayList<TopicBean> getTopicList(int uid) {

        //http请求，返回一个json，解析出来一个topic列表
        ArrayList<TopicBean> list = new ArrayList<TopicBean>();

        int size = 10;
        for (int i = 0; i < size; ++i) {
            TopicBean temp = new TopicBean(i);
            temp.setImfor("" + i);
            list.add(temp);
        }

        return list;
    }

}
