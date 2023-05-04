package Implements;

import Interfaces.PrecioArticulo;

public class Software implements PrecioArticulo {
    private char codigo;
    private String descripcion;
    private String tipo;

    public Software(char codigo, String descripcion, String tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public char getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public Double getPrecio(char codigo) {
        if (codigo == 'B'){
            if (this.tipo.equals("ProgramaJuegos")){
                return 50.3 * 0.05;
            }else
            return 50.3;
        }
        if (codigo == 'C'){
            if (this.tipo.equals("ProgramaJuegos")){
                return 150.50 * 0.05;
            }else
                return 150.50;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Software{" +
                "codigo =" + codigo +
                ", descripcion ='" + descripcion + '\'' +
                ", tipo ='" + tipo + '\'' +
                ", precio = " + getPrecio(getCodigo()) + '\'' +
                '}';
    }
}
