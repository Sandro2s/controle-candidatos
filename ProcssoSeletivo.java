//package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcssoSeletivo {
    public static void main(String[] args) {
       String[] candidatos = {"Felipe","Julia","Paulo","Augusto"};
       for (String candidato:candidatos){
            entrandoEmContato(candidato) ;

       }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando;
        boolean atendeu=false;
        do { 
            atendeu=atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                 tentativasRealizadas++;
                 else
                   System.out.println("Contato Realizado com sucesso");
        } while (continuarTentando && tentativasRealizadas<3);
        if(atendeu)
            System.out.println("Conseguimos contato com "+ candidato + " NA " + tentativasRealizadas);
            else 
               System.out.println(" Não conseguimos contato com " + candidato +", numero maximo tentativas  "+ tentativasRealizadas +"  realizada  ");
    }

    //método auxiliar
    static boolean  atender(){
        return new Random().nextInt(3)==1;
     }




    static void imprimirSelecionados(){
        String[]candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0;indice < candidatos.length;indice++){
            System.out.println("O candidato de n° " + (indice+1) + " é o "+candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
         for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
         }

    }

    static void selecaoCandidatos(){
         // Array com a lista de candidatos
       String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
       int candidatosSelecionados = 0;
       int candidatosAtual=0;
       double salarioBase = 2000.0;
       while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato  " + candidato + "  solicitou este valor de salario " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato  "+ candidato + "  foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
       }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }


    //metodo de analise de candidatos
    static void  analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o Candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
