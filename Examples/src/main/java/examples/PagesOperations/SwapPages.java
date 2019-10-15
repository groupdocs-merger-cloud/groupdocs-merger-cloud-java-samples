package examples.PagesOperations;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to swap document pages.
 */
public class SwapPages {

	public static void main(String[] args) {		

		PagesApi apiInstance = new PagesApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/four-pages.docx");

			SwapOptions options = new SwapOptions();
			options.setFileInfo(fileInfo);
			options.setOutputPath("output/swap-pages.docx");
			options.setFirstPageNumber(2);
			options.setSecondPageNumber(4);

			SwapRequest request = new SwapRequest(options);

			DocumentResult response = apiInstance.swap(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}