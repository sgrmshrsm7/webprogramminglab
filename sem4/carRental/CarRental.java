import java.util.*;
import java.lang.String;

public class CarRental implements Runnable
{	
	static ArrayList<User> userList = new ArrayList<User>();
    static ArrayList<Car> carList = new ArrayList<Car>();
    static ArrayList<Driver> driverList = new ArrayList<Driver>();
    
	public void run()
	{
    	try {
    		User user1 = new User("Cristiano","9876543210","cr7@gmail.com","pass123");
            User user2 = new User("Michael","9876543211","mick456@gmail.com","pass456");
            User user3 = new User("John","9876543212","johny789@gmail.com","pass789");
            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            
            Car car1 = new Car("mini","Indica","MH09-54321","white",15);
            Car car2 = new Car("mini","Etios","MH04-76387","red",15);
            Car car3 = new Car("micro","Ritz","MH06-13485","white",12);
            Car car4 = new Car("micro","i10","MH05-92135","white",12);
            Car car5 = new Car("sedan","City","MH03-87438","black",20);
            Car car6 = new Car("sedan","Dzire","MH03-87438","black",20);
            carList.add(car1);
            carList.add(car2);
            carList.add(car3);
            carList.add(car4);
            carList.add(car5);
            carList.add(car6);
            
            Driver driver1 = new Driver("Satish","6873452210","DL5473264",4.2);
            Driver driver2 = new Driver("Sameer","6873457230","DL5734687",4.5);
            Driver driver3 = new Driver("Pramod","6873458899","DL4327634",3.9);
            Driver driver4 = new Driver("Amit","6873432423","DL3463532",4.6);
            driverList.add(driver1);
            driverList.add(driver2);
            driverList.add(driver3);
            driverList.add(driver4);
            
            System.out.println("Data loaded!");
    	} catch(Exception e) {}
    }
	
	public static void main(String[] args)
	{
        Thread childThread = new Thread(new CarRental());
        childThread.start();
    	
        System.out.println("Welcome to the CarRental System");
  
        Scanner sc = new Scanner(System.in);
        short choice = 0;
		do
		{     
			do
			{
        	    try {
        	    	System.out.println("Press 1 for Login (or) Press 2 for Registration");
        	        choice = sc.nextShort();
        	    } catch (InputMismatchException e) {
        	        System.out.println("Invalid choice!");
        	    }
        	    sc.nextLine(); // clears the buffer
        	} while (choice!=1 && choice!=2);
			while(choice!=0)
			{
				switch(choice)
				{
						case 1: System.out.println("Login Menu");
								System.out.println("Enter user ID : ");
								String id = sc.next();
								System.out.println("Enter password : ");
								String password = sc.next();
								int val = loginMethod(id,password,userList);
								if(val==-1)
									System.out.println("Invalid credentials, Try again!");
								else
								{
									System.out.println("Login successful!");
									booking(val,userList,carList,driverList,sc);
									choice = 0;
								}                               
								break;
						case 2: System.out.println("Registration Menu");
								System.out.println("Enter name : ");
								String na = sc.next();
								System.out.println("Enter mobile-No : ");
								String con = sc.next();
								System.out.println("Enter email-Id : ");
								String emI = sc.next();
								System.out.println("Enter password : ");
								String pass = sc.next();
								registrationMethod(na,con,emI,pass,userList);
								choice = 1;
								break;
						default: System.out.println("Invalid Choice!");
				}
            }
            
			do
			{
        	    try {
        	    	System.out.println("Press 1 for new booking or 2 to quit : ");
        	        choice = sc.nextShort();
        	    } catch (InputMismatchException e) {
        	        System.out.println("Invalid choice!");
        	    }
        	    sc.nextLine(); // clears the buffer
            } while (choice!=1 && choice!=2);
        } while(choice==1);  
        sc.close();
    }

	private static int loginMethod(String id, String password, ArrayList<User> userList)
	{
		int i;
        for(i=0;i<userList.size();++i)
        {
                if(userList.get(i).getUserName().equals(id))
                {
                        if(userList.get(i).getPassword().equals(password))
                                return i;
                        else return -1;
                }
        }
		return -1;
	}
	
	private static void registrationMethod(String na, String con, String emI, String pass, ArrayList<User> userList)
	{
		User user4 = new User(na,con,emI,pass);
		System.out.println("Registration successful!");
		System.out.println("Your user-id is : " + user4.getUserName());
		userList.add(user4);
	}
	
	private static void booking(int index, ArrayList<User> userList, ArrayList<Car> carList, ArrayList<Driver> driverList, Scanner sc)
	{
		System.out.println("Enter pick-up location : ");
		String pL = sc.next();	
		System.out.println("Enter drop-location : ");
		String dL = sc.next();		
		int choice = 0;
		do
		{
    	    try {
    	    	System.out.println("Press 1 for intermediate stop or 2 for no stop : ");
    	    	choice = sc.nextInt();
    	    } catch (InputMismatchException e) {
    	        System.out.println("Invalid choice!");
    	    }
    	    sc.nextLine(); // clears the buffer
		} while (choice!=1 && choice!=2);
		
		String via = "None";
		if(choice==1)
		{
			System.out.println("Enter intermediate location : ");
			via = sc.next();
		}
		do
		{
    	    try {
    	    	System.out.println("Press 1 for mini(indica,etios) or 2 for micro(ritz,i10) or 3 for sedan(dzire,city) : ");
    	    	choice = sc.nextInt();
    	    } catch (InputMismatchException e) {
    	        System.out.println("Invalid choice!");
    	    }
    	    sc.nextLine(); // clears the buffer
        } while (choice!=1 && choice!=2 && choice!=3);		
		
		int choice1 = 0,i,price = 0,decision = 0;
		String carDetails = "";
		String driverDetails = "";
		switch(choice)
		{
			case 1 : do
					{
						try {
							System.out.println("Press 1 for indica or 2 for etios : ");
							choice1 = sc.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Invalid choice!");
						}
						sc.nextLine(); // clears the buffer
					} while (choice1!=1 && choice1!=2);	

					if(choice1 == 1 && carList.get(0).isCarStatus() == false)
					{
						carDetails = carList.get(0).getData();
						price = carList.get(0).getCarPrice();
					}
					else if(choice1 == 2 && carList.get(1).isCarStatus() == false)
					{
						carDetails = carList.get(1).getData();
						price = carList.get(1).getCarPrice();
					}         
					break;
			case 2 : do
					{
						try {
							System.out.println("Press 1 for ritz or 2 for i10 : ");
							choice1 = sc.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Invalid choice!");
						}
						sc.nextLine(); // clears the buffer
					} while (choice1!=1 && choice1!=2);	

					if(choice1 == 1 && carList.get(2).isCarStatus() == false)
					{
						carDetails = carList.get(2).getData();
						price = carList.get(2).getCarPrice();
					}
					else if(choice1 == 2 && carList.get(3).isCarStatus() == false)
					{
						carDetails = carList.get(3).getData();
						price = carList.get(3).getCarPrice();
					}               
					break;
			case 3 : do
					{
						try {
							System.out.println("Press 1 for city or 2 for dzire : ");
							choice1 = sc.nextInt();
						} catch (InputMismatchException e) {
							System.out.println("Invalid choice!");
						}
						sc.nextLine(); // clears the buffer
					} while (choice1!=1 && choice1!=2);

					if(choice1 == 1 && carList.get(4).isCarStatus() == false)
					{
						carDetails = carList.get(4).getData();
						price = carList.get(4).getCarPrice();
					}
					else if(choice1 == 2 && carList.get(5).isCarStatus() == false)
					{
						carDetails = carList.get(5).getData();
						price = carList.get(5).getCarPrice();
					}             
					break;
		}
		
		if(carDetails=="")
	    	 System.out.println("No cars available at the moment!");
		else
		{
			for(i=0;i<driverList.size();++i) 
				if(driverList.get(i).isStatus()==false)
				{
					driverDetails = driverList.get(i).getData();
					break;
				}
		    		 
		    if(driverDetails=="") 
		    	 System.out.println("No drivers available at the moment!");
			else
			{
				System.out.println("Your ride details : ");
				System.out.println("Going from : " + pL);
				System.out.println("Going to : " + dL);

				if(via!="None") 
					System.out.println("Via : " + via);
				
				float distance = Math.round(((Math.random() * 15)*10)/10 + 1);
				System.out.println("Distance : " + distance + "km");
				System.out.println("Car : " + carDetails);
				System.out.println("Driver : " + driverDetails);
				price = (int) (price * distance);
				System.out.println("Fare price : Rs" + price);
		    	 		    	 
				do
				{
					try {
						System.out.println("Press 1 to confirm booking or 2 to cancel : ");
						decision = sc.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Invalid decision!");
					}
					sc.nextLine(); // clears the buffer
				} while (decision!=1 && decision!=2);
				if(decision==1)
				{
					System.out.println("Booking confirmed and details sent to " + userList.get(index).getEmailId());
					driverList.get(i).setStatus(true);
					carList.get((choice-1)*2 + (choice1 - 1)).setStatus(true);
				}		    		 
				else 
					System.out.println("Booking cancelled!");				    	 
		     } 
		}
	}
}
