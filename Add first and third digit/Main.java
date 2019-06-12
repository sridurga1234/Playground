#include<stdio.h>
int main()
{
   int n,sum,ld,fd;
  scanf("%d",&n);
  ld = n % 10;
  fd = n /100;
  sum = fd + ld;
  printf("%d",sum);
  return 0;
}