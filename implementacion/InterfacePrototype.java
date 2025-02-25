/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Creacional - > Prototype
 * Tipo de Clase: Interface
 * Clase que implementa la interface Cloneable para aprovechar la funcionalidad de clonación estándar de Java.
 * Definimos el tipo genérico T para asegurarnos de que todos los prototipos implementen la interface InterfacePrototype.
 */
package implementacion;

/**
 *
 * @author Fabrizio Bolaño
 */
public interface InterfacePrototype <T extends InterfacePrototype> extends Cloneable {
    public T clone();
    public T deepClone();
}

