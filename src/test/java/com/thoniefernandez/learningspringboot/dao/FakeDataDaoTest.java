package com.thoniefernandez.learningspringboot.dao;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.thoniefernandez.learningspringboot.model.User;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class FakeDataDaoTest {
    private FakeDataDao fakeDataDao;


    @BeforeEach
    public void setUp() throws Exception{
        fakeDataDao = new FakeDataDao();
    }

    @Test
    public void shouldSelectAllUsers() throws Exception{
        List<User> users = fakeDataDao.selectAllUsers();
        assertThat(users).hasSize(1);
        User user = users.get(0);
        assertThat(user.getAge()).isEqualTo(25);
        assertThat(user.getFirstName()).isEqualTo("Juan");
        assertThat(user.getLastName()).isEqualTo("Dela Cruz");
        assertThat(user.getGender()).isEqualTo(User.Gender.MALE);
        assertThat(user.getEmail()).isEqualTo("juandelacruz@gmail.com");
        assertThat(user.getUserUid()).isNotNull();
    }

    @Test
    public void selectUserByUid() {
    }

    @Test
    void updateUser() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void insertUser() {
    }
}