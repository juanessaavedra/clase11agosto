package ejercicio;

public class Direction {
    public int numeroCalle;
    public String ciudad;
    public String departamento;
    public String pais;

    public Direction(int numeroCalle, String ciudad, String departamento, String pais) {
        this.numeroCalle = numeroCalle;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
    }
}

 class Student { //Tenemos clases aparte y no la estamos heredando, sino agregando
    public int rol;
    public String nombreEstudi;

    Direction direccionestudiante; //La propiedad que toma es un objeto

     public Student(int rol, String nombreEstudi, Direction direccionestudiante) { //Aca en los parametros una propiedad de una clase se esta convirtiendo en un objeto
         this.rol = rol;
         this.nombreEstudi = nombreEstudi;
         this.direccionestudiante = direccionestudiante;
     }
 }
