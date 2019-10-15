package examples.SecurityOperations;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to remove document password.
 */
public class RemoveDocumentPassword {

	public static void main(String[] args) {		

		SecurityApi apiInstance = new SecurityApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/password-protected.docx");
			fileInfo.setPassword("password");

			Options options = new Options();
			options.setFileInfo(fileInfo);
			options.setOutputPath("output/remove-password.docx");

			RemovePasswordRequest request = new RemovePasswordRequest(options);

			DocumentResult response = apiInstance.removePassword(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}