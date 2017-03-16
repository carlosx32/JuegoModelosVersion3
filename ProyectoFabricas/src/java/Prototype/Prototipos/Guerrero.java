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
import Fabrica.Guerrero.BotasDelInfinito;
import Fabrica.Guerrero.CascoDePuas;
import Fabrica.Guerrero.Cota;
import Fabrica.Guerrero.Espada;
import Fabrica.Guerrero.ShieldWarrior;
import Fabrica.TrajeAbs;

/**
 *
 * @author carandy
 */
public class Guerrero extends PrototipoPj  {
    static private Guerrero singletonWarrior;
    
    private Guerrero(){
        super();
    }
    
    public static FabricaPjAbs getSingleton() {
        if(singletonWarrior==null){
            singletonWarrior=new Guerrero();
        }
        return singletonWarrior;       
    }

    @Override
    public CascoAbs crearCasco() {
        return new CascoDePuas();        
    }

    @Override
    public BotasAbs crearBotas() {
      return new BotasDelInfinito();
    }

    @Override
    public EscudoAbs crearEscudo() {
       return new ShieldWarrior();
    }
    @Override
    public ArmaAbs crearArma() {
        return new Espada();
    }

    @Override
    public TrajeAbs crearTraje() {
        return new Cota();
    }
    
    
}
