package algoexpert;

public class KnuthMorrisPrattAlgorithm {

    public static boolean knuthMorrisPrattAlgorithm(String string, String substring) {
        int i = 0 , j = 0;

        while( i < string.length() && j < substring.length()){
            if(string.charAt(i) == substring.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j == substring.length();
    }
}
