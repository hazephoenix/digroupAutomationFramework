package pagemodel;

import java.util.Map;

public class User {

    private String login;
    private String password;
    private String dataRozhdeniya;
    private int  age;
    private String diagnos;
    private Map<String, String > li4nieDannie;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public User(String login, String password, String dataRozhdeniya, int age, String diagnos) {
        this.login = login;
        this.password = password;
        this.dataRozhdeniya = dataRozhdeniya;
        this.age = age;
        this.diagnos = diagnos;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
