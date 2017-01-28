package service;

/**
 * Created by vedmant on 1/28/17.
 */
public class ServiceFactory {

    private static ServiceFactory instance = new ServiceFactory();

    private LoginService loginService = new LoginService();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public LoginService getLoginService() {
        return loginService;
    }
}
