package examples;
import com.groupdocs.cloud.merger.client.*;

public class Common {

	// TODO: Get your ClientId and ClientSecret at https://dashboard.groupdocs.cloud (free
	// registration is required).

	private static String ClientId = "XXXX-XXXX-XXXX-XXXX";
	private static String ClientSecret = "XXXXXXXXXXXXXXXX";
	public static String MYStorage = "First Storage";

	public static Configuration GetConfiguration()
	{
		Configuration cfg = new Configuration(Common.ClientId, Common.ClientSecret);		
		cfg.setTimeout(60000);
		cfg.setApiBaseUrl("https://api.groupdocs.cloud");
		return cfg;
	}
}