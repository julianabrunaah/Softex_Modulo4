
public class Teste {
    public Double valorTotal;
    public Double entrada;
    public Integer parcelas;
    
    public Teste(Double valorTotal, Double entrada, Integer parcelas){
        
        if(entrada < valorTotal * 0.2){
            throw new RuntimeException("Operação não autorizada. Entrada deve ser pelo menos 20% do valor total");
        }
        else if(parcelas < 6){
            throw new RuntimeException("Operação não autorizada. Aumente o número de parcelas");
        }
        
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }
    public double prestacao(){
        return (valorTotal - entrada) / parcelas;
    }
}
