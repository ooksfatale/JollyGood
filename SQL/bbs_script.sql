CREATE TABLE jolly.TB_BBS_INFO (
    BBS_ID int(10) NOT NULL COMMENT '게시글 번호',
    BBS_CD varchar(10) NOT NULL COMMENT '게시글 구분코드',
    BBS_WRITER_SNO varchar(10) NOT NULL COMMENT '게시글 작성자 회원번호',
    BBS_WRITER_ID varchar(10) NOT NULL COMMENT '게시글 작성자 아이디',
    BBS_TITLE varchar(300) NOT NULL COMMENT '게시글 제목',
    BBS_CONTENT text NOT NULL COMMENT '게시글 내용',
    BBS_REG_DATE datetime NOT NULL COMMENT '게시글 작성시간',
    BBS_UPD_DATE datetime NOT NULL COMMENT '게시글 수정시간',
    BBS_VIEW_CNT int(10) NOT NULL DEFAULT 0 COMMENT '게시글 조회수',
    BBS_USE_YN varchar(1) NOT NULL DEFAULT 'Y' COMMENT '게시글 사용여부',
    PRIMARY KEY (`BBS_ID`,`BBS_CD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8