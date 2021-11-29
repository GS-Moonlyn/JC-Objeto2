package objeto2;

public class mainApp {
		
		static int linhaChegada = 200;
		
		public static void main(String[] args) {
			
			    Tela game = new Tela();
			    
			    
			    
				
				int NCarro;
				NCarro = 5;
				 
				for (int i = 1; i <= NCarro; i++) {
				Carro carro = new Carro("Carro" + i, linhaChegada);
				carro.start();
				 }
		}

	}
