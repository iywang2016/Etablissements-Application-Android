package com.abdelhakim.etablissements.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.checkerframework.checker.confidential.qual.*;

@Entity(tableName = "users")
public class User {
    @PrimaryKey
    @NonNull
    public @NonConfidential String login;

    @ColumnInfo(name = "user_pass")
    public @Confidential String pass;

    @NonNull
    public @NonConfidential String getLogin() {
        return login;
    }

    public @Confidential String getPass() {
        return pass;
    }

    public void setLogin(@NonNull @NonConfidential String login) {
        this.login = login;
    }

    public void setPass(@Confidential String pass) {
        this.pass = pass;
    }
}

