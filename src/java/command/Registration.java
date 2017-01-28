package command;

import service.LoginService;
import service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by vedmant on 1/28/17.
 */
public class Registration implements Command {

    public String execute(HttpServletRequest req) {
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        HttpSession session = req.getSession(true);

        if (name.equals("") || login.equals("") || password.equals("")) {
           session.setAttribute("error", "Validation failed");

           return "/WEB-INF/jsp/registration.jsp";
        }

        LoginService loginService = ServiceFactory.getInstance().getLoginService();
        Boolean success = loginService.registration(name, login, password);

        if ( ! success) {
            session.setAttribute("error", "Registration failed");

            return "/WEB-INF/jsp/registration.jsp";
        }

        return "/WEB-INF/jsp/login.jsp";
    }
}
