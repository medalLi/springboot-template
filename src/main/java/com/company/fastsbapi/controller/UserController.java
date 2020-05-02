package com.company.fastsbapi.controller;

import com.company.fastsbapi.dataobject.model.User;
import com.company.fastsbapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: WireChen
 * @Date: Created in 下午5:02 2018/3/16
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     */
//    @PostMapping("/login")
//    public String userLogin(@RequestBody User dbSourceManager) {
//        User dataManger = dataModelingDBSourceService.findDataManger(dbSourceManager.getName());
//        return dataManger.getName();
//    }

    @RequestMapping("/demo")
    public Object user() {
        Object o = userService.showUser();
        return o;
    }

}
