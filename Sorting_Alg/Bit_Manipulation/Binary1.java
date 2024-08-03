public class Binary1{
    public static void main(String[] args) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
//Compiler will give 2’s complement of that number, i.e., 2’s complement of 1 will be -1.
        System.out.println(~0); // 0000000 = 111111 = 0000000 +1= 000001
    
        System.out.println(5 << 2);
        System.out.println(6 >> 1);
    }
}



/*
 Decimal to binary 4/2 
2  4  remainder 0   = 100
2  2            0
   1

Binary to Decimal 100
1*2^2+ 0*2^1+ 0*2^0 = 4

And &
or | 
xor ^
binary omn's compliment ~
left shift <<
right shift >>

BINARY AND(&)  .....16 8 4 2 1 
0 & 0 = 0             5 & 6
0 & 1 = 0             101  (5)
1 & 0 = 0             110  (6)
1 & 1 = 1            ------
                      100 (4)

BINAY OR(|)

0 | 0 = 0             5 & 6
0 | 1 = 1             101  (5)
1 | 0 = 1             110  (6)
1 | 1 = 1            -------
                      111  (7)
BINARY XOR(^)

0 ^ 0 = 0             5 & 6
0 ^ 1 = 1             101  (5)
1 ^ 0 = 1             110  (6)
1 ^ 1 = 0            ------
                      011  (3)
                      
Binary one's compliment ~
0 ~ 1 = 1        MSB = 0 +VE NO  0010
1 ~ 0 = 0        MSB = 1 -VE NO  10010           

2's compliment = 1's compliment + 1

Binary left shift << LEFT LA SHIFT KRNE 

a << b  a * 2^b
0011  left shift by 2 as bis 2 = 1100
000101(5) << b(2) = 010100(20)

BINARY RIGHT SHIFT

A >> B = a / 2^b
6 >> 1 = 000110 >> 1 = 000011(3)


 */