package org.ssa.community.ssa_community_first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.ssa.community.ssa_community_first.entity.Category;
import org.ssa.community.ssa_community_first.entity.TotalBoard;
import org.ssa.community.ssa_community_first.repository.BoardRepository;
import org.ssa.community.ssa_community_first.repository.CategoryRepository;

import java.util.Optional;

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

// 전체 게시물 리스트
    @GetMapping("/list")
    public String getList(Model model,
                          @PageableDefault Pageable pageable){
        int page = (pageable.getPageNumber()==0) ? 0 : (pageable.getPageNumber()-1);
        pageable = PageRequest.of(page, 15, Sort.by("bNo").descending());

        Page<TotalBoard> list = boardRepository.findAll(pageable);

        System.out.println("================list==============="+list);

        model.addAttribute("list", list);

        return "/board/totalBoardList";
    }


// 게시물 상세페이지
    @GetMapping("/select")
    public String getBoardById(@RequestParam("bNo") int bNo, Model model){

        System.out.println("======================="+bNo);
        Optional<TotalBoard> boardOne = boardRepository.findById(bNo);

        System.out.println("===============boardOne========"+boardOne);
        model.addAttribute("boardOne",boardOne.get());

        //Optional 에서 값을 빼올려면 get()써줘야함
        return "/board/selectByBNo";
    }

// 수정 페이지
    @GetMapping("/update")
    public String goBoardUpdateForm(@RequestParam("bNo") int bNo, Model model){

        System.out.println("======================="+bNo);
        Optional<TotalBoard> boardOne = boardRepository.findById(bNo);

        System.out.println("===============boardOne========"+boardOne);
        model.addAttribute("boardOne",boardOne.get());

        //Optional 에서 값을 빼올려면 get()써줘야함
        return "/board/updateBoardForm";
    }


// 게시물 수정
    @PostMapping("/updateBoard")
    public String boardUpdate(TotalBoard totalBoard){

        System.out.println("===========boardUpdate===========");

        boardRepository.save(totalBoard);

        int bNo = totalBoard.getBNo();

        return "redirect:/board/select?bNo="+bNo;
    }


    // 게시물 상세페이지
    @GetMapping("/delete")
    public String boardDelete(@RequestParam("bNo") int bNo){

        System.out.println("======================="+bNo);
        boardRepository.deleteById(bNo);

        //Optional 에서 값을 빼올려면 get()써줘야함
        return "redirect:/board/list";
    }



}
