package com.teachmeskills.lesson10.task2.authorization;

import com.teachmeskills.lesson10.task2.exception.NotCorrectLoginException;
import com.teachmeskills.lesson10.task2.exception.NotCorrectPasswordException;
import com.teachmeskills.lesson10.task2.exception.WrongInputException;

public class Authorization {
    public static boolean checkLoginPassword(String login, String password, String confirmPassword) throws NotCorrectLoginException, NotCorrectPasswordException, WrongInputException {

        if (login.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            throw new WrongInputException("Fill in all fields");
        }
        if ((login.length() > 20) || (login.contains(" "))) {
            throw new NotCorrectLoginException("Login must be less than 20 characters and must not contain spaces");
        }
        if (password.length() < 20) {
            if (!password.matches("(.)*(\\d)(.)*")) {
                throw new NotCorrectPasswordException("Password must be numbers");
            }
        } else {
            throw new NotCorrectPasswordException("Password must be less than 20 characters and must not contain spaces");
        }
        if (confirmPassword.equals(password)) {
            throw new NotCorrectPasswordException("Passwords must be the same");
        }
        return true;
    }
}