package latihan2;

public class TestInterface {
    public static void main (String[]args){
        //make 2 object
        Line a = new Line(4,5,7,9);
        Line b = new Line(8,2,4,2);
        //length object 1 and 2
        System.out.println("Length a = "+a.getLength());
        System.out.println("Length b = "+b.getLength());
        System.out.println("");
        //
        System.out.println("aLen > bLen  = "+a.isGreater(a,b));
        System.out.println("aLen < bLen  = "+a.isLess(a,b));
        System.out.println("aLen == bLen = "+a.isEqual(a,b));
    }
}
