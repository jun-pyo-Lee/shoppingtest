package com.junpyo.shopping.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.junpyo.shopping.user.dto.UserDTO;

@Mapper
public interface UserMapper {

  int insertUser(UserDTO userDto);

  // 로그인 할때 체크하는거
  int existsUser(UserDTO userDto);

}
