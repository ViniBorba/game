import java.util.Random;
import java.util.Scanner;

class Game  {

			public static void main(String[] args) throws InterruptedException {


				Heroi heroiDoJogo = new Heroi();
				//EquipamentoArma cajadoSimplorio = new EquipamentoArma();
				MostraInventario mostra = new MostraInventario();
				//EquipamentoArmadura armaduraSimples = new EquipamentoArmadura();
				FormataString formata = new FormataString();
				Imagens imagens = new Imagens();
				Scanner entrada = new Scanner(System.in);
				Enter pressioneEnter = new Enter();
				ExperienciaRecebida recebeExperiencia = new ExperienciaRecebida();


				System.out.println("\n \n");

				formata.lento("Este é um mundo onde não se mede o tempo.");
				System.out.println();
				Thread.sleep(300);

				formata.lento("Um mundo onde a magia, a força e a coragem são suas maiores armas.");
				System.out.println();
				Thread.sleep(300);

				formata.lento("Onde os Deuses e Deusas, Herois e Vilões, Monstros e Aberrações vivem.");
				System.out.println();
				Thread.sleep(300);

				formata.lento("Mas nada se compara ao que está por vir");
				Thread.sleep(800);
				System.out.print(".");
				Thread.sleep(900);
				System.out.print(".");
				Thread.sleep(900);
				System.out.print(".");
				System.out.println();
				
				Thread.sleep(2000);

				imagens.nomeDoJogoImagem();

				pressioneEnter.pressioneEnter();

				Thread.sleep(2500);

				formata.lento("Seja bem vido a este mudo de aventuras");
				System.out.println();
				formata.lento("Você é um servo da Magia ou é um Guerreiro?");
				System.out.println();
				
				imagens.guerreiroEMagoImagem();
				System.out.println("Digite 1 para MAGO ou pressione 2 para GUERREIRO");
				heroiDoJogo.recebeHeroi(entrada.nextInt());
				
				mostra.mostrarAtributos();
				mostra.mostraArma();
				mostra.mostrarArmadura();

				pressioneEnter.pressioneEnter();

				//Thread.sleep(2000);

				formata.lento("Você recebe inicialmente 15 pornto para aumentar seus atributos");
				System.out.println();
				
				recebeExperiencia.receberExperiencia(15);

				mostra.mostrarAtributos();
				mostra.mostraArma();
				mostra.mostrarArmadura();

				pressioneEnter.pressioneEnter();

				//#começa #começaaventura #aventura

				Thread.sleep(2000);
				System.out.println("\n \n****** TABERNA DO JAVALI SALTITANTE ******\n \n");
				Thread.sleep(2000);
				imagens.placaDaTaberna();

				formata.lento("A Taverna do Javali Saltitante é um belo lugar para gastar moedas.");
				System.out.println();
				formata.lento("Pena você não ter nem uma moeda no bolso.");
				System.out.println();
				formata.lento("A melhor maneira de conseguir moedas é aceitando uma das aventuras no mural da praça.");
				System.out.println();

				formata.lento("Vamos até lá.");
				System.out.println();
				Thread.sleep(2000);	

				imagens.placaDeQuest();


				
				System.out.println();

			
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
	private static int vidaDoHeroi;
	private static int forcaDoHeroi;
	private static int defesaDoHeroi;
	private static int poderMagicoDoHeroi;
	private static int moedasDoHerois;
	//private static EquipamentoArma armaDoHeroi;
	//private static Equipamentos armaduraDoHeroi;

	
	//Metodo para iniciar o Herois, depedendo da escolha do jogador
	void recebeHeroi (int letra)throws InterruptedException{
		FormataString formata = new FormataString();//objeto da classe que formata String
		Scanner entrada = new Scanner(System.in);//salva atributos do heroi
		//MostraInventario invetario = new MostraInventario();// mostra os atributos e equipamentos.
		if(letra == 1){
			formata.lento("Você escolheu o Mago.\n");
			formata.lento("Escolha um nome para o seu Heroi: ");
			this.nomeDoHeroi = entrada.next();

			vidaDoHeroi = 30;
			forcaDoHeroi = 2;
			defesaDoHeroi = 2;
			poderMagicoDoHeroi = 6;
			moedasDoHerois = 0;

			//Equipamentos
			//equipamentos.cajadoSimples();
			EquipamentoArma cajadoSimplorio = new EquipamentoArma();
			cajadoSimplorio.setdescreveArma("Cajado Simples");
			cajadoSimplorio.setaumentaPoderMagico(1);

			EquipamentoArmadura armaduraSimples = new EquipamentoArmadura();	
			armaduraSimples.setdescreveArmadura("Amadura Simples");
			armaduraSimples.setaumentaArmadura(10);
			armaduraSimples.setaumentaVida(10);

			formata.lento("Sua maior força é a Magia.\n");
			formata.lento("Seus atributos: ");
				
		}	
			else if (letra == 2){
				formata.lento("Você escolheu ser Geurreiro\n");
				formata.lento("Escolha um nome para o seu Heroi: ");
				this.nomeDoHeroi = entrada.next();

				vidaDoHeroi = 30;
				forcaDoHeroi = 6;
				defesaDoHeroi = 2;
				poderMagicoDoHeroi = 2;
				moedasDoHerois = 0;

				//Equipamentos
				//equipamentos.cajadoSimples();
				EquipamentoArma machadoSimplorio = new EquipamentoArma();
				machadoSimplorio.setdescreveArma("Machado Simples");
				machadoSimplorio.setaumentaForca(1);
				
				EquipamentoArmadura armaduraSimples = new EquipamentoArmadura();
				armaduraSimples.setdescreveArmadura("Amadura Simples");
				armaduraSimples.setaumentaArmadura(10);
				armaduraSimples.setaumentaVida(10);
				formata.lento("Use a força Bruta para derrubar seus inimigos.\n");
				formata.lento("Seus atributos: ");
				
			}
				else{
				System.out.println("Nada");
				//heroiDoJogo.recebeHeroi(entrada.next());
					
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

		//void seta para aumentar e recuperar vida get int para mostra a vida
		public void setvidaDoHeroi(int recebe){
			this.vidaDoHeroi += recebe;
		}
		public int getvidaDoHeroi(){
			return this.vidaDoHeroi;
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
					Thread.sleep(100);
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

	//IMagem da placa da Taverna
	void placaDaTaberna(){
		System.out.println("\n                                    8@@8\n   .########.........#########888888@@88\n  .888888888888888888888888888888888@@@8\n   88888888888@@@@@@@@@@@@@8888@@@@@@@@8\n         ..             # .88888   .8@88\n         ..             #   88888# .8@88\n        ................#.   .@8888.@@88\n       #88888##8888#888#88#    8@888@@88\n    .#888888888888888#####88#.  .@88@@88\n    .8@8888888888888##888888#.    8@@@88\n    .88888888888888#######888#     #8888\n    #8888888888888########888#     .8888\n    #8@@8@8888888888888888888#     .@888\n    #8@8888888888888888888888#      8888\n    #888888888888888888888888#      8888\n    #8@8888888888888888888888#      8888\n    #@@@888888888888888888888#      8888\n     .#888888888888888888888.       8888\n       #8888888888888888888         8888\n                                    8888\n \n");
	}
	void  placaDeQuest(){
		System.out.println("                                                       \n                                                       \n                                                       \n  @8###############################################8@  \n  8 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@8 #  \n  8 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ #  \n  8 @@@@88@@@@@@8@@@8@@@@@888@@@@@@888@@@@88888@@@@ #  \n  8 @@# @  @@@@@ #@# @@@@#    @@@@    @@@@@    #@@@ #  \n  8 @@ #@@  @@@@ #@# @@@@# @@@@@@@ 8@@@@@@@@ #@@@@@ #  \n  8 @8 8@@  @@@@ #@# @@@@#    @@@@#  @@@@@@@ #@@@@@ #  \n  8 @8 8@@  @@@@ #@# @@@@# @@@@@@@@@8 #@@@@@ #@@@@@ #  \n  8 @@@ #@ 8@@@@  #  @@@@#    @@@@   8@@@@@@ #@@@@@ #  \n  8 @@@@@ @@@@@@@   @@@@@@@@@@@@@@@@@@@@@@@@8@@@@@@ #  \n  8 @@@@@@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ #  \n  8 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ #  \n  8 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ #  \n  8                                                 #  \n  8                                                 #  \n  8                                                 #  \n  8                                                 #  \n  8     1 - Esqueletos estão levantando             #  \n  8          de suas tumbas no velho cemitério      #  \n  8                                                 #  \n  8                                                 #  \n  8     2 - Coisas estranhas estão acontecendo      #  \n  8          na FLoresta Velha                      #  \n  8                                                 #  \n  8                                                 #  \n  8     3 - Pragas estão destruindo toda a safra    #  \n  8          de castanhas da cidade                 #  \n  8                                                 #  \n  8                                                 #  \n  8                                                 #  \n  8                                                 #  \n  8                                                 #  \n  8                                                 #  \n  8                                                 #  \n  ## @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#@  \n    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    \n                                                       \n                                                       \n");
	}   	

}

/*
#armas #equipamentos
*/
class EquipamentoArma{

	private static int aumentaPoderMagico;
	private static int aumentaForca;
	private static int aumentaArmadura;
	private static String descreveArma;

	EquipamentoArma(){

	}

	EquipamentoArma(String descreveArma){
		this.descreveArma = descreveArma;

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
//#armadura
class EquipamentoArmadura{

	private static int aumentaPoderMagico;
	private static int aumentaForca;
	private static int aumentaArmadura;
	private static int aumentaVida;
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
		this.aumentaPoderMagico = aumentaQuanto;
		heroiDoJogo.setpoderMagicoDoHeroi(aumentaQuanto);
	}
	int getaumentaPoderMagico(){
		return this.aumentaPoderMagico;
	}

	//void set para força e int get para mostrar
	void setaumentaForca(int aumentaQuanto){
		this.aumentaForca = aumentaQuanto;
		heroiDoJogo.setforcaDoHeroi(aumentaQuanto);
	}
	int getaumentaForca(){
		return this.aumentaForca;
	}

	//void set para aumendar armadura e int get para mostrar
	void setaumentaArmadura(int aumentaQuanto){
		this.aumentaArmadura = aumentaQuanto;
		heroiDoJogo.setdefesaDoHeroi(aumentaQuanto);
	}
	int getaumentaArmadura(){
		return this.aumentaArmadura;
	}

	//void set para aumentar a vida
	void setaumentaVida(int aumentaQuanto){
		this.aumentaVida = aumentaQuanto;
		heroiDoJogo.setvidaDoHeroi(aumentaQuanto);
	}
	int getaumentaVida(){
		return this.aumentaVida;
	}
}


/*
#MostraInventario #invetario
*/
class MostraInventario{

	//Equipamentos equipamentos = new Equipamentos();//Equipamentos do Heroi
	EquipamentoArma equipamentosArma = new EquipamentoArma();
	EquipamentoArmadura equipamentoArmadura = new EquipamentoArmadura();
	Heroi heroiDoJogo = new Heroi();
	//MostraInventario tudo = new MostraInventario();


	public void mostrarAtributos(){
		//System.out.println(heroiDoJogo.getpoderMagicoDoHeroi());
		System.out.println("\n \n+---------------------------+\n|"+"*** "+heroiDoJogo.getnomeDoHeroi()+" ***"+"\n|Pontos de vida do Heroi: "+heroiDoJogo.getvidaDoHeroi()+"\n|Força: "+heroiDoJogo.getforcaDoHeroi()+"\n|Defesa: "+heroiDoJogo.getdefesaDoHeroi()+"\n|Poder Mágico: "+heroiDoJogo.getpoderMagicoDoHeroi()+"\n|                       \n|Coins: "+heroiDoJogo.getmoedasDoHerois()+"\n+---------------------------+");
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

	public void mostrarArmadura(){
		System.out.println("|*** Armadura Equipada ***");
		System.out.println("|"+equipamentoArmadura.getmostraDescricao());

		if(equipamentoArmadura.getaumentaForca() > 0){
			System.out.println("|Armadura aumenta a força em: "+equipamentoArmadura.getaumentaForca());
		}
		if(equipamentoArmadura.getaumentaPoderMagico() > 0){
			System.out.println("|Armadura aumenta o poder Mágico em: "+equipamentoArmadura.getaumentaPoderMagico());
		}
		if(equipamentoArmadura.getaumentaVida() > 0){
			System.out.println("|Armadura aumenta a vida: "+equipamentoArmadura.getaumentaVida());
		}
		if(equipamentoArmadura.getaumentaArmadura() > 0){
			System.out.println("|Armadura Defesa em: "+equipamentoArmadura.getaumentaArmadura());
		}
		System.out.print("+---------------------------+\n");
	}


}

/*
#experiencia
*/

class ExperienciaRecebida{

	Scanner entrada = new Scanner(System.in);
	Heroi heroiDoJogo = new Heroi();

	public void receberExperiencia(int maximoDePontos){



			int auxiliarGlobal;
			int auxiliarDeVida;
			int auxiliarDeDefesa;
			int auxiliarDeForca;
			int auxiliarMagia;

			auxiliarGlobal = maximoDePontos;	

		do{ 

			maximoDePontos = auxiliarGlobal;
			System.out.println("\n \n-----------------------------------------******************-----------------------------------------");
			System.out.println("Você deve distribuir "+maximoDePontos+" de pontos entre os seus atributos: Vida, Defesa, força e Magia");
			System.out.println("Você ainda tem "+maximoDePontos+" pontos");

			System.out.println("Quantos pontos você quer colocar no atributo Vida: ");
			auxiliarDeVida = entrada.nextInt();
			//heroiDoJogo.setvidaDoHeroi(auxiliar);
			maximoDePontos = maximoDePontos - auxiliarDeVida;
			System.out.println("Ainda resta:  "+maximoDePontos+" pontos");

			System.out.println("Quantos pontos você quer colocar no atributo Defesa: ");
			auxiliarDeDefesa = entrada.nextInt();
			//heroiDoJogo.setdefesaDoHeroi(auxiliar);
			maximoDePontos = maximoDePontos - auxiliarDeDefesa;
			System.out.println("Ainda resta:  "+maximoDePontos+" pontos");

			System.out.println("Quantos pontos você quer colocar no atributo Força: ");
			auxiliarDeForca = entrada.nextInt();
			//heroiDoJogo.setdefesaDoHeroi(auxiliar);
			maximoDePontos = maximoDePontos - auxiliarDeForca;
			System.out.println("Ainda resta:  "+maximoDePontos+" pontos");

			System.out.println("Quantos pontos você quer colocar no atributo Magia: ");
			auxiliarMagia = entrada.nextInt();
			//heroiDoJogo.setdefesaDoHeroi(auxiliar);
			maximoDePontos = maximoDePontos - auxiliarMagia;
			System.out.println("Ainda resta:  "+maximoDePontos+" pontos");

			//auxiliarGlobal = maximoDePontos;
		}
		while(maximoDePontos != 0);

		heroiDoJogo.setvidaDoHeroi(auxiliarDeVida);
		heroiDoJogo.setdefesaDoHeroi(auxiliarDeDefesa);
		heroiDoJogo.setforcaDoHeroi(auxiliarDeForca);
		heroiDoJogo.setpoderMagicoDoHeroi(auxiliarMagia);

	}
}

class Enter{
	Scanner entrada = new Scanner(System.in);

	void pressioneEnter(){
		System.out.println("\n \nPressione Enter para continuar.");
		entrada.nextLine();
	}

}

class Aventuras{


}