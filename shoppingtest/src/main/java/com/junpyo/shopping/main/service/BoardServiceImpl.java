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
    System.out.println("서비스 들어옴");
    List<BoardDTO> list = mapper.selectBoardList();
    return list;
  }

}
