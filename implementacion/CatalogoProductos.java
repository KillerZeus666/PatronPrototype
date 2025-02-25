/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Creacional - > Prototype
 * Tipo de Clase: Java
 * Clase para manejar el catalogo de productos ofertados.
  */
  package implementacion;

  /**
   *
   * @author Fabrizio Bolaño
   */
  public class CatalogoProductos implements InterfacePrototype<CatalogoProductos> {
      private String nombreProducto;
      private double precioProducto;
      
      public CatalogoProductos(){
      }
  
      public CatalogoProductos(String nombre, double precio) {
          this();
          this.nombreProducto = nombre;
          this.precioProducto = precio;
      }
      
      public String getNombreProducto() {
          return nombreProducto;
      }
  
      public void setNombreProducto(String nombreProducto) {
          this.nombreProducto = nombreProducto;
      }
  
      public double getPrecioProducto() {
          return precioProducto;
      }
  
      public void setPrecioProducto(double precioProducto) {
          this.precioProducto = precioProducto;
      }
      
          
      @Override
      public CatalogoProductos clone() {
          return new CatalogoProductos(this.nombreProducto,this.precioProducto);
      }
  
      @Override
      public CatalogoProductos deepClone() {
          return clone();
      }
  
      @Override
      public String toString() {
          return "Catalogo{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
          
      }
  
      
      
  }