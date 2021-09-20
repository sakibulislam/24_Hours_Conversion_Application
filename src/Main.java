
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConvertTo24HourFormat convertTo24HourFormatObj = new ConvertTo24HourFormat();
		
		String covertedTime = convertTo24HourFormatObj.convertTo24HourFormat("11:59:00 PM");
		
		System.out.println("Converted Time In 24 Hours Format: " + covertedTime);
		

	}

}
