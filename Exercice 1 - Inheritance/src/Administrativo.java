import java.util.Objects;

public class Administrativo extends Empleado{
    public static final double salaryHour = 15;
    private int hoursWorked;

    public Administrativo(int id, String nombre, String email, int hoursWorked) {
        super(id, nombre, email);
        this.hoursWorked = hoursWorked;
    }

    public double calcularSalario() {
        return salaryHour * getHoursWorked();
    }

    public String describir(){
        return "Empleado numero "+ super.id +" se llama "+super.name+" y pertence al departamento de Administrativos.";
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

}
