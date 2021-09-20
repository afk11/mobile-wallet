package org.mifos.mobilewallet.core.domain.model.user;

public class LoginUser {
    private String username;
    private String password;

    public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
