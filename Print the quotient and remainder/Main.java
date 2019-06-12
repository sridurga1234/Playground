#include<stdio.h>
int main()
{
  int n = 365 , remainder, quotient;
  quotient = n%4;
  remainder = n/4;
  printf("Quotient: %d \nRemainder: %d", remainder, quotient); 
  
  return 0;
}