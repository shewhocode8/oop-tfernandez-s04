package com.thoniefernandez.learningspringboot.dao;
import com.thoniefernandez.learningspringboot.model.User;
import com.thoniefernandez.learningspringboot.model.User.Gender;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.UUID;

import java.util.*;

@Repository
public class FakeDataDao implements UserDao {
    private static final Map<UUID, User> database;
    static{
        database = new HashMap<>();
        UUID juanUserid = UUID.randomUUID();
        database.put(juanUserid, new User(juanUserid, "Juan", "Dela Cruz", Gender.MALE,
                25, "juandelacruz@gmail.com"));
    }

    @Override
    public List<User> selectAllUsers() {
        return new ArrayList<>(database.values());
    }

    @Override
    public Optional<User> selectUserByUid(UUID userUid) {
        return Optional.ofNullable(database.get(userUid));
    }

    @Override
    public int updateUser(User user) {
        database.put(user.getUserUid(), user);
        return 1;
    }

    @Override
    public int deleteUser(UUID userUid) {
        database.remove(userUid);
        return 1;
    }

    @Override
    public int insertUser(UUID userUid, User user) {
        database.put(userUid, user);
        return 1;
    }
}
