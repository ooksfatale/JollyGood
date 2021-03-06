package com.blog.jollygood.controller.board;

import com.blog.jollygood.dto.BoardDto;
import com.blog.jollygood.service.board.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    /*게시글 목록*/
    @GetMapping("/board/{bbsCd}")
    public String boardList(@ModelAttribute BoardDto boardDto, ModelMap model) throws Exception{
        try {
            List<BoardDto> boardList = boardService.boardList(boardDto);
            model.addAttribute("boardList", boardList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "board/board_list";
    }

    /* 게시글 작성*/
    @GetMapping("/board/{bbsCd}/write")
    public String writeBoard(@ModelAttribute BoardDto boardDto, ModelMap model, HttpServletRequest req, HttpServletResponse res, HttpSession session) {
        try {
            boardDto.setBbsWriterId("test");
            model.addAttribute("boardDto", boardDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "board/board_write";
    }

    /* 게시글 저장*/
    @PostMapping("/board/write")
    public String saveBoard(@ModelAttribute BoardDto boardDto, ModelMap model, HttpServletRequest req, HttpServletResponse res, HttpSession session) {
        try {
            boardDto.setBbsWriterId("test");
            boardDto.setBbsWriterSno("test");
            boardService.saveBoard(boardDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/board/"+boardDto.getBbsCd();
    }

    /* 게시글 보기*/
    @GetMapping("/board/{bbsCd}/{bbsId}")
    public String detailBoard(@ModelAttribute BoardDto boardDto, ModelMap model, HttpServletRequest req, HttpServletResponse res, HttpSession session) {
        try {
            model.addAttribute("boardDto",boardService.boardInfo(boardDto));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "board/board_detail";
    }

    /* 게시글 수정화면*/
    @GetMapping("/board/{bbsCd}/{bbsId}/edit")
    public String editBoard(@ModelAttribute BoardDto boardDto, ModelMap model, HttpServletRequest req, HttpServletResponse res, HttpSession session) {
        try {
            model.addAttribute("boardDto",boardService.boardInfo(boardDto));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "board/board_edit";
    }

    /* 게시글 수정*/
    @PutMapping("/board/{bbsCd}/{bbsId}")
    public String updateBoard(@ModelAttribute BoardDto boardDto, ModelMap model, HttpServletRequest req, HttpServletResponse res, HttpSession session) {
        try {
            boardService.updateBoard(boardDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/board/"+boardDto.getBbsCd();
    }

}
