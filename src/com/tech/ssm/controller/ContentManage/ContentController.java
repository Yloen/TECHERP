package com.tech.ssm.controller.ContentManage;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.tech.ssm.domain.Content;

import com.tech.ssm.service.ContentService;

@Controller
@RequestMapping("/Content")
public class ContentController {

	@Autowired
	private ContentService contentservice;

	// 所有
	@RequestMapping("/List.do")
	public String Contentlist(HttpSession session) {
		List contentlist = contentservice.find();
		session.setAttribute("contentlist", contentlist);
		return "Content/content_list";
	}

	// 新建界面
	@RequestMapping("/Content_add")
	public String add() {
		return "Content/content_add";
	}

	// 添加(上传图片或者文件)
	@RequestMapping(value = "/Content_insert", method = RequestMethod.POST)
	@ResponseBody
	private String insert(Content content, @RequestParam("File") List<MultipartFile> uploadfile,
			HttpServletRequest request) {
		// 判断所上传文件是否存在
		if (!uploadfile.isEmpty() && uploadfile.size() > 0) {
			// 循环输出上传的文件
			for (MultipartFile file : uploadfile) {
				// 获取上传文件的原始名称
				String originalFilename = file.getOriginalFilename();

				String dirPath = null;
				// 得到加载文件的扩展名
				String type = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);

				System.out.println(type);
				if ("png".equals(type.toLowerCase()) || "jpg".equals(type.toLowerCase())
						|| "jpeg".equals(type.toLowerCase())) {
					// 设置上传文件的保存地址目录
					dirPath = request.getServletContext().getRealPath("/images/");

					// 获取图片位置
					content.setPicSrc( originalFilename);
				} else {
					dirPath = request.getServletContext().getRealPath("/files/");
					// 获取文件位置
					content.setFileSrc( originalFilename);
				}
				System.out.println(dirPath);
				if(dirPath!=null){
					File filePath = new File(dirPath);
					// 如果保存文件的地址不存在，就先创建目录
					if (!filePath.exists()) {
						filePath.mkdirs();
					}
					try {
						// 使用MultipartFile接口的方法完成文件上传到指定位置
						file.transferTo(new File(dirPath + originalFilename));
					} catch (Exception e) {
						e.printStackTrace();
					}	
				}
				
			}
			// 跳转到成功页面
			int i=contentservice.insert(content);
			if(i==1) {
				return "ok";
			}
			return "error";
		} else {

			return "error";
		}
	}

	// 修改界面
	@RequestMapping("/Content_edit")
	public String edit(String ContentId, HttpSession session) {
		Content content = contentservice.selectByID(ContentId);
		session.setAttribute("content", content);
		return "Content/content_edit";
	}

	// 详细界面
	@RequestMapping("/Content_show")
	public String searchContentByContentId(String ContentId, HttpSession session) {
		Content content = contentservice.selectByID(ContentId);
		session.setAttribute("content", content);
		return "Content/content_show";
	}

	// 伪删除
	@RequestMapping("/Content_Recovery")
	@ResponseBody
	public int recovery(String ContentId) {
		return contentservice.Recovery(ContentId);
	}

	// 伪删除 (多)
	@RequestMapping("/Content_RecoveryBatch")
	@ResponseBody
	public int recoverybatch(String[] ContentId) {
		return contentservice.RecoveryBatch(ContentId);
	}

	// 回收站界面
	@RequestMapping("/Content_RecoveryList")
	public String Recoverylist(HttpSession session) {
		List contentlist = contentservice.findRecovery();
		session.setAttribute("contentlist", contentlist);
		return "Content/recovery_list";

	}

	// 撤销
	@RequestMapping("/Revocation")
	@ResponseBody
	public int Revocation(String ContentId) {
		return contentservice.Revocation(ContentId);
	}

	// 删除
	@RequestMapping("/Content_Delete")
	@ResponseBody
	public int delete(String ContentId) {
		return contentservice.deleteByID(ContentId);
	}

	// 批量删除
	@RequestMapping(value = "/Content_DeleteBatch")
	@ResponseBody
	private int deleteBatch(String[] ids) throws Exception {
		return contentservice.deleteBatch(ids);
	}

	// 模糊查询
	@RequestMapping("/findlikeContent")
	@ResponseBody
	public ModelAndView findlikeContent(Content content) {
		System.out.println(content);
		List<Content> contents = contentservice.likecontent(content);
		ModelAndView data = new ModelAndView("Content/search_list");
		data.addObject("contents", contents);
		return data;
	}

}
