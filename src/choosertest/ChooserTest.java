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
    
    private static final ArrayList<Coin> coinList = new ArrayList<>();
    private static Chooser chooser;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        addCoin();
        chooser = new Chooser(coinList);
        
        for(int i = 0; i <= 10; i++){
            System.out.println(chooser.choose().toString());
        }
    }
    
    private static void addCoin(){
        coinList.add(new Coin("penny", 0.01));
        coinList.add(new Coin("nickel", 0.05));
        coinList.add(new Coin("dime", 0.10));
        coinList.add(new Coin("quarter", 0.25));
        coinList.add(new Coin("halfDollar", 0.50));
        coinList.add(new Coin("dollar", 1.00));

    }
    
    
}
