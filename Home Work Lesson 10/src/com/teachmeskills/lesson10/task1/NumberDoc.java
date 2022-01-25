package com.teachmeskills.lesson10.task1;

import com.teachmeskills.lesson10.task1.exception.IsExistsABCException;
import com.teachmeskills.lesson10.task1.exception.IsExists555Exception;
import com.teachmeskills.lesson10.task1.exception.IsExists1a2bException;

public class NumberDoc {

    public static boolean isContainABC;

    //Вывести на экран в одну строку два первых блока по 4 цифры
    static String getNum(String sr) {
        sr = sr.substring(0, 4) + " " + sr.substring(9, 13);
        return sr;
    }

    //Вывести на экран номер документа, но блоки из трех букв заменить на (каждая буква заменятся на )
    static String changeLetter(String sr) {

        sr = sr.replace("E", "e").
                replace("A", "a").
                replace("E", "e").
                replace("E", "e").
                replace("C", "c").
                replace("E", "e").
                replace("B", "b").
                replace("B", "b");
        return sr;
    }

    //Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
    static String lettersDoc(String sr) {
        sr = ((sr.substring(5, 8) + "/" + sr.substring(14, 17) + "/" + sr.substring(19, 20) + "/" + sr.substring(21)).toUpperCase());
        return sr;
    }

    //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder)
    static String lettersDocCD(StringBuilder sr) {
        return (sr.substring(5, 8) + "/" + sr.substring(14, 17) + "/" + sr.substring(19, 20) + "/" + sr.substring(21)).toUpperCase();
    }

    //Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
    //(причем, abc и ABC считается одинаковой последовательностью).
    static String isContainABC(String sr) throws IsExistsABCException {
        sr = sr.toUpperCase();
        if (sr.contains("ABC")) {
            return "Yes, it contains ABC";
        } else {
            return "No, it doesn't contain ABC";
        }
    }

    //Проверить начинается ли номер документа с последовательности 555.
    static String isТumber(String sr) throws IsExists555Exception {
        sr = sr.toUpperCase();
        if (sr.contains("555")) {
            return "Yes, it contains 555";
        } else {
            return "No, it doesn't contain 555";
        }
    }

    //Проверить заканчивается ли номер документа на последовательность 1a2b.
    static String isSigns(String sr) throws IsExists1a2bException {
        sr = sr.toUpperCase();
        if (sr.contains("1a2b")) {
            return "Yes, it contains 1a2b";
        } else {
            return "No, it doesn't contain 1a2b";
        }
    }
}