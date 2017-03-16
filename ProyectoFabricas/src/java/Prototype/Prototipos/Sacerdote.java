/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.Prototipos;


import Fabrica.ArmaAbs;
import Fabrica.BotasAbs;
import Fabrica.CascoAbs;
import Fabrica.EscudoAbs;
import Fabrica.FabricaPjAbs;
import Fabrica.Sacerdote.BotasEspirituales;
import Fabrica.Sacerdote.CascoEspiritual;
import Fabrica.Sacerdote.CorazaEspiritual;
import Fabrica.Sacerdote.EscudoEspiritual;
import Fabrica.Sacerdote.LibroDeHechizos;
import Fabrica.TrajeAbs;


/**
 *
 * @author carandy
 */
public class Sacerdote extends PrototipoPj {
    static private Sacerdote singletonSac;
    
    private Sacerdote(){
        
    }
    
    public static FabricaPjAbs getSingleton() {
        if(singletonSac==null){
            singletonSac=new Sacerdote();
        }
        return singletonSac;       
    }

    @Override
    public CascoAbs crearCasco() {
        return new CascoEspiritual();        
    }

    @Override
    public BotasAbs crearBotas() {
      return new BotasEspirituales();
    }

    @Override
    public EscudoAbs crearEscudo() {
       return new EscudoEspiritual();
    }
    @Override
    public ArmaAbs crearArma() {
        return new LibroDeHechizos();
    }

    @Override
    public TrajeAbs crearTraje() {
        return new CorazaEspiritual();
    }
}
