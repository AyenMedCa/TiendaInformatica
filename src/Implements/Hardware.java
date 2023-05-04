package Implements;

import Interfaces.PrecioArticulo;

public class Hardware implements PrecioArticulo{

    //Variables
    private char codigo;
    private String descripcion;
    private boolean esPeriferico;
    
    //Getter
    public char getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEsPeriferico() {
        return esPeriferico;
    }

    //Contructor
    public Hardware(char codigo, String descripcion, boolean esPeriferico) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.esPeriferico = esPeriferico;
    }

    //Arroja el precio
    @Override
    public Double getPrecio(char codigo) {
        if (codigo == 'B'){
            if (esPeriferico){
                return (50.3 * 0.1) + 50.3;
            }else
                return 50.3;
        }
        if (codigo == 'A'){
            if (esPeriferico){
                return (100.0 * 0.1) + 100.0;
            }else
                return 100.0;
        }
        return null;
        }

        //Imprimir
    @Override
    public String toString() {
        return "Hardware{" +
                "codigo= " + codigo +
                ", descripcion= '" + descripcion + '\'' +
                ", esPeriferico= " + esPeriferico + '\'' +
                ", Precio = " +getPrecio(getCodigo()) +'\''+
                '}';
    }
}
