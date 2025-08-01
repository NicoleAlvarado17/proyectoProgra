
package fidecompro;

import java.io.Serializable;

public class Cliente extends Usuario implements Serializable{
   private static final long serialVersionUID = 1L; 
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;

  
    public Cliente(int id,String usuario, String contraseña,String nombre,String direccion,String telefono) {
        super(usuario, contraseña);
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  id + "-"+ nombre;
    }
    
    
    
}
