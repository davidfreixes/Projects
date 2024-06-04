import java.util.Objects;

public class Gerente extends Empleado{
    public static final double baseSalary = 1550.50;
    private double bonif;

    public Gerente(int id, String nombre, String email, double bonif) {
        super(id, nombre, email);
        this.bonif = bonif;
    }

    public double calcularSalario() {
        return baseSalary + getBonif();
    }
    public String describir() {
        return "Empleado numero "+ super.id +" se llama "+super.name+" y pertence al departamento de Gerentes.";
    }

    public double getBonif() {
        return bonif;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gerente gerente = (Gerente) o;
        return Double.compare(bonif, gerente.bonif) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(bonif);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonif=" + bonif +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
