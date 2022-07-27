package com.junpyo.shopping.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junpyo.shopping.board.dto.BoardDTO;
import com.junpyo.shopping.board.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "board")
public class BoardController {

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

  //  @RequestMapping(value = "/")
  //  public String mainPage(Model model) {
  //    return "mainPage";
  //  }

  @RequestMapping(value = "boardWrite.do")
  public String boardWrite() {
    return "board/boardWrite";
  }

  @RequestMapping(value = "boardListView.do")
  public String boardListView(Model model) {
    List<BoardDTO> list = boardService.getBoardList();
    model.addAttribute("list", list);
    return "board/boardListView";
  }

  @RequestMapping(value = "contentsView.do")
  public String contentsView(int boardNo, Model model) {
    BoardDTO dto = boardService.getContentsView(boardNo);
    model.addAttribute("dto", dto);
    return "board/contentsView";
  }

  @RequestMapping(value = "writeCheck.do")
  public String writeCheck(BoardDTO boardDto) {
    boardService.setBoardWrite(boardDto);
    return "redirect:/board/boardListView.do";
  }

  // 해당 게시글 삭제(실제 데이터 삭제 X 삭제유무 컬럼값만 변경)
  @RequestMapping(value = "deleteList.do")
  public String deleteList(int boardNo) {
    boardService.setDeleteList(boardNo);
    return "redirect:/board/boardListView.do";
  }

  @RequestMapping(value = "updateBoard.do")
  public String updateBoard(int boardNo, Model model) {
    BoardDTO dto = boardService.getUpdateForm(boardNo);
    model.addAttribute("dto", dto);
    return "board/updateBoard";
  }

  @RequestMapping(value = "setUpdateBoard.do")
  public String setUpdateBoard(BoardDTO boardDto) {
    boardService.setUpdateForm(boardDto);
    return "redirect:/board/boardListView.do";
  }
}
