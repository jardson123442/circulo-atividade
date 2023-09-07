package atividadecirculo;

public class Circulo {
	int raio;
	int centrox;
	int centroy;
	
	public int getRaio() {
		return raio;
	}
	public void setRaio(int raio) {
		this.raio = raio;
	}
	public int getCentrox() {
		return centrox;
	}
	public void setCentrox(int centrox) {
		this.centrox = centrox;
	}
	public int getCentroy() {
		return centroy;
	}
	public void setCentroy(int centroy) {
		this.centroy = centroy;
		
	}

	public Circulo(int raio,int centrox,int centroy) {
		this.raio = raio;
		this.centrox = centrox;
		this.centroy = centroy;
	}
}