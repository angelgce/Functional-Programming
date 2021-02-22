
import java.util.stream.IntStream;

public class intStream {

    public static void main(String[] args) {
        //new array with random values
        int[] grades = new int[]{10,5,7,6,9,5,10,7,8};
        //Im creating a new IntStream passing my array as parameter of the method > OF < from IntStrem.
        //with forEach we are accessing the value of each one.
        System.out.printf("Grades: "); 
        IntStream.of(grades).forEach(value -> System.out.printf("%d " ,value));//printing all grades with foreEach method.
    
    System.out.println("\nArray length: "+IntStream.of(grades).count()); //getting the lengh value of the array.
    System.out.println("Minimum value: "+IntStream.of(grades).min().getAsInt()); //getting the minumum value.
    System.out.println("Maximum value: "+IntStream.of(grades).max().getAsInt()); //getting the maximum value.
    System.out.println("Product of all grades: "+IntStream.of(grades).reduce(1, (x,y) -> x*y)); //the product of all grades.
    System.out.println("Total: "+IntStream.of(grades).sum()); //getting the sum of all grades
    System.out.println("Average: "+IntStream.of(grades).average().getAsDouble()+"%"); //getting the avarege
    System.out.println("Summary Statics: "+IntStream.of(grades).summaryStatistics()); //using the method "SummaryStatistics" 
    System.out.println("Students who passed the course: " + IntStream.of(grades).filter(value -> value>6).count()); //getting who pass the course (7 as minimum)
    System.out.println("Students who did not passed the course: " + IntStream.of(grades).filter(value -> value<7).count());//getting who did not pass the course
   
    System.out.printf("Grades in order : "); //sorting the grades 
    IntStream.of(grades).sorted().forEach(value -> System.out.printf("%d " ,value));



    }
}
