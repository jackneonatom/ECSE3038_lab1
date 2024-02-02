#include <avr/io.h>

int main(void)
{
	unsigned char mylist[] = "0123456789ABCD";  //The compiler will convert the characters to their ASCII values.
	unsigned char z;

	DDRB = 0xFF;
	for(z=0; z<=13; z++)
		PORTB = mylist[z];

	while(1);

	return 0;
}
