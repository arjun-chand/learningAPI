package com.APIexample.firstAPI;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class RepositoryLayer {
    Map<Integer, UserInfo> userInfoDb = new HashMap<>();
    public String addUserToDb(UserInfo obj){
        int key = obj.getUserId();
        userInfoDb.put(key,obj);
        return "User has been added Via postman obj using RequestBody";
    }

    public List<UserInfo> getAllUsers(){
        return userInfoDb.values().stream().toList();
    }
}
