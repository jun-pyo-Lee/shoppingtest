package com.junpyo.shopping.main.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
  private BoardService boardSerivce;

  private static final Logger logger = LoggerFactory.getLogger(MainController.class);

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

  @RequestMapping(value = "boardListView")
  public String boardListView(Model model) {
    System.out.println("보드리스트 진입 ");
    List<BoardDTO> list = boardSerivce.getBoardList();
    model.addAttribute("list", list);
    return "boardListView";
  }
}
