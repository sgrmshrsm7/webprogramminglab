public class User
{
	private String name, userName, contact, emailId, password;

	public User(String N, String c, String eI, String pa)
	{
		name = N;
		contact = c;
		emailId = eI;
		password = pa;
		userName = name.substring(0, 3) + contact.substring(7, 10);
	}

	public String getName()
	{
		return name;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getContact()
	{
		return contact;
	}

	public String getEmailId()
	{
		return emailId;
	}
	
	public String getPassword()
	{
		return password;
	}
}
