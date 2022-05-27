package com.sdet34l1.genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.jdbc.Driver;

public class Databaseutility {

	static Connection connection;
	static Statement statement;

	/**
	 * 
	 * This method is used to open the database connection
	 * @param dburl
	 * @param dbuserName
	 * @param dbpassWord
	 */
	
	
	
	
	public static void openDBConnection(String dburl,String dbuserName,String dbpassWord )
	{
		Driver driver = null;
		try {
			driver = new Driver();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			connection= DriverManager.getConnection(dburl,dbuserName,dbpassWord);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * 
	 * This method is used to get data from database 
	 * @param query
	 * @param columnName
	 * @return
	 */
	public static  ArrayList<String>getDataFromDataBase(String query,String columnName)
	{
		ArrayList<String> list = new ArrayList<>();

		ResultSet result = null;
		try {
			result = statement.executeQuery(query);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			while(result.next())
			{
				list.add(result.getString(columnName));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 
	 * This method is used to validate the data which is present in database or not
	 * @param query
	 * @param columnName
	 * @param expectedData
	 * @return
	 */
	public static boolean ValidDateDataInDatabase(String query, String columnName ,String expectedData )
	{

		ArrayList<String>list1=getDataFromDataBase(query,columnName);
		boolean flag=false;
		for(String actualData:list1)
		{
			if(actualData.equalsIgnoreCase(expectedData)) {
				flag=true;
				break;
			}
		}



		return flag;

	}
	
	/**
	 * 
	 * This method is used to set the data into database
	 * @param query
	 */


	public static  void setDataInDatabase(String query) {
		int result = 0;
		try {
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result>=1) {
			System.out.println("Data entered /modified successfully");
		}
	}
	public static void closeDBconnection()
	{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




