package monmey1024.service.impl;

import monmey1024.bean.User;
import monmey1024.dao.UserDao;
import monmey1024.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);


    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }

    @Override
    public List<User> selectUsers() {
        return userDao.selectUsers();
    }

    @Override
    public User selectUserById(int id) {
        return userDao.selectUserById(id);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }
}
