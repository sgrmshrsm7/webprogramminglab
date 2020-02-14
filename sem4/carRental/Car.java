import carrental.Data;

public class Car extends Data
{
	private String carType, carModel, carNumber, carColor;
	private int carPrice;
	private boolean status;

	public Car( String cT, String cM, String cN, String cC, int cP)
	{
		carNumber = cN;
		carType = cT;
		carModel = cM;
		carColor = cC;
		carPrice = cP;
		status = false;
	}

	public boolean isCarStatus()
	{
		return status;
	}
	
	public String getCarNumber()
	{
		return carNumber;
	}

	public String getCarType()
	{
		return carType;
	}

	public String getCarModel()
	{
		return carModel;
	}

	public String getCarColor()
	{
		return carColor;
	}

	public String getData()
	{
		return getCarNumber() + " " + getCarType() + " " + getCarColor() + " " + getCarModel();
	}

	public int getCarPrice()
	{
		return carPrice;
	}
	
	public void setStatus(boolean b)
	{
		status = b;
	}
}
