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
        commands.put("/auth/login_form", new LoginForm());
        commands.put("/auth/login", new Login());
        commands.put("/auth/registration_form", new RegistrationForm());
        commands.put("/auth/registration", new Registration());
    }

    public static CommandFactory getInstance() {
        return instance;
    }

    public Command getCommand(HttpServletRequest req) {
        String uri = req.getRequestURI();

        System.out.println(uri);

        Command command = commands.get(uri);

        if (command != null) {
            return command;
        }

        return new NotFound();
    }

}
