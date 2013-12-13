package net.spring.controller;

import net.spring.model.User;
import net.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-11-25
 * Time: 下午3:40
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {
    @Autowired
    @Qualifier("u1")
    private IUserService userService;

    @RequestMapping("addUser.do")
    public ModelAndView addUser(@ModelAttribute User user) {
        try {
            user.setUname(new String(user.getUname().getBytes("ISO-8859-1"), "utf-8"));
            user.setUpw(new String(user.getUpw().getBytes("ISO-8859-1"), "utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        userService.addUser(user);
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "注册成功！");
        mv.setViewName("/jsp/success");
        return mv;
    }

    @RequestMapping("allUser.do")
    public ModelAndView findAllUser() {
        List<User> list = userService.queryAllUser();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("jsp/userList");
        mv.addObject("userList", list);
        return mv;
    }



}
