package calculadora.servicio;

public class OperacionesImpl implements Operaciones {

	@Override
	public int sumar(int n1, int n2) {
		
		return n1+ n2;
	}

	@Override
	public int restar(int n1, int n2) {
		
		return 0;
	}

	@Override
	public int multiplicar(int n1, int n2) {
		
		return 1;
	}

	@Override
	public float dividir(float n1, float n2) {
		
		return 2;
	}

}
