package examples.DocumentOperations;

import java.util.Arrays;
import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to join specific pages from several source documents.
 */
public class JoinPagesFromVariousDocuments {

	public static void main(String[] args) {		

		DocumentApi apiInstance = new DocumentApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo1 = new FileInfo();			
			fileInfo1.setFilePath("WordProcessing/sample-10-pages.docx");
			JoinItem item1 = new JoinItem();
			item1.setFileInfo(fileInfo1);
			item1.setPages(Arrays.asList(3, 6, 8));

			FileInfo fileInfo2 = new FileInfo();			
			fileInfo2.setFilePath("WordProcessing/four-pages.docx");
			JoinItem item2 = new JoinItem();
			item2.setFileInfo(fileInfo2);
			item2.setStartPageNumber(1);
			item2.setEndPageNumber(4);
			item2.setRangeMode(JoinItem.RangeModeEnum.ODDPAGES);

			JoinOptions options = new JoinOptions();
			options.setJoinItems(Arrays.asList(item1, item2));
			options.setOutputPath("output/joined-pages.docx");

			JoinRequest request = new JoinRequest(options);

			DocumentResult response = apiInstance.join(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}