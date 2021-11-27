package objeto2;

public class mainApp {
		
		static int linhaChegada = 200;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
					
				Thread t = Thread.currentThread();
				System.out.println(t.getName());
				
				 int NCarro;
				 NCarro = 5;
				 
				for (int i = 1; i <= NCarro; i++) {
				Carro carro = new Carro("Carro" + i, linhaChegada);
				 
				 }
		}

	}
