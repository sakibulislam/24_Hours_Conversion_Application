
public class ConvertTo24HourFormat {
	
	public String convertTo24HourFormat(String givenTime){
//      String givenTime = "08:00:00 AM";
      String convertedTime = "";
      if (givenTime.contains("AM") && Integer.parseInt(givenTime.substring(0,2)) != 12 ){
          convertedTime = givenTime.substring(0,8);
      } else if (givenTime.contains("AM") && Integer.parseInt(givenTime.substring(0,2)) == 12 ){
          convertedTime = givenTime.replace("12", "00").substring(0,8);
      } else if (givenTime.contains("PM") && Integer.parseInt(givenTime.substring(0,2)) != 12 ){
          int prevValue = Integer.parseInt(givenTime.substring(0,2));
          int convertedValue = prevValue + 12;
          System.out.println("convertedValue: " + convertedValue);
          convertedTime = givenTime.replace(givenTime.substring(0,2), String.valueOf(convertedValue)).substring(0,8);
      } else if (givenTime.contains("PM") && Integer.parseInt(givenTime.substring(0,2)) == 12 ){
          convertedTime = givenTime.substring(0,8);
      }
      return convertedTime;
  }

}
