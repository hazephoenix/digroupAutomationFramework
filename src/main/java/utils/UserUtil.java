package utils;

import pagemodel.User;

public class UserUtil {

    public static User createAdminUser() {
        return new User(PropUtil.getProperty("adminLogin", "admin"), PropUtil.getProperty("adminPasswopd","123456"));
    }

    public static User createUser(String name, String password) {
        return new User(name, password);
    }

}
