import java.util.Objects;

public class Ingeniero extends Empleado{
    public static final double salaryHour = 20;
    private int hoursWorked;

    public Ingeniero(int id, String nombre, String email, int hoursWorked) {
        super(id, nombre, email);
        this.hoursWorked = hoursWorked;
    }

    public String describir() {
        return "Empleado numero "+ super.id +" se llama "+super.name+" y pertence al departamento de Ingenieros.";
    }

    public double calcularSalario() {
        return salaryHour * getHoursWorked();
    }

    public int getHoursWorked() {
        return hoursWorked;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ingeniero that = (Ingeniero) o;
        return hoursWorked == that.hoursWorked && Double.compare(salaryHour, that.salaryHour) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hoursWorked, salaryHour);
    }

    @Override
    public String toString() {
        return "Ingenieros{" +
                "hoursWorked=" + hoursWorked +
                ", salaryHour=" + salaryHour +
                '}';
    }
}
