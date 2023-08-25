package ejercicio;

public class MainDirection {
    public static void main(String[] args) {
        Direction ad = new Direction(55, "Armenia", "Quindio", "Colombia");
        Student obj = new Student(123, "Juan", ad);
        System.out.println(obj.rol);
        System.out.println(obj.nombreEstudi);
        System.out.println(obj.direccionestudiante.numeroCalle);
        System.out.println(obj.direccionestudiante.ciudad);
        System.out.println(obj.direccionestudiante.departamento);
        System.out.println(obj.direccionestudiante.pais);
    }
}
