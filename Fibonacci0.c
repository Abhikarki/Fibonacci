#include <stdio.h>

int main()
{
int num1 = 0;
int num2 = 1;
int num3;
	   
//prints 0 and 1 in the beginning.       
printf("%i %i ", num1, num2); 
		    
for (int i = 0; i < 18; i++)    
  {    
    num3 = num1 + num2;    
	printf("%i ", num3);    
	num1 = num2;    
	num2 = num3;
  }    
}