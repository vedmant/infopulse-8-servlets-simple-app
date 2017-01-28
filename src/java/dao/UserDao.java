package dao;

import dto.UserDTO;

import java.util.List;

/**
 * Created by vedmant on 1/28/17.
 */
public interface UserDao {

    boolean saveUser(String name, String login, String password);

    UserDTO getUserByLogin(String login);

    List<UserDTO> getAllUsers();
}
