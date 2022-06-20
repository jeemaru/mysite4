package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVo;

@Repository
public class UserDao {

	@Autowired
	private SqlSession sqlSession;

	public int join(UserVo userVo) {
		
		int count  =  sqlSession.insert("users.join", userVo);
		
		return count;
	}
	
	public int modify(UserVo userVo) {
		
		int count = sqlSession.update("users.modify", userVo);
		
		return count;
	}
}
