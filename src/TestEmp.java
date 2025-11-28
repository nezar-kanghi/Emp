public class TestEmp {
    public static void main(String[] args) {

        Emp emp1 = new Emp("María", 2500, "Contabilidad");
        emp1.mostrarInfo();

        emp1.setNombre("Raúl");
        emp1.setSalario(-1000);
        emp1.setDepartamento("Recursos Humanos");

        emp1.mostrarInfo();
    }
}
