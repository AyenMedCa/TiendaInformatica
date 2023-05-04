import Implements.Hardware;
import Implements.Software;

public class Programa {
    public static void main(String[] args) {

        //Variables
        Software software = new Software('B',"El mejor software del mundo","ProgramaJuegos");
        Hardware hardware = new Hardware('A',"Los mejores perifericos de Colombia",true);

        //Imprimir Software
        System.out.println(software.toString());

        //Imprimir Hardware
        System.out.println(hardware.toString());
    }
}
