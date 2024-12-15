package entornos;

/*
 	Representa una mascota virtual con atributos de hambre, energía y estado de ánimo.
 	Proporciona métodos para interactuar con la mascota: jugar, alimentar y dormir.
 */
public class Tamagotchi{

    int hunger = 4; // Nivel de hambre de la mascota (0-10).
    int energy = 4; // Nivel de energía de la mascota (0-10).
    int mood = 4;   // Nivel de estado de ánimo de la mascota (0-10).

    /*
      Constructor de la clase Tamagotchi.
      @param hunger Nivel inicial de hambre.
      @param energy Nivel inicial de energía.
      @param mood Nivel inicial de estado de ánimo.
     */
    public Tamagotchi(int hunger, int energy, int mood) {
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }

    /**
     * Método para jugar con el Tamagotchi.
     * Incrementa el hambre y el estado de ánimo, reduce la energía si es mayor que 0.
     * @return Un string que representa el estado emocional del Tamagotchi.
     */
    public String play() {
        hunger+=1;
        mood+=1;
        if (energy>0) {
            energy-=1;
        }
        if (mood>8) {
            return ":-)";
        } else if (energy==0) {
            return "(-_-) zZZ";
        } else if (energy<3) {
            return "(-_-)";
        } else if (mood<2) {
            return "ఠ_ఠ";
        } else {
            return ":-|";
        }
    }

    /**
     * Método para alimentar al Tamagotchi.
     * Reduce el hambre y la energía.
     * @return Un string que representa el estado emocional del Tamagotchi.
     */
    public String eat() {
        if (energy>0) {
            energy-=1;
        }
        if (hunger>1) {
            hunger-=2;
        } else if (hunger==1) {
            hunger-=1;
        }
        if (mood>8) {
            return ":-)";
        } else if (energy==0) {
            return "(-_-) zZZ";
        } else if (energy<3) {
            return "(-_-)";
        } else if (mood<2) {
            return "ఠ_ఠ";
        } else {
            return ":-|";
        }
    }

    /**
     * Método para hacer dormir al Tamagotchi.
     * Incrementa la energía.
     * @return Un string que representa el estado emocional del Tamagotchi.
     */
    public String sleep() {
        energy+=2;
        if (mood>8) {
            return ":-)";
        } else if (energy==0) {
            return "(-_-) zZZ";
        } else if (energy<3) {
            return "(-_-)";
        } else if (mood<2) {
            return "ఠ_ఠ";
        } else {
            return ":-|";
        }
    }

    /**
     * Método principal para probar la funcionalidad de la clase Tamagotchi.
     */
    public static void main(String[] args) {
        // Crear un Tamagotchi inicial con hambre, energía y estado de ánimo predeterminados
        Tamagotchi tamagotchi = new Tamagotchi(4, 4, 4);

        // Jugar con el Tamagotchi
        System.out.println("Playing: " + tamagotchi.play());
        System.out.println("Playing: " + tamagotchi.play());
        System.out.println("Playing: " + tamagotchi.play());
        
        // Alimentar al Tamagotchi
        System.out.println("Eating: " + tamagotchi.eat());
        System.out.println("Eating: " + tamagotchi.eat());

        // Hacer que el Tamagotchi duerma
        System.out.println("Sleeping: " + tamagotchi.sleep());
    }
}
