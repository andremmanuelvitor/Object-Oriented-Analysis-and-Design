package br.gov.financa;
public class Brasil implements Banco{
	private Central central; 
	@Override
	public boolean emprestimo(float v){
		if(central != null) {
			return central.emprestimo(v);
		}else {
			return false;
		}
	}
	public Central getCentral() {
		return central;
	}
	public void setCentral(Central central) {
		this.central = central;
	}	
}
