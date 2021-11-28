package objeto2;

public class Carro extends Thread{
	
	private String nome;
	private int min = 10;
	private int max = 30;
	private int posicaoAtual;
	private int chegada;
	private int tempo = 0;
	private int posicaoInicial = 0;
	private int velocidadeInicial = 0;
	private Thread t = Thread.currentThread();
	
	
	//Construtor
	public Carro(String nome, int chegada) {
		this.nome = nome;
		this.chegada = chegada;
	}

	public void run() {
		//Exibe a Thread atual 
		//Thread t = Thread.currentThread();
		//System.out.println(t.getName());
		
		//Log de distancia percorrida pelo Carro
		while(posicaoAtual < chegada) {
			tempo++;
			int velocidade = velocidadeInicial + (int)Math.floor(Math.random()*(max-min+1)+min) * tempo;
			posicaoAtual = posicaoInicial + velocidade * tempo;
			System.out.println(nome + " correu " + velocidade + "km. " + nome + " percorreu um total de " + posicaoAtual + "km");
			try{
					Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
		
		//Exibe que o Carro atingiu a linha de chegada
		if(posicaoAtual >= chegada) {
			System.out.println(nome + " atingiu a linha de chegada!" + " Total de km percorridos: " + posicaoAtual + "km");
		}	
	}
}
