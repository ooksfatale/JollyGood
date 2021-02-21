package com.blog.jollygood.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardDto {
    private String bbsCd; //게시판코드
    private int bbsId; //게시글 고유번호
    private String bbsWriterSno; //작성자 번호
    private String bbsWriterId; //작성자 아이디
    private String bbsTitle; //제목
    private String bbsContent; //내용
    private Date bbsRegDate; //작성일
    private Date bbsUpdDate; //수정일
    private int bbsViewCnt; //조회수
    private String bbsUseYn; //게시글 사용 여부
    //private String bbsAtchFileSn; //첨부파일 번호
    //private String bbsImageFileSn; //이미지파일 번호
}
