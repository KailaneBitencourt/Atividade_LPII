package atividade2;

public class Televisao {
	private int tamanhoTela;
	private int volume;
	private String marca;
	private int voltagem;
	private int canal;
	private boolean ligada;

	public Televisao(int tamanhoTela, String marca, int voltagem, int canal) {
		this.tamanhoTela = tamanhoTela;
		this.volume = 20; // 
		this.marca = marca;
		this.voltagem = voltagem;
		this.canal = canal;
		this.ligada = false;
	}

	public void ligar() {
		ligada = true;
		int consumo = voltagem * tamanhoTela;
		System.out.println("A TV está ligada. Consumo: " + consumo + " watts.");
	}

	public void desligar() {
		ligada = false;
		System.out.println("A TV está desligada.");
	}

	public void aumentarVolume() {
		if (volume < 10) {
			volume++;
			System.out.println("Volume atual: " + volume);
		} else {
			System.out.println("Volume máximo atingido.");
		}
	}

	public void diminuirVolume() {
		if (volume > 1) {
			volume--;
			System.out.println("Volume atual: " + volume);
		} else {
			System.out.println("Volume mínimo atingido.");
		}
	}

	public void subirCanal() {
		canal++;
		System.out.println("Canal atual: " + canal);
	}

	public void descerCanal() {
		if (canal > 1) {
			canal--;
			System.out.println("Canal atual: " + canal);
		} else {
			System.out.println("Canal mínimo atingido.");
		}
	}

	public void exibir() {
		System.out.println("Marca: " + marca);
		System.out.println("Tamanho da tela: " + tamanhoTela + " polegadas");
		System.out.println("Voltagem: " + voltagem + "V");
		System.out.println("Volume: " + volume);
		System.out.println("Canal: " + canal);
		System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
	}

	public static void main(String[] args) {
		Televisao minhaTV = new Televisao(47, "Samsung", 220, 12);

		minhaTV.exibir();

		minhaTV.ligar();
		minhaTV.aumentarVolume();
		minhaTV.aumentarVolume();
		minhaTV.diminuirVolume();
		minhaTV.subirCanal();
		minhaTV.subirCanal();
		minhaTV.descerCanal();
		minhaTV.desligar();

		minhaTV.exibir();
	}
}
