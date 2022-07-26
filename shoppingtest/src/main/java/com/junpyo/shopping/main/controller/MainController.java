package com.junpyo.shopping.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junpyo.shopping.main.dto.BoardDTO;
import com.junpyo.shopping.main.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {

  @Autowired
  private BoardService boardService;

  /**
   * Simply selects the home view to render by returning its name.
   */
  //  @RequestMapping(value = "/", method = RequestMethod.GET)
  //  public String home(Locale locale, Model model) {
  //    logger.info("Welcome home! The client locale is {}.", locale);
  //
  //    Date date = new Date();
  //    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
  //
  //    String formattedDate = dateFormat.format(date);
  //
  //    model.addAttribute("serverTime", formattedDate);
  //
  //    return "home";
  //  }

  @RequestMapping(value = "/")
  public String mainPage(Model model) {
    System.out.println("메인페이지 진입");
    return "mainPage";
  }

  @RequestMapping(value = "boardWrite.do")
  public String boardWrite() {
    return "boardWrite";
  }

  @RequestMapping(value = "boardListView.do")
  public String boardListView(Model model) {
    System.out.println("보드리스트 진입 ");
    List<BoardDTO> list = boardService.getBoardList();
    model.addAttribute("list", list);
    return "boardListView";
  }

  @RequestMapping(value = "contentsView.do")
  public String contentsView(int boardNo, Model model) {
    System.out.println("게시글 보기 진입");
    BoardDTO dto = boardService.getContentsView(boardNo);
    model.addAttribute("dto", dto);
    return "contentsView";
  }

  @RequestMapping(value = "writeCheck.do")
  public String writeCheck(BoardDTO boardDto) {
    System.out.println("작성창진입");
    boardService.setBoardWrite(boardDto);
    return "redirect:/boardListView.do";
  }
}
