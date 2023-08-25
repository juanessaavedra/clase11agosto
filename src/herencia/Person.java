package herencia;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employeed extends Person { //La palabra extends me sirve para la herencia, empleado va heredar de persona

    public String cargo; //Tiene una propiedad y otras dos de la clase padre

    public Employeed(String cargo) {
        this.cargo = cargo;
    }

    public Employeed(int id, String name, String cargo) {
        super(id, name); //Propiedades heredadas
        this.cargo = cargo; //Propiedad propia
    }
}


//Este es el propio constructor de el
//Identifico que era id y string, porque tiene heredado todo lo de la clase padre
//Super nos dice que esta heredando de otra clase
//Esta construyendo su propio constructor con las propiedades de la clase padre
//Polimorfismo, ambos tienen el mismo nombre
//Cuando un metodo tiene final, el hijo no se puede sobreescribir
//Si se llega a sobreescribir, el metodo de la clase que fue instanciada, instancia es crear el objeto
//Cuando aplica el polimorfismo: Cuando se sobreescribe
//Se puede tener un nieto que se extiende de derivada 2
//Final me sirve en metodos y propiedades, a la propiedad la vuelve constante, al metodo no lo puedo sobreescribir
//Extends: para heredar

/* En Java no se puede tener dos papas, en Phyton si, esto se llama herencia multiple
Si le coloco final a una clase, no puedo colocarlo a heredar
Programacion orientada a objetos: Para reutilizar
Encapsular clase: con private
Super es para usar las propiedades del padre
Palabra para anular el metodo en la herencia: Super
Tipos de herencia:
Herencia unica:
Herencia multinivel:
Herencia Jerarquica: Dos hijos y 1 padre
Herencia multiple: No se puede porque C tiene dos papas
Herencia hibrida: No se puede

*/
