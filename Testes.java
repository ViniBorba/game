import java.util.Random;

class Dados {



			public static void main(String[] args) {



				Dados d6 = new Dados();


				for(int i = 0; i < 2; i++){	
				System.out.println(d6.sorteiaDadoD20()+1);
				}
			
				d6.mago();

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


	void mago(){
		System.out.println("                 *8           \n                8@#           \n               ^8@@           \n              ^88#&*          \n            *&&8@@$88^        \n     888     8@$@@$$&         \n    8|8$8    @8&8|$8&&        \n    $& 8&    8@|$8#8          \n    @88      &|8##$8@         \n     8@$     ^@$88$@8&        \n     @@8    &8888$@8#^        \n     ^$    8@$|$$|#@@8        \n      @     ^$$^8@88$$        \n     &@^&8^8@|#&@8888#&       \n     8@@8@@&$|$@|8&888        \n      @&    $|$$||&88#        \n      8     $$$$@|8^8#        \n      &    8#@8$$$|&8#        \n      8    @8@8@$8@8&88       \n      8    @$88@$&&@&8@       \n      8    $$&8#|8 #8&@@      \n      8^   #|&8#||^8@8#       \n      8^  &8|888@|88@888      \n      8^  8#|8^8@|@&8@8@      \n      8& 88#&88$@@88@@888     \n      88 8#@& @$^  8#@8#@^    \n      #8    & @$    @|#&@^    \n      @&     $$$^   8$@       \n      &&  ^&8@$$^   @@@       \n       ^  8@@||$^   8#@       \n          ^888&    88@@       \n                  8@@$|       \n                   888^       \n");
	}







}


