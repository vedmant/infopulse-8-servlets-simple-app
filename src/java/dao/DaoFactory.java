package dao;

/**
 * Created by vedmant on 1/28/17.
 */
public class DaoFactory {

    private static DaoFactory instance = new DaoFactory();

    private UserDao userDao = new UserDaoImpl();

    public static DaoFactory getInstance() {
        return instance;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
