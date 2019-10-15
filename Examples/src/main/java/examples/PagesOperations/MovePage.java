package examples.PagesOperations;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to move document page to a new position.
 */
public class MovePage {

	public static void main(String[] args) {		

		PagesApi apiInstance = new PagesApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/four-pages.docx");

			MoveOptions options = new MoveOptions();
			options.setFileInfo(fileInfo);
			options.setOutputPath("output/move-pages.docx");
			options.setPageNumber(1);
			options.setNewPageNumber(2);

			MoveRequest request = new MoveRequest(options);

			DocumentResult response = apiInstance.move(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}