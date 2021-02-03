
public class Libro {

	private String titulo;
	private int cantidad;
	
	Libro(){
		this.cantidad=0;
		this.titulo=null;
	}
	
	Libro(String tit, int can){
		this.titulo=tit;
		this.cantidad=can;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public String toString() {
		return ("Del libro "+this.titulo+" existen "+this.cantidad+" unidades");
	}
	
	public void prestamo() {
		if(this.cantidad>0) {
			System.out.println("Se va a prestar el libro "+this.titulo);
			cantidad--;
		}else {
			System.out.println("No quedan libros con el titulo "+this.titulo);
		}
	}
	
	public void devoluccion() {
		cantidad++;
		System.out.println("Libro devuelto");
	}
}
