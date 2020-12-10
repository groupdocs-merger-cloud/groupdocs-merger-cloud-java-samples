package examples;
import com.groupdocs.cloud.merger.client.*;

public class Common {

	// TODO: Get your ClientId and ClientSecret at https://dashboard.groupdocs.cloud (free
	// registration is required).

	private static String ClientId = "xxxxxxxxxxxxx";
	private static String ClientSecret = "xxxxxxxxxxxxx";
	public static String MYStorage = "First Storage";

	public static Configuration GetConfiguration()
	{
		Configuration cfg = new Configuration(Common.ClientId, Common.ClientSecret);		
		cfg.setTimeout(60000);
		return cfg;
	}
}