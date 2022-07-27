package com.junpyo.shopping.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junpyo.shopping.user.dto.UserDTO;
import com.junpyo.shopping.user.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public int setUserSignUp(UserDTO userDto) {
    int check = userMapper.insertUser(userDto);
    return check;
  }

  @Override
  public int getLoginCheck(UserDTO userDto) {
    int check = userMapper.existsUser(userDto);
    return check;
  }

}
