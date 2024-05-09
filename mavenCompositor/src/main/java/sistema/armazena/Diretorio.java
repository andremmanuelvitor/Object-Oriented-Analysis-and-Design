package sistema.armazena;

import java.util.ArrayList;
import java.util.List;

public class Diretorio extends Elemento {
	private List<Elemento> elementos = new ArrayList<>();
	@Override
	public int espaço() {
		int soma=0;
		for (Elemento e : elementos) {
			soma+=e.espaço();
		}
		return soma;
	}
	public List<Elemento> getElementos() {
		return elementos;
	}
	public void setElementos(List<Elemento> elementos) {
		this.elementos = elementos;
	}	
}
