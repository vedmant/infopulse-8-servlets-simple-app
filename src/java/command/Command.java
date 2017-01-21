package command;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by vedmant on 1/21/17.
 */
public interface Command {

    public void execute (HttpServletRequest req);
}
