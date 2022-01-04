package calculator;


import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<String> numbersGlobal = new ArrayList<>();

    int result = 0;

    public void input(String input){

        input = input.replace("\\n","\n");

        // check for custom delimiter dvs "//"
        String delimiter = " ";
        String splitter[];
        if(input.contains("//")){
            splitter = input.split("\n");
            delimiter = splitter[0].replaceAll("//", "");

            String clearDelimiter = "//"+delimiter+"\n";
            input = input.replaceFirst(clearDelimiter, "");

        }

        String allDelimiters = ",|\n|" + delimiter;



        String[] numbers = input.split(",|&|\n",0);
        for (String number: numbers) {
            numbersGlobal.add(number);
        }
    }



    public int print(){
        for (String number : numbersGlobal) {
            result += Integer.parseInt(number);
        }
        return result;
    }

}
