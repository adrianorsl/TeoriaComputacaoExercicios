
public class Verificador {

	
	private String a;

	
	public String getA() {
		return a;
	}

	public void setA(String a) {
		for(int x = 0; x < a.length(); x++) {
			if ((a.charAt(x) == '0') || (a.charAt(x) == '1')) {
				this.a = a;
			}
		}
		
		
	}
	
	public String  verificador(String a) {
		String aux = getA();
		String resultado = "";
		boolean f = false;
		if (aux.charAt(0) == '1') {
			resultado = "Rejeitado";
			return resultado;
		}else if (aux.charAt(1) == '0'){
			resultado = "Rejeitado";
			return resultado;
		}else if (aux.charAt(aux.length() - 1) == '1'){
			resultado = "Rejeitado";
			return resultado;
		}else if ((aux.charAt(aux.length() - 1) == '0') && (aux.charAt(aux.length() - 2) == '0')) {
			resultado = "Rejeitado";
			return resultado;
		}else {
			for(int i = 1; i < aux.length() - 1; i++) {
				if(aux.charAt(i) != '1') {
					resultado = "Rejeitado";
					f = true;
				}else if (f == false){
					resultado = "Aceito";
				}	
			}
			return resultado;
		}
		
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Verificador [a=");
		builder.append(a);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
