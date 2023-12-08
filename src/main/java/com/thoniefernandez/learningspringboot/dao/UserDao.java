package com.thoniefernandez.learningspringboot.dao;
import com.thoniefernandez.learningspringboot.model.User;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

public interface UserDao {
    List<User> selectAllUsers();
    Optional<User> selectUserByUid(UUID userUid);
    int updateUser(User user);
    int deleteUser(UUID userUid);
    int insertUser(UUID userUid, User user);
}
