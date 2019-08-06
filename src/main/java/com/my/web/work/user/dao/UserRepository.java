package com.my.web.work.user.dao;

import com.my.web.work.user.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 15:44 2018/9/7
 * @Description:
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}