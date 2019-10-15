package examples.PagesOperations;

import java.util.Arrays;
import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to change document page orientation.
 */
public class ChangePageOrientation {

	public static void main(String[] args) {		

		PagesApi apiInstance = new PagesApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("WordProcessing/four-pages.docx");

			OrientationOptions options = new OrientationOptions();
			options.setFileInfo(fileInfo);
			options.setOutputPath("output/change-page-orientation.docx");
			options.setPages(Arrays.asList(2, 4));
			options.setMode(OrientationOptions.ModeEnum.LANDSCAPE);

			OrientationRequest request = new OrientationRequest(options);

			DocumentResult response = apiInstance.orientation(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}