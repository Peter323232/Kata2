package Kata;

public class Calc {
    String result;

    public String resultCalc(String bS, String k, String aS, String oper) {
        result = "";
        if (k.equals("строка") && oper.equals(" + ")) { //&& aS.length() < 11 && bS.length() < 11
            aS = aS.replace(" ", "");  //убрать кавычки и пробелы
            aS = aS.replace("\"", "");
            bS = bS.replace(" ", "");
            bS = bS.replace("\"", "");
            result = aS + bS;
            result = "\"" + result + "\"";
        } else if (k.equals("строка") && oper.equals(" - ")) {
            aS = aS.trim();
            bS = bS.trim();
            aS = aS.replace("\"", "");
            bS = bS.replace("\"", "");
            result = aS.replace(bS, "");
            result = "\"" + result + "\"";
        } else if (k.equals("строка") && oper.equals(" * ")) {
            throw new RuntimeException("Калькулятор умеет выполнять операции сложения строк, вычитания строки из строки, умножения строки на число и деления строки на число: \"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b.");
        } else if (k.equals("строка") && oper.equals(" / ")) {
            throw new RuntimeException("Калькулятор умеет выполнять операции сложения строк, вычитания строки из строки, умножения строки на число и деления строки на число: \"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b.");


        } else if (k.equals("число") && oper.equals(" + ")) {
            throw new RuntimeException("Калькулятор умеет выполнять операции сложения строк, вычитания строки из строки, умножения строки на число и деления строки на число: \"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b.");
        } else if (k.equals("число") && oper.equals(" - ")) {
            throw new RuntimeException("Калькулятор умеет выполнять операции сложения строк, вычитания строки из строки, умножения строки на число и деления строки на число: \"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b.");


        } else if (k.equals("число") && oper.equals(" * ")) {
            int b = Integer.parseInt(bS);

            if (b >= 0 && b <= 10) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < b; i++) {
                    sb.append(aS);
                }
                result = sb.toString();
                result = result.replace(" ", "");
                result = result.replace("\"", "");
                result = "\"" + result + "\"";
            } else {
                throw new RuntimeException("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            }
        } else if (k.equals("число") && oper.equals(" / ")) {
            int b = Integer.parseInt(bS);
            aS = aS.replace(" ", "");
            aS = aS.replace("\"", "");
            int aSlen = aS.length();


            if (b > 0 && b <= 10) {
                int del = aSlen / b;
                result = aS.substring(0,del);
                result = "\"" + result + "\"";
            } else {
                throw new RuntimeException("Калькулятор должен принимать на вход числа от 1 до длины строки aS включительно.");
            }
        } else {
            throw new RuntimeException("Калькулятор завершает работу");
        }
        return result;
    }
    public String resultProvarka(String result) {
        if (result.length() > 40) {
            String result1 = result.substring(0, 40).concat("...\"");
            return result1;
        }

        return result;
    }
}
