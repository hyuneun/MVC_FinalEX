package net.mvc.model;

import java.util.ArrayList;

public class UserManaget {//여러개의 dao를 관리
	public static UserManaget manager = new UserManaget();
	
	public static UserManaget instance(){
		return manager;
	}
	
	public UserDaoModel getUserDaoModel(){
		return new UserDaoModel();
	}
	
	public ArrayList<BuserDto> getUserList(){
		return getUserDaoModel().getUserList();
	}
	
	public ArrayList<SawonDto> findUser(String buser_no){
		return getUserDaoModel().getUserList2(buser_no);
	}
	
	public ArrayList<GogekDto> findUser2(){
		return getUserDaoModel().getUserList3();
	}
	
	
}
