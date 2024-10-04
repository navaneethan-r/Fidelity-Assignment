import java.util.*;
public class DjangoMultiplex {

    int pizzaPrice = 200;
    int puffprize = 40;
    int coolDrinkPrize = 120;

    public void totalBill(int pizzas, int puffs, int coolDrinks)
    {
        System.out.println("------- Django Multiplex -------");
        System.out.println("Pizza       : " + pizzas + " x " + pizzaPrice  + " = " + pizzaPrice*pizzas);
        System.out.println("Puff        : " + puffs + " x " + puffprize + "  = " + puffprize*puffs);
        System.out.println("Cool Drinks : " + coolDrinks + " x " + coolDrinkPrize + " = " + coolDrinkPrize*coolDrinks);
        System.out.println("--------------------------------");
        System.out.println("Total                 = " + ((pizzaPrice*pizzas)+(puffprize*puffs)+(coolDrinkPrize*coolDrinks)));
        System.out.println("--------------------------------");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of pizza : ");
        int pizzas = sc.nextInt();
        System.out.print("Enter the count of puff : ");
        int puffs = sc.nextInt();
        System.out.print("Enter the count of cool drink : ");
        int coolDrinks = sc.nextInt();
        DjangoMultiplex obj = new DjangoMultiplex();
        obj.totalBill(pizzas,puffs,coolDrinks);
        sc.close();
    }
}
