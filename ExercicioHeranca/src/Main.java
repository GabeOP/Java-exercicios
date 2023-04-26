import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> lista = new ArrayList<>();
        Employee employee;
        OutsourcedEmployee outsourcedEmployee;

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.printf("Employee #%d data %n", i+1);
            System.out.print("Outsourced? (y/n): ");
            char outsourced = sc.next().charAt(0);
            if(outsourced == 'n'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();

                employee = new Employee(name, hours, valuePerHour);
                lista.add((employee));

                System.out.println();
            }else if(outsourced == 'y'){
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                lista.add((outsourcedEmployee));

                System.out.println();
            }
        }

        System.out.println("PAYMENTS: ");
        for(Employee obj : lista){
            System.out.println(obj);
        }


        sc.close();
    }
}