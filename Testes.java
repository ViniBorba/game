import java.util.Random;

class Dados  {



			public static void main(String[] args) throws InterruptedException {

				Heroi heroiDoJogo = new Heroi();

				heroiDoJogo.recebeLetra("g");


				/*
				Dados d6 = new Dados();

				for(int i = 0; i < 70; i++){
					System.out.println();
				}

				d6.lento("Este é um mundo onde não se mede o tempo.");
				System.out.println();
				Thread.sleep(300);

				d6.lento("Um mundo onde a magia, a força e a coragem são suas maiores armas.");
				System.out.println();
				Thread.sleep(300);

				d6.lento("Um mundo além, muito além.");
				System.out.println();
				Thread.sleep(300);

				d6.lento("Onde os Deuses e Deusas, Herois e Vilões, Monstros e Aberrações vivem.");
				System.out.println();
				Thread.sleep(300);

				d6.lento("Mas nada se compara ao que está por vir");
				Thread.sleep(800);
				System.out.print(".");
				Thread.sleep(800);
				System.out.print(".");
				Thread.sleep(800);
				System.out.print(".");
				System.out.println();
				
				Thread.sleep(2000);

				d6.nomeDoJogo();

				Thread.sleep(2000);

				//Mostra mago e guerreiro juntos
				System.out.println("                 *8           |                ..            \n                8@#           |           #   .8@@           \n               ^8@@           |            #  .##8@ #        \n              ^88#&*          |             #.#88@@88        \n            *&&8@@$88^        |            . #888@@@888.     \n     888     8@$@@$$&         |           88..@888@@8@@8.    \n    8|8$8    @8&8|$8&&        |          .88#.#888@8@@88#    \n    $& 8&    8@|$8#8          |          8@@@8888#8@@@@@8    \n    @88      &|8##$8@         |          #8@@8888888@@@@8    \n     8@$     ^@$88$@8&        |          #888888888@#.@8@8   \n     @@8    &8888$@8#^        |        .##88@@@@@@8@. 8@@@   \n     ^$    8@$|$$|#@@8        |        8@@@8@@@@@@@@8  @@@   \n      @     ^$$^8@88$$        |        8@8@@8@@8@@8@8  #@@   \n     &@^&8^8@|#&@8888#&       |        @@@8@@@@@@@@@@# #@@   \n     8@@8@@&$|$@|8&888        |        @@8#@@@@@@@@@@8 #@@   \n      @&    $|$$||&88#        |        888@@@@@@@@@@@@##88   \n      8     $$$$@|8^8#        |        8#.@@@@@@@@@8@@@.#.   \n      &    8#@8$$$|&8#        |       ##  8@@@@@@@@@@@@8     \n      8    @8@8@$8@8&88       |       8   @@@@@@@@@@8@@8     \n      8    @$88@$&&@&8@       |   ##.88   8@@88@@@@@@@@8     \n      8    $$&8#|8 #8&@@      |   .@@8.#8 88@@8@88@@@@@      \n      8^   #|&8#||^8@8#       |    #@@ 8@ 8@@@@88@@@@@@      \n      8^  &8|888@|88@888      |    8@@8@@. @@@@@@8@8@@@      \n      8^  8#|8^8@|@&8@8@      |    # @@@@. 8@@88@@@.8@@      \n      8& 88#&88$@@88@@888     |      8@@8  .@@. .88  @@.     \n      88 8#@& @$^  8#@8#@^    |     8@@8.  .@@      .@@8     \n      #8    & @$    @|#&@^    |     #@8    @@@.      8@@     \n      @&     $$$^   8$@       |           #@@@       8@@.    \n      &&  ^&8@$$^   @@@       |          #888#       #@@#    \n       ^  8@@||$^   8#@       |         #^^@@@      8@@@@#   \n          ^888&    88@@       |                              \n                  8@@$|       |                              \n                   888^       |                              \n");

				//for(int i = 0; i < 2; i++){	
				//System.out.println(d6.sorteiaDadoD20()+1);
				//}
			
				

				//String valor = "uma palavra escrita lentamente.";

				//d6.lento("uma palavra escrita lentamente.");
		
				
				System.out.println();
				

				//d6.guerreiro();
				//d6.mago();
			*/
			}
	

	//Metodo que pega uma frase e escreve ela lentamente.
	void lento(String valor)throws InterruptedException{

		for(char c: valor.toCharArray()){
					System.out.print(c);
					Thread.sleep(125);
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


	void mago(){
		System.out.println("                 *8           \n                8@#           \n               ^8@@           \n              ^88#&*          \n            *&&8@@$88^        \n     888     8@$@@$$&         \n    8|8$8    @8&8|$8&&        \n    $& 8&    8@|$8#8          \n    @88      &|8##$8@         \n     8@$     ^@$88$@8&        \n     @@8    &8888$@8#^        \n     ^$    8@$|$$|#@@8        \n      @     ^$$^8@88$$        \n     &@^&8^8@|#&@8888#&       \n     8@@8@@&$|$@|8&888        \n      @&    $|$$||&88#        \n      8     $$$$@|8^8#        \n      &    8#@8$$$|&8#        \n      8    @8@8@$8@8&88       \n      8    @$88@$&&@&8@       \n      8    $$&8#|8 #8&@@      \n      8^   #|&8#||^8@8#       \n      8^  &8|888@|88@888      \n      8^  8#|8^8@|@&8@8@      \n      8& 88#&88$@@88@@888     \n      88 8#@& @$^  8#@8#@^    \n      #8    & @$    @|#&@^    \n      @&     $$$^   8$@       \n      &&  ^&8@$$^   @@@       \n       ^  8@@||$^   8#@       \n          ^888&    88@@       \n                  8@@$|       \n                   888^       \n");
	}

	void guerreiro(){
		System.out.println("                ..            \n           #   .8@@           \n            #  .##8@ #        \n             #.#88@@88        \n            . #888@@@888.     \n           88..@888@@8@@8.    \n          .88#.#888@8@@88#    \n          8@@@8888#8@@@@@8    \n          #8@@8888888@@@@8    \n          #888888888@#.@8@8   \n        .##88@@@@@@8@. 8@@@   \n        8@@@8@@@@@@@@8  @@@   \n        8@8@@8@@8@@8@8  #@@   \n        @@@8@@@@@@@@@@# #@@   \n        @@8#@@@@@@@@@@8 #@@   \n        888@@@@@@@@@@@@##88   \n        8#.@@@@@@@@@8@@@.#.   \n       ##  8@@@@@@@@@@@@8     \n       8   @@@@@@@@@@8@@8     \n   ##.88   8@@88@@@@@@@@8     \n   .@@8.#8 88@@8@88@@@@@      \n    #@@ 8@ 8@@@@88@@@@@@      \n    8@@8@@. @@@@@@8@8@@@      \n    # @@@@. 8@@88@@@.8@@      \n      8@@8  .@@. .88  @@.     \n     8@@8.  .@@      .@@8     \n     #@8    @@@.      8@@     \n           #@@@       8@@.    \n          #888#       #@@#    \n                              \n");
	}

	void nomeDoJogo(){
		System.out.println("                                                                    \n ____      ____  ____  _________________      _____        ______   \n|    |    |    ||    |/                 \\ ___|\\    \\   ___|\\     \\  \n|    |    |    ||    |\\______     ______//    /\\    \\ |     \\     \\ \n|    |    |    ||    |   \\( /    /  )/  |    |  |    ||     ,_____/|\n|    |    |    ||    |    ' |   |   '   |    |__|    ||     \\--'\\_|/\n|    |    |    ||    |      |   |       |    .--.    ||     /___/|  \n|\\    \\  /    /||    |     /   //       |    |  |    ||     \\____|\\ \n| \\ ___\\/___ / ||____|    /___//        |____|  |____||____ '     /|\n \\ |   ||   | / |    |   |`   |         |    |  |    ||    /_____/ |\n  \\|___||___|/  |____|   |____|         |____|  |____||____|     | /\n    \\(    )/      \\(       \\(             \\(      )/    \\( |_____|/ \n     '    '        '        '              '      '      '    )/    \n....................................................................\n                +  DOMINUS  +  VITAE   +  MORTEM  +                 \n....................................................................\n");
	}



}

/*
#heroi
*/

class Heroi{

	private String nomeDoHeroi;
	private int forcaDoHeroi;
	private int defesaDoHeroi;
	private int poderMagicoDoHeroi;

	
		void recebeLetra (String letra){
			if(letra == "m" || letra == "M"){




				System.out.println("Mago");
				//return;
			}
				else if (letra == "g" || letra == "G"){
					System.out.println("Guerreiro");
					
				}
					else{
						System.out.println("Volta");
						
					}
		
		}
}
