package examples;
import com.groupdocs.cloud.merger.client.*;

public class Common {

	// TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free
	// registration is required).

	private static String AppSID = "xxxxxxxxxxxxx";
	private static String AppKey = "xxxxxxxxxxxxx";
	public static String MYStorage = "First Storage";

	public static Configuration GetConfiguration()
	{
		Configuration cfg = new Configuration(Common.AppSID, Common.AppKey);		
		cfg.setTimeout(60000);
		return cfg;
	}
}