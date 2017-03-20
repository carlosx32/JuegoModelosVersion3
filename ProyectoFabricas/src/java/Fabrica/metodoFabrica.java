/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import Prototype.Prototipos.Brujo;
import Prototype.Prototipos.Cazador;
import Prototype.Prototipos.Guerrero;
import Prototype.Prototipos.PrototipoPj;
import Prototype.Prototipos.Sacerdote;

/**
 *
 * @author carandy
 */
public class metodoFabrica {
    private FabricaPjAbs Pjabs;
    public FabricaPjAbs getPersonaje(String tipo ){
        switch(tipo){
            case "Guerrero":   
                    Pjabs= Guerrero.getSingleton();
                break;
            case "Cazador":
                    Pjabs=Cazador.getSingleton();
                break;
            case "Sacerdote":
                    Pjabs=Sacerdote.getSingleton();
                break;
            case "Brujo":
                    Pjabs=Brujo.getSingleton();
                break;
        }
        return Pjabs;
    }

    public PrototipoPj getPersonajeProt(String tipo) {
                switch(tipo){
            case "Guerrero":   
                    Pjabs= Guerrero.getSingleton();
                break;
            case "Cazador":
                    Pjabs=Cazador.getSingleton();
                break;
            case "Sacerdote":
                    Pjabs=Sacerdote.getSingleton();
                break;
            case "Brujo":
                    Pjabs=Brujo.getSingleton();
                break;
        }
        return (PrototipoPj) Pjabs;
    }
    
    
}
