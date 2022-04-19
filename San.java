package com.laoqiaobei;

public class San {
	public static void main(String[] args) {
		boolean p=true;
		int t=0;
		for(long i=2022;i<=2022222022;++i) {
			String s=i+"";
			int l=s.length();
			if(l%2==0) {
				for(int j=0;j<s.length()/2-1;++j) {
					//char n=s.charAt(0);
					if(s.charAt(j+1)<s.charAt(j)) {
						p=false;
						
					}
				    for(int m=s.length()/2;m<s.length()-1;++m) {
				    	if(s.charAt(m)!=s.charAt(l-m-1)||s.charAt(m+1)>s.charAt(m)) {
				    		p=false;
				    	}
				    	
					
				    }
					
				}
				
			}else{
				for(int j=0;j<l/2+2;++j) {
					//char n=s.charAt(0);
					if(s.charAt(j+1)<s.charAt(j)) {
						p=false;
						
					}
				    for(int m=l/2+1;m<s.length()-1;++m) {
				    	if(s.charAt(m)!=s.charAt(l-m-1)||s.charAt(m+1)>s.charAt(m)) {
				    		p=false;
				    	}
				    	
					
				    }
					
				}
				
			}
			if(p) {
				t++;
			}
			
			
		}
		System.out.println(t);
		
	}

}
