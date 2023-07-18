package com.ss.demo.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.demo.domain.UserVO;
import com.ss.demo.persistence.UserService_Mapper;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService{
	
	//마이바티스에서  사용할 메소드 집합 
	private UserService_Mapper usm;
	// 맵퍼 불러오기 
	@Autowired
	public UserServiceImpl(SqlSession sqlSession) {
		this.usm = sqlSession.getMapper(UserService_Mapper.class);
	}
	// 유저 회원가입 
	@Override
	public int userInsert(UserVO uv) {
		// TODO Auto-generated method stub
		
		int value = usm.userInsert(uv);
		System.out.println("user"+value);
		return value;
	}
	//유저 로그인
	public UserVO userlogin(String uId)
	{
		UserVO uv = null;
		uv = usm.userlogin(uId);
		System.out.println("sql"+uv);
		return uv;
	}
	// 유저 닉네임 중복체크 
	public int uNickCheck(String uNick)
	{
		
		int value = usm.uNickCheck(uNick);
		System.out.println("sql :" +value);
		return value;
	}
}
