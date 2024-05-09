package sistema.armazena;

public class App {

	public static void main(String[] args) {
		Diretorio c = new Diretorio();
		c.setNome("c:");
		Arquivo page = new Arquivo();
		page.setNome("pagefile.sys");
		page.setTamanho(1000000);
		c.getElementos().add(page);
		
		Diretorio windows = new Diretorio();
		windows.setNome("windows");
		c.getElementos().add(windows);
		Arquivo explorer = new Arquivo();
		explorer.setNome("explorer.exe");
		explorer.setTamanho(4624);
		windows.getElementos().add(explorer);
		Arquivo calc = new Arquivo();
		calc.setNome("calc.exe");
		calc.setTamanho(27);
		windows.getElementos().add(calc);
		
		Diretorio system = new Diretorio();
		system.setNome("system32");
		windows.getElementos().add(system);
		Arquivo shell = new Arquivo();
		shell.setNome("shell32.dll");
		shell.setTamanho(7257);
		system.getElementos().add(shell);
		
		Diretorio usuario = new Diretorio();
		usuario.setNome("usuario");
		c.getElementos().add(usuario);
		Diretorio aluno = new Diretorio();
		aluno.setNome("aluno");
		usuario.getElementos().add(aluno);
		System.out.println("[c:]="+c.espaço());
		System.out.println("[c:\\windows]="+windows.espaço());
		System.out.println("[c:\\windows\\system]="+system.espaço());
		
	}

}
