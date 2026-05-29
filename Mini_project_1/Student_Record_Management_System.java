package Mini_project_1;
/* problem statement:create a apllication used to store the students name and marks and Give ranks according to marks
Solution:we can use objects instead of arrays and strings.Tracking student name and marks using objects and using binary search for sorting o(n^2)
 */
import java.util.Scanner;
import java.util.*; 
class Rank{
    String name;  //object
    int marks;    //object

    Rank(String name,int marks){ //constructor
        this.name=name;
        this.marks=marks;
    }
}
public class Student_Record_Management_System {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();//using this because the program will consider enter as a string and store them this throws expection thread
        Rank[] names=new Rank[n];
        for(int i=0;i<n;i++){
            String name=in.nextLine();
            int marks=in.nextInt();
            in.nextLine();
            names[i]=new Rank(name,marks);

        }

        Student_Record_Management_System obj=new Student_Record_Management_System(); //creating a object in Student_record_management_system because sort method belongs to this class;
        obj.sort(names);
        int c=1;
        for(int i=0;i<names.length;i++){
            System.out.println("Rank "+c++ +" is "+ names[i].name +" scored "+names[i].marks);
        }

    }



    void sort(Rank[] arr){              //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j].marks<arr[j+1].marks){
                    Rank temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
            }
        }
    }
}
