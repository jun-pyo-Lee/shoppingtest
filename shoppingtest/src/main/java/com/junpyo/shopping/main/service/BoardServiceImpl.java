package com.junpyo.shopping.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junpyo.shopping.main.dto.BoardDTO;
import com.junpyo.shopping.main.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

  @Autowired
  private BoardMapper mapper;

  @Override
  public List<BoardDTO> getBoardList() {
    List<BoardDTO> list = mapper.selectBoardList();
    return list;
  }

  @Override
  public BoardDTO getContentsView(int boardNo) {
    BoardDTO dto = mapper.selectContentsView(boardNo);
    return dto;
  }

  @Override
  public int setBoardWrite(BoardDTO boardDto) {
    int check = mapper.insertBoardWrite(boardDto);

    return check;
  }

  @Override
  public int setDeleteList(int boardNo) {
    int check = mapper.deleteList(boardNo);
    return check;
  }

  @Override
  public BoardDTO getUpdateForm(int boardNo) {
    BoardDTO dto = mapper.selectUpdateForm(boardNo);
    return dto;
  }

  @Override
  public int setUpdateForm(BoardDTO boardDto) {
    int check = mapper.updateBoardForm(boardDto);
    return check;
  }

}
