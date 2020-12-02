import java.util.Scanner;

public class Uzd03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Žaidime dalyvaujančių žmonių skaičius: ");
        int n = reader.nextInt();
        System.out.print("Sugalvotas keturženklis skaičius: ");
        int s = reader.nextInt();
        int temp = s;


        while (true) {
            System.out.print("Kokį skaitmenį norima keisti: (1 - 4): ");
            int sk = reader.nextInt();
            System.out.print("Kokiu skaitmeniu norima pakeisti (0 -9 ): ");
            int changeTo = reader.nextInt();

            //pagal įvestą skaičių pasirenkame, kurioj vietoj pakiesti skaičių
            switch (sk) {
                case 1: //įvestą skaičių dauginame iš 1000 ir pridedame likusius tris skaičius
                    temp = changeTo * 1000 + (temp % 1000);
                    break;
                case 2: //pasiimame pirmą keturženklį ir prie jo pridedame pakeistą triženklį skaičių ir likusius kitus du
                    temp = (temp / 1000) * 1000 + changeTo * 100 + (temp % 100);
                    break;
                case 3: //pasiimame du pirmus skaičius ir ptie jo pridedame pakeistą dviženklį skaičių ir pridedame likusį vieną
                    temp = (temp / 100 * 100) + changeTo * 10 + (temp % 10) ;
                    break;
                case 4: //pasiimame tris pirmus skaičius ir prie jo pridedame pakeistą vienaženklį skaičių
                    temp = (temp / 10 * 10) + changeTo;
                    break;
                default:
                    break;
            }

            n--; //sumažiname žaidėjų skaičių
            // turime n žaidėjų, kadangi 1 žaidėjas savo sk pasakė, einam iki tol kol liks vienas žaidėjas, ir tada išeiname iš while ciklo
            if(n <= 1) {
                break;
            }
        }
        System.out.println("Rezultatas: " + Math.abs(s-temp));

        }
    }

