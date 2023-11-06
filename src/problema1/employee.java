package problema1;
public class employee
{
    private String name;
    private String email;
    private double hourrate;
    private int capacity;
    private int freedays;
    private double dailyincome;
    private double monthlyincome;
    public employee() {}
    public employee(String name, String email, double hourrate, int capacity, int freedays, double dailyincome, double monthlyincome)
    {
        this.name=name;
        this.email=email;
        this.hourrate=hourrate;
        this.capacity=capacity;
        this.freedays=freedays;
        this.dailyincome=dailyincome;
        this.monthlyincome=monthlyincome;
    }


    public void setName(String name)
    {
        this.name=name;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setHourrate(double hourrate)
    {
        this.hourrate=hourrate;
    }
    public void setCapacity(int capacity)
    {
        this.capacity=capacity;
    }
    public void setFreedays(int freedays)
    {
        this.freedays=freedays;
    }


    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public double getHourrate()
    {
        return hourrate;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public int getFreedays() {
        return freedays;
    }


    public double getCalculatedailyincome()
    {
        return this.dailyincome=this.capacity*this.hourrate;
    }
    public double getCalculatemonthlyincome()
    {
        return this.monthlyincome=this.dailyincome*30-this.capacity*this.hourrate*this.freedays;
    }
}
