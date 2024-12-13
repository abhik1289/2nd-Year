

public class Question2 {
    public  static  void main(String[] args){


      


        int marks = 67;
        char grade = 0;
        

        if(marks>100){
            System.out.println("Invalid I/p");
        }else if(marks>=90 && marks<=100){
            grade = 'O';
        }else if(marks>=80 && marks<=89){
            grade = 'E';
        }else if(marks>=70 && marks<=79){
            grade = 'A';
        }else if(marks>=60 && marks<=69){
            grade = 'B';
        }else if(marks>=50 && marks<=59){
            grade = 'C';
        }
        
        System.out.println("Your grade is:"+grade);


    }
}
