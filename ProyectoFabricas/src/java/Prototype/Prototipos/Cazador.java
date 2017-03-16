/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.Prototipos;

import Fabrica.ArmaAbs;
import Fabrica.BotasAbs;
import Fabrica.CascoAbs;
import Fabrica.Cazador.ArcoDelPantano;
import Fabrica.Cazador.BotasDelPantano;
import Fabrica.Cazador.CascoDelPantano;
import Fabrica.Cazador.EscudoDelPantano;
import Fabrica.Cazador.PecheraDelPantano;
import Fabrica.EscudoAbs;
import Fabrica.FabricaPjAbs;
import Fabrica.TrajeAbs;
/**
 *
 * @author carandy
 */
public class Cazador extends PrototipoPj {
    static private Cazador singletonHunter;

    public static FabricaPjAbs getSingleton() {
            if(singletonHunter==null){
            singletonHunter=new Cazador();
        }
        return singletonHunter;       
    }
    
    private Cazador(){
        super();
    }
    


    @Override
    public CascoAbs crearCasco() {
        return new CascoDelPantano();        
    }

    @Override
    public BotasAbs crearBotas() {
        return new BotasDelPantano();
    }

    @Override
    public EscudoAbs crearEscudo() {
        return new EscudoDelPantano();
    }
    @Override
    public ArmaAbs crearArma() {
        return new ArcoDelPantano();
    }

    @Override
    public TrajeAbs crearTraje() {
        return new PecheraDelPantano();
    }
}
