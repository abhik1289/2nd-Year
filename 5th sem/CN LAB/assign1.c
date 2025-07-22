#include <stdio.h>

int main() {
    unsigned int num;
    printf("Enter a 32-bit number: ");
    scanf("%u", &num);


    char byte1 = (num & 0xFF);
    char byte2 = (num >> 8) & 0xFF;
    char byte3 = (num >> 16) & 0xFF;
    char byte4 = (num >> 24) & 0xFF;


    printf("Byte 1 (LSB): %u\n", (unsigned char)byte1);
    printf("Byte 2      : %u\n", (unsigned char)byte2);
    printf("Byte 3      : %u\n", (unsigned char)byte3);
    printf("Byte 4 (MSB): %u\n", (unsigned char)byte4);

    return 0;
}

