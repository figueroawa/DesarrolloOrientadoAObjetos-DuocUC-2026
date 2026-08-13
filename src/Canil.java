public class Canil {
    public static void main(String[] args) {
        System.out.println("===Bienvenido al canil===");
        
        Perro perro_del_profe = new Perro();
        perro_del_profe.nombre = "Gimli";
        perro_del_profe.edad = 6;
        perro_del_profe.peso = 40.5;
        perro_del_profe.vacuna = false;

        Perro perro_de_selena = new Perro();
        perro_de_selena.nombre = "Lautaro";
        perro_de_selena.edad = 7;
        perro_de_selena.peso = 35.0;
        perro_de_selena.vacuna = true;

        if (perro_de_selena.edad > 2) {
            System.out.println(perro_de_selena.nombre + " tiene más de 2 años.");
        } else {
            System.out.println(perro_de_selena.nombre + " NO tiene más de 2 años.");
        }
        
        if (perro_de_selena.peso > 20.0) {
            System.out.println(perro_de_selena.nombre + " es un perro watón.");
        } else {
            System.out.println(perro_de_selena.nombre + " es un perro ligero.");
        }

        if (perro_de_selena.vacuna == true) {
            System.out.println(perro_de_selena.nombre + " puede entrar al canil.");
        } else {
            System.out.println(perro_de_selena.nombre + " NO puede entrar al canil. ¡Vacúnelo!.");
        }
    }
}