package org.spring.springmvc1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/templates/board")
public class BoardController {

    @GetMapping("/index")
    public String board_index(){
        return "templates/board/index";
    }
}
