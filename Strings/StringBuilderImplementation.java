// StringBuilder is a class used to create and modify strings without creating a new object every time.
// Unlike String, it is mutable.

That means - 
StringBuilder sb = new StringBuilder("Java");
// if u do  - 
// sb.append("Coding") - the same object is modified and no new object is created in the memory


// StringBuilder sb = new StringBuilder(); = Empty constructors where the initial state is = content = "" and capacty = 16
// StringBuilder sb = new StringBuilder("Hello"); - Constcto th the string where now the capacity is = 16 + length = 16+5 = 21
// StringBuilder sb = new StringBuilder(50); - here u r passing the constructor with the capacity means it is useful when u already now approximately how large the final string will be because its reduces the resizing

// Capacity = 50
// Content = ""


// Method 1 : append()
StringBuilder sb = new StringBuilder();
sb.append("Java");
sb.append(" ");
sb.append("coding");
System.out.println(sb); = Java DSA

// append() with different data types
StringBuilder sb = new StringBuilder();
sb.append(100);
sb.append(true);
sb.append('A');
sb.append(5.6);
System.out.println(sb); - 100trueA5.6
  // append() is overloaded, so it accepts many types.


// Method 2 : insert()
// Addss the data at the specific position 

StringBuilder sb = new StringBuilder("Java");
sb.insert(4," DSA");
// Insert after index 4
System.out.println(sb); - Java DSA


// Method 3 : delete()
// delete(start,end) - wheere the start is included and the end is excluded

// Method 4 : deleteCharAt()
StringBuilder sb = new StringBuilder("Java");
sb.deleteCharAt(1);
System.out.println(sb);



// Method 5 : replace()
// replaces the range of characters

StringBuilder sb = new StringBuilder("Hello");
sb.replace(0,5,"Java");
System.out.println(sb); - Java

StringBuilder sb = new StringBuilder("I Love Java");
sb.replace(2,6,"Like");
System.out.println(sb); = I Like Java


// Method 6 : reverse()

StringBuilder sb = new StringBuilder("ABCDE");
sb.reverse();
System.out.println(sb);


// Method 7 : charAt()
StringBuilder sb = new StringBuilder("Hello");
System.out.println(sb.charAt(1));

// Method 8 : length()
SOUT(sb.length());

// capacity always becomes -(old capacity × 2) + 2

// Method 11 : substring()
StringBuilder sb = new StringBuilder("Programming");
System.out.println(sb.substring(3));

// Method 12 : isEmpty()

StringBuilder sb = new StringBuilder();
System.out.println(sb.isEmpty());




// ---------------------------------------------------------------------------------------

// Full implementation code

public class StringBuilderImplementation {

    public static void main(String[] args) {

        // =====================================================
        // 1. Creating StringBuilder
        // =====================================================

        StringBuilder sb1 = new StringBuilder();
        System.out.println("Empty Constructor : " + sb1);

        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("String Constructor : " + sb2);

        StringBuilder sb3 = new StringBuilder(50);
        System.out.println("Capacity Constructor : " + sb3.capacity());



        // =====================================================
        // 2. append()
        // =====================================================

        sb1.append("Java");
        sb1.append(" ");
        sb1.append("DSA");
        sb1.append(" ");
        sb1.append(2026);
        sb1.append(" ");
        sb1.append(true);

        System.out.println("\nappend() : " + sb1);



        // =====================================================
        // 3. insert()
        // =====================================================

        sb1.insert(5, "Programming ");
        System.out.println("\ninsert() : " + sb1);



        // =====================================================
        // 4. delete()
        // =====================================================

        StringBuilder sb4 = new StringBuilder("Hello World");
        sb4.delete(5, 11);

        System.out.println("\ndelete() : " + sb4);



        // =====================================================
        // 5. deleteCharAt()
        // =====================================================

        StringBuilder sb5 = new StringBuilder("Java");
        sb5.deleteCharAt(1);

        System.out.println("\ndeleteCharAt() : " + sb5);



        // =====================================================
        // 6. replace()
        // =====================================================

        StringBuilder sb6 = new StringBuilder("Hello");

        sb6.replace(0, 5, "Java");

        System.out.println("\nreplace() : " + sb6);



        // =====================================================
        // 7. reverse()
        // =====================================================

        StringBuilder sb7 = new StringBuilder("Programming");

        sb7.reverse();

        System.out.println("\nreverse() : " + sb7);



        // =====================================================
        // 8. charAt()
        // =====================================================

        StringBuilder sb8 = new StringBuilder("Computer");

        System.out.println("\ncharAt(3) : " + sb8.charAt(3));



        // =====================================================
        // 9. setCharAt()
        // =====================================================

        sb8.setCharAt(0, 'Z');

        System.out.println("setCharAt() : " + sb8);



        // =====================================================
        // 10. length()
        // =====================================================

        System.out.println("\nlength() : " + sb8.length());



        // =====================================================
        // 11. capacity()
        // =====================================================

        StringBuilder sb9 = new StringBuilder();

        System.out.println("\nDefault Capacity : " + sb9.capacity());



        // =====================================================
        // 12. substring()
        // =====================================================

        StringBuilder sb10 = new StringBuilder("Programming");

        System.out.println("\nsubstring(3) : " + sb10.substring(3));

        System.out.println("substring(0,7) : " + sb10.substring(0, 7));



        // =====================================================
        // 13. indexOf()
        // =====================================================

        System.out.println("\nindexOf(\"gram\") : "
                + sb10.indexOf("gram"));



        // =====================================================
        // 14. lastIndexOf()
        // =====================================================

        StringBuilder sb11 = new StringBuilder("ababa");

        System.out.println("\nlastIndexOf(\"ba\") : "
                + sb11.lastIndexOf("ba"));



        // =====================================================
        // 15. toString()
        // =====================================================

        String normalString = sb10.toString();

        System.out.println("\ntoString() : " + normalString);



        // =====================================================
        // 16. append various data types
        // =====================================================

        StringBuilder sb16 = new StringBuilder();

        sb16.append(100);
        sb16.append('A');
        sb16.append(99.99);
        sb16.append(false);

        System.out.println("\nappend different data types : "
                + sb16);

    }
}













  

