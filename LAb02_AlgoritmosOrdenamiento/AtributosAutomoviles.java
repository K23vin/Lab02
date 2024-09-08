public class AtributosCarro {
    private String marca;
    private String modelo;
    private String color;
    private int kilometraje;

    public AtributosCarro(String marca, String modelo, String color, int kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getColor(){
        return color;
    }

    public int getKilometraje(){
        return kilometraje;
    }

    @Override
    public String toString() {
        return String.format(
            "==================\n" +
            "Marca : %s\n" +
            "Modelo : %s\n" +
            "Color : %s\n" +
            "Kilometraje : %d km\n" +
            "==================",
            marca, modelo, color, kilometraje
        );
        
    }
    
}
