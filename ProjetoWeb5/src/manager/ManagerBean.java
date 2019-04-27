package manager;


/*
 * entrada > controller > saída
 * 
 */


import java.util.ArrayList;
import java.util.List;
import entity.Usuario;


public class ManagerBean {

	public static List<Usuario> usuarios = new ArrayList<Usuario>();

	// Uso do mock para não precisar acessar banco de dados
	static {
		usuarios.add(new Usuario(1, "Carlos", "carlos@gmail.com", "123", "https://randomuser.me/api/portraits/men/81.jpg"));
		usuarios.add(new Usuario(2, "Igor", "igor@gmail.com", "456", "https://randomuser.me/api/portraits/women/91.jpg"));
		usuarios.add(new Usuario(3, "Cláudia", "claudia@gmail.com", "789", "https://randomuser.me/api/portraits/men/81.jpg"));
	}
	
	
	public static Usuario validarLoginSenha(Usuario u) {
		
		Usuario resposta = usuarios.stream().filter(x -> x.getEmail().equals(u.getEmail()) &
							x.getSenha().equals(u.getSenha())).findAny().orElseThrow(()
							-> new IllegalArgumentException("Usuário não encontrado"));
							return resposta;
	}
	
	
	public static Usuario validarLoginSenha2(String login, String senha) {
		
		Usuario resposta = usuarios.stream().filter
				(x -> x.getEmail().equals(login)&
						x.getSenha().equals(senha)).findAny().
				orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));
						return resposta;
	}
	
	public static void main(String[] args) {
		System.out.println(ManagerBean.usuarios);
		System.out.println(ManagerBean.validarLoginSenha2("carlos@gmail.com", "123"));
	}
}