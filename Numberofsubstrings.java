package Kata;

public class Numberofsubstrings {//класс 2 количество подстрок
    public int metodTwo (String input) {
        String[] elements = input.split(" [-+*/] "); //переменной elements присваевае результат работы метода сплит с массивом строки

        if (elements.length != 2 ) { //если колиесвто элементов массива не ровно двум то выбросить исключение
            throw new IllegalArgumentException("\"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b"); // исключение класса
        }
           return elements.length; //вовзращаем значение в переменную l результат метода считывания количество элементов массива разделённыъ пробелом
    }
}