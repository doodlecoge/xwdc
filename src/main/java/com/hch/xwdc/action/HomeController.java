package com.hch.xwdc.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: hch
 * Date: 13-10-11
 * Time: 下午9:13
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
