
public class CH10E22MyString1 {

	public static void main(String[] args) {

		char array[] = {'M','a','r','c','o'};
		CH10E22MyString1 word = new CH10E22MyString1(array);
		
		System.out.println(word.toString());
		System.out.println(word.charAt(2));
		System.out.println(word.lenght());
		System.out.println(word.substring(1, 3).toString());
		System.out.println(word.toLowerCase().toString());
		
/*		valueOf(8);*/
		
		char array2[] = {'P','o','l','o'};
		CH10E22MyString1 word2 = new CH10E22MyString1(array2);
		
		System.out.println(word.equals(word2));
		
		char array3[] = {'M','a','r','c','o'};
		CH10E22MyString1 word3 = new CH10E22MyString1(array3);
		
		System.out.println(word.equals(word3));
		
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
	
	public String toString(){
		String output = "";
		for(int i=0; i<chars.length; i++){
			output += chars[i];
		}
		return output;
	}
	
	public CH10E22MyString1 toLowerCase(){
		for(int i=0; i<chars.length; i++){
			if(chars[i]>=65 && chars[i]<=90){
				chars[i] = (char)((int)(charAt(i)) + 32);
			}
		}
		CH10E22MyString1 newString = new CH10E22MyString1(chars);
		return newString;
	}
	
	public boolean equals(CH10E22MyString1 s){
		String sString = s.toString();
		CH10E22MyString1 newString = new CH10E22MyString1(chars);
		String chString = newString.toString();
		int count = 0;
		if(sString.length() == chString.length()){
			for(int i=0; i<sString.length(); i++){
				if(sString.charAt(i) == chString.charAt(i)){
					count++;
					if(count==sString.length()){
						return true;
					}
				}
			}
		}
	return false;
	}
	
	
/*	public static CH10E22MyString1 valueOf(int i){
		char newest[] = new char[1];
		newest[1] = 
		CH10E22MyString1 newString = new CH10E22MyString1(newest);
		return newString;
	}*/
	
	
}
