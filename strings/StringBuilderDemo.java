package Strings;

import java.util.Arrays;

public class StringBuilderDemo {


    public static void main(String[] args) {


        // 1. in normal way using string
        // ( every time new object craeted , as string are immuatble
        // memeory wastage

        String str  = " ";
        for (int i =0 ; i<=50 ; i++)
        {
            str = str+i;
            System.out.println(i);
        }


       // 2. using String Builder ( no new object created , and mutable )
        StringBuilder s1 = new StringBuilder(" ");
        for (int i = 0 ; i<=50;i++)
        {
            s1=s1.append(i);
            System.out.println(s1);

        }


        // 3 how to apppend two items using builder
        StringBuilder sb = new StringBuilder(" Raghu");
        int [] arr = { 1,2,3,4,5};

        sb.append(Arrays.toString(arr));
        System.out.println(sb);


        // 4. how to insert anything at any index

        StringBuilder s2 = new StringBuilder("Bharth kumar");
        s2.insert(4,'a');
        System.out.println(s2);

   // 5. how to check capacity of StringBuilder
        StringBuilder s3 = new StringBuilder();

        System.out.println( s3.capacity()); // default is 16


        // now lets append , something
        s3.append(" bharath kumar gowda ");
        System.out.println(s3.capacity()); // dynamically increases by old capacity *2 +2

        // supppose we want to save the memory , so we can trim it

        StringBuilder s4 = new StringBuilder("Hello"); // default capacity is 16

        s4.trimToSize();
        System.out.println(s4.capacity()); //only 5


        // if we wanrt to reverse
        s4.reverse();
        System.out.println(s4);

    }
}
