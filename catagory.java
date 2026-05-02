import java.util.Scanner;

public class catagory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] category = new String[100];
        double[] amount = new double[100];

        int i = 0;
        double total = 0;
        double foodTotal = 0;

        while (true) {
            double amt = sc.nextDouble();
            if (amt == 0)
                break;
            sc.nextLine();
            String cat = sc.nextLine();

            amount[i] = amt;
            category[i] = cat;

            total += amt;

            if (cat.equalsIgnoreCase("Food"))
                foodTotal += amt;

            i++;
        }

        System.out.println("Total Expense: " + total);
        System.out.println("Food Expense: " + foodTotal);

        for (int j = 0; j < i; j++) {
            System.out.println(category[j] + " " + amount[j]);
        }
    }
}