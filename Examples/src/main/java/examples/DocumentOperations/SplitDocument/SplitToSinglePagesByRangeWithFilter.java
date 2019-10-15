package examples.DocumentOperations.SplitDocument;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to split the document to several one-page documents (by start/end page numbers and even/odd filter).
 */
public class SplitToSinglePagesByRangeWithFilter {

	public static void main(String[] args) {		

		DocumentApi apiInstance = new DocumentApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/sample-10-pages.docx");

			SplitOptions options = new SplitOptions();
			options.setFileInfo(fileInfo);
			options.setOutputPath("output/split-by-start-end-numbers-with-filter");
			options.setStartPageNumber(3);
			options.setEndPageNumber(7);
			options.setRangeMode(PageOptions.RangeModeEnum.ODDPAGES);
			options.setMode(SplitOptions.ModeEnum.PAGES);

			SplitRequest request = new SplitRequest(options);

			MultiDocumentResult response = apiInstance.split(request);

			for (DocumentResult documentResult : response.getDocuments()) {
				System.err.println("Output file path: " + documentResult.getPath());
			}			
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}