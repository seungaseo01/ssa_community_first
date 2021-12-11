package org.ssa.community.ssa_community_first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.ssa.community.ssa_community_first.entity.Category;
import org.ssa.community.ssa_community_first.repository.CategoryRepository;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/")
    public String index(){
        return "index/index";
    }

    @GetMapping("/regCategoryForm")
    public String regCategory(){
        return "board/regCategoryForm";
    }

    @GetMapping("/regBoardForm")
    public String regBoard(Model model){

        List<Category> categoryList =  categoryRepository.findAll();

        model.addAttribute("categoryList",categoryList);

        return "board/regBoardForm";
    }

}
