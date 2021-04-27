package grandesalmacenes;

public class Almacen {
	 private int numProductos;
     public Almacen(int nProductos){
             this.numProductos=nProductos;
     }// este metodo recibe la cantidad de productos, definidio en la clase Grandes Almacenes, y luego lo asigna a la variable numProductos.
     public boolean cogerProducto(){
             if (this.numProductos>0){
                     this.numProductos--;
                     return true;
             }
             return false;
     }// Cada vez que una persona coge un producto, el método restará un producto a la cantidad de productos definida, mientras que aya productos, pero si ya no hay productos, el estado cambiara a falso,
}
