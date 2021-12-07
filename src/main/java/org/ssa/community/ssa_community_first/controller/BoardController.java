package org.ssa.community.ssa_community_first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.ssa.community.ssa_community_first.entity.Category;
import org.ssa.community.ssa_community_first.entity.TotalBoard;
import org.ssa.community.ssa_community_first.repository.BoardRepository;
import org.ssa.community.ssa_community_first.repository.CategoryRepository;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    CategoryRepository categoryRepository;


    @Autowired
    BoardRepository boardRepository;

//    카테고리 생성

    @PostMapping("/regCategory")
    public String regCategory(Category category){
        System.out.println("==============category==============="+category);
        categoryRepository.save(category);
        return "redirect:/";
    }

//    카테고리 리스트
//
//    @PostMapping("/categoryList")
//    public String categoryList(Category category){
//        System.out.println("==============category==============="+category);
//        categoryRepository.save(category);
//        return "/categoryList";
//    }


// 게시물 생성
    @PostMapping("/regBoard")
    public String regBoard(TotalBoard totalBoard){
        System.out.println("==============category==============="+totalBoard);
        boardRepository.save(totalBoard);
        return "redirect:/";
    }


}
