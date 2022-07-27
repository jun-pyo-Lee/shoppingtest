package com.junpyo.shopping.board.service;

import java.util.List;

import com.junpyo.shopping.board.dto.BoardDTO;

public interface BoardService {

  // 전체 보드 게시글 가져오기
  List<BoardDTO> getBoardList();

  // 게시글 클릭하면 해당게시글의 번호를 param으로 가져와 보여주기
  BoardDTO getContentsView(int boardNo);

  // 게시글 작성 DTO로 받아서 전달
  int setBoardWrite(BoardDTO boardDto);

  // 게시글 삭제 시 해당 게시글의 번호 param으로 가져오기
  int setDeleteList(int boardNo);

  // 해당 게시글 클릭 시 param으로 boardNo가져오고 값들 dto로 받아서 controller전달.
  BoardDTO getUpdateForm(int boardNo);

  // 게시글 수정
  int setUpdateForm(BoardDTO boardDto);

}
