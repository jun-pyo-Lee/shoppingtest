package com.junpyo.shopping.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.junpyo.shopping.user.dto.UserDTO;
import com.junpyo.shopping.user.service.UserService;

@Controller
@RequestMapping(value = "user")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "userSignUpPage.do")
  public String userSignUpPage() {
    return "user/userSignUpPage";
  }

  @RequestMapping(value = "userSignUP.do")
  public String userSignUP(UserDTO userDto) {
    System.out.println("작성완료");
    System.out.println(userDto.getUserId());
    System.out.println(userDto.getUserPassword());
    userService.setUserSignUp(userDto);
    return "redirect:/mainPage";
  }

  @RequestMapping(value = "loginCheck.do")
  public String loginCheck(UserDTO userDto) {
    int check = userService.getLoginCheck(userDto);
    if (check == 1) {
      return "board/boardListView";
    } else {
      return "redirect:/mainPage";
    }

  }
}
