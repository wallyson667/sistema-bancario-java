package MeuBanco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Integer valor){
        super(valor);
    }

    // Sobrescrevendo
    @Override
    public void visualizar(){
        super.visualizar();
        // Adicionando comportamento
        System.out.println(" (Tipo: C) R$ " + getValor());
    }
}