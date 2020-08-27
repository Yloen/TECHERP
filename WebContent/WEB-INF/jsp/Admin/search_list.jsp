<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<table id="datalist"
	class="table table-border table-bordered table-hover table-bg table-sort">
	<thead>
		<tr class="text-c">
			<th width="25"><input type="checkbox" name="" value=""></th>
			<th width="80">管理员编号</th>
			<th width="80">用户名</th>
			<th width="80">密码</th>
			<th width="80">用户分类</th>
			<th width="70">用户状态</th>
			<th width="100">操作</th>
		</tr>
	</thead>

	<tbody>

		<c:forEach items="${admins}" var="admin">
						<tr class="text-c">
							<td><input type="checkbox" value="${admin.getAdminId()}" name="ckbok"></td>
							<td>${admin.getAdminId()}</td>
							<td><u style="cursor: pointer" class="text-primary"
						onclick="member_show('${admin.getAdminName()}',
					'${pageContext.request.contextPath}/Admin/admin_show?AdminId=${admin.getAdminId()}',
					'10001','360','400')">${admin.getAdminName()}</u></td>
							<td>${admin.getAdminPwd()}</td>
							<td class="text-l">${admin.getCategoryName()}</td>
							<td class="td-status"><span
								class="label label-success radius">${admin.getStatus()}</span></td>
							<td class="td-manage"><a style="text-decoration: none"
								onClick="member_stop(this,'10001')" href="javascript:;"
								title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a
								title="编辑" href="javascript:;"
								onclick="member_edit('编辑','${pageContext.request.contextPath}/Admin/admin_edit?AdminId=${admin.getAdminId()}','4','','510')"
								class="ml-5" style="text-decoration: none"> <i
									class="Hui-iconfont">&#xe6df;</i>
							</a> <a style="text-decoration: none" class="ml-5"
								onClick="change_password('修改密码','${pageContext.request.contextPath}/Admin/admin_new_password?AdminId=${admin.getAdminId()}','10001','600','270')"
								href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i>
							</a> <a title="删除" href="javascript:;"
								onclick="member_del(this,'${admin.getAdminId()}')" class="ml-5"
								style="text-decoration: none"> <i class="Hui-iconfont">&#xe6e2;</i>
							</a></td>
						</tr>
</c:forEach>
	</tbody>

</table>
