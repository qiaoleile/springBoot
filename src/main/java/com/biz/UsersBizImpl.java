package com.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.IUsersDao;
import com.po.Users;
@Service
public class UsersBizImpl implements IUsersBiz {
	@Resource
	private IUsersDao iud;
	@Override
	public List<Users> selectAll() {
		return iud.selectAll();
	}

}
