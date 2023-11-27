import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        //apro lo scanner e permetto input dati in console
        Scanner userInput = new Scanner(System.in);

        //raccolgo i dati di cui necessito quidando l'utente durante l'input
        System.out.println("I'll ask u to type 3 different words, after each word press enter. Let's go! type the first");
        String word1 = userInput.nextLine();
        System.out.println("Type the second");
        String word2 = userInput.nextLine();
        System.out.println("Type the third");
        String word3 = userInput.nextLine();

        // Compongo una frase con gli input e poi ne creo un array
        String union = word1 + ' ' + word2 + ' ' + word3;
        String[] unionArray = {word1, word2, word3};

        //comunico in console i dati ricevuto e ne mostro una versione con lettura inversa
        System.out.println("You typed: " + union);
        System.out.println("Now I'll reverse the order: ");

        //il ciclo mi permette di partire con il print dall'ultimo elemento fino allo zero
        for (int i = unionArray.length - 1; i >= 0; i--) {
            System.out.println(unionArray[i]);
        }

        //chiudo lo scanner e impedisco input dati in console
        userInput.close();

        //ho cercato anche qui su google, perché conoscevo solo il reverse metrodo stringa
    }
}
