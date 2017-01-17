/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrador1
 */
public class Automovil {
    private String color;    
    private String marca;
    private String subMarca;
    private int modelo;   
    private double precio;
    
    public double getPrecio() {
        return precio;
    }    
    
    public String getColor()
    {
        return color;
    }
    
    public String getMarca() {
        return marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public int getModelo() {
        return modelo;
    }    
    
    public void descripcion()
    {
        System.out.println("Vehículo marca: " + marca);
        System.out.println("Sub-marca: " + subMarca);
        System.out.println("modelo: " + modelo);
        System.out.println("color: " + color);
        System.out.println("precio: " + precio);
    }
    
    public static void main(String[] args) {
        //creación de una instancia (objeto) de tipo Automovil
        Automovil miCarrito = new Automovil();                
        miCarrito.color = "rojo";
        miCarrito.marca = "VW";
        miCarrito.modelo = 1999;
        miCarrito.precio = 100000;
        miCarrito.subMarca = "bocho";
        
        miCarrito.descripcion();
    }
}
