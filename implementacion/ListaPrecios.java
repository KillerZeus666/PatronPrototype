/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Creacional - > Prototype
 * Tipo de Clase: Java
 * Clase para manejar la lista de precios y sus variantes.
  */
  package implementacion;

  import java.util.ArrayList;
  import java.util.List;
  
  /**
   *
   * @author Fabrizio Bolaño
   */
  public class ListaPrecios implements InterfacePrototype<ListaPrecios> {
  
      private String listado;
      private List<CatalogoProductos> productos = new ArrayList<CatalogoProductos>();
  
       public ListaPrecios(String lista) {
          this.listado = lista;
      }
      
      public String getListado() {
          return listado;
      }
  
      public void setListado(String listado) {
          this.listado = listado;
      }
  
      public List<CatalogoProductos> getProductos() {
          return productos;
      }
  
      public void setProductos(List<CatalogoProductos> productos) {
          this.productos = productos;
      }
  
       public void addCatalogoItem(CatalogoProductos item){
          this.productos.add(item);
      }
      
      
      @Override
      public ListaPrecios clone() {
           ListaPrecios clone = new ListaPrecios(listado);
          clone.setProductos(productos);
          return clone;
      }
  
      @Override
      public ListaPrecios deepClone() {
           List<CatalogoProductos> cloneProducts = new ArrayList<>();
          for(CatalogoProductos item : this.productos){
              CatalogoProductos cloneItem = item.clone();
              cloneProducts.add(cloneItem);
          }
          ListaPrecios clone = new ListaPrecios(listado);
          clone.setProductos(cloneProducts);
          return clone;
      }
  
      @Override
      public String toString() {
          String items = "";
          String newline = System.getProperty("line.separator");
          for(CatalogoProductos item : this.productos){
              items += "\t" + item.toString() + "\n";            
              
              }
          //return "Lista de Precios del Catalogo {" + "listado=" + listado + ", productos=" + productos + '}';
          return "Lista de Precios{Tipo de Lista:=" + listado + ", Productos=\n" + items + '}';
          
      }
      
      
  }