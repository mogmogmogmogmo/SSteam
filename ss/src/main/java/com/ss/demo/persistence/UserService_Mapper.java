package com.ss.demo.persistence;

import java.util.List;
import java.util.Map;

import com.ss.demo.domain.FoodVO;
import com.ss.demo.domain.RentalhomeVO;
import com.ss.demo.domain.SearchVO;
import com.ss.demo.domain.UserVO;


public interface UserService_Mapper {

	public int userInsert(UserVO uv);
	public UserVO userlogin(UserVO uv);
	
	public int uNickCheck(String uNick);
	// id 중복체크 
	public int uIdCheck(String uId);
	//pw 체크
	public UserVO uPwCheck(String uId);
	// 회원 정보 수정
	public int UserModifyAction(UserVO uv);
	// 유저 조회 
	public UserVO userONE(UserVO uv);
	// 유저 리스트
	public List<UserVO> UserList(UserVO uv);
	public List<UserVO> seaUserList(String uType);
	// 유저 서치
	public List<UserVO> searchList(SearchVO searchVO);

	// 이미지 수정 
	public int profileimg(Map<String, Object> map);
	// 마이페이지 좋아요 리스트 뿌려줘버려~
	public List<RentalhomeVO> selectAll_rentalhome_userlike(int uNo);
	// 마이페이지 좋아요 맛집 리스트
	public List<FoodVO> selectAll_food_userlike(int uNo);
	/*
	 * public userVO login(String uId); public int memberIdCheckcnt(String uId);
	 * public userVO memberLogin(String uId);
	 */
	public int rentalhome_userlike(int uNo);
}
