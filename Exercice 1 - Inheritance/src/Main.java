import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Numero de empleados a añadir: ");
        int n = read.nextInt();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Empleado numero " + i);
            System.out.println("Pon el numero del departamento: 1-Gerente. 2-Ingeniero. 3-Administrativo");
            int num = read.nextInt();
            if (num == 1) {
                System.out.println("Nombre:");
                String name = read.next();
                System.out.println("Email:");
                String email = read.next();
                System.out.println("Sueldo base:" + Gerente.baseSalary);
                System.out.println("Bonificacion:");
                double bonif = read.nextDouble();
                Gerente ger = new Gerente(i, name, email, bonif);
                empleados.add(ger);
            }
            else if (num == 2) {
                System.out.println("Nombre:");
                String name = read.next();
                System.out.println("Email:");
                String email = read.next();
                System.out.println("Sueldo por hora:" + Ingeniero.salaryHour);
                System.out.println("Horas trabajadas:");
                int hoursWorked = read.nextInt();
                Ingeniero ing = new Ingeniero(i, name, email, hoursWorked);
                empleados.add(ing);
            }
            else if (num == 3) {
                System.out.println("Nombre:");
                String name = read.next();
                System.out.println("Email:");
                String email = read.next();
                System.out.println("Sueldo por hora: " + Administrativo.salaryHour);
                System.out.println("Horas trabajadas:");
                int hoursWorked = read.nextInt();
                Administrativo admin = new Administrativo(i, name, email, hoursWorked);
                empleados.add(admin);
            }
            else {
                System.out.println("Numero incorrecto");
                i--;
            }
        }
        for (int i = 0; i < empleados.size(); i++) {
            Empleado emp = empleados.get(i);
            System.out.println(emp.describir() + " Salario: " + emp.calcularSalario() + "€");
        }
        read.close();
    }
}