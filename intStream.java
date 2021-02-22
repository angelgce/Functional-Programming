
import java.util.stream.IntStream;

public class intStream {

    public static void main(String[] args) {
        //new array with random values
        int[] grades = new int[]{10,5,7,6,9,5,10,7,8};
        //Im creating a new IntStream passing my array as parameter of the method > OF < from IntStrem
        //with forEach we are accessing the value of each one
        System.out.printf("Grades: ");
        IntStream.of(grades).forEach(value -> System.out.printf("%d " ,value));
    
    System.out.println("\nArray length: "+IntStream.of(grades).count());
    System.out.println("Minimum value: "+IntStream.of(grades).min().getAsInt());
    System.out.println("Maximum value: "+IntStream.of(grades).max().getAsInt());
    System.out.println("Product of all grades: "+IntStream.of(grades).reduce(1, (x,y) -> x*y));
    System.out.println("Total: "+IntStream.of(grades).sum());
    System.out.println("Average: "+IntStream.of(grades).average().getAsDouble()+"%");
    System.out.println("Summary Statics: "+IntStream.of(grades).summaryStatistics());
    System.out.println("Grades in order (Ascending): " + IntStream.of(grades).filter(value -> value>6).count());
    System.out.println("Students who passed the course: " + IntStream.of(grades).filter(value -> value>6).count());
    System.out.println("Students who did not passed the course: " + IntStream.of(grades).filter(value -> value<7).count());
   
    System.out.printf("Grades in order : ");
    IntStream.of(grades).sorted().forEach(value -> System.out.printf("%d " ,value));



    }
}
