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
			<th width="50">ID</th>
			<th width="80">部门名</th>
			<th width="90">负责人</th>
			<th width="">简介</th>
			<th width="100">操作</th>
		</tr>
	</thead>

	<tbody>

		<c:forEach items="${departments}" var="department">
			<tr class="text-c">
							<td><input type="checkbox" value="${department.getDepartmentId()}"
								name="ckbok"></td>
							<td>${department.getDepartmentId()}</td>
							<td><u style="cursor: pointer" class="text-primary"
								onclick="member_show('${department.getDepartmentName()}','${pageContext.request.contextPath}/Department/department_show?DepartmentId=${department.getDepartmentId()}','10001','360','400')">${department.getDepartmentName()}</u></td>
							<td>${department.getLeader()}</td>
							<td>${department.getContent()}</td>
							<td class="td-manage"> <a
								title="编辑" href="javascript:;"
								onclick="member_edit('编辑','${pageContext.request.contextPath}/Department/department_edit?DepartmentId=${department.getDepartmentId()}','4','','510')"
								class="ml-5" style="text-decoration: none"> <i
									class="Hui-iconfont">&#xe6df;</i>
							</a> 
							 <a title="删除" href="javascript:;"
								onclick="member_del(this,'${department.getDepartmentId()}')" class="ml-5"
								style="text-decoration: none"> <i class="Hui-iconfont">&#xe6e2;</i>
							</a></td>
						</tr>
		</c:forEach>

	</tbody>

</table>
