package Kata;

public class Operandum { //класса 3 операндум (определим операндума) пока что
    String oper;
    String oper1 = " - ";
    String oper2 = " + ";
    String oper3 = " * ";
    String oper4 = " / ";
    public String metodOper (String input) {
        if (input.contains(oper1)) {
            oper = oper1;
        } else if (input.contains(oper2)) {
            oper = oper2;
     } else if (input.contains(oper3)) {
            oper = oper3;
        } else if (input.contains(oper4)) {
            oper = oper4;
        } else {
            throw new RuntimeException("Оператор не найден");
        }
        return oper;
    }
}