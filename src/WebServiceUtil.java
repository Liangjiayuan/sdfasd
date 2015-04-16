
import java.security.PublicKey;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class WebServiceUtil {
	public static boolean isError = false;

	private static final String SERVICE_NAMESPACE = "http://www.adl-ssc.com/UserManageService/";
	
	private static final String SERVICE_URL = "http://202.116.48.86:8080/WeiTuTelematics_1.0.0/UserManageServiceImplService/UserManageServiceImpl?wsdl";

	public static String callService(String method, String[] paramNames,
			String[] paramValues) {
		HttpTransportSE httpTranstation = new HttpTransportSE(SERVICE_URL);
		httpTranstation.debug = true;
		
		SoapObject request = new SoapObject(SERVICE_NAMESPACE, method);
		for (int i = 0; i < paramNames.length; i++) {
			request.addProperty(paramNames[i], paramValues[i]);
		}
		SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
				SoapEnvelope.VER11);
		envelope.dotNet = false;
		envelope.bodyOut = request;
		envelope.setOutputSoapObject(request);

		try {
			httpTranstation.call(null, envelope);
			if (envelope.getResponse() != null) {
				int method_len = method.length();
				SoapObject bodyIn = (SoapObject) envelope.bodyIn;
				String temp = bodyIn.toString();
				int temp_len = temp.length();
				String[] str_details = temp.substring(method_len+9, temp_len-3).split("=");
				String str_detail = str_details[1];			
				return str_detail;
			}
		} catch (Exception e) {
			isError = true;
			e.printStackTrace();		
		}
		return "error";
		
	}

}
