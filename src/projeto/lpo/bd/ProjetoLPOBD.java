package projeto.lpo.bd;

public class ProjetoLPOBD {

    public static void main(String[] args) {
        
        // instanciando um objeto
        UICadastroCliente formularioCadastro = new UICadastroCliente();
        formularioCadastro.setVisible(true);
        Pessoa cliente = new Pessoa(formularioCadastro.nome, formularioCadastro.cpf,
                "Masculino", formularioCadastro.endereco, formularioCadastro.cidade,
                formularioCadastro.estado);
        
    }
    
}
