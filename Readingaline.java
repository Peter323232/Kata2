package Kata;

import java.util.Scanner;

class Readingaline {                                                            //класс один (считывавние строки)
    public String metodOne() {                                                  //метод один считать строку
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите");
        return scanner.nextLine();
    }
}
