package examples.DocumentOperations;

import java.util.Arrays;
import java.util.List;
import com.groupdocs.cloud.merger.client.*;
import com.groupdocs.cloud.merger.model.*;
import com.groupdocs.cloud.merger.model.requests.*;
import com.groupdocs.cloud.merger.api.*;
import examples.Common;

/**
 * This example demonstrates how to mix specific pages from several source documents.
 */
public class MixPages {

    public static void main(String[] args) {

        DocumentApi apiInstance = new DocumentApi(Common.GetConfiguration());

        try {
            // Prepare FileInfo list
            FileInfo fileInfo1 = new FileInfo();
            fileInfo1.setFilePath("WordProcessing/sample-10-pages.docx");
            FileInfo fileInfo2 = new FileInfo();
            fileInfo2.setFilePath("WordProcessing/four-pages.docx");
            List<FileInfo> files = Arrays.asList(fileInfo1, fileInfo2);

            // Prepare MixPagesItem list
            MixPagesItem item1 = new MixPagesItem();
            item1.setFileIndex(0);
            item1.setPages(Arrays.asList(1, 2));

            MixPagesItem item2 = new MixPagesItem();
            item2.setFileIndex(1);
            item2.setPages(Arrays.asList(1, 2));

            MixPagesItem item3 = new MixPagesItem();
            item3.setFileIndex(0);
            item3.setPages(Arrays.asList(3, 4));

            List<MixPagesItem> filesPages = Arrays.asList(item1, item2, item3);

            // Set options
            MixPagesOptions options = new MixPagesOptions();
            options.setFiles(files);
            options.setFilesPages(filesPages);
            options.setOutputPath("Output/mixed-pages.docx");

            // Create and send request
            MixRequest request = new MixRequest(options);
            DocumentResult response = apiInstance.mix(request);

            System.out.println("Output file path: " + response.getPath());

        } catch (ApiException e) {
            System.out.println("Exception while calling api: " + e.getMessage());
        }
    }
}