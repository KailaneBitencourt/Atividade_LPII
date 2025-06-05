package atividade2;

public class Carro {
	private String modelo;
	private float velocidade;
	private float aceleracao;
	private int marcha;
	
	
	void ligar() {
		System.out.println("O carro está ligado.");
	}
	
	void desligar() {
		System.out.println("O carro está desligado.");
	}
	void acelerar() {
		System.out.println("O carro está acelerando.");
	}
	
	void desacelerar() {
		System.out.println("O carro está desacelerando.");
	}
	void virarParaDireita() {
		System.out.println("O carro está virando para a direita.");
	}
	void virarParaEsquerda() {
		System.out.println("O carro está virando para a esquerda.");
	}
	void marchaParaCima() {
		System.out.println("A macha está para cima");
	}
	void marchaParaBaixo() {
		System.out.println("A macha está para baixo");
	}
	
	
	
	public Carro(String modelo, float velocidade, float aceleracao, int marcha){
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.aceleracao = aceleracao;
		this.marcha = marcha;
	}
	
	public void exibir() {
        System.out.println("\nModelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Aceleração: " + aceleracao);
        System.out.println("Marcha: " + marcha);
       
    }
	
	public static void main(String[] args) {
		Carro meuCarro = new Carro("Palio", 0, 10, 1);
        meuCarro.exibir();

        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.marchaParaCima();
        meuCarro.virarParaDireita();
        meuCarro.desacelerar();
        meuCarro.desligar();

        meuCarro.exibir();

	}

}
