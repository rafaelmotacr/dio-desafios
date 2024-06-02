package aparelhoEletronico.smartphone;

import aparelhoEletronico.aparelhoTelefonico.AparelhoTelefonico;
import aparelhoEletronico.navegadorInternet.NavegadorInternet;
import aparelhoEletronico.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	
	// Metodos "herdados" de AparelhoTelefonico
	
	@Override
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA " + numero + "...");
	}
	
	@Override
	public void atender() {
		System.out.println("ATENDENDO LIGACAO!!!");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("GRAVE AGORA O SEU RECADO!!!");
	}
	
	// Metodos "herdados" de NavegadorInternet
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("ACESSANDO A PAGINA: " + url + "!!!");
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("ABRINDO NOVA ABA!!!");
		
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA!!! VOCE APERTOU F5!!!");
	}
	
	// Metodos "herdados" de RerpodutorMusical
	
	@Override
	public void tocar() {
		System.out.println("TOCANDO SUA MUSIQUINHA DAORA!!!");
	}
	
	@Override
	public void pausar() {
		System.out.println("PAUSANDO SUA MUSIQUINHA DAORA :(");
	}
	
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("VOCE ESCOLHEU TOCAR A MUSICA: " + musica + "!!!");
		
	}
}
