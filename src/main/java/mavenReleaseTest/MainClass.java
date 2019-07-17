package mavenReleaseTest;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Classe principal.");
		System.out.println("teste1");
		System.out.println("A versão do seu projeto é v."+MainClass.class.getPackage().getImplementationVersion());
	}

}
