<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
    <!-- HEAD START -->
    <jsp:include page="../includes/head.jsp" flush="false" />
    <!-- //HEAD START -->

    <!-- summernote editor -->
    <link href="/summernote/summernote-lite.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="wrapper">
    <jsp:include page="../includes/header.jsp" flush="false" />
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">게시글 등록</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <div class="row">
            <div class="col-lg-6">
                <div class="panel panel-default">

                    <div class="panel-heading">
                        DataTables Advanced Tables
                    </div>
                    <form id="frm" action="/board/write" method="post">
                        <div class="panel-body">
                            <div class="col-sm-3">
                                <div class="form-group">
                                    <select name="bbsCd" class="form-control" >
                                        <option>FREE</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-sm-12">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">제목</span>
                                    <input type="text" class="form-control" name="bbsTitle" value="${boardDto.bbsTitle}" placeholder="제목을 입력해 주세요.">
                                </div>
                            </div>
                            <div class="col-sm-12">
                                <div class="form-group input-group">
                                    <span class="input-group-addon">내용</span>
                                    <textarea id="summernote" class="form-control" name="bbsContent">${boardDto.bbsContent}</textarea>
                                </div>
                            </div>
                        </div>
                    </form>
                    <div class="panel-footer">
                        <a href="#none" class="btn btn-default" onclick="fnSave()">저장</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="../includes/footer.jsp" flush="false" />
</div>

<jsp:include page="../includes/foot.jsp" flush="false" />


<!-- summernote editor -->
<script src="/summernote/summernote-lite.js"></script>
<script src="/summernote/summernote-ko-KR.js"></script>

<script type="text/javascript">
    $(document).ready(function(){
        $("#summernote").summernote({
            height : 400,
            minHeight : null,
            maxHeight : null,
            focus : true,
            lang : "ko-KR"
        });
    });

    function fnSave(){
        $("#frm").submit();
    }
</script>
</body>
</html>

