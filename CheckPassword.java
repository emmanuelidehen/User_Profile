


/*
 * Emmanuel idehen
 * Java Programming 
 * 
 * Algorithm:
 * ♣	Ask the user for a name, university, gender, email, and telephone number.
	♣	Ask for a username (check to see if the username is not already used)
		Usernames are not case sensitive
		♣	Ask for a password (direct the user to enter the password twice and check the validity)


 * 
 * Program Discription 
 * 
 * This program takes a user name, university, gender, email, telephone 
 * and validates some of the inputs, it checks if the user-name already exits
 * and it encripts the password entred by the user using a key
 *  
 * 
 * 
 */



import java.util.Random;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Scanner;

class User_Profile {
	// declare scanner 
	Scanner scan = new Scanner(System.in);
	
	String name, univeristy, gender, email, phone_number, password, username;
	int Shift;
	// create method 
	public User_Profile(String name2, String university2, String gender1, String email2, Long phoneNumber2) {
		
	}
	// create method to get password 
	public int getPassword() {
		
		return 0;
	}
	// this method object getusername 
	public Object getUsername() {
		
		return null;
	}
	// method to print out users information 
	public void printProfile() {
		
		
	}
	// set password with method 
	public void setPassword(String password2) {
		
		
	}
	//
	public void setUsername(String username2) {
		
		
	}
	public void setShift(int passwordShift) {
	
		
	}


User_Profile( Long phoneNumber) {
		
		setPhoneNumber(phoneNumber);
		

	}
private void setPhoneNumber(Long phoneNumber2) {
	// TODO Auto-generated method stub
	
}




	void printProfile1() {
		System.out.println(getUsername());
		System.out.println(getUniversity());
		System.out.println(getGender());
		System.out.println(getEmail());
		System.out.println(getPhoneNumber());

	}
	private char[] getPhoneNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	private char[] getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	private char[] getGender() {
		// TODO Auto-generated method stub
		return null;
	}
	private char[] getUniversity() {
		// TODO Auto-generated method stub
		return null;
	}	
}


public class CheckPassword {
	static Scanner scan = new Scanner(System.in);
	static String passwordEncryption(String passwordSelection, int PasswordShift){
	String password ="";
	for(int i = 0; i < passwordSelection.length(); i++){
			char ch = passwordSelection.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch + PasswordShift);
	            
	            if(ch > 'z'){
	                ch = (char)(ch - 'z' + 'a' - 1);
	            }
	            
	            password+= ch;
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch + PasswordShift);
	            
	            if(ch > 'Z'){
	                ch = (char)(ch - 'Z' + 'A' - 1);
	            }
	            
	           	password += ch;
	        }
	        else {
	        	password += ch;
	        }
		}

	return password;
}
	
	
	
	

    public static void main(String[] args) {
    	
    	char choice ='Y';

    	int count =0;

    	String name;
    	String university;
    	String gender;
    	String email="";
    	String sex;
 
    	Long  phoneNumber;
    	String password ="";
    	String passwordSelection="";
    	int PasswordShift ;
    	String username;

    	Scanner scanner = new Scanner(System.in);
    	ArrayList<User_Profile> profiles = new ArrayList<User_Profile>();
    do {


    	System.out.print("Enter your name: ");
    	name = scanner.next();

    	System.out.print("Enter your university: ");
    	university = scanner.next();


    	System.out.print("Enter your email address: ");
    	email = scanner.next();

    	


    	System.out.print("Enter your gender : ");
    	String gender1 = scan.nextLine();

    	switch(gender1)
        {
             // male    
            case"male":
            case"m":
            case"M":
            case"Male":
               gender1 = "Male"; 
               
                break;
            case"f": // female 
            case"F":
            case"Female":
            case"female":
              gender1 = "Female";
                break;
                
            default:
                
        }

        System.out.print("Enter your phone Number: ");
  
        phoneNumber =scanner.nextLong();

       
        // users profile 
        
       profiles.add(new User_Profile(name, university, gender1, email, phoneNumber));


        System.out.print("Enter your username: ");
        username = scanner.next();
        username = username.toUpperCase();
        	// // take users information 
        for(int i=0; i<=count; i++) {
        	if(username.equals(profiles.get(i).getUsername())){
        		System.out.println("Username already taken. Enter a unique username below");
        		System.out.print("Enter your username: ");
        		username = scanner.next();
        		username = username.toUpperCase();
        		i=0;
        	}


        }

        
        System.out.print("Enter a password: ");
        passwordSelection = scanner.next();
        passwordSelection = passwordSelection.toUpperCase();
        System.out.print("Enter the password again: ");
        password = scanner.next();
        password = password.toUpperCase();

        System.out.println(passwordSelection +"   " + password);

        while(!(passwordSelection.equals(password))){
        	System.out.println("Enter matching passwords");
        	System.out.print("Enter a password: ");
        	passwordSelection = scanner.next();
        	passwordSelection = passwordSelection.toUpperCase();
        	System.out.print("Enter the password again: ");
        	password = scanner.next();
        	password = password.toUpperCase();
        }

        //random 
        
        Random rand = new Random();
        // password encription 
        PasswordShift = rand.nextInt(25) +1;
		password = passwordEncryption(passwordSelection, PasswordShift);
 
		System.out.println(password);
		profiles.get(count).setPassword(password);
		profiles.get(count).setUsername(username);
		profiles.get(count).setShift(PasswordShift);
    	

		// print out users information
		System.out.println("Profile created");
		System.out.print("----------------------------------------------------------------------------"+ "\n");
		System.out.print("Enter your username : ");
		username = scanner.next();
		username = username.toUpperCase();
		System.out.print("Enter your password: ");
		password = scanner.next();
		password = password.toUpperCase();
		password = passwordEncryption(password, PasswordShift);
		System.out.print(password);
		// check while the information entered is same  
		while((!(username.equals(profiles.get(count).getUsername()) )) || (!(password.equals( profiles.get(count).getPassword())) )) {
			System.out.println(" Invalid username and password combination");
			System.out.println(profiles.get(count).getUsername() +" " +profiles.get(count).getPassword() );
			System.out.println(username +" " + password);
			System.out.print("Enter your username : ");
			username = scanner.next();
			username = username.toUpperCase();
			System.out.print("Enter your password: ");
			password = scanner.next();
			password = password.toUpperCase();
			password = passwordEncryption(password, PasswordShift);

		}
		// if true then accept 
		if((username.equals(profiles.get(count).getUsername())) && (password.equals( profiles.get(count).getPassword()))) {
			profiles.get(count).printProfile();
		}
   
        System.out.print("Enter another profile? Enter 'Y' or 'N' ");
        choice = scanner.next().charAt(0);
        choice =Character.toUpperCase(choice);
        System.out.println(choice);
        while((choice !=  'Y' )&& (choice != 'N')) {
        System.out.print("Enter a valid choice, Y or N : ");
        	choice = scanner.next().charAt(0);
        	choice = Character.toUpperCase(choice);
        	System.out.print("----------------------------------------------------------------------------"+ "\n");
        }

        count++;
       

    }while(choice !='N');
    	

	}
    
}
/* 

Enter your name: emma
Enter your university: MVSU
Enter your email address: emma@mvsu.edu
Enter your gender. Enter M or F : m
Enter your phone Number: 3473231538
invalid phone number phone number
Enter your 10 digit  phone Number: 3473231538
Enter your username: emma
Username already taken. Enter a unique username below
Enter your username: joan  
Enter a password:fish 
Enter the password again: fish


Enter your details below to log into your account

Enter your username : emma
Enter your password: fish

User profile is displayed below

emma
MVSU
Male
emma@mvsu.edu
3473231538
..................................................
Enter your name: osas
Enter your university: MVSU
Enter your email address: emma@mvsu.edu
Enter your gender. Enter M or F : m
Enter your phone Number: 3473231538
invalid phone number phone number
Enter your 10 digit  phone Number: 3473231538
Enter your username: osas
Username already taken. Enter a unique username below
Enter your username: osas  
Enter a password:fish 
Enter the password again: fish


Enter your details below to log into your account

Enter your username : osas
Enter your password: fish

User profile is displayed below

oasa
MVSU
Male
emma@mvsu.edu
3473231538
......................................................
Enter your name: omo
Enter your university: MVSU
Enter your email address: emma@mvsu.edu
Enter your gender. Enter M or F : m
Enter your phone Number: 3473231538
invalid phone number phone number
Enter your 10 digit  phone Number: 3473231538
Enter your username: omo
Username already taken. Enter a unique username below
Enter your username: joan  
Enter a password:fish 
Enter the password again: fish


Enter your details below to log into your account

Enter your username : omo
Enter your password: fish

User profile is displayed below

omo
MVSU
Male
emma@mvsu.edu
3473231538

*/
  


