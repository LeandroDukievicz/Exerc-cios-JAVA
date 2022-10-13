
package atv01structured;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Atv01structured {

    public static void main(String[] args) throws IOException, InterruptedException{
        
        
   
        Scanner ler = new Scanner(System.in);
        
            double candidato1 =0;
            double candidato2 =0;
            //int nulo=0;
          //  double nuloB=0;
            double totalPorcent1 =0;
            double  totalPorcent2 =0;
            int opcao;        
            int qtdVotos ; 
            int count;
            
            System.out.println("      Atividade 01 - Leandro Dukiévicz 21144207-5 ");
            System.out.println("");
            System.out.println(" Controle Pesquisa Eleitoral. ");
            System.out.println("");
            System.out.println("Informe a Quantidade de Eleitores para Iniciar: ");
            
           qtdVotos = ler.nextInt();
           
           System.out.println("A Quantidade selecionada  para esta seção foi de : " + qtdVotos + "  " + "Eleitores.");
           System.out.println("");
           
           for (count=0; count<qtdVotos; count ++){
               
               Scanner scan = new Scanner(System.in);
               System.out.println("Selecione o Candidato : ");
               System.out.println("Vote 1 para - Zé da Farmácia  /  Vote 2  para -  Rita da Padaria ");
           
               opcao = scan.nextInt();
               
               switch (opcao){
                   case 1:
                       System.out.println("OK Voto Contabilizado ! ");
                       System.out.println("");                      
                       candidato1 =++candidato1;
                       
                       totalPorcent1 =candidato1 *100 / qtdVotos;                 
                       break;
              
                   case 2 :
                       System.out.println("OK Voto Contabilizado ! ");
                       System.out.println("");                           
                       candidato2 =++candidato2;
                       totalPorcent2 = candidato2*100 / qtdVotos;
                       break;
                       
                    default :
                       // nulo=++nulo;
                        System.out.println("Voto Inválido e não contabilizado, Votos Válidos somente entre números  1 e 2 "); 
                       break;
               }
           
           }
                     
                    System.out.println(""); 
                    System.out.println("Votação Encerrada !!!"); 
                    System.out.println("Votos desta seção:  Total de   "+ qtdVotos + " " + "Votos !"); 
                    System.out.println("");   
                    System.out.println("Candidato 01 - Zé da Farmácia com : " + candidato1 + " "+ "Votos" + " "+ " e " + totalPorcent1+"% "+ "dos Votos válidos pelos Eleitores. ");
                    System.out.println("");
                    System.out.println("Candidato 02 - Rita da Padaria  : " + candidato2 + " "+ "Votos" + " "+ " e " + totalPorcent2+"% "+ "dos Votos válidos pelos Eleitores.");
                    System.out.println(""); 
                   // nulo = qtdVotos -candidato1 -candidato2 ;
                    //nuloB = nulo *100/qtdVotos;
                    //System.out.println("Votos Nulos/Brancos: " + nulo + " voto(s)" + nuloB + " %  " + "do Total de Votos"   );     
    }
  
}
