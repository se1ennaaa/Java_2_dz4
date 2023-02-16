import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> AdamsA = new ArrayList<>();
        ArrayList<String> AdamsB = new ArrayList<>();
        ArrayList<String> AdamsC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 names");
        for (int i = 0; i < 5; i++) {
            AdamsA.add(scanner.next());



        }
        System.out.println("LIST A  " + AdamsA );
        System.out.println("enter 5 new name"  );
        for (int i = 0; i < 5; i++) {
            AdamsB.add(scanner.next());

        }
        System.out.println("List B " + AdamsB);
        for (int i = 0; i < 5; i++) {
            AdamsC.add(AdamsA.get(i));
            AdamsC.add(AdamsB.get(i));

        }

        System.out.println("List C "+ AdamsC);
        Collections.sort(AdamsC, Comparator.comparing(String::length));
        System.out.println("Sorting List C " + AdamsC);


    }
    // Sofa Jey Kill Piter Lika
    // Trier Troll Mayk Riki Bersek
}