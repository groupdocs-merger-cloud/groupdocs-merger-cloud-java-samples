package examples;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;

/**
 * This example demonstrates how to get document info.
 */
public class GetDocumentInformation {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Common.GetConfiguration());
		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/password-protected.docx");
			fileInfo.setPassword("password");

			GetInfoRequest request = new GetInfoRequest(fileInfo);

			InfoResult response = apiInstance.getInfo(request);

			System.err.println("InfoResult.Pages.Count: " + response.getPages().size());
		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}