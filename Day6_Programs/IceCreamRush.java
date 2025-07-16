package Day6_Programs;
import java.util.Scanner;

class Flavors {
    String name;  
    int sales;

    Flavors(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }
}
class IceCream {
    Flavors[] flavors;

    IceCream(Flavors[] flavors) {
        this.flavors = flavors;
    }

    void sortFlavors() {
        int n = flavors.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (flavors[j].sales < flavors[j + 1].sales) {
                    Flavors temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    void displayFlavors() {
        System.out.println("\nFlavors sorted by most sold:");
        for (Flavors f : flavors) {
            System.out.println(f.name + " - " + f.sales + " Sales");
        }
    }
}

public class IceCreamRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] flavorNames = {"Vanilla", "Chocolate", "Strawberry", "Mango","Butterscotch", "Pista", "Blackcurrent", "Coffee"};
        Flavors[] flavorList = new Flavors[flavorNames.length];
        System.out.println("Enter number of sales for each flavor:");
        for (int i = 0; i < flavorNames.length; i++) {
            System.out.print(flavorNames[i] + ": ");
            int sale = sc.nextInt();
            flavorList[i] = new Flavors(flavorNames[i], sale);
        }

        IceCream shop = new IceCream(flavorList);
        shop.sortFlavors();
        shop.displayFlavors();
        sc.close();
    }
}


    	   
	   
	   
