package com.cun.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cun.entity.User;

/**
 * 用户 dao 接口
 * @author linhongcun
 *
 */
public interface UserDao extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User>{

}
