import java.util.Arrays;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        //dichiaro tutto ciò che mi serve tra stringhe, numeri e array al fine di eseguire le operazioni
        int numb1 = 3;
        int numb2 = 8;
        String word = "It's";
        String[] arrayOfWords = {"I", "believe", "world", "beautiful", "place"};
        int positionNewWord = 3;

        //eseguo tutte le operaioni (moltiplico, concateno e aggoungo elementi ad array
        int result = numb1 * numb2;
        String result2 = word + ' ' + numb1;
        String[] newArrayOfWords = new String[arrayOfWords.length + 1];
        IntStream.range(0, positionNewWord).forEach(i -> newArrayOfWords[i] = arrayOfWords[i]);
        newArrayOfWords[positionNewWord] = word;
        IntStream.range(positionNewWord + 1, newArrayOfWords.length).forEach(i -> newArrayOfWords[i] = arrayOfWords[i - 1]);

        //stampo il risultato in console per verificare che sia andato tutto bene
        System.out.println("The result of the operation is: " + result);
        System.out.println("The result2 " + result2);
        System.out.println("The new Array is: " + Arrays.toString(newArrayOfWords));
    }
    // ho cercato metodi su intrnet, come primo giorno la struttura delle varie operazioni mi risultava poco chiara.
    // ho inoltre espolrato tra i suggerimenti dell'editor.
    // ho raggruppato tutto in un'unica funzione poichè avevo provato a dividere gli erecizi e riscontravo più errori.
}