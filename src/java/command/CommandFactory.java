package command;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by vedmant on 1/21/17.
 */
public class CommandFactory {

    private static CommandFactory instance = new CommandFactory();

    private Map<String, Command> commands = new HashMap<String, Command>();

    private CommandFactory() {
        commands.put("login", new LoginForm());
        commands.put("login_send", new Login());
        commands.put("register", new RegistrationForm());
        commands.put("register_send", new Registration());
    }

    public static CommandFactory getInstance() {
        return instance;
    }

    public Command getCommand(HttpServletRequest req) {
        String uri = req.getRequestURI();

        return commands.get(uri);
    }

}
