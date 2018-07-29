package com.dao;

import java.util.List;

import com.po.Users;

public interface IUsersDao {
  public  List<Users> selectAll();
}