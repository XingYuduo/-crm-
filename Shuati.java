package com.laoqiaobei;

import java.util.Scanner;

public class Shuati {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] m=new int[n+n];
		int[] m1=new int[n+n];
		int[] m2=new int[n];
		int[] k=new int[n];
		int t;
		for(int i=0;i<n;++i) {
			m[i]=scan.nextInt();
			m1[i]=m[i];
		}
		for(int j=0;j<n;++j) {
			for(int q=j+1;q<n;++q) {
				if(m[q]>m[j]) {
					
					k[j]++;
					k[q]--;
					
				}
				if(m[q]<m[j]) {
					k[j]--;
					k[q]++;
					t=m[j];
					m[j]=m[q];
					m[q]=t;
					m2[j]=q;
				}
			}
			
			
		}
		for(int h=0;h<n;++h) {
			
			  if(k[h]>0) { 
				   //int l=k[h]/2; k[h]=m[l]-m1[h]+1;
				  int l;
				  l=(k[h]+1)/2;
				  System.out.println(m[m2[h]+l]);
				  System.out.println(m1[h]);
				  k[h]=m[m2[h]+l]-m1[h]+1;
			  }else { 
				  k[h]=0;
				  }
			 
			
			
		}
		
		for(int b=0;b<n;++b) {
			System.out.print(k[b]);
			System.out.print(" ");
		}
		
		
		scan.close();
	}

}
