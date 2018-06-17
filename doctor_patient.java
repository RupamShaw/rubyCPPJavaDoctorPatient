import java.util.Scanner;  
class User
{ 
    char[] gender=new char[10];    
    int age=0;
    boolean age_permission, gender_permission;

    public void setData(){
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter Age and Gender");  
        age=sc.nextInt();  
        gender=sc.next().toCharArray();
    }

    void getuser(boolean user){
      Scanner sc=new Scanner(System.in);  
      if(user==true){ 
        setData();
        System.out.println(" Set Age Permission  Yes (1)/No (0) : ");
        age_permission= (sc.nextInt()==1)? true : false;
        System.out.println(" Set Gender Permission Yes (1)/No (0) :");
        gender_permission=(sc.nextInt()==1)? true :false;    
      } 
    }
     
    void getdisplay(boolean user){
        if(user==false){
            if(age_permission)
               System.out.println(" Patient Age : " +age);
            else
                System.out.println(" No Age Permission");
        
            if(gender_permission){
                System.out.print(" Patient Gender : ");
                for (char c : gender) {
                    System.out.print(c);
                }
                System.out.println(" \n" );
            }else
                System.out.println(" No Gender Permission");
        }
    }   
}

public class Main {
  public static void main(String[] args) {
    User user= new User();
    int patient_age;
    char[] patient_gender=new char[10];  
    boolean user_type;
    boolean condition;

    Scanner sc= new Scanner(System.in);  
    do {
        System.out.println("  Please Enter the User as patient (value 1) or doctor (value 0): "); 
        user_type = (sc.nextInt()==1)? true:false;
        
        if(user_type==true) //patient
         user.getuser(user_type);
        else
          user.getdisplay(user_type);//doctor

        System.out.println("  Do you want to continue Yes (1)/No (0)  :");
        condition = (sc.nextInt()==1)?true:false;    
    }while(condition==true);
     
  }
}