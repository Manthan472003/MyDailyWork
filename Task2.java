// TASK 2

// STUDENT GRADE CALCULATOR
// Input: Take marks obtained (out of 100) in each subject.
// Calculate Total Marks: Sum up the marks obtained in all subjects.
// Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
// Grade Calculation: Assign grades based on the average percentage achieved.
// Display Results: Show the total marks, average percentage, and the corresponding grade to the user

import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER PHYSICS MARKS (OUT OF 100) : ");
        int phy = sc.nextInt();
        System.out.print("ENTER CHEMISTRY MARKS (OUT OF 100) : ");
        int chem = sc.nextInt();
        System.out.print("ENTER MATHEMATICS MARKS (OUT OF 100) : ");
        int maths = sc.nextInt();
        System.out.print("ENTER BIOLOGY MARKS (OUT OF 100) : ");
        int bio = sc.nextInt();
        System.out.print("ENTER ENGLISH MARKS (OUT OF 100) : ");
        int eng = sc.nextInt();

        if(phy > 100 || chem >100 || maths>100 || bio>100 || eng>100 || phy <0 || chem <0 || maths < 0 || bio <0|| eng <0){
            System.out.println("INCORRECT INPUT");
        }
        else{
            int totalMarks = phy + chem + maths + bio + eng;

            int avg = totalMarks / 5;
            String grades;
    
            if (avg>90) {
                grades = "A+";                        
            }
            else if (avg > 80){
                grades= "A";
            }
            else if (avg > 70){
                grades= "B+";
            }
            else if (avg > 60){
                grades= "B";
            }
            else if (avg > 50){
                grades= "C+";
            }
            else if (avg > 40){
                grades= "C";
            }
            else{
                grades= "FAIL";
            }
    
            System.out.println("TOTAL MARKS = "+totalMarks);
            System.out.println("AVERAGE MARKS = "+avg);
            System.out.println("GRADES = "+grades);
    
    

        }


    }
}
