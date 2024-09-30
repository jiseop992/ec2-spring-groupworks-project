package com.groupworks.app.message.dao;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import com.groupworks.app.message.vo.MessageVo;

@Repository
public class MessageDao {

	public List<MessageVo> sendList(SqlSessionTemplate sst, String memberNo) {
		return sst.selectList("MessageMapper.sendList", memberNo);
	}
	
	public List<MessageVo> recieveList(SqlSessionTemplate sst, String memberNo) {
		return sst.selectList("MessageMapper.recieveList", memberNo);
	}
	
	public int write(SqlSessionTemplate sst, MessageVo vo) {
		return sst.insert("MessageMapper.insert", vo);
	}
	
	public int reWrite(SqlSessionTemplate sst, MessageVo vo) {
		return sst.insert("MessageMapper.reInsert", vo);
	}
	
	public int delete(SqlSessionTemplate sst, String no) {
		return sst.update("MessageMapper.delete", no);
	}
	

}
