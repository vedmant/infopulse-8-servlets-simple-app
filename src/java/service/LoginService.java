package service;

import dao.DaoFactory;
import dao.UserDao;
import dto.UserDTO;

/**
 * Created by vedmant on 1/28/17.
 */
public class LoginService {

    private UserDao userDao = DaoFactory.getInstance().getUserDao();

    public boolean registration(String name, String login, String password) {

        return userDao.saveUser(name, login, password);
    }

    public boolean login(String login, String password) {
        UserDTO user = userDao.getUserByLogin(login);

        return user != null && user.getPassword().equals(password);
    }
}
