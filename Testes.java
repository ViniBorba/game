import java.util.Random;

class Dados {



			public static void main(String[] args) {



				Dados d6 = new Dados();


				for(int i = 0; i < 50; i++){	
				System.out.println(d6.sorteiaDado());
				}
			
			}
	





	//int é o objeto do array dado6
	 int sorteiaDado(){

		//int[] dado6  = new int[6];

		int aux = 1;
		Random radom  = new Random();

		return aux = 1 + radom.nextInt(6);

		//System.out.println(aux);
		
		//for(int i = 0; i < 6; i++){
		//	 dado6[i] = i +1 ;
		//}

	}

	void muda(){
		System.out.println("Olá");
	}







}


