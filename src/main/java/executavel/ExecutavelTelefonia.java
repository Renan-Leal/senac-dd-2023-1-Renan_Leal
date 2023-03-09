package executavel;

import java.util.ArrayList;
import java.util.List;

import model.vo.telefonia.Cliente;
import model.vo.telefonia.Endereco;
import model.vo.telefonia.Telefone;

public class ExecutavelTelefonia {

	public static void main(String[] args) {
		
		
		Endereco endereco1 = new Endereco("88000123", "Mauro Ramos", "10", "Centro", "Florianópolis", "SC");
 		
		List<Telefone> telefonesDoPele;
		
		List<Telefone> telefonesDoSocrates = new ArrayList<Telefone>();
		telefonesDoSocrates.add(new Telefone("48", "323228888", true, false));
		
		
		
		
		Cliente pele = new Cliente("Edson Arantes", "11122233344", null, true, endereco1);
	    Cliente socrates= new Cliente("Sócrates Brasileiro", "33322233344", telefonesDoSocrates, true, endereco1);
	    
	    
	    List<Cliente> clientes = new ArrayList<Cliente>();
	    clientes.add(pele);
	    clientes.add(socrates);
	    
	    for (Cliente cliente : clientes) {
	    	System.out.println(cliente.toString());
			
		}

	}

}
