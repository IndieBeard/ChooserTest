/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choosertest;

import java.util.ArrayList;

/**
 *
 * @author andyr
 */
public class ChooserTest {
    
    private static final ArrayList<Coin> COIN_LIST = new ArrayList<>();
    private static Chooser chooser;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        addCoin();
        chooser = new Chooser<>(COIN_LIST);
        
        for(int i = 0; i <= 10; i++){
            System.out.println(chooser.choose().toString());
        }
    }
    
    private static void addCoin(){
        COIN_LIST.add(new Coin("penny", 0.01));
        COIN_LIST.add(new Coin("nickel", 0.05));
        COIN_LIST.add(new Coin("dime", 0.10));
        COIN_LIST.add(new Coin("quarter", 0.25));
        COIN_LIST.add(new Coin("halfDollar", 0.50));
        COIN_LIST.add(new Coin("dollar", 1.00));

    }
    
    
}
