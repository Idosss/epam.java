package kz.epam.gabdollin.practice.blinov;



public class OptionA1BlinovStrings {
    public static void main(String[] args) {
        String offer = "Lorem ipsum dolor sit amet.";
        int k = 4;
        char symbol = '_';
        System.out.println(replaceSymbol(offer, k, symbol));
    }

    public static String replaceSymbol(String offer, int index, char symbol) {
        StringBuilder sb = new StringBuilder();
        if (offer != null && offer.length() > 0 && index > 0) {
            for (String word : offer.split(" ")) {
                if (word.length() >= index) {
                    sb.append(word.substring(0, index - 1)).append(symbol).append(word.substring(index, word.length()));
                } else {
                    sb.append(word);
                }
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}






