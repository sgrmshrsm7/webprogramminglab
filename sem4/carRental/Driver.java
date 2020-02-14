import carrental.Data;

public class Driver extends Data
{
        private double rating;
        private String driverName, contact, licenseNumber;
		private boolean status = false;
        
		public String getContact()
		{
			return contact;
		}

		public void setContact(String contact)
		{
			this.contact = contact;
		}
        
		public double getRating()
		{
			return rating;
		}

		public void setRating(double rating)
		{
			this.rating = rating;
		}

		public String getDriverName()
		{
			return driverName;
		}

		public void setDriverName(String driverName)
		{
			this.driverName = driverName;
		}

		public String getLicenseNumber()
		{
			return licenseNumber;
		}

		public void setLicenseNumber(String licenseNumber)
		{
			this.licenseNumber = licenseNumber;
		}

		public boolean isStatus()
		{
			return status;
		}

		public void setStatus(boolean status)
		{
			this.status = status;
		}
		
		public String getData()
		{
			return getDriverName() + " " + getContact() + " " + getLicenseNumber() + " " + getRating() + "rating";
		}

		public Driver(String dN, String con, String lN, double r)
		{
        	driverName = dN;
        	contact = con;
        	licenseNumber = lN;
        	rating = r;
        }
}
