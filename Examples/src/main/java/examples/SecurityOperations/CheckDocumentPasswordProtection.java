package examples.SecurityOperations;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to check document password.
 */
public class CheckDocumentPasswordProtection {

	public static void main(String[] args) {		

		SecurityApi apiInstance = new SecurityApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/password-protected.docx");			

			CheckPasswordRequest request = new CheckPasswordRequest(fileInfo.getFilePath(), Common.MYStorage, null);

			PasswordResult response = apiInstance.checkPassword(request);

			System.err.println("checkPassword: " + response.getIsPasswordSet());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}