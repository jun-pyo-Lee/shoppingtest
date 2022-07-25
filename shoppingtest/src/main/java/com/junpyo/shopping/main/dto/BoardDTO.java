package com.junpyo.shopping.main.dto;

import java.util.Date;

public class BoardDTO {
  private int boardNo;
  private String boardTitle;
  private String boardContents;
  private String boardWriter;
  private Date boardWriteDate;
  private String boardDelYn;
  private Date boardModifyDate;

  public int getBoardNo() {
    return boardNo;
  }

  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }

  public String getBoardTitle() {
    return boardTitle;
  }

  public void setBoardTitle(String boardTitle) {
    this.boardTitle = boardTitle;
  }

  public String getBoardContents() {
    return boardContents;
  }

  public void setBoardContents(String boardContents) {
    this.boardContents = boardContents;
  }

  public String getBoardWriter() {
    return boardWriter;
  }

  public void setBoardWriter(String boardWriter) {
    this.boardWriter = boardWriter;
  }

  public Date getBoardWriteDate() {
    return boardWriteDate;
  }

  public void setBoardWriteDate(Date boardWriteDate) {
    this.boardWriteDate = boardWriteDate;
  }

  public String getBoardDelYn() {
    return boardDelYn;
  }

  public void setBoardDelYn(String boardDelYn) {
    this.boardDelYn = boardDelYn;
  }

  public Date getBoardModifyDate() {
    return boardModifyDate;
  }

  public void setBoardModifyDate(Date boardModifyDate) {
    this.boardModifyDate = boardModifyDate;
  }

}
