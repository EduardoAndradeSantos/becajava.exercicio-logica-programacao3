import java.util.Scanner;

public class Conversor {
	public Scanner Ler = new Scanner(System.in);
	public double Celcius;
	public double Fire;
	public double Conversao;
	public double Opcao;

	public void GravaCelcius() {
		System.out.println("!! Se não quiser uma temperatura digite 0 !! ");
		System.out.printf("Digite temperatura em ceucius: ");
		Celcius = (double) Ler.nextDouble();
	}

	public void GravaFire() {
		System.out.printf("Digite temperatura em fire: ");
		Fire = (double) Ler.nextDouble();
	}

	public void SelecionaOpcao() {
		System.out.printf("Converter de C pra F digite opção 1 ou F para C digite 2: ");
		Opcao = (double) Ler.nextDouble();
	}

	public void CalculaConversao() {
		if (Opcao == 1) {
			Conversao = ((Celcius * 1.8) + 32);
			System.out.println("resultado C>F: " + Conversao);
		} else if (Opcao == 2) {
			Conversao = ((Fire - 32) / 1.8);
			System.out.println("resultado F>C: " + Conversao);
		}

	}
}
