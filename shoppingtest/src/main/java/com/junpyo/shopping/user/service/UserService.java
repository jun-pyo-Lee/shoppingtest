package com.junpyo.shopping.user.service;

import com.junpyo.shopping.user.dto.UserDTO;

public interface UserService {

  int setUserSignUp(UserDTO userDto);

  int getLoginCheck(UserDTO userDto);

}
