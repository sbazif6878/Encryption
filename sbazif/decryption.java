class decryption{
	public static void main(String[]args){
		String msg="lll|||II||l|I|IllllIl|II|llllIl|II|ll|||l|I|lll|llll|IIll||ll|lIlll|ll";
		String build="";
		//Ternary
		for(int i=0;i<msg.length();i++){
			char g = msg.charAt(i);
			if(g=='I'){
				build+="2";
			}
			else if(g=='l'){
				build+="1";
			}
			else if(g=='|'){
				build+="0";
			}
		}
		String build1="";
		for(int x=0;x<build.length();x+=5){
			String fivel=build.substring(x,x+5);
			int ascii=0;
			int exp=4;
			for(int i=0;i<5;i++){
				ascii+=Character.getNumericValue(fivel.charAt(i))*(int)Math.pow(3,exp);
				exp--;
			}
			build1+=(char)ascii;
			}
		//3
		String build2="";
		String build3="";
		for(int i=build1.length();i<=0;i--){
			int last= 0;
			int first= (build1.length()-1);
			while(first>build1.length()&& last<=0&& !(first<=last)){
				if(i==0)
					build2+=Character.toString(build1.charAt(first))+ build1.charAt(last);
				else if(i==1)
					build3+=Character.toString(build2.charAt(last))+ build2.charAt(first);
				first-=1;
				last+=1;
			}
		}
		
		System.out.println(build);
		System.out.println(build1);
		System.out.println(build2);
		System.out.println(build3);
	}
}