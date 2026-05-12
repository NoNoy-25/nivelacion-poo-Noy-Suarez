package modelo;

public class Personaje {

    public void mostrarEstado() {

        double porcentaje = (vida / vidaMaxima) * 100;

        int relleno = (int) (porcentaje / 10);

        String barra = "[";

        for (int i = 0; i < relleno; i++) {
            barra += "#";
        }

        for (int i = relleno; i < 10; i++) {
            barra += ".";
        }

        barra += "]";

        String estado;

        if (porcentaje <= 0) {
            estado = "MUERTO";
        } else if (porcentaje <= 25) {
            estado = "CRITICO";
        } else if (porcentaje <= 50) {
            estado = "HERIDO";
        } else if (porcentaje <= 75) {
            estado = "ESTABLE";
        } else {
            estado = "SALUDABLE";
        }

        System.out.println(
                barra + " " + porcentaje + "% - " + estado);
    }

    String nombre;

    String clase;

    int nivel;

    double vida;

    double vidaMaxima;

    int ataque;
    int defensa;

    public Personaje(String nombre, String clase,

            double vidaMax, int ataque,

            int defensa) {

        this.nombre = nombre;

        this.clase = clase;

        this.nivel = 1;

        this.vida = vidaMax;

        this.vidaMaxima = vidaMax;

        this.ataque = ataque;

        this.defensa = defensa;

    }

    @Override

    public String toString() {

        return String.format(

                "[%s] %s Nv%d | HP:%.0f/%.0f",

                clase, nombre, nivel, vida, vidaMaxima);

    }

}
