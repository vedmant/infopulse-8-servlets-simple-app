package dao;

import dao.util.EntityManagerUtil;
import domain.User;
import dto.UserDTO;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vedmant on 1/28/17.
 */
public class UserDaoImpl implements UserDao {

    public boolean saveUser(String name, String login, String password) {
        EntityManager em = null;

        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();

            User user = new User();
            user.setName(name);
            user.setLogin(login);
            user.setPassword(password);

            em.persist(user);
            em.getTransaction().commit();

            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public UserDTO getUserByLogin(String login) {
        User user = null;
        EntityManager em = null;

        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();

            user = em.createQuery("FROM domain.User WHERE login = :login", User.class)
                    .setParameter("login", login)
                    .getSingleResult();

            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }

        if (user == null) {
            return null;
        } else {
            return new UserDTO(user.getId(), user.getName(), user.getLogin(), user.getPassword());
        }
    }

    public List<UserDTO> getAllUsers() {
        EntityManager em = null;
        List<UserDTO> userList = new ArrayList<UserDTO>();

        try {
            em = EntityManagerUtil.getEntityManager();
            em.getTransaction().begin();

            List<User> users = em.createQuery("FROM domain.User", User.class)
                    .getResultList();

            users.forEach(user -> {
                userList.add(new UserDTO(user.getId(), user.getName(), user.getLogin(), user.getPassword()));
            });

            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }

       return userList;
    }
}
