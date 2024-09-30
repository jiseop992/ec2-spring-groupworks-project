package com.groupworks.app.payform.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import com.groupworks.app.payform.dao.PayFormDao;
import com.groupworks.app.payform.vo.PayFormVo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PayFormService {

	
	private final PayFormDao dao;
	private final SqlSessionTemplate sst;
	
	public List<PayFormVo> list() {
		return dao.list(sst);
	}
	
	public List<PayFormVo> ingApprove() {
		return dao.ingApprove(sst);
	}
	
	public List<PayFormVo> edApproved() {
		return dao.edApprove(sst);
	}
	
	public int write(PayFormVo vo) {
		return dao.write(sst, vo);
	}
	
	public int apply(PayFormVo vo) {
		return dao.apply(sst, vo);
	}
	
	public int rejection(PayFormVo vo) {
		return dao.rejection(sst, vo);
	}
	
	public int delete(String no) {
		return dao.delete(sst, no);
	}
}
