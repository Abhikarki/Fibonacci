#include <stdio.h>

int generate(int num);
int main() 
{
    for (int i = 0; i < 20; i++) 
    {
        printf("%i", generate(i));
        printf(" ");     
    }
}

//Recursive function to generate fibonacci sequence.
int generate(int num) 
{
    if (num == 0) 
    {
        return num;
    } 
	else if (num == 1) 
    {
        return 1;
    } 
	else 
    {
        //Recursion
        return (generate(num - 1) + generate(num - 2));  
    }
}
