public class OlaMundo {
    public static void main(String[] args){
	int acessoAoLink = 13;

	acessoAoLink++;

	int novoContagemAcessoAoLink = acessoAoLink++;

	System.out.println("O total de acessos ao link: " + acessoAoLink);
	System.out.println("Novo: " + novoContagemAcessoAoLink);
    }
}