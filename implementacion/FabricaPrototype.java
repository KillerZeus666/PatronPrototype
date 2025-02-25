/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Creacional - > Prototype
 * Tipo de Clase: Java
 * Clase para deelegarle la responsabilidad de crear los prototipos.
 */
package implementacion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Fabrizio Bolaño
 */
public class FabricaPrototype {
    private static Map<String,InterfacePrototype> prototypes = new HashMap<String, InterfacePrototype>();
    
    public static InterfacePrototype getPrototype(String prototypeName){
        return prototypes.get(prototypeName).deepClone();
    }
    
    public static void addPrototype(String prototypeName,InterfacePrototype prototype){
        prototypes.put(prototypeName, prototype);
    }
}