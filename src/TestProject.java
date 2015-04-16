
public class TestProject {

	public static void main(String[] args) {
		//2015-04-07 19:59:59鎴�015-04-07杩欎袱鑰呭彲浠ラ�鎷╀竴绉嶈緭鍏�
		/*for(int i = 2000;i<100;i++){
			String t = String.valueOf(i);
			try {
				Thread.sleep(4*1000);
				addCarTouch(t, t, "2001-01-01");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}*/
		addCarTouch("3000", "3000", "2001-01-01");
		//ownerRegister("0001", "0001", "13268101234", "123456", "Benz", "SLK808S");
		//updateOwnerInfo("13268121311", "jack", "mfjk", "2100-01-03", "http:.../..../...jpg", "gailun@qq.com", "312", "123");
		
		//userLogin                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ("prince", "000000");
		//submitFeedback("prince", "2015-04-07 19:59:59", "鍝堝搱鍝堝搱鍝堝搱鍝堝搱锛屼綘杩欑儌杞欢锛�, "rt");
		//getCarInfo("0002");
		/*updateCarInfo("0002", "绮8888GZ", "涓扮敯", "姹夊叞杈�, "2014", "0002", "3.0T");
		getCarInfo("0002");
		isUserExist("hahahahahahahaahhahaprince");*/
		
		/*long bt = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			getOwnerInfo("prince");
		}
		System.out.println(System.currentTimeMillis() - bt);*/
	}
	
	public static void isUserExist(String userID) {
		String paramNames[] = {"userID"};
		String paramValues[] = {userID};
		System.out.println(WebServiceUtil.callService("isUserExist", paramNames, paramValues));
	}
	
	public static void addCarTouch(String carDeviceID, String carDevicePassword, String manufacturingDate) {
		String paramNames[] = {"carDeviceID", "carDevicePassword", "manufacturingDate"};
		String paramValues[] = {carDeviceID,carDevicePassword,manufacturingDate};
		System.out.println(WebServiceUtil.callService("addCarDevice", paramNames, paramValues));
	}
	
	public static void ownerRegister(String carDeviceID, String carDevicePassword, String userID, String userPassword, String carBrand, String carType) {
		String paramNames[] = {"carDeviceID", "carDevicePassword", "userID","userPassword", "carBrand", "carType"};
		String paramValues[] = {carDeviceID,carDevicePassword,userID,userPassword,carBrand,carType};
		System.out.println(WebServiceUtil.callService("ownerRegister", paramNames, paramValues));
	}
	
	public static void userLogin(String userID, String userPassword) {
		String paramNames[] = {"userID","userPassword"};
		String paramValues[] = {userID,userPassword};
		System.out.println(WebServiceUtil.callService("userLogin", paramNames, paramValues));
	}
	
	public static void getOwnerInfo(String userID) {
		String paramNames[] = {"userID"};
		String paramValues[] = {userID};
		System.out.println(WebServiceUtil.callService("getOwnerInfo", paramNames, paramValues));
	}
	
	public static void updateOwnerInfo(String userID, String userName, String sex,
			String birthDate, String icon, String email, String province,
			String city) {
		String paramNames[] = {"userID","userName","sex","birthDate","icon","email","province","city"};
		String paramValues[] = {userID,userName,sex,birthDate,icon,email,province,city};
		System.out.println(WebServiceUtil.callService("updateOwnerInfo", paramNames, paramValues));
	}
	
	public static void submitFeedback(String userID, String date, String title,
			String content) {
		String paramNames[] = {"userID","date","title","content"};
		String paramValues[] = {userID,date,title,content};
		System.out.println(WebServiceUtil.callService("submitFeedback", paramNames, paramValues));
	}
	
	public static void getCarInfo(String carID) {
		String paramNames[] = {"carID"};
		String paramValues[] = {carID};
		System.out.println(WebServiceUtil.callService("getCarInfo", paramNames, paramValues));
	}
	
	public static void updateCarInfo(String carID, String carNum, String carBrand,
			String carType, String carYear, String carDeviceID, String emission) {
		String paramNames[] = {"carID","carNum","carBrand","carType","carYear","carDeviceID","emission"};
		String paramValues[] = {carID,carNum,carBrand,carType,carYear,carDeviceID,emission};
		System.out.println(WebServiceUtil.callService("updateCarInfo", paramNames, paramValues));
	}
}
