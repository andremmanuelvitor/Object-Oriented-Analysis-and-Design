package bio.colmeia;

public class FavoMel {
	private double ladoParede;
	public double getLadoParede() {
		return ladoParede; }
	public void setLadoParede(double ladoParede) {
		this.ladoParede = ladoParede; }
	public double superficie() {
		return 6 * Math.pow(ladoParede, 2.0) * Math.sqrt(3.0) / 4;
	}
}
