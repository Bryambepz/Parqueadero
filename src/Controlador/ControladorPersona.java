/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import modelo.Persona;

/**
 *
 * @author braya
 */
public class ControladorPersona extends ControladorAbstra<Persona>{

    public ControladorPersona() {
        super();
    }
    
    public Persona read(String buscar){
        var list = getListaObjetos();
        for (Persona persona : list) {
            if (persona.getId().equals(buscar)) {
                return persona;
            }
        }
        return null;
    }
    
    public Persona update(Persona objeto){
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var p = getListaObjetos().get(i);
            if (objeto.getId().equals(p.getId())) {
                getListaObjetos().set(i, objeto);
                return objeto;
            }
        }
        return null;
    }
    
    public boolean delete(Persona objeto){
        for (int i = 0; i < getListaObjetos().size(); i++) {
            var p = getListaObjetos().get(i);
            if (objeto.getId().equals(p.getId())) {
                getListaObjetos().remove(i);
                return true;
            }
        }
        return false;
    }
}
