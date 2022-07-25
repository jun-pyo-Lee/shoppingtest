package com.junpyo.shopping.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.junpyo.shopping.main.dto.BoardDTO;

@Mapper
public interface BoardMapper {

  List<BoardDTO> selectBoardList();

}
