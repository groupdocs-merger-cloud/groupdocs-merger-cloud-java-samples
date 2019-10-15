package examples.PagesOperations.ExtractPages;

import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to extract document pages by specifying page numbers range.
 */
public class ExtractPagesByRange {

	public static void main(String[] args) {		

		PagesApi apiInstance = new PagesApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/sample-10-pages.docx");

			ExtractOptions options = new ExtractOptions();
			options.setFileInfo(fileInfo);
			options.setOutputPath("output/extract-pages-by-range.docx");
			options.setStartPageNumber(1);
			options.setEndPageNumber(10);
			options.setRangeMode(PageOptions.RangeModeEnum.EVENPAGES);

			ExtractRequest request = new ExtractRequest(options);

			DocumentResult response = apiInstance.extract(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}