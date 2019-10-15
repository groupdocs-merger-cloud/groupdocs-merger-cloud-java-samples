package examples.SecurityOperations;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to add password to document.
 */
public class AddDocumentPassword {

	public static void main(String[] args) {		

		SecurityApi apiInstance = new SecurityApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/one-page.docx");
			fileInfo.setPassword("password");

			Options options = new Options();
			options.setFileInfo(fileInfo);
			options.setOutputPath("output/add-password.docx");

			AddPasswordRequest request = new AddPasswordRequest(options);

			DocumentResult response = apiInstance.addPassword(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}