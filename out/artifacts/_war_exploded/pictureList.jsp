
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>



<!DOCTYPE html>
<html>

<!--主体内容-->
<section class="publicMian ">
    <div class="left"></div>

    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>图片管理页面</span>
        </div>
        <div class="search">
            <span>搜索条件：</span>
            <input type="text" placeholder="请输入关键字"/>
            <input type="button" value="搜索"/>
            <a href="pictureAdd.jsp">添加图片</a>
        </div>
        <!--图片操作表格-->
        <form action="selectAll" method="post">
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="10%">图片编号</th>
                <th width="15%">图片名称</th>
                <th width="10%">作者</th>
                <th width="30%">操作</th>
            </tr>
            <c:forEach  items="${picInfo}" var = "picture">
            <tr>
                <td>${picture.pcode}</td>
                <td>${picture.pname}</td>
                <td>${picture.pauthor}</td>
                <td>
                    <a href="pictureView"><img src="img/read.png" alt="查看" title="查看"/></a>
                    <a href="pictureUpdate/${picture.pcode}" ><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                    <a href="/delete?pcode=${picture.pcode}"><img src="img/schu.png" alt="删除" title="删除"/></a>
                </td>
                </c:forEach>
        </table>
        </form>
    </div>
</section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeProv">
   <div class="removerChid">
       <h2>提示</h2>
       <div class="removeMain" >
               <p>你确定要删除该图片资源吗？</p>
               <a href="#" id="yes">确定</a>
               <a href="#" id="no">取消</a>
       </div>
   </div>
</div>

</html>