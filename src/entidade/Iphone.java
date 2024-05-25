package entidade;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
	private String nome;
	private boolean numero;
	private boolean wifi;
	
	public Iphone(String nome, boolean numero, boolean wifi) {
		this.nome = nome;
		this.numero = numero;
		this.wifi = wifi;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isNumero() {
		return numero;
	}


	public void setNumero(boolean numero) {
		this.numero = numero;
	}


	public boolean isWifi() {
		return wifi;
	}


	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}


	@Override
	public void tocar(String musica) {
		System.out.println("Tocando a musica "+ musica);
		mostrarCapaAlbum(musica);
		
	}
	private void mostrarCapaAlbum(String musica) {
		System.out.println("Capa do album da musica: "+musica);
	}

	@Override
	public void pausar(String musica) {
		System.out.println("Pausando a musica " + musica);
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("A musica selecionada foi "+ musica);
		tocar(musica);
		pausar(musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		if(this.wifi) {
			System.out.println("Exibindo pagina "+ url);
		}else {
			System.out.println("Sem Acesso a internet");
		}
		
	}

	@Override
	public void adicionarNovaAba(String novaUrl) {
		if(this.wifi) {
			System.out.println("Exibindo pagina "+ novaUrl);
		}else {
			System.out.println("Sem Acesso a internet");
		}
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
		
	}


	@Override
	public void ligar(String numero) {
		censorTela();
		
		if (this.numero) {
			verificarChip();
			System.out.println("Ligando para "+ numero);
		}else {
			verificarChip();
		}
		
		
	}

	@Override
	public void atender() {
		censorTela();
		
		if(this.numero) {
			verificarChip();
			System.out.println("Atendendo ligação");
			
		}else {
			verificarChip();
		}
		
		
	}

	@Override
	public void iniciarCorreioVoz() {
		censorTela();
		
		if (this.numero) {
			verificarChip();
			System.out.println("Ligação não atendida iniciando correio de voz!!!");
		}else {
			verificarChip();
		}
		
		
	}

	
	private void censorTela() {
		System.out.println("desligando tela ");
		
	}

	
	private void verificarChip() {
		if(this.numero) {
			
		 System.out.println("Chip encontrado");
		}else {
			System.out.println("Chip não encontrado");
		}
		
		
	}

}
