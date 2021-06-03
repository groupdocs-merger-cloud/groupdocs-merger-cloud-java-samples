package examples.DocumentOperations;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to import attachment into pdf document
 */
public class ImportAttachment {

	public static void main(String[] args) {		

		DocumentApi apiInstance = new DocumentApi(Common.GetConfiguration());

		try {
			ImportOptions options = new ImportOptions();
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("Pdf/one-page-password.pdf");
			fileInfo.setPassword("password");			
			options.setFileInfo(fileInfo);			
			options.addAttachmentsItem("Txt/document.txt");
			options.setOutputPath("output/with-attachment.pdf");

			CallImportRequest request = new CallImportRequest(options);

			DocumentResult response = apiInstance.callImport(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}