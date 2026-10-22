package OOPS;



// TOPIC : ARRAY OF OBJECTS

public class Student {


        String name;
        int rollNumber;
        int marks;




    public static void main(String[] args) {

     Student s1 = new Student();

     s1.name = "Bharath";
     s1.rollNumber = 51;
     s1.marks = 100;



     Student s2 = new Student();


        s2.name = "Mahesh";
        s2.rollNumber = 41;
        s2.marks = 90;


        Student s3 = new Student();
        s3.name = "Bhavanth";
        s3.rollNumber = 55;
        s3.marks = 99;



        // lets create an array  which stores objects

        Student [] detailsOfStudent = new Student[3];

   detailsOfStudent[0] = s1;
   detailsOfStudent[1] = s2;
   detailsOfStudent[2] = s3;

        for( int i =0 ; i<detailsOfStudent.length;i++)
        {
            System.out.println(detailsOfStudent[i].name);
            System.out.println(detailsOfStudent[i].rollNumber);
            System.out.println(detailsOfStudent[i].marks);

            System.out.println();
        }
    }
}
