package poo.model;

public class Veiculo {

    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
    
    // Métodos sobrecarregados (overloaded)
    public void mover(int distancia) {
        System.out.println("O veículo se moveu por " + distancia + " metros.");
    }

    public void mover(String tipoTerreno) {
        System.out.println("O veículo está se movendo sobre " + tipoTerreno + ".");
    }

    public void mover(int distancia, String tipoTerreno) {
        System.out.println("O veículo se moveu por " + distancia + " metros sobre " + tipoTerreno + ".");
    }
}
