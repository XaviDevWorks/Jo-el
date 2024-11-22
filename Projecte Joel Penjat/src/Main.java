import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int casos = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < casos; i++) {
            //Joc del penjat
            String paraulaMagica = scan.nextLine();
            ArrayList<Character> paraula = new ArrayList<>();
            for (char c : paraulaMagica.toCharArray()) {
                paraula.add(c);
            }
            String endevinances = scan.nextLine();
            ArrayList<Character> endevina = new ArrayList<>();
            for (char c : endevinances.toCharArray()) {
                if (c != ' ') {
                    endevina.add(c);
                }
            }
            int errors = 0;
            for (int j = 0; j < endevina.size(); j++) {
                if (!paraula.contains(endevina.get(j))) {
                    errors++;
                }
            }
            for (int j = 0; j < paraula.size(); j++) {
                if (endevina.contains(paraula.get(j))) {
                    paraula.set(j, endevina.get(endevina.indexOf(paraula.get(j))));
                } else {
                    paraula.set(j, '*');
                }
            }
            for (char c : paraula) {
                System.out.print(c);
            }
            System.out.println(" " + errors);
        }
        scan.close();
    }
}