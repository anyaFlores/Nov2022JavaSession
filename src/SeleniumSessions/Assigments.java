package SeleniumSessions;

public class Assigments {

	public static void main(String[] args) {
		int i = 1;

		while(i<=1)
			i++;
		System.out.println("Hi Java");//Infinity loop without i++
System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");

for(int y=1; y<=1; y++) {
	for(int z=1; z<=9; z++) {
		System.out.println("I am Batman﻿"+" "+ z);
	}
	}
//3. WAP to print 10 to 1 using for, while and do-while loop
for(int q=10; q>=1; q--) {
	System.out.println(q);
}
// WhileLoop: START->CONDITION CHECKING(false->EXIT)->STATEMENT(true)
int e = 10;//could be negative -10, byte
while(e >=1) {
	System.out.println(e);//infinity loop 1(without i++); 
	e--;//10-1, have to come out of the loop!!!!DO NOT FORGET TO decrease THE VALUE BY 1
}

// Start->Condition Checking(exit)/Continue checking
//Run at least ONCE
int u = 10;
do {
	System.out.println(u);
	u--;
}while(u>=1);

//4. Write a program in Java to print "Hello World" ten times using WHILE LOOP
int o = 1;
while(o<=10) {
	System.out.println("Hello World");
	o++;
}
//5. Write a program in Java to print 1 to 10 using while loop
int r=1;
while (r<=10) {
System.out.println(r);
r++;
}
//6. WAP to find out the max number from the given three different positive numbers:num1 = 100,num2 = 200, num3 = 300
int num1 = 100;
int num2 = 200;
int num3= 300;
if (num1>num2 && num1>num3) {
	System.out.println("num1 is the maximum");
	} else if (num2>num1 && num2>num3){
		System.out.println("Num2 is the maximum");
	}else {
		System.out.println("Num3 is the maximum");
	}

	}
}
