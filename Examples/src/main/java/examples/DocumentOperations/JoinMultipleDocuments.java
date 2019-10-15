package examples.DocumentOperations;

import java.util.Arrays;
import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to join multiple documents into one document.
 */
public class JoinMultipleDocuments {

	public static void main(String[] args) {		

		DocumentApi apiInstance = new DocumentApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo1 = new FileInfo();			
			fileInfo1.setFilePath("WordProcessing/four-pages.docx");
			JoinItem item1 = new JoinItem();
			item1.setFileInfo(fileInfo1);

			FileInfo fileInfo2 = new FileInfo();			
			fileInfo2.setFilePath("WordProcessing/one-page.docx");
			JoinItem item2 = new JoinItem();
			item2.setFileInfo(fileInfo2);

			JoinOptions options = new JoinOptions();
			options.setJoinItems(Arrays.asList(item1, item2));
			options.setOutputPath("output/joined.docx");

			JoinRequest request = new JoinRequest(options);

			DocumentResult response = apiInstance.join(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}