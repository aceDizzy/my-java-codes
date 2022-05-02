package sourceCodes;

public class Electricity {
	  public static void main(String[] args) {

	    // declare variables
	    String userName,serviceType;
	    char serviceCode;
	    int userID;
	    double presReading,prevReading,consumption,ratePerCu,bill;

	    // assign data
	    userName="Anna Clarisse"; userID=0526; serviceCode='J';
	    serviceType="Water Domestic"; presReading=2139;
	    prevReading=2032; ratePerCu=1.75;

	    // computation
	    consumption=presReading-prevReading;
	    bill=consumption*ratePerCu;

	    // display
	    System.out.printf("\n");
	    System.out.printf("User Name          : %s\n",userName);
	    System.out.printf("User ID            : %d\n",userID);
	    System.out.printf("Service Code       : %s\n",serviceCode);
	    System.out.printf("Service Type       : %s\n\n",serviceType);
	    System.out.printf("Present Reading    : %7.2f\n",presReading);
	    System.out.printf("Previous Reading   : %7.2f\n",prevReading);
	    System.out.printf("Consumption        : %7.2f\n\n",consumption);
	    System.out.printf("Rate per cu.m      : %7.2f\n",ratePerCu);
	    System.out.printf("Monthly Water Bill : %7.2f\n",bill);
	  }
	}