package oops;

import java.util.Scanner;

public class Vowel {
	public void letter(char v) {
		if(v == 'a'|| v == 'e'||v == 'i'||v == 'o'||v == 'u') {
			System.out.println(v + " is a vowel");
		}else if(v == 'b'|| v == 'c'||v =='d'||v =='f'||v =='g' ||v =='h'||v =='j'||v =='k'||v =='l' ||v =='m'||
				v =='n'||v =='p'||v =='q'||v =='r'||v =='s'||v =='t'||v =='v'||v =='w'||v =='x'||v =='y'||v =='z')
		{
			System.out.println(v + " is a consonant");
		}else {
			System.out.println("you didnot enter the alphabet");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any alphabet - ");
		char v = sc.next().charAt(0);
		Vowel r = new Vowel();
		r.letter(v);
		

	}

}
