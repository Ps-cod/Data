package Zh;
import java.io.*;
import java.util.*;

public class Alpha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char freq1[]=new char[26];
		char freq2[]=new char[26];
		char freq3[]=new char[27];
		char ch='a';
		for(int m=1;m<=26;m++)
		{
			
			freq3[m]=ch;
			ch++;
		}
		/*for(int b=1;b<27;b++)
		{
			System.out.print(freq3[b]);
		}*/
		
		
		//System.out.print((s1.charAt(0)-'a')+1);
		for(int i=0;i<s1.length();i++)
		{
			int h=(s1.charAt(i)-'a')+1;
			
			freq1[h]=s1.charAt(i);
		}
		
		for(int j=0;j<s2.length();j++)
		{
			int l=(s2.charAt(j)-'a')+1;
			freq2[l]=s2.charAt(j);
		}
		
		/*for(int i=1;i<26;i++)
		{
		System.out.print(freq1[i]);
		}
		System.out.println();*/
		for(int u=0;u<s2.length();u++)
		{
			int p=(s2.charAt(u)-'a')+1;
			int q=(s1.charAt(u)-'a')+1;
			int ind1=p;
			int ind2=q;
			int ind3=p+q;
			if(ind3>26)
			{
				ind3=ind3-26;
			}
			
			System.out.print(freq3[ind3]);
			
			
		}
		
		

	}

}
