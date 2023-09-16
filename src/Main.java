
public class Main {

	public static void main(String[] args) {
		
		TomadaDeTresPinos t3 = new TomadaDeTresPinos();
		
		AdapterTomada adaptador = new AdapterTomada(t3);
		adaptador.ligarNaTomadaDeDoisPinos();

	}

}
