package dto;

/**
 * Created by vedmant on 1/28/17.
 */
public class UserDTO {

    private Long id;

    private String name;

    private String login;

    private String password;

    public UserDTO(Long id, String name, String login, String password) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
