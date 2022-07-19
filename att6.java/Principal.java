
public class Principal {
    public static void main(String[] args){
        double valorTotal = 1000.0;
        double entrada = 100.0;
        int parcelas = 10;
        
        try{
            Teste t = new Teste(valorTotal, entrada, parcelas);
            System.out.println(t.prestacao());
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
