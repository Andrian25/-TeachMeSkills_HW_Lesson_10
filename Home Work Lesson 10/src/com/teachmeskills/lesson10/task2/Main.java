package com.teachmeskills.lesson10.task2;

import com.teachmeskills.lesson10.task2.exception.NotCorrectLoginException;
import com.teachmeskills.lesson10.task2.exception.NotCorrectPasswordException;
import com.teachmeskills.lesson10.task2.exception.WrongInputException;
import com.teachmeskills.lesson10.task2.authorization.Authorization;

import java.util.Scanner;

/**
 * 2. Создать класс, в котором будет статический метод.
 * (почитать и понять, чем статический метод отличается от нестатического - обсудить на занятии по необходимости)
 * Этот метод принимает на вход три параметра:
 * login
 * password
 * confirmPassword
 * Все поля имеют тип данных String.
 * Длина login должна быть меньше 20 символов и не должен содержать пробелы.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Метод возвращает true, если значения верны или false в другом случае.
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean authoriz = false;
        String login;
        String password;
        String confirmPassword;

        while (!authoriz) {
            System.out.println("Enter login:");
            login = scanner.nextLine();

            System.out.println("Enter password:");
            password = scanner.nextLine();

            System.out.println("Confirm confirmPassword:");
            confirmPassword = scanner.nextLine();

            try {
                if (Authorization.checkLoginPassword(login, password, confirmPassword)){
                    System.out.println("You have registered congratulations");
                    authoriz = true;
                }
            } catch (NotCorrectLoginException e1) {
                System.out.println("invalid login:" + e1.getMessage());
                System.out.println();
            } catch (NotCorrectPasswordException e2) {
                System.out.println("invalid password:" + e2.getMessage());
                System.out.println();
            } catch (WrongInputException e3) {
                System.out.println(e3.getMessage());
            }
        }
    }
}