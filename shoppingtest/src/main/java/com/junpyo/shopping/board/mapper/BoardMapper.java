package com.junpyo.shopping.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.junpyo.shopping.board.dto.BoardDTO;

@Mapper
public interface BoardMapper {

  List<BoardDTO> selectBoardList();

  BoardDTO selectContentsView(int boardNo);

  int insertBoardWrite(BoardDTO boardDto);

  int deleteList(int boardNo);

  BoardDTO selectUpdateForm(int boardNo);

  int updateBoardForm(BoardDTO boardDto);

}
