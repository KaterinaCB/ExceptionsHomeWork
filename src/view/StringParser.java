package view;

public class StringParser {
    public String[] getDataFromString(String inputString){
        String[] result = inputString.split(" ");
        return result;
    }
}