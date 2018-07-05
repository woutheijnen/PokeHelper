/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokehelper;

import java.io.IOException;

/**
 *
 * @author Wout
 */
public class PokeHelper {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        HelperForm h = new HelperForm();
        h.goLoadFirstPoke();
        h.setVisible(true);
    }
    
}
