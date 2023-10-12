import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intro {

    public static Scanner in = new Scanner(System.in);
    static List<Person> people = new ArrayList<Person>();
    
    public static void main(String[] args) {
        System.out.println("============== Cadastrar pessoa ==============");

        while (true) {
            createPerson();

            for(int i = 0; i < 10; i++) {
                System.out.print(" ");
            }
            
            System.out.println("Pessoas cadastradas:");
            System.out.println();

            System.out.println(String.format("%-20s %-10s %s", "Nome", "Idade", "Gênero"));
            System.out.println("-------------------- ---------- ----------");


            for(Person person: people) {
                System.out.println(person.toString());
            }
        }
       
    }

    public static void createPerson() {
        System.out.println("\nNome:");
        String nome = in.nextLine();

        System.out.println("Idade:");
        Integer age = in.nextInt();

        in.nextLine();
        
        System.out.println("Gênero:");
        String gender = in.nextLine();

        Person person = new Person(nome, age, gender);
        
        people.add(person);
    }

}