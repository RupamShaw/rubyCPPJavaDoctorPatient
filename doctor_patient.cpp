#include <iostream>
using namespace std;
class User
{
    public:
    int age;
    char gender [10];
    bool age_permission,gender_permission;
    
    void setData()
    {
        cout <<"User details";
        cout << "\n Enter age :-";
        cin >>age;
        cout <<"\n Enter Gender :-";
        cin>>gender;
    }
    
    void display(int age,char gender[10])
    {
        cout<<"\n Patient details as below ";
        cout <<"\n Age :-"<<age;
        cout <<"\n Gender :-" <<gender;
    } 

    void getuser(bool user)
    {
      if(user==1)
       { 
         setData();
         cout <<"\n Set Age Permission  Yes (1)/No (0) :-";
         cin >>age_permission;
         cout <<"\n set gender permission Yes (1)/No (0) :-";
         cin>>gender_permission;    
       } 
      
     }
     void getdisplay(bool user){
         if(user==0)
      {
         if(age_permission)
           cout<<"\n Patient Age :-" <<age;
        else
          cout <<"\n No Age Permission";
         if(gender_permission)
            cout<<"\n Patient Gender :-" <<gender;
        else
            cout <<"\n No Gender Permission";
      }
     }
 };
int main()
{
    int patient_age;
    char patient_gender[10] ;
    bool users_type;
    bool condition;
    User users;
     LOOP:do {
         cout <<"\n Please Enter the Users as patient (value 1) or doctor (value 0):- ";
        cin >>users_type;
         if(users_type==1)
       {
          users.getuser(users_type);
       }
    else
    {
       // users.getuser(users_type);
       // users. getdisplay(users_type);
        users.getdisplay(users_type);
    }
      cout <<"\n Do you want to continue Yes (1)/No (0)  :-";
        cin>>condition;   
     }while(condition==true);
        return 1;
}