package cn.wykjc.jiaochengdemo.user.controller;

import cn.wykjc.jiaochengdemo.user.entity.UserEntity;
import cn.wykjc.jiaochengdemo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author wystart
 * @create 2021-03-14-10:55
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return  userService.getAll(map);

    }
    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";

    }
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity){
        userService.save(userEntity);
        System.out.println(userEntity);
        return "success";
    }
}
