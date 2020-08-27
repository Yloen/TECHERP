<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
			<table id="datalist"
				class="table table-border table-bordered table-hover table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="25">选择</th>
						<th width="50">ID</th>
						<th width="80">姓名</th>
						<th width="90">性别</th>
						<th width="90">图片</th>
						<th width="">简介</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${personallInfos}" var="personallInfo">
						<tr class="text-c">
							<td><input type="checkbox" value="${personallInfo.getPersonalId()}"
								name="ckbok"></td>
							<td>${personallInfo.getPersonalId()}</td>
							<td><u style="cursor: pointer" class="text-primary"
								onclick="member_show('${personallInfo.getName()}','${pageContext.request.contextPath}/PersonallInfo/Person_Show?PersonalId=${personallInfo.getPersonalId()}','10001','360','400')">${personallInfo.getName()}</u></td>
							<td>${personallInfo.getSex()}</td>
							<td>${personallInfo.getPhoto()}</td>
							<td>${personallInfo.getContent()}</td>
							<td class="td-manage"><a style="text-decoration: none"
								onClick="member_stop(this,'10001')" href="javascript:;"
								title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a
								title="编辑" href="javascript:;"
								onclick="member_edit('编辑','${pageContext.request.contextPath}/PersonallInfo/Person_Edit?PersonalId=${personallInfo.getPersonalId()}','4','','510')"
								class="ml-5" style="text-decoration: none"> <i
									class="Hui-iconfont">&#xe6df;</i>
							</a> <a style="text-decoration: none" class="ml-5"
								onClick="change_password('修改,'${pageContext.request.contextPath}/change_password.do?name=${personallInfo.getName()}','10001','600','270')"
								href="javascript:;" title="修改"><i class="Hui-iconfont">&#xe63f;</i>
							</a> <a title="删除" href="javascript:;"
								onclick="member_del(this,'${personallInfo.getPersonalId()}')" class="ml-5"
								style="text-decoration: none"> <i class="Hui-iconfont">&#xe6e2;</i>
							</a></td>
						</tr>
					</c:forEach>

				</tbody>
				</div>
			</table>