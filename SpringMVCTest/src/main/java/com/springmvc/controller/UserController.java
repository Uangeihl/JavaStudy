package com.springmvc.controller;

import com.springmvc.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
//@ResponseBody /*全有情况下加*/
//@RestController /*@Controller与@ResponseBody合一*/
@RequestMapping("/user")
public class UserController {
/*
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'module':'user delete'}";
    }
*/
    //请求
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age){
        System.out.println("name="+name);
        System.out.println("age="+age);
        return "{'module':'common param'}";
    }
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody
    public String commonParamDifferentName(@RequestParam("name") String userName, int age){
        System.out.println("userName="+userName);
        System.out.println("age="+age);
        return "{'module':'commonParamDifferentName'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo 传递：user="+user);
        return "{'module':'pojoParam'}";
    }

    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("pojo 传递：user="+user);
        return "{'module':'ojoContainPojoParam'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("arrayParam 传递：likes="+ Arrays.toString(likes));
        return "{'module':'arrayParam'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("listParam 传递：likes="+ likes);
        return "{'module':'listParam'}";
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("listParamForJson 传递：likes="+ likes);
        return "{'module':'listParamForJson'}";
    }

    @RequestMapping("/PojoParamForJson")
    @ResponseBody
    public String PojoParamForJson(@RequestBody User user){
        System.out.println("PojoParamForJson 传递：user"+user);
        return "{'module':'PojoParamForJson'}";
    }

    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("listPojoParamForJson 传递：list="+ list);
        return "{'module':'listPojoParamForJson'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date2){
        System.out.println("date = "+date);
        System.out.println("date1(yyyy-MM-dd) = "+date1);
        System.out.println("date2(yyyy-MM-dd HH-mm-ss) = "+date2);
        return "{'module':'dateParam'}";
    }

    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "../page.jsp";
    }

    //响应
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回文本数据");
        return "response text";
    }

    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        System.out.println("返回Json对象数据");
        User user = new User();
        user.setName("itcast");
        user.setAge(15);
        return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回Json集合数据");
        User user1 = new User();
        user1.setName("张飞");
        user1.setAge(15);

        User user2 = new User();
        user2.setName("孙权");
        user2.setAge(16);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }

    //RESTful
    @RequestMapping(value = "/users",method = RequestMethod.POST)
//    @PostMapping
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
//    @DeleteMapping("/users/{id}")
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("user delete ..."+id);
        return "{'module':'user delete'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
//    @PutMapping
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update ..."+user);
        return "{'module':'user update'}";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
//    @GetMapping("/users/{id}")
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("user getById ..."+id);
        return "{'module':'user getById'}";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
//    @GetMapping
    @ResponseBody
    public String getAll(){
        System.out.println("user getAll ...");
        return "{'module':'user getAll'}";
    }
}
