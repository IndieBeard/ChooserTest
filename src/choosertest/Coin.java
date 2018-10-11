/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choosertest;

/**
 *
 * @author andyr
 */
public class Coin {
    
    private final String name;
    private final double value;
    
    public Coin(String _name, double _value){
        name = _name;
        value = _value;
    }

    @Override
    public String toString(){
        return "I'm a coin; my name is " + name + "; my value is " + value;
    }
    
}
