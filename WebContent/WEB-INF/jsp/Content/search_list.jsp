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
						<th width="80">标题</th>
						<th width="120">发布时间</th>
						<th width="">类别</th>
						<th width="">作者</th>
						<th width="">文件</th>
						<th width="">图片</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${contents}" var="content">
				<!--非回收站-->
					<c:if test="${content.getStatus()==2}">
						<tr class="text-c">
							<td><input type="checkbox" value="${content.getContentId()}"
								name="ckbok"></td>
							<td>${content.getContentId()}</td>
							<td><u style="cursor: pointer" class="text-primary"
								onclick="member_show('${content.getTopic()}','${pageContext.request.contextPath}/Content/Content_show?ContentId=${content.getContentId()}','10001','360','400')">${content.getTopic()}</u></td>
							
							<td>${content.getPublicDate()}</td>
							
							<td>${content.getCategoryName()}</td>
							<td>${content.getAuthor()}</td>
							
							<td>${content.getFileSrc()}</td>
							
							<td><img width="30px" height="30px"
							src="${pageContext.request.contextPath}/images/${content.getPicSrc()}"></td>
							
							
							<td class="td-manage">
							 <a
								title="编辑" href="javascript:;"
								onclick="member_edit('编辑','${pageContext.request.contextPath}/Content/Content_edit?ContentId=${content.getContentId()}','4','','510')"
								class="ml-5" style="text-decoration: none"> <i
									class="Hui-iconfont">&#xe6df;</i>
							</a> 
							
							 <a title="删除" href="javascript:;"
								onclick="member_del(this,'${content.getContentId()}')" class="ml-5"
								style="text-decoration: none"> <i class="Hui-iconfont">&#xe6e2;</i>
							</a></td>
						</tr>		
						</c:if>
						
						
					<!--回收站-->
					<c:if test="${content.getStatus()==1}">
						
						<tr class="text-c">
							<td><input type="checkbox" value="${content.getContentId()}"
								name="ckbok"></td>
							<td>${content.getContentId()}</td>
							<td><u style="cursor: pointer" class="text-primary"
								onclick="member_show('${content.getTopic()}','${pageContext.request.contextPath}/Content/content_show?ContentId=${content.getContentId()}','10001','360','400')">${content.getTopic()}</u></td>
							
							<td>${content.getPublicDate()}</td>
							
							<td>${content.getCategoryName()}</td>
							<td>${content.getAuthor()}</td>
							
							<td>${content.getFileSrc()}</td>
							
							<td><img width="30px" height="30px"
							src="${pageContext.request.contextPath}/images/${content.getPicSrc()}"></td>
							
							
							<td class="td-manage">
							 <a
								title="撤销删除" href="javascript:;"
								onclick="Revocation(this,'${content.getContentId()}')"
								class="ml-5" style="text-decoration: none"> <i
									class="Hui-iconfont">&#xe6df;</i>
							</a> 
							
							 <a title="确定删除" href="javascript:;"
								onclick="member_del(this,'${content.getContentId()}')" class="ml-5"
								style="text-decoration: none"> <i class="Hui-iconfont">&#xe6e2;</i>
							</a></td>
						</tr>
					</c:if>
						
					</c:forEach>

				</tbody>

</table>
