package com.blog.jollygood.service.board;

import com.blog.jollygood.dto.BoardDto;
import com.blog.jollygood.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    /*게시글 목록*/
    @Override
    public List<BoardDto> boardList(BoardDto boardDto) throws Exception {
        return boardMapper.boardList(boardDto);
    }

    /*게시글 저장*/
    @Override
    public void saveBoard(BoardDto boardDto) throws Exception {
        boardMapper.saveBoard(boardDto);
    }

    /*게시글 저장*/
    @Override
    public BoardDto boardInfo(BoardDto boardDto) throws Exception {
        return boardMapper.boardInfo(boardDto);
    }

}
