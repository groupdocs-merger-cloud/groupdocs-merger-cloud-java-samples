package examples;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.api.InfoApi;

/**
 * This example demonstrates how to obtain all supported file types.
 */
public class GetSupportedFileTypes {

	public static void main(String[] args) {
		
		InfoApi apiInstance = new InfoApi(Common.GetConfiguration());
		
		try {
			FormatsResult response = apiInstance.getSupportedFileFormats();

			for (Format format : response.getFormats()) {
				System.out.println(format.getFileFormat());
			}
		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}