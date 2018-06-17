class User
#class variable  
 @@age_permission, @@gender_permission, @@age, @@gender = ""
 
  def setData() #patient details set 
    puts "User details"
    puts "Enter age"
    patient_age = gets
    @@age = patient_age
    puts "Enter Gender"
    @@gender = gets
  end

  def displayData() # display the patient 
    puts "Patient details as below"
    puts "Age :-#{@age}"
    puts "Gender:- #{@gender}"
  end

  def getUser(user) #check the user and permission
    if (user)
      setData()
      puts "Set Age Permission Set Age Permission  Yes (1)/No (0) :-"
      @@age_permission = gets.chomp.to_i #input the int 
      puts "set gender permission Yes (1)/No (0) :-"
      @@gender_permission = gets.chomp.to_i #input the int 
    end
  end

  def getDisplay(user)
      if (user == 0) #check the user type doctor or patient 
      if (@@age_permission == 1) # check age permission 
        puts "Patient Age #{@@age}"
      else
        puts "No Age Permission Set "
      end
      if (@@gender_permission == 1) #check gender pemission
        puts "Patient Gender #{@@gender}"
      else
        puts "No Gender Permisssion Set"
      end
    end
  end
end

users = User.new
user_type = condition = "" #input from user 
begin #do while loop 
  puts "Please Enter Please Enter the Users as patient (value 1) or doctor (value 0):- "
  user_type = gets.chomp.to_i
  if (user_type == 1)
    users.getUser(user_type)
  else
    users.getDisplay(user_type)
  end
  puts "Do you want to continue yes (1)/no (0) "
  condition = gets.chomp.to_i
end while (condition == 1)
