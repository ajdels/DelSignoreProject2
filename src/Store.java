import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public main(args:string{});
    var filename = "customers.txt";
    var CustomerNames = Paths.get(filename);
    var customerNames = new ArrayList<String>();
    var customerLines = Files.readAllLines(CustomerNames);
    for (var line : customerLines){
        var splitLine = line.split(",");
        customerNames.add(splitLine[0]);

    }
    public void runStore() {
        var inputReader = new Scanner(System.in);
        while(true) {
            printMenu();
            var userChoice = inputReader.next();
            switch (userChoice) {
                case 1:
                    System.exit(0);
                case 2:
                    addCustomer(inputReader);
                    break;
                case 3:
                    System.out.print("Which Customer are you looking for?: ");
                    var CustID = inputReader.nextInt();
                    var customer = getCustomer(CustID);
                    if (customer.isPresent()) {
                        doCustomerMenu(inputReader, customer.get());

                    } else
                        System.out.print("No Customer Exists here");
                    break;
            }
            public selectCustomer(); Customer;
            System.out.println("Select a Customer: ");
            var CustID = inputReader.nextInt();
            if (customer.isPresent()) {
                doCustomerMenu(inputReader, customer.get());

            } else
                System.out.print("No Customer Exists here");
            break; }
        public void manageCustomer(selectedCustomer: Customer);
        var inputReader = new Scanner(System.in);
        while(true) {
            printMenu();
            var userChoice = inputReader.next();
            switch (userChoice) {
                case 1:
                    addAdress(inputReader);
                    break;
                case 2:
                    makeOrder = new ArrayList<String>();
                    makeOrder(inputReader);
                    break; {
        }

    }

    private ArrayList<Order>;



