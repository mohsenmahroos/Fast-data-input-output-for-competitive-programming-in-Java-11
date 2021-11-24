# Fast-data-input-output-for-competitive-programming-in-Java-11

It is well-known that the Time-Limit Exceeded (TLE) Verdict received from the automatic judge in competitive programming contests and practicing is sometimes not because the computations involved in solving problem are too time-consuming, but because the data input operations from System.in stream and/or data output operations to System.out stream are not fast enough.

The program is a simple Java 11 template for data input-output using InputStreamReader, BufferedReader and BufferedOutputStream library classes. The program declares a queue-based tokens class to parse multiple data items in the same line and push them to the rear of the data queue using LinkedList utility object. The next...() member function, where ... stands for the data-item type, is used to get the next data item from the queue front. Helper to_bytes(... x), where ... stands for the data-item type, are declared to convert data item to byte[] array that can be written to the buffered output stream using BufferedOutputStream::write(byte[]) function call. It is always necessary to call the BufferedOutputStream::flush() member function before quitting from the program, so as to flush the buffered output stream by sending its contents to System.out. Note that writing floating-point data items requires an additional format string parameter to specify the number of decimal digits after the decimal floating point. 
 
 References:
 
1. [Fast I/O in Java in Competitive Programming](https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/) 

2. [Fast I/O In Java For Competitive Programming](https://www.codingninjas.com/blog/2021/07/26/fast-i-o-in-java-for-competitive-programming/)

3. [Fast Output in Java](https://www.geeksforgeeks.org/fast-output-in-java/)
