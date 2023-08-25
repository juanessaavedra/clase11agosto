package ejercicioherencia;

public class AnimalDomestico {
    private String name;
    private int weight;

    public AnimalDomestico(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void comer() {
        System.out.println("Padre");
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}

class Dog extends AnimalDomestico {

    private String raza;
    public Dog(String name, int weight) {
        super(name, weight);
    } //Este es un constructor solamente para inicializar los datos del padre

    @Override
    public void comer() {
        System.out.println("Hijo");

    }

    public Dog(String name, int weight, String raza) {
        super(name, weight);
        this.raza = raza;
    } //Este ya tiene las caracteristicas del padre y del hijo
}

