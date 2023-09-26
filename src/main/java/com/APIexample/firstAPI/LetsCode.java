package com.APIexample.firstAPI;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LetsCode {
    HashMap<Integer, UserInfo> userInfoDb = new HashMap<>();


    @PostMapping("/addUser")
    public String addUserToDb(@RequestParam("userId") Integer userId,
                              @RequestParam("emailId") String emailId,
                              @RequestParam("name") String name,
                              @RequestParam("age") Integer age
                            ){

        UserInfo obj = new UserInfo(userId, name,age,emailId);
        userInfoDb.put(userId, obj);
        return "User has been added to database";
    }
    @PostMapping("/addUserViaReqBody")
    public String addUser(@RequestBody UserInfo obj){
        int key = obj.getUserId();
        userInfoDb.put(key,obj);
        return "User has been added Via postman obj using RequestBody";
    }
    @GetMapping("/getUser/{userId}")
    public  UserInfo getUserInfo(@PathVariable("userId") Integer userId){
        UserInfo object = userInfoDb.get(userId);
        return object;
    }

    @GetMapping("/getUser/{greaterThanAge}/{lessThanAge}")
    public List<UserInfo> getUsers(@PathVariable("greaterThanAge")Integer greaterThanAge, @PathVariable("lessThanAge") Integer lessThanAge){
        List<UserInfo> ageList = new ArrayList<>();
        for (UserInfo userinfo: userInfoDb.values()) {
            if (userinfo.getAge() >= greaterThanAge && userinfo.getAge() <= lessThanAge) {
                ageList.add(userinfo);
            }
        }
        return ageList;
    }

    @GetMapping("/getUserbyUserId")
    public UserInfo getUserInfoByUserId(@RequestParam("userId") Integer userId){
        UserInfo response = userInfoDb.get(userId);
        return response;
    }


    @GetMapping("/findAllUsers")
    public List<UserInfo> findAllUsers(@RequestParam("userId") Integer userId){
        List<UserInfo> userlist = new ArrayList<>();
        for (Map.Entry<Integer, UserInfo> entry : userInfoDb.entrySet()){
            userlist.add(entry.getValue());
        }
        return userlist;
    }

    @GetMapping("/findOnlyNames")
    public List<String> findOnlyNames(){
        List<String> nameList = new ArrayList<>();
        for (UserInfo obj : userInfoDb.values()){
            nameList.add(obj.getName());
        }
        return nameList;
    }



}
