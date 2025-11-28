public class Emp {
    private String nombre;
    private double salario;
    private String departamento;

    // Constructor
    public Emp(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            this.salario = 0;
        }
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario + "€");
        System.out.println("Departamento: " + departamento);
    }
}
