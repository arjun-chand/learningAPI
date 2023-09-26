package com.APIexample.firstAPI;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ControllerLayer {
    //This Layer contains endpoints of APIs
    ServiceLayer serviceLayerObj = new ServiceLayer();
    @PostMapping("/addUserViaReqBody")
    public String addUser(@RequestBody UserInfo obj) {
        String ans = serviceLayerObj.addUser(obj);
        return ans;
    }
    @GetMapping("/findAllUsers")
    public List<UserInfo> findAllUsers(@RequestParam("userId") Integer userId){
        List<UserInfo> userlist = serviceLayerObj.getAllUsers();

        return userlist;
    }
    @GetMapping("/getUser/{greaterThanAge}/{lessThanAge}")
    public List<UserInfo> getUsers(@PathVariable("greaterThanAge")Integer greaterThanAge, @PathVariable("lessThanAge") Integer lessThanAge){
        List<UserInfo> ansList = serviceLayerObj.getFilteredAgePeople(lessThanAge, greaterThanAge);
        return ansList;
    }
}
