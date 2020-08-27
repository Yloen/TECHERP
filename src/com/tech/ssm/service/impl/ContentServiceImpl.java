package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Content;
import com.tech.ssm.domain.User;
import com.tech.ssm.mapper.ContentMapper;
import com.tech.ssm.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {
	
	@Autowired
	private ContentMapper contentmapper;

	@Override
	public List<Content> find() {
		// TODO 自动生成的方法存根
		return contentmapper.find();
	}

	@Override
	public Content selectByID(String ContentId) {
		// TODO 自动生成的方法存根
		return contentmapper.selectByID(ContentId);
	}

	@Override
	public List<Content> findRecovery() {
		// TODO 自动生成的方法存根
		return contentmapper.findRecovery();
	}

	@Override
	public int Recovery(String ContentId) {
		// TODO 自动生成的方法存根
		return contentmapper.Recovery(ContentId);
	}

	@Override
	public int RecoveryBatch(String[] ContentId) {
		// TODO 自动生成的方法存根
		return contentmapper.RecoveryBatch(ContentId);
	}

	@Override
	public int deleteBatch(String[] ContentId) {
		// TODO 自动生成的方法存根
		return contentmapper.deleteBatch(ContentId);
	}

	@Override
	public int deleteByID(String ContentId) {
		// TODO 自动生成的方法存根
		return contentmapper.deleteByID(ContentId);
	}

	@Override
	public int Revocation(String ContentId) {
		// TODO 自动生成的方法存根
		return contentmapper.Revocation(ContentId);
	}

	@Override
	public List<Content> likecontent(Content Content) {
		// TODO 自动生成的方法存根
		return contentmapper.likecontent(Content);
	}

	@Override
	public int insert(Content content) {
		// TODO 自动生成的方法存根
		return contentmapper.insert(content);
	}

}
