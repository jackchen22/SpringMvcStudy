package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Product;
import pojo.User;
import service.UserDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class controller {
    @Autowired
    UserDao userDao;
    @RequestMapping("/check.action")
    @ResponseBody
    public String checkName(String name) {
        int i = userDao.checkUserName(name);
        if (i > 0) {
            return "用户名已被注册";
        } else {
            return "用户名没有被使用可以注册";
        }
    }

    @RequestMapping("/searchPage.action")
    public String registerPage() {

        return "search";
    }

    @RequestMapping("/checkPage.action")
    public String checkPage() {
        return "test";
    }


    @RequestMapping(value = "/search.action", method = RequestMethod.POST)

    public @ResponseBody
    List<Product> search(@RequestBody User user1) {

        List<Product> list = new ArrayList<> ();
        list.add(new Product(1, "phone", 20.0f, new Date (), "test"));
        list.add(new Product(1, "phone", 20.0f, new Date(), "test"));
        list.add(new Product(1, "手机", 20.0f, new Date(), "test"));
        return list;

    }


    @RequestMapping(value = "/searchUserAjax.action")
    @ResponseBody
    public List<User> searchUserAjax(@RequestBody User user) {
        List<User> users = userDao.searchByWhere(user);
        return users;


    }

    @RequestMapping("/searchUserAjaxPage.action")

    public String searchUserAjaxPage() {
        return "userSearch";

    }
}
