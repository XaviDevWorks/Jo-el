import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bombo1;
        int bombo2;

        String[] Bomboequip1 = {"Manchester United (ING)", "Nantes (FRA)", "Midjylland (DIN)", "Rennes (FRA)", "Union Berlin (GER)", "Monaco (FRA)", "PSV Eindhoven (NED)", "Roma (ITA)"};
        String[] Bomboequip2 = {"Barcelona (ESP)", "Juventus (ITA)", "Sporting (POR)", "Shakhtar Donetsk (UKR)", "Ajax (NED)", "Bayer Leverkusen (GER)", "Sevilla (ESP)", "Salzburgo (AUS)"};

        boolean[]equip1 = new boolean[8];
        boolean[] equip2 = new boolean[8];

        System.out.println("Lista de equipos:");
        for (int i = 0; i < 8; i++) {

            do {
                bombo1=(int) (Math.random()*8);
            }
            while (equip1[bombo1]);
            equip1[bombo1] = true;

            do {
                bombo2=(int) (Math.random()*8);
            }
            while (equip2[bombo2]);
            equip2[bombo2] = true;

            System.out.println(Bomboequip1[bombo1] + " - " + Bomboequip2[bombo2]);
        }
    }
}
