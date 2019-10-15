package examples.PagesOperations;

import java.util.Arrays;
import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to rotate document pages.
 */
public class RotatePages {

	public static void main(String[] args) {		

		PagesApi apiInstance = new PagesApi(Common.GetConfiguration());

		try {
			FileInfo fileInfo = new FileInfo();			
			fileInfo.setFilePath("Pdf/ten-pages.pdf");

			RotateOptions options = new RotateOptions();
			options.setFileInfo(fileInfo);
			options.setOutputPath("output/rotate-pages.pdf");
			options.setPages(Arrays.asList(2, 4));
			options.setMode(RotateOptions.ModeEnum.ROTATE90);

			RotateRequest request = new RotateRequest(options);

			DocumentResult response = apiInstance.rotate(request);

			System.err.println("Output file path: " + response.getPath());
		
		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}