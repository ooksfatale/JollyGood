package com.blog.jollygood.mapper;

import com.blog.jollygood.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    /*게시글 목록*/
    public List<BoardDto> boardList(BoardDto boardDto) throws Exception;

    /*게시글 저장*/
    public void saveBoard(BoardDto boardDto) throws Exception;

    /*게시글 저장*/
    public BoardDto boardInfo(BoardDto boardDto) throws Exception;

}
