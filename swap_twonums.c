#include<stdio.h>
int main(void){
	int num1, num2, holder;

	printf("Enter the first number: ");
	scanf("%d", &num1);

	printf("Enter the second number: \n");
	scanf("%d", &num2);

	printf("Swapping the numbers--- \n");

	holder = num1;
	num1 = num2;
	num2 = holder;

	printf("The first number is: %d \n", num1);
	printf("The second number is: %d \n", num2);


}