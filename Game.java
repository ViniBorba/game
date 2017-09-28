import java.util.Random;
import java.util.Scanner;

class Game  {



			public static void main(String[] args) throws InterruptedException {

				Heroi heroiDoJogo = new Heroi();

				heroiDoJogo.recebeHeroi("m");




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

/*
#heroi
*/


class Heroi{

	private static String nomeDoHeroi;
	private static int forcaDoHeroi;
	private static int defesaDoHeroi;
	private static int poderMagicoDoHeroi;
	private static int moedasDoHerois;

	
		//Metodo para iniciar o Herois, depedendo da escolha do jogador
		void recebeHeroi (String letra)throws InterruptedException{
			FormataString formata = new FormataString();//objeto da classe que formata String
			Scanner entrada = new Scanner(System.in);//salva atributos do heroi
			Equipamentos equipamentos = new Equipamentos();//Equipamentos do Heroi
			MostraInventario invetario = new MostraInventario();// mostra os atributos e equipamentos.

			if(letra == "m" || letra == "M"){
				formata.lento("Você escolheu o Mago.\n");
				formata.lento("Escolha um nome para o seu Heroi: ");
				this.nomeDoHeroi = entrada.next();

				poderMagicoDoHeroi = 6;
				forcaDoHeroi = 2;
				defesaDoHeroi = 2;
				moedasDoHerois = 0;

				//Equipamentos
				equipamentos.cajadoSimples();

				formata.lento("Sua maior força é a Magia.\n");
				formata.lento("Seus atributos: ");
				invetario.mostrarAtributos();

			
				//setar o nome
				//this.nomeDoHeroi = entrada.next();
				//System.out.println(this.nomeDoHeroi);

				
			}
				else if (letra == "g" || letra == "G"){
					formata.lento("Você escolheu ser Geurreiro\n");
					
				}
					else{
						formata.lento("Volta seu feio\n");
						
					}
		
		}

		void setpoderMagicoDoHeroi(int poder){
			this.poderMagicoDoHeroi += poder;
		}
		int getpoderMagicoDoHeroi(){
			return this.poderMagicoDoHeroi;
		}
}


/*
#formata #lento #formatastring
*/

class FormataString{

	//Metodo que pega uma frase e escreve ela lentamente.
	void lento(String valor)throws InterruptedException{

		for(char c: valor.toCharArray()){
					System.out.print(c);
					Thread.sleep(125);
				}
	}


}

/*
#imagem
*/
class Imagens{

		//Método para mostrar a imagem do nome do Jogo
	void nomeDoJogoImagem(){
		System.out.println("                                                                    \n ____      ____  ____  _________________      _____        ______   \n|    |    |    ||    |/                 \\ ___|\\    \\   ___|\\     \\  \n|    |    |    ||    |\\______     ______//    /\\    \\ |     \\     \\ \n|    |    |    ||    |   \\( /    /  )/  |    |  |    ||     ,_____/|\n|    |    |    ||    |    ' |   |   '   |    |__|    ||     \\--'\\_|/\n|    |    |    ||    |      |   |       |    .--.    ||     /___/|  \n|\\    \\  /    /||    |     /   //       |    |  |    ||     \\____|\\ \n| \\ ___\\/___ / ||____|    /___//        |____|  |____||____ '     /|\n \\ |   ||   | / |    |   |`   |         |    |  |    ||    /_____/ |\n  \\|___||___|/  |____|   |____|         |____|  |____||____|     | /\n    \\(    )/      \\(       \\(             \\(      )/    \\( |_____|/ \n     '    '        '        '              '      '      '    )/    \n....................................................................\n                +  DOMINUS  +  VITAE   +  MORTEM  +                 \n....................................................................\n");
	}

	//Metodo para mostrar a imagem do Mago
	void magoImagem(){
		System.out.println("                 *8           \n                8@#           \n               ^8@@           \n              ^88#&*          \n            *&&8@@$88^        \n     888     8@$@@$$&         \n    8|8$8    @8&8|$8&&        \n    $& 8&    8@|$8#8          \n    @88      &|8##$8@         \n     8@$     ^@$88$@8&        \n     @@8    &8888$@8#^        \n     ^$    8@$|$$|#@@8        \n      @     ^$$^8@88$$        \n     &@^&8^8@|#&@8888#&       \n     8@@8@@&$|$@|8&888        \n      @&    $|$$||&88#        \n      8     $$$$@|8^8#        \n      &    8#@8$$$|&8#        \n      8    @8@8@$8@8&88       \n      8    @$88@$&&@&8@       \n      8    $$&8#|8 #8&@@      \n      8^   #|&8#||^8@8#       \n      8^  &8|888@|88@888      \n      8^  8#|8^8@|@&8@8@      \n      8& 88#&88$@@88@@888     \n      88 8#@& @$^  8#@8#@^    \n      #8    & @$    @|#&@^    \n      @&     $$$^   8$@       \n      &&  ^&8@$$^   @@@       \n       ^  8@@||$^   8#@       \n          ^888&    88@@       \n                  8@@$|       \n                   888^       \n");
	}

	//Metodo para mostrar a imagem do Guerreiro
	void guerreiro(){
		System.out.println("                ..            \n           #   .8@@           \n            #  .##8@ #        \n             #.#88@@88        \n            . #888@@@888.     \n           88..@888@@8@@8.    \n          .88#.#888@8@@88#    \n          8@@@8888#8@@@@@8    \n          #8@@8888888@@@@8    \n          #888888888@#.@8@8   \n        .##88@@@@@@8@. 8@@@   \n        8@@@8@@@@@@@@8  @@@   \n        8@8@@8@@8@@8@8  #@@   \n        @@@8@@@@@@@@@@# #@@   \n        @@8#@@@@@@@@@@8 #@@   \n        888@@@@@@@@@@@@##88   \n        8#.@@@@@@@@@8@@@.#.   \n       ##  8@@@@@@@@@@@@8     \n       8   @@@@@@@@@@8@@8     \n   ##.88   8@@88@@@@@@@@8     \n   .@@8.#8 88@@8@88@@@@@      \n    #@@ 8@ 8@@@@88@@@@@@      \n    8@@8@@. @@@@@@8@8@@@      \n    # @@@@. 8@@88@@@.8@@      \n      8@@8  .@@. .88  @@.     \n     8@@8.  .@@      .@@8     \n     #@8    @@@.      8@@     \n           #@@@       8@@.    \n          #888#       #@@#    \n                              \n");
	}

	//Mostra mago e guerreiro juntos
	void guerreiroEMagoImagem(){
				System.out.println("                 *8           |                ..            \n                8@#           |           #   .8@@           \n               ^8@@           |            #  .##8@ #        \n              ^88#&*          |             #.#88@@88        \n            *&&8@@$88^        |            . #888@@@888.     \n     888     8@$@@$$&         |           88..@888@@8@@8.    \n    8|8$8    @8&8|$8&&        |          .88#.#888@8@@88#    \n    $& 8&    8@|$8#8          |          8@@@8888#8@@@@@8    \n    @88      &|8##$8@         |          #8@@8888888@@@@8    \n     8@$     ^@$88$@8&        |          #888888888@#.@8@8   \n     @@8    &8888$@8#^        |        .##88@@@@@@8@. 8@@@   \n     ^$    8@$|$$|#@@8        |        8@@@8@@@@@@@@8  @@@   \n      @     ^$$^8@88$$        |        8@8@@8@@8@@8@8  #@@   \n     &@^&8^8@|#&@8888#&       |        @@@8@@@@@@@@@@# #@@   \n     8@@8@@&$|$@|8&888        |        @@8#@@@@@@@@@@8 #@@   \n      @&    $|$$||&88#        |        888@@@@@@@@@@@@##88   \n      8     $$$$@|8^8#        |        8#.@@@@@@@@@8@@@.#.   \n      &    8#@8$$$|&8#        |       ##  8@@@@@@@@@@@@8     \n      8    @8@8@$8@8&88       |       8   @@@@@@@@@@8@@8     \n      8    @$88@$&&@&8@       |   ##.88   8@@88@@@@@@@@8     \n      8    $$&8#|8 #8&@@      |   .@@8.#8 88@@8@88@@@@@      \n      8^   #|&8#||^8@8#       |    #@@ 8@ 8@@@@88@@@@@@      \n      8^  &8|888@|88@888      |    8@@8@@. @@@@@@8@8@@@      \n      8^  8#|8^8@|@&8@8@      |    # @@@@. 8@@88@@@.8@@      \n      8& 88#&88$@@88@@888     |      8@@8  .@@. .88  @@.     \n      88 8#@& @$^  8#@8#@^    |     8@@8.  .@@      .@@8     \n      #8    & @$    @|#&@^    |     #@8    @@@.      8@@     \n      @&     $$$^   8$@       |           #@@@       8@@.    \n      &&  ^&8@$$^   @@@       |          #888#       #@@#    \n       ^  8@@||$^   8#@       |         #^^@@@      8@@@@#   \n          ^888&    88@@       |                              \n                  8@@$|       |                              \n                   888^       |                              \n");
	}
}

/*
#armas #equipamentos
*/
class Equipamentos{

	Heroi heroiDoJogo = new Heroi();

	void cajadoSimples(){
		heroiDoJogo.setpoderMagicoDoHeroi(1);		

	}
	void getcajadoSimples(){
		System.out.println("-> Cajado simples (+1 de Poder Mágico)");
	}
}


/*
#MostraInventario #invetario
*/
class MostraInventario{

	Equipamentos equipamentos = new Equipamentos();//Equipamentos do Heroi
	Heroi heroiDoJogo = new Heroi();

	void mostrarAtributos(){
		//System.out.println(heroiDoJogo.getpoderMagicoDoHeroi());
		System.out.println("\n \n+---------------------------+\n|Força Bruta: \n|Defesa de Armadura:   \n|Poder Mágico: "+heroiDoJogo.getpoderMagicoDoHeroi()+"\n|                       \n|Coins:                \n+---------------------------+\n");
	}

}