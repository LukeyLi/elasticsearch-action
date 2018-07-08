package com.lzy.spring.boot.blog.repository;

import com.lzy.spring.boot.blog.domain.User;

import java.util.List;

public interface UserRepository {
    /**
     * 创建或修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    void deleteUser(Long id);

    User getUserById(Long id);

    List<User> listUser();
}
