package Kata;

public class Operands {
    public String metodOperA (String A,String input,char op,int index1) {
        String aS;
        if (A.charAt(0)=='"' &&  A.charAt(index1) == '"') {
            aS = A;
        } else {
            throw new RuntimeException("Первый оператро должен быть строкой");
        }
        return aS;
    }
    public String [] metodOperB (String B,String input,char op,int index2,int x,int uwu) {
        String[] operand2 = new String[2];
        if (B.charAt(0)=='"' &&  B.charAt(uwu) == '"') {
            operand2[0] = B;
            operand2[1] = "строка";
        } else if (B.charAt(0) !='"' &&  B.charAt(uwu) != '"') {
            operand2[0] = B;
            operand2[1] = "число";
        } else {
            throw new RuntimeException("ни строка не число");
        }
        return operand2;
    }
    public void metodStr(String aS, String bS) {
        String aSS = aS.trim().replaceAll("^\"|\"$", ""); // Убрать пробелы и кавычки в начале и конце строки aS
        String bSS = bS.trim().replaceAll("^\"|\"$", ""); // Убрать пробелы и кавычки в начале и конце строки bS
        if (!(aSS.length() < 11 && bSS.length() < 11)) {
            throw new RuntimeException("Строка не более 10 символов число не более 10");
        }
    }
}
