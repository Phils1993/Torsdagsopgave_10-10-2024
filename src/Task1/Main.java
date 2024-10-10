package Task1;

import java.util.ArrayList;
    public class Main {

        public static void main(String[] args) {
            // 1.e
            ArrayList<Customer> customers = new ArrayList<>();
            Customer c1 = new Customer("Tanni", "Iversen", "Tanni93");
            Customer c2 = new Customer("Philip", "Philip", "Philip93");
            customers.add(c1);
            customers.add(c2);

            printCustomers(customers);

        }

        public static void printCustomers(ArrayList<Customer> customers) {
            for (Customer c : customers) {
                System.out.println(c.toString());

            }
        }
    }

