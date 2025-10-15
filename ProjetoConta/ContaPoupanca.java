package MeuBanco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Integer valor){
        super(valor);
    }

    //Sobrescrevendo
    @Override
    public void visualizar(){
        // Chamamos o método da classe pai para mostrar o valor.
        super.visualizar();
        // Adicionando comportamento
        System.out.println(" (Tipo: P) R$ " + getValor());
    }
}