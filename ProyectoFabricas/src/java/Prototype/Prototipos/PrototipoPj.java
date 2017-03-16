/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.Prototipos;

import Fabrica.FabricaPjAbs;

/**
 *
 * @author carandy
 */
public abstract class PrototipoPj implements FabricaPjAbs, Cloneable {
    @Override
    public FabricaPjAbs clone(){
                FabricaPjAbs clonedpj = null;
        try {
            clonedpj = (FabricaPjAbs) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return clonedpj;
    };
}
