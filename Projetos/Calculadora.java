class Calculadora{
	float num1;
    float num2;
	
	 public Calculadora(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
		
     }
     public void somarResultado(){
		 float soma = num1 + num2;
		 if (soma > 10){
			 System.out.println("Só um teste, tem nada de interessante");
		     System.out.println("A soma de A + B = " + soma);
		 }else{
			 System.out.println("A soma de A + B = " + soma);
			 System.out.println("FIM");
	 }
 }
      public static void main(String args[]){
		
		Calculadora somas = new Calculadora(10,8);
		
		somas.somarResultado();
	 }
  }

