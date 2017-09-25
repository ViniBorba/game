import java.util.Random;

class Dados {



			public static void main(String[] args) {



				Dados d6 = new Dados();


				for(int i = 0; i < 50; i++){	
				System.out.println(d6.sorteiaDadoD20()+1);
				}
			
			}
	





	//int é o objeto do array dado6
	 public int sorteiaDadoD6(){
		
		Random radom  = new Random();

		return radom.nextInt(6);

	}

	public int sorteiaDadoD20(){

		//int aux;
		Random radom  = new Random();

		return radom.nextInt(20);
	}


	void muda(){
		System.out.println("Olá");
	}







}


