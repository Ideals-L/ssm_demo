package monmey1024.service;

import monmey1024.bean.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    List<User> selectUsers();

    User selectUserById(int id);

    void deleteUser(int id);
}
