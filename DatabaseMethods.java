// Marisol Miramontes, 4306-001
import java.sql.*;

public class DatabaseMethods
{
  static final String DATABASE_URL = "jdbc:derby:customers";
  static final String DATABASE_USER = "perry";
  static final String DATABASE_PASSWORD = "perry";

  public static void commitToDatabase()
  {
    Connection connection = null;
    PreparedStatement statement = null;

    String insertCustomer = "INSERT INTO Customer VALUES (?, ?, ?, ?, ?, ?, ?);";

    try
    {
      connection = DriverManager.getConnection(DATABASE_URL,
                                               DATABASE_USER,
                                               DATABASE_PASSWORD);
      
      statement = connection.prepareStatement(insertCustomer);


      for (Customer c : Main.customerList)
      {
        statement.setString(1,
                            c.getName());
        statement.setInt(2,
                         c.getAccountNumber());
        statement.setString(3,
                            c.getcType().toString());
        statement.setString(4,
                            c.getAddress().getStreet());
        statement.setString(5,
                            c.getAddress().getCity());
        statement.setString(6,
                            c.getAddress().getState());
        statement.setInt(7,
                         c.getAddress().getZip());

        statement.executeQuery();
      }
    }
    catch (SQLException sqle)
    {
      sqle.printStackTrace();
    }
    finally
    {
      try
      {
        if (statement != null)
        {
          statement.close();
        }

        if (connection != null)
        {
          connection.close();
        }
      }
      catch (SQLException sqle)
      {
        sqle.printStackTrace();
      }
      catch (NullPointerException npe)
      {
        System.out.println("Null point exception raised...");
      }
    }
  }

  public static void writeDatabaseTables()
  {
    Connection connection = null;
    Statement statement = null;
    ResultSet results = null;

    try
    {
      connection = DriverManager.getConnection(DATABASE_URL,
                                               DATABASE_USER,
                                               DATABASE_PASSWORD);

      statement = connection.createStatement();

      
      results = statement.executeQuery("SELECT * FROM customer");

      ResultSetMetaData metadata = results.getMetaData();
      int numOfColumns = metadata.getColumnCount();

      System.out.println("Customer Data Table");

    
      for (int i = 1; i <= 1; i++)
      {
        System.out.printf("%-8s\t",
                          metadata.getColumnName(i));
      }

      System.out.println();

      while (results.next())
      {
        for (int i = 1; i <= numOfColumns; i++)
        {
          System.out.printf("%-8s\t",
                            results.getObject(i));
        }

        System.out.println();
      }

    
      results = statement.executeQuery("SELECT * FROM course");

      metadata = results.getMetaData();
      numOfColumns = metadata.getColumnCount();

      System.out.println("Course Data Table");

      // Print column headers
      for (int i = 1; i <= 1; i++)
      {
        System.out.printf("%-8s\t",
                          metadata.getColumnName(i));
      }

      System.out.println();

      while (results.next())
      {
        for (int i = 1; i <= numOfColumns; i++)
        {
          System.out.printf("%-8s\t",
                            results.getObject(i));
        }

        System.out.println();
      }
    }

    catch (SQLException e)
    {
      e.printStackTrace();
    }

    finally
    {
      try
      {
        results.close();
        statement.close();
        connection.close();
      }

      catch (SQLException e)
      {
        e.printStackTrace();
      }
    }
  }
}