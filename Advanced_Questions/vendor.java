 package nitinproject;
import java.util.*;
public class vendor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter total hours: ");
        double hours = sc.nextDouble();

        System.out.print("Enter rate per hour: ");
        double rate = sc.nextDouble();

        System.out.print("Enter vendor resources cost per hour: ");
        double vendorRate = sc.nextDouble();

        double clientManpower = hours * rate;
        double vendorManpower = hours * vendorRate;

        System.out.print("Enter hardware cost: ");
        double hardware = sc.nextDouble();

        System.out.print("Is hardware borne by client? (1-Yes / 0-No): ");
        int hwChoice = sc.nextInt();

        double clientHardware = 0;
        if (hwChoice == 1) {
            clientHardware = 0.30 * hardware;
        }

        System.out.print("Enter software cost: ");
        double software = sc.nextDouble();

        System.out.print("Is software borne by client? (1-Yes / 0-No): ");
        int swChoice = sc.nextInt();

        double clientSoftware = 0;
        if (swChoice == 1) {
            System.out.print("Is software common? (1-Yes / 0-No): ");
            int common = sc.nextInt();

            if (common == 1)
                clientSoftware = 0.50 * software;
            else
                clientSoftware = 1.00 * software;
        }

        System.out.print("Enter consultant hours: ");
        double ch = sc.nextDouble();

        System.out.print("Enter consultant rate: ");
        double cr = sc.nextDouble();

        double consultantCost = ch * cr;

        double totalClientPay = clientManpower + clientHardware + clientSoftware;
        double totalVendorCost = vendorManpower + hardware + software + consultantCost;

        double result = totalClientPay - totalVendorCost;

        System.out.println("\nTotal paid by client = " + totalClientPay);
        System.out.println("Total vendor cost = " + totalVendorCost);

        if (result > 0)
            System.out.println("Vendor Profit = " + result);
        else if (result < 0)
            System.out.println("Vendor Loss = " + (-result));
        else
            System.out.println("No Profit No Loss");

        sc.close();
    }


}


