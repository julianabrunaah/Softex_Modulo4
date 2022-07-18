import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		 int a, b;
		 System.out.printf("Insira o valor de a");
		 a = ler.nextInt();
		 System.out.printf("Insira o valor de b");
		 b = ler.nextInt();
		 try {
		     System.out.println(a / 0);
		     System.out.println(b / 0);
		     
		 } catch(Exception e) {
		     System.out.println("Erro " + exception.getMassage());
		 }
		 System.out.println("Fim");
