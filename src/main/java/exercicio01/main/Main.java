    package exercicio01.main;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Main app = new Main ();
            app.start();

        }

        private void start() {
            
            
            int contagem =3;
            int[] valores = new int[4];
            int []retorno = obterValores(contagem,valores);  
            calcularValores(retorno);
            
            
            for (int i=0; i< retorno.length; i++) {
            	
            	if (retorno[i]>= 70) {
            		
            		System.out.println("Valor muito alto. " );
            
            	}else {
            		
            	System.out.println("Valor normal.");	
            	}
            	}
            	
            }
            
            
        
            
        
    
            
        
        private int [] obterValores(int contagem, int valores[]){
            
            Scanner ler = new Scanner(System.in);
            int[] retorno  = new int [4];
            for(int i=0; i<=contagem; i++) {
                System.out.println("Digite um valor");
                valores[i]= ler.nextInt();  
                
                retorno[i] = valores[i];
            }
                
            return retorno;
            
        }
        private void calcularValores(int retorno[]){
            
            int maior = 0;
            int menor = 0;
            int i=3;
            
            for (i=0; i<= retorno.length; i++) {
                
                if (retorno[i]> maior) {
                    maior = retorno[i];
                    
                }
                else((retorno[i] < maior)&&(retorno[i] >= menor)){
                    
                    menor= retorno[i];
                }
                
                System.out.println("O maior valor é: "+ maior);
                System.out.println("O menor valor é: "+ menor);
                
            }
            
            
            
        
     }
 }
        