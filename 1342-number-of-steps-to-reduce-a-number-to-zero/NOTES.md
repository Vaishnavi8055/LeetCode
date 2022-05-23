Can also be done by bit manipulation.
​
checking even  ------------------------------------->
​
4 -> binary -> 100
7 -> binary -> 111
​
**if end bit is 1 number is odd else it is even.**
​
get last bit ----------------------------------------------->
​
100 & 1 = 0                 (1 is 001 in 3 bits)
111 & 1 = 1
​
**To find last bit we can binary & with the binary representation of number**
​
removing last bit after checkig ------------------------------------->
​
**Do Right shift**
​
removing each bit from end one by one tends to 0 at the end.
100 ---> 010 --> 001 --> 000
​
​
​
​