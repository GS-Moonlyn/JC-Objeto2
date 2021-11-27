package objeto2;

public class Carro extends Thread{
	
	private String nome;
	private int min = 10;
	private int max = 30;
	private int posicaoAtual;
	private int chegada;
	
	//Construtor
	public Carro(String nome, int chegada) {
		this.nome = nome;
		this.chegada = chegada;
		start();
	}

	public void run() {
		//Exibe a Thread atual 
		//Thread t = Thread.currentThread();
		//System.out.println(t.getName());
		
		//Log de distancia percorrida pelo Carro
		while(posicaoAtual < chegada) {
			int correr = (int)Math.floor(Math.random()*(max-min+1)+min);
			posicaoAtual += correr;
			System.out.println(nome + " correu " + correr + "km. " + nome + " percorreu " + posicaoAtual + "cm");
		}
		
		//Exibe que o Carro atingiu a linha de chegada
		if(posicaoAtual >= chegada) {
			String km = null;
			System.out.println(nome + " atingiu a linha de chegada!" + " Total de km percorridos: " + km);
		}
		
	}
}
