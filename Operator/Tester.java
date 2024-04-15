class Tester {

    public static void main(String args[]) {
        // Shift operator (<< and >>) is used to move the left operands value by
        // the number of bits specified.
        int a = 10;
        int b = 20;
        System.out.println(a << 2); // left-shift operator moves the value to
                                    // the left side
        System.out.println(b >> 3); // right-shift operator moves the value to
                                    // the right side

        // Unsigned right shift operator(>>>)
        System.out.println(a >> 2);
        System.out.println(a >>> 2);
        // works in the same way for positive numbers

        int c = -1;
        System.out.println(c >> 2);
        System.out.println(c >>> 2);

        // There is no unsigned left shift operator(<<<). The below line leads
        // to an error
        // System.out.println(a<<<2);

        // Bitwise operators are used to perform manipulation of individual bits

        // Logical OR(||) does not check second condition if first is true
        // Bitwise OR(|) always checks both conditions even if first condition
        // is true or false
        System.out.println(a | b);

        // Logical AND(&&) does not check second condition if first is false
        // Bitwise AND(&) checks both conditions even if first condition is true
        // or false
        System.out.println(a & b);
    }
}

// ************************************My_Research****************************************
/*In Java, the signed right shift operator (>>) fills the vacant places on the left side with the sign bit (the leftmost bit of the number being shifted).

For example, when you perform a signed right shift on -1 (1111...1111 in binary), the sign bit is 1 (indicating a negative number). When you shift the bits to the right, the sign bit is preserved and filled in on the left side to maintain the negative value.

This behavior is consistent with the two's complement representation of signed integers, where the leftmost bit represents the sign of the number (0 for positive, 1 for negative). The signed right shift operator preserves the sign bit to maintain the correct signed value of the number. */

/*
 Performing an unsigned right shift operation on -1 (1111 1111 in binary) two times:

First unsigned right shift: 1111 1111 >>> 1 = 0111 1111 (shifts all bits to the right, fills with 0 on the left)
Second unsigned right shift: 0111 1111 >>> 1 = 0011 1111 (shifts all bits to the right, fills with 0 on the left)
After two unsigned right shift operations, the result is 0011 1111, which represents 63 in binary.
 */