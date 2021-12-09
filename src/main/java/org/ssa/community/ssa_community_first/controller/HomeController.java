package org.ssa.community.ssa_community_first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index/index";
    }

    @GetMapping("/regCategoryForm")
    public String regCategory(){
        return "board/regCategoryForm";
    }

    @GetMapping("/regBoardForm")
    public String regBoard(){
        return "board/regBoardForm";
    }

}
