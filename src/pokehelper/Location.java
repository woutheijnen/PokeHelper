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
public class Location {
    private Encounter[] encounterList;
    private String name;
    
    Location(String locName, Encounter[] encList)
    {
        name = locName;
        encounterList = encList;
    }
    
    public String toString()
    {
        return name;
    }
    
    public Encounter[] getPokemon()
    {
        return encounterList;
    }
    
    
}
