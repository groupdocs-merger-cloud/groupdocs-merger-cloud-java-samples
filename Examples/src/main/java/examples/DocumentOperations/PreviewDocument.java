package examples.DocumentOperations;

import java.util.Arrays;
import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to generate document pages preview.
 */
public class PreviewDocument {

	public static void main(String[] args) {		

		DocumentApi apiInstance = new DocumentApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/four-pages.docx");

			PreviewOptions options = new PreviewOptions();
			options.setFileInfo(fileInfo);
			options.setPages(Arrays.asList(1, 3));
			options.setOutputPath("output/preview-page");
			options.setFormat(PreviewOptions.FormatEnum.PNG);

			PreviewRequest request = new PreviewRequest(options);

			MultiDocumentResult response = apiInstance.preview(request);

			for (DocumentResult documentResult : response.getDocuments()) {
				System.err.println("Output file path: " + documentResult.getPath());
			}			
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}