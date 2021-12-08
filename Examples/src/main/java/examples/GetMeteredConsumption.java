package examples;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.api.LicenseApi;


/**
 * This example demonstrates how to get metered license consumption information
 */
public class GetMeteredConsumption {

	public static void main(String[] args) {
		
		LicenseApi apiInstance = new LicenseApi(Common.GetConfiguration());
		
		try {
			ConsumptionResult response = apiInstance.getConsumptionCredit();

			System.out.println("Credit: " + response.getCredit());
			System.out.println("Quantity: " + response.getQuantity());
		} catch (ApiException e) {
			System.err.println("Exception while calling LicenseApi:");
			e.printStackTrace();
		}
	}
}