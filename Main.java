package Kata;

public class Main {
    public static void main(String[] args) {
        Readingaline readingaline = new Readingaline(); //Объект класс 1 (считывавние строки)
        String input = readingaline.metodOne(); //переменной input присваеваем значение результата метода один

        Numberofsubstrings numberofsubstrings = new Numberofsubstrings(); //Объект класс 2 (количество подстрок)
        int l = numberofsubstrings.metodTwo(input); // переменной l присваеваем значение операции метода с переменной input

        Operandum operandum = new Operandum(); //Объект класса 3 операндум (определим операндума) пока что
        String oper = operandum.metodOper(input); // переменной oper присваеваем значение операции метода Oper


        char op = oper.charAt(1); // переменной op присваем значение символа с индексом 1 переменной oper
        int index = input.indexOf(oper) + 1;
        int index2 = index + 2;
        int index1 = index - 2;
        int x = input.length();

        Operands operands = new Operands();
        String A = input.substring(0, index);
        String B = input.substring(index2, x);
        int uwu = B.length() - 1;
        String aS = operands.metodOperA(A, input, op, index1);
        String[] operand2 = operands.metodOperB(B, input, op, index2, x, uwu);
        String bS = operand2[0];
        String k = operand2[1];


        operands.metodStr(aS, bS);

        Calc calc = new Calc();
        String result = calc.resultCalc(bS, k, aS, oper);

        String result1 = calc.resultProvarka(result);

        System.out.println(result1);
    }
}