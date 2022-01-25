package com.teachmeskills.lesson10.task1;

import com.teachmeskills.lesson10.task1.exception.IsExistsABCException;
import com.teachmeskills.lesson10.task1.exception.IsExists555Exception;
import com.teachmeskills.lesson10.task1.exception.IsExists1a2bException;

/**
 * 1. Добработать нулевое домашнее задание предыдущего урока.
 * Теперь надо создать свои классы исключений на каждую ситуацию:
 * - Проверить содержит ли номер документа последовательность abc.
 * - Проверить начинается ли номер документа с последовательности 555.
 * - Проверить заканчивается ли номер документа на последовательность 1a2b.
 * Если номер документа не удовлетворяет условию - то "бросить" исключение.
 * В методе класса, в котором будут вызываться эти методы для демонстрации работы,
 * перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя(сообщение на консоль).
 */

public class Main {
    public static void main(String[] args) {

        String numberDoc = "4567-EAE-8900-ECE-9B9B";
        StringBuilder sbDoc = new StringBuilder("4567-EAE-8900-ECE-9B9B");

        System.out.println(NumberDoc.getNum(numberDoc));
        System.out.println(NumberDoc.changeLetter(numberDoc));
        System.out.println(NumberDoc.lettersDoc(numberDoc));
        System.out.println("Letters:" + NumberDoc.lettersDocCD(sbDoc));

        try {
            System.out.println(NumberDoc.isContainABC(numberDoc));
        } catch (IsExistsABCException e ) {
            System.out.println("Excpection:" + e.getClass().getSimpleName() + " " + e.getMessage());
        }
        try {
            System.out.println(NumberDoc.isТumber(numberDoc));
        } catch (IsExists555Exception e ) {
            System.out.println("Excpection:" + e.getClass().getSimpleName() + " " + e.getMessage());
        }
        try {
            System.out.println(NumberDoc.isSigns(numberDoc));
        } catch (IsExists1a2bException e) {
            System.out.println("Excpection:" + e.getClass().getSimpleName() + " " + e.getMessage());
        }
    }
}