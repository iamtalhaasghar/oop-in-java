

public class StackDemo{

	public static void main(String []args){

		Lifo ob = new Lifo();
		
		for(int i=0 ; i<5; i++){
	
			ob.push(i*2+2);
			System.out.println(i*2+2);

		}


		System.out.println();

		for(int i=0; i<5; i++)
			System.out.println(ob.pop());


	}


}












interface Stack{

	int ARRAY_SIZE = 5;

	void push(int item);
	int pop();

}

class Lifo implements Stack{

	private int index;
	private int [] numbers;	

	Lifo(){

		index = -1;
		numbers = new int[Stack.ARRAY_SIZE];

	}
	
	public void push(int item){
		
		if(index >= Stack.ARRAY_SIZE-1){

			System.out.println("Stack OverFlow. Can`t push "+item+" on stack.");
		}
		else{

			numbers[++index] = item;

		}

	
	} 	// end of push


	public int pop(){

		if(index<0){

			System.out.println("Stack is empty. Returning -1.");
			return -1;
		}
		else{
			
			return numbers[index--];
		
		}
		
	}	// end of pop
	


}