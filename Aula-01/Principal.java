import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Principal{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();

        Pessoa obj1 = new Pessoa("Geizi",35);
        Pessoa obj2 = new Pessoa();
        Pessoa obj3 = new Pessoa();

        System.out.println("Nome: " + obj1.getNome());
        System.out.println("Idade: " + obj1.getIdade());

        System.out.println("Digite o nome: ");
        obj3.setNome(input.nextLine());

        System.out.println("Digite a idade: ");
        obj3.setIdade (input.nextInt());

       System.out.println(obj1.toString());
       System.out.println(obj1.toString());
       System.out.println(obj1.toString());

       listaP.add(obj1);
       listaP.add(obj2);
       listaP.add(obj3);

       for(Pessoa auxPessoa: listaP){
        System.out.println(auxPessoa.toString());
        }
        

        System.out.println(listaP.get(1).setNome(null));

       
        
    }
}