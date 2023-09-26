package com.APIexample.firstAPI;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceLayer {
    RepositoryLayer respositoryLayerObj = new RepositoryLayer();

    public String addUser(UserInfo userinfo) {
        String result = respositoryLayerObj.addUserToDb(userinfo);
        return result;
    }

    public List<UserInfo> getAllUsers() {
        List<UserInfo> ansList = respositoryLayerObj.getAllUsers();
        return ansList;
    }

    public List<UserInfo> getFilteredAgePeople(int lessage, int greaterAge) {
        List<UserInfo> getAllUser = respositoryLayerObj.getAllUsers();
        List<UserInfo> ansList = new ArrayList<>();

        for (UserInfo userinfo : getAllUser) {
            if (userinfo.getAge() >= greaterAge && userinfo.getAge() <= lessage) {
                ansList.add(userinfo);
            }
        }
        return ansList;
    }
}
