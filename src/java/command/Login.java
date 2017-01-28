package command;

import dto.UserDTO;
import service.LoginService;
import service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by vedmant on 1/28/17.
 */
public class Login implements Command {

    public String execute(HttpServletRequest req) {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        HttpSession session = req.getSession(true);

        if (login == null || password == null) {
            session.setAttribute("error", "Validation failed");

            return "/WEB-INF/jsp/login.jsp";
        }

        LoginService loginService = ServiceFactory.getInstance().getLoginService();
        Boolean success = loginService.login(login, password);

        if ( ! success) {
            session.setAttribute("error", "Login failed");

            return "/WEB-INF/jsp/login.jsp";
        }

        session.setAttribute("login", login);
        List<UserDTO> users = ServiceFactory.getInstance().getLoginService().getAllUsers();
        session.setAttribute("users", users);

        return "/WEB-INF/jsp/profile.jsp";
    }
}
