<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<table id="datalist" class="table table-border table-bordered table-hover table-bg table-sort">
      <thead>
      <tr class="text-c">
        <th width="25">选择</th>
        <th width="50">ID</th>
        <th width="80">用户名</th>
        <th width="90">权限</th>
        <th width="">状态</th>
        <th width="100">操作</th>
      </tr>
      </thead>

<tbody >

     <c:forEach items="${users}" var="user">
       <tr class="text-c">
        <td><input type="checkbox" value="${user.getUserId()}"
								name="ckbok"></td>
        <td>${user.getUserId()}</td>
        <td><u style="cursor:pointer" class="text-primary"
               onclick="member_show('${user.getUserName()}','${pageContext.request.contextPath}/User/User_show?UserId=${user.getUserId()}','10001','360','400')">${user.getUserName()}</u></td>
        <td>${user.getCategoryName()}</td>
        <td>${user.getStatus()}</td>
        <td class="td-manage">
					<a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>
					<a title="编辑" href="javascript:;" onclick="member_edit('编辑','${pageContext.request.contextPath}/User/User_edit?UserId=${user.getUserId()}','4','','510')" class="ml-5" style="text-decoration:none">
						<i class="Hui-iconfont">&#xe6df;</i>
					</a>
					<a style="text-decoration:none" class="ml-5" onClick="change_password('修改密码','${pageContext.request.contextPath}/change_password.do?name=${user.getUserName()}','10001','600','270')"
						 href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i>
					</a>
          <a title="删除" href="javascript:;" onclick="member_del(this,'${user.getUserId()}')" class="ml-5" style="text-decoration:none">
						<i class="Hui-iconfont">&#xe6e2;</i>
					</a>
				</td>
      </tr>
      </c:forEach>
      
</tbody> 

</table>
