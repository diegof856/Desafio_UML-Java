package aplicacao;

import entidade.Iphone;

public class app {

	public static void main(String[] args) {
		Iphone device = new Iphone("Diego", true, true);
		
		device.adicionarNovaAba("https://www.google.com/");
		device.atender();
		device.iniciarCorreioVoz();
		device.ligar("95959485");
		device.selecionarMusica("Zoio de lua");

	}

}
