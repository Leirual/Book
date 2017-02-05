
public class CH10E22MyString1 {

	public static void main(String[] args) {

		char array[] = {'M','a','r','c','o'};
		
		CH10E22MyString1 word = new CH10E22MyString1(array);
		
		System.out.println(word.toString());
		System.out.println(word.charAt(2));
		System.out.println(word.lenght());
		System.out.println(word.substring(1, 3).toString());

		
	}

	public char[] chars;
	
	public CH10E22MyString1(char[] chars){
		this.chars = chars;
		for(int i=0; i<chars.length; i++){
			this.chars[i] = chars[i];
		}
	}
	
	public char charAt(int index){
		char c = chars[index];
		return c;
	}
	
	public int lenght(){
		int count = 0;
		for(char c : chars){
			count++;
		}
		return count;
	}
	
	public CH10E22MyString1 substring(int begin, int end){
		int l = end-begin;
		char newest[] = new char[l];
		CH10E22MyString1 newString = new CH10E22MyString1(newest);
		
		for(int i=0; i<l; i++){
			newest[i]=chars[i+begin];
		}
		return newString;
	}
	
	/*	public CH10E22MyString1 toLowerCase(){
		
	}
	
	public boolean equals(CH10E22MyString1 s){
		
	}
	
	public static CH10E22MyString1 valueOf(int i){
		
	}*/
	
	
}
