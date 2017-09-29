import java.util.Random;
import java.util.Scanner;

class Game  {



			public static void main(String[] args) throws InterruptedException {

				Heroi heroiDoJogo = new Heroi();
				MostraInventario mostra = new MostraInventario();

				heroiDoJogo.recebeHeroi("m");

				EquipamentoArma cajadoMelhor = new EquipamentoArma("cajado Melhor", 4);
				cajadoMelhor.setaumentaPoderMagico(4);

				mostra.mostrarAtributos();
				mostra.mostraArma();




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
	private static EquipamentoArma armaDoHeroi;
	//private static Equipamentos armaduraDoHeroi;

	
		//Metodo para iniciar o Herois, depedendo da escolha do jogador
		void recebeHeroi (String letra)throws InterruptedException{
			FormataString formata = new FormataString();//objeto da classe que formata String
			Scanner entrada = new Scanner(System.in);//salva atributos do heroi
			//Equipamentos equipamentos = new Equipamentos();//Equipamentos do Heroi
			
			MostraInventario invetario = new MostraInventario();// mostra os atributos e equipamentos.

			if(letra == "m" || letra == "M"){
				formata.lento("Você escolheu o Mago.\n");
				formata.lento("Escolha um nome para o seu Heroi: ");
				this.nomeDoHeroi = entrada.next();

				poderMagicoDoHeroi = 6;
				forcaDoHeroi = 2;
				defesaDoHeroi = 2;
				moedasDoHerois = 0;
				EquipamentoArma cajadoSimplorio = new EquipamentoArma("Cajado Simples",1);

				//Equipamentos
				//equipamentos.cajadoSimples();
				cajadoSimplorio.setaumentaPoderMagico(1);
				//cajadoSimplorio.setdescreveArma("Cajado Simples");
				cajadoSimplorio.setaumentaArmadura(10);

				//System.out.println("Poder do cajado: "+cajadoSimplorio.getaumentaPoderMagico());

				formata.lento("Sua maior força é a Magia.\n");
				formata.lento("Seus atributos: ");
				invetario.mostrarAtributos();
				invetario.mostraArma();
				
			}	
				else if (letra == "g" || letra == "G"){
					formata.lento("Você escolheu ser Geurreiro\n");
					
				}
					else{
						formata.lento("Volta seu feio\n");
						
					}
		
		}

		//GET para mostrar atributos e SET para mudar os atributos
		
		//Get mostra nome do Heroi
		public String getnomeDoHeroi(){
			return this.nomeDoHeroi;
		}

		//set voi para mudar a força e get int para mostrar retornar a força
		public void setforcaDoHeroi(int recebe){
			this.forcaDoHeroi += recebe;
		}
		public int getforcaDoHeroi(){
			return this.forcaDoHeroi;
		}

		//set void para mudar a defesa e get int para mostrar a defesa
		public void setdefesaDoHeroi(int recebe){
			this.defesaDoHeroi += recebe;
		}
		public int getdefesaDoHeroi(){
			return this.defesaDoHeroi;
		}

		//set void para mudar o porder mágico e get int para mostrar
		public void setpoderMagicoDoHeroi(int recebe){
			this.poderMagicoDoHeroi += recebe;
		}
		public int getpoderMagicoDoHeroi(){
			return this.poderMagicoDoHeroi;
		}

		//void seta para receber valor de moedas get int para mostrar quantas moedas tem
		public void setmoedasDoHeroi(int recebe){
			this.moedasDoHerois += recebe;
		}
		public int getmoedasDoHerois(){
			return this.moedasDoHerois;
		}
}


/*
#formata #lento #formatastring
*/

class FormataString{

	//Metodo que pega uma frase e escreve ela lentamente.
	public void lento(String valor)throws InterruptedException{

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
class EquipamentoArma{

	private static int aumentaPoderMagico;
	private  int aumentaForca;
	private  int aumentaArmadura;
	private static String descreveArma;

	EquipamentoArma(){

	}

	EquipamentoArma(String descreveArma, int aumentaPoderMagico){
		this.descreveArma = descreveArma;
		this.aumentaArmadura= aumentaPoderMagico;
	}

	Heroi heroiDoJogo = new Heroi();

	//Se arma tem poderes ela aumenta um ou mais atributos do heroi
	//Na criação do objeto EquipamentoArma vou passar os parametros da arma



	//Arma aumenta o poder mágico do heroi
	void setaumentaPoderMagico(int aumentaQuanto){
		this.aumentaPoderMagico = aumentaQuanto;
		heroiDoJogo.setpoderMagicoDoHeroi(aumentaQuanto);
	}
	int getaumentaPoderMagico(){
		return this.aumentaPoderMagico;
	}

	//Arma aumenta a força do heroi do jogo 
	void setaumentaForca(int aumentaQuanto){
		this.aumentaForca = aumentaQuanto;
		heroiDoJogo.setforcaDoHeroi(aumentaQuanto);
	}
	int getaumentaForca(){
		return this.aumentaForca;
	}

	//void set para aumentar a armadura e get para mostrar
	void setaumentaArmadura(int aumentaQuanto){
		this.aumentaArmadura = aumentaQuanto;
		this.aumentaArmadura += aumentaQuanto;
	}
	int getaumentaArmadura(){
		return this.aumentaArmadura;
	}

	//Apensa guarda a secreição da Arma, para mostrar no invetário.
	void setdescreveArma(String descricao){
		this.descreveArma = descricao;
	}
	String getmostraDescricao(){
		return descreveArma;
	}

}

class EquipamentoArmadura{

	private static int aumentaPoderMagico;
	private static int aumentaForca;
	private static int aumentaArmadura;
	private static String descreveArmadura;

	Heroi heroiDoJogo = new Heroi();

	//Se armadura tem poderes ela aumenta um ou mais atributos do heroi
	//Na criação do objeto EquipamentoArmadura vou passar os parametros da armadura

	//Apensa guarda a secreição da Armadura, para mostrar no invetário.
	void setdescreveArmadura(String descricao){
		this.descreveArmadura = descricao;
	}
	String getmostraDescricao(){
		return descreveArmadura;
	}

	//void set para guardar poder mágico e int get para mostrar
	void setaumentaPoderMagico(int aumentaQuanto){
		heroiDoJogo.setpoderMagicoDoHeroi(aumentaQuanto);
	}
	int getaumentaPoderMagico(){
		return this.aumentaPoderMagico;
	}

	//void set para força e int get para mostrar
	void setaumentaForca(int aumentaQuanto){
		this.aumentaForca += aumentaQuanto;
	}
	int getaumentaForca(){
		return this.aumentaForca;
	}

	//void ser para aumendar armadura e int get para mostrar
	void setaumentaArmadura(int aumentaQuanto){
		this.aumentaArmadura += aumentaQuanto;
	}
	int getaumentaArmadura(){
		return this.aumentaArmadura;
	}
}


/*
#MostraInventario #invetario
*/
class MostraInventario{

	//Equipamentos equipamentos = new Equipamentos();//Equipamentos do Heroi
	EquipamentoArma equipamentosArma = new EquipamentoArma();
	Heroi heroiDoJogo = new Heroi();


	public void mostrarAtributos(){
		//System.out.println(heroiDoJogo.getpoderMagicoDoHeroi());
		System.out.println("\n \n+---------------------------+\n|"+"*** "+heroiDoJogo.getnomeDoHeroi()+" ***"+"\n|Força: "+heroiDoJogo.getforcaDoHeroi()+"\n|Defesa de Armadura: "+heroiDoJogo.getdefesaDoHeroi()+"\n|Poder Mágico: "+heroiDoJogo.getpoderMagicoDoHeroi()+"\n|                       \n|Coins: "+heroiDoJogo.getmoedasDoHerois()+"\n+---------------------------+");
	}

	public void mostraArma(){
		System.out.println("|*** Arma Equipada ***");
		System.out.println("|"+equipamentosArma.getmostraDescricao());

		if(equipamentosArma.getaumentaForca() > 0){
			System.out.println("|Arma aumenta a força em: "+equipamentosArma.getaumentaForca());
		}
		if(equipamentosArma.getaumentaPoderMagico() > 0){
			System.out.println("|Arma aumenta o poder Mágico em: "+equipamentosArma.getaumentaPoderMagico());
		}
		if(equipamentosArma.getaumentaArmadura() > 0){
			System.out.println("|Arma aumenta a Armadura em: "+equipamentosArma.getaumentaArmadura());
		}
		System.out.print("+---------------------------+\n");
	}



}