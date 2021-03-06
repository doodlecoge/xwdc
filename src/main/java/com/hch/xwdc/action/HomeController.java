package com.hch.xwdc.action;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

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
    private int id;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping("/{id}")
    public String index(@PathVariable int id, ModelMap map) {
        if (id > 10){
            this.id = id;
        }

        map.addAttribute("id", this.id);
        return "index";
    }
}
