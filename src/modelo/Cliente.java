/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Josue Anavisca
 */
public class Cliente extends Persona {
    private String nit;
    public Cliente (){} 
    public Cliente(String nit, String nombres, String apellidos, String dirección, String teléfono, String fecha_nacimiento) {
        super(nombres, apellidos, dirección, teléfono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar(){
    System.out.println("Nit:  " + getNit());
    System.out.println("Nombres:  " + getNombres());
    System.out.println("Apellidos:  " + getApellidos());
    System.out.println("Dirección:  " + getDirección());
    System.out.println("Teléfono:  " + getTeléfono());
    System.out.println("Fecha Nacimiento:  " + getFecha_nacimiento());
    System.out.println("_____________________________________");
            }
}
