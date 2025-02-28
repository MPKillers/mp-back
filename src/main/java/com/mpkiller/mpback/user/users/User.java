package com.mpkiller.mpback.user.users;

import java.util.UUID;

public abstract class User {
    protected String nickname;
    protected UUID uuid;
    protected String email;
    protected String passwordHash;
    public abstract User newUser(String nickname, String email, String passwordHash);

}
