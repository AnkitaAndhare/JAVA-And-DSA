public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");

        sb.append(" ");
        sb.append("world");

        String mesg = sb.toString();
        System.out.println(mesg);
    }
}

//StringBuffer is synchronized. therfore it is safe 
// This means that multiple threads cannot call the methods of StringBuffer simultaneously.

// StringBuilder is asynchronized. This means that multiple threads can call the methods of StringBuilder simultaneously.
// not safe