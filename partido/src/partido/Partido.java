package partido;

public class Partido {

	public static void main(String[] args) {
		
		String partido1 = "pstu";
		String partido2 =  "pt"; 
		
		String num_candidato = "13789"; // seu input sua entrada da dados aqui, so um exemplo 
		String num_partido;
		
		num_partido = num_candidato.substring(0,2);
		
		if(num_partido.equals("16")){
			System.out.print("-->"+partido1);
		}else if(num_partido.equals("13")) {
			System.out.print("-->"+partido2);
			
		}
		// TODO Auto-generated method stub

	}

}
