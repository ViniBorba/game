import java.util.Random;

class Dados {

	public static void main(String[] args) {

	//int é o objeto do array dado6
	int[] dado6  = new int[6];

	int aux = 1;
	Random radom  = new Random();

	aux = 1 + radom.nextInt(6);

	System.out.println(aux);
	
	for(int i = 0; i < 6; i++){
		 dado6[i] = i +1 ;
	}

	
}
	
}