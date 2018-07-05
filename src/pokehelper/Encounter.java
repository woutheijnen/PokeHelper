/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokehelper;

/**
 *
 * @author Wout
 */
public class Encounter {
    private String name;
    private String method;
    
    public Encounter(String pkmn, String how)
    {
        name = pkmn;
        method = how;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getHow()
    {
        return method;
    }
}
