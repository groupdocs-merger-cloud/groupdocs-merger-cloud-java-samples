package examples.SecurityOperations;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to update document password.
 */
public class UpdateDocumentPassword {

	public static void main(String[] args) {		

		SecurityApi apiInstance = new SecurityApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/password-protected.docx");
			fileInfo.setPassword("password");

			UpdatePasswordOptions options = new UpdatePasswordOptions();
			options.setFileInfo(fileInfo);
			options.setOutputPath("output/update-password.docx");
			options.setNewPassword("newPassword");

			UpdatePasswordRequest request = new UpdatePasswordRequest(options);

			DocumentResult response = apiInstance.updatePassword(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}