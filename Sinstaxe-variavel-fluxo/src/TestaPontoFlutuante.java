
public class TestaPontoFlutuante {

	public static void main(String[] args){
		
		double salario;
		salario  = 1250.40;
		
		System.out.println("O Salario �  "+ salario);
		
		
		// quando se usa dois numeros inteiros o resultado ser� inteiro 
		// mesmo a variavel sendo do tipo double
		
		double divisao =  5 / 2;
		System.out.println("Divis�o 1 : " + divisao);
		
		
		//para fazer funcionar temos que usar numero em formato double 
		double divisao2 = 5.0 / 2;
		System.out.println("Divis�o 2 :" + divisao2);
		
		double peso = 5.5;
		int quantidade = 4;
		
		System.out.println(peso * quantidade);
			
	}
	
}
