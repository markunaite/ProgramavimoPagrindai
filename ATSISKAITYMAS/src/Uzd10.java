import java.util.Scanner;

public class Uzd10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite data");
        String data = reader.nextLine();

        switch (data) {
            case "2012 1":
            case "2013 1":
            case "2014 1":
                System.out.println("Gauta: 31");
                break;
            case "2012 2":
                System.out.println("Gauta: 29");
                break;
            case "2013 2":
            case "2014 2":
                System.out.println("Gauta: 28");
                break;
            case "2012 3":
            case "2013 3":
            case "2014 3":
                System.out.println("Gauta: 31");
                break;
            case "2012 4":
            case "2013 4":
            case "2014 4":
                System.out.println("Gauta: 30");
                break;
            case "2012 5":
            case "2013 5":
            case "2014 5":
                System.out.println("Gauta: 31");
                break;
            case "2012 6":
            case "2013 6":∑
            case "2014 6":
                System.out.println("Gauta: 30");
                break;
            case "2012 7":
            case "2013 7":
            case "2014 7":
                System.out.println("Gauta: 31");
                break;
            case "2012 8":
            case "2013 8":
            case "2014 8":
                System.out.println("Gauta: 31");
                break;
            case "2012 9":
            case "2013 9":
            case "2014 9":
                System.out.println("Gauta: 30");
                break;
            case "2012 10":
            case "2013 10":
            case "2014 10":
                System.out.println("Gauta: 31");
                break;
            case "2012 11":
            case "2013 11":
            case "2014 11":
                System.out.println("Gauta: 30");
                break;
            case "2012 12":
            case "2013 12":
            case "2014 12":
                System.out.println("Gauta: 31");
                break;
            default:
                System.out.println("iveskite data tarp 2012 ir 2014 metu");
                break;
        }

        reader.close();
    }
}
