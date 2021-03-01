package com.blog.jollygood.service.board;

import com.blog.jollygood.dto.BoardDto;

import java.util.List;

public interface BoardService {

    /*게시글 목록*/
    public List<BoardDto> boardList(BoardDto boardDto) throws Exception;

    /*게시글 저장*/
    public void saveBoard(BoardDto boardDto) throws Exception;

    /*게시글 정보*/
    public BoardDto boardInfo(BoardDto boardDto) throws Exception;

    /*게시글 수정*/
    public void updateBoard(BoardDto boardDto) throws Exception;
}
