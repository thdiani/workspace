package br.com.lojauati.modelo;

public class Televisao {
	private int canal;
	private boolean status;
	private int volume;


	public void preencherVolume(int pVolume) {
		if (volume>=0)
			volume = pVolume;
	}
	public void preencherCanal(int pCanal) {
		if (canal>=0)
			canal = pCanal;
	}
	public void preencherStatus(boolean pStatus) {
		status = pStatus;
	}
	public void aumentaVolume() {
		if(volume>=0 && volume<50 && status==true) {
			volume++;		
		}
	}
	public void diminuiVolume() {
		if(volume<=50 && volume>0 && status==true) {
			volume--;
		}
	}
	public void ligarTv() {
		status=true;

	}
	public void desligarTv() {
		status=false;

	}
	public void mudarCanal(int pCanal) {
		if (status==true) {
			canal=pCanal;
		}
	}
	public boolean exibirStatus() {
		return status;
	}
	public String exibirTudo() {
		String resposta="DESLIGADA";
		if (status==true){
			resposta = "LIGADA";
		}
		return
				"Canal Atual.......: " + canal + "\n" +
				"Volume Atual......: " + volume + "\n" +
				"Status TV.........: " + resposta;
	}
}
