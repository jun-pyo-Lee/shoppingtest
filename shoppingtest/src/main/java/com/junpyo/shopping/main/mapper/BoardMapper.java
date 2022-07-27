package com.junpyo.shopping.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.junpyo.shopping.main.dto.BoardDTO;

@Mapper
public interface BoardMapper {

  List<BoardDTO> selectBoardList();

  BoardDTO selectContentsView(int boardNo);

  int insertBoardWrite(BoardDTO boardDto);

  int deleteList(int boardNo);

  BoardDTO selectUpdateForm(int boardNo);

  int updateBoardForm(BoardDTO boardDto);

}
