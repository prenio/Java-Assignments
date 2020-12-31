/**
 * Assignment: ASU CSE205 Fall 2020 #11
// Name: Pierce Renio
// StudentID:1214793827
// Lecture: MWF 9:40 - 10:30
 * Description: Customer class represent a customer that visits a bank to see a loan officer.
 */
public class Customer
{
    private int custID;
    private String category;

    //Constructor to initialize member variables
    public Customer(int custID, String category)
    {
        this.custID = custID;
        this.category = category;
    }

    //Accessor method to access its custID
    public int getCustID()
    {
        return custID;
    }

    //Accessor method to access its category
    public String getCategory()
    {
        return category;
    }

    //toString method returns a string containing
    //the information of a customer
    public String toString( )
    {
        String result = "Cust.ID: " + custID
                + "(" + category + ")";
        return result;
    }
}