package net.mvc.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.websocket.Session;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import net.mvc.resource.SqlMapConfig;

public class UserDaoModel { // business logic 을 수행
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();



	public ArrayList<BuserDto> getUserList() {
		ArrayList list = null;
		SqlSession session = factory.openSession();
		try {
			list = (ArrayList) session.selectList("getUserbuser");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		return list;
	}

	public ArrayList<SawonDto> getUserList2(String buser_no) {
		ArrayList list = null;
		SqlSession session = factory.openSession();
		try {
			list = (ArrayList) session.selectList("findsawon",buser_no);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		return list;
	}
	
	public ArrayList<GogekDto> getUserList3(){
		ArrayList list = null;
		SqlSession session = factory.openSession();
		try {
			list = (ArrayList) session.selectList("findgogek");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
		return list;
	}

}
