package command;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by vedmant on 1/28/17.
 */
public class NotFound implements Command {

    public String execute(HttpServletRequest req) {
        return "/WEB-INF/jsp/not_found.jsp";
    }
}
