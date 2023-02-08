package examples;

import examples.DocumentOperations.*;
import examples.DocumentOperations.SplitDocument.*;
import examples.PagesOperations.*;
import examples.PagesOperations.ExtractPages.*;
import examples.SecurityOperations.*;

public class RunExamples {

	public static void main(String[] args) {

		// Upload files
		UploadResoruces.main(args);

		// Info API examples
		GetSupportedFileTypes.main(args);
		GetDocumentInformation.main(args);

		// Document API examples
		JoinMultipleDocuments.main(args);
		JoinWordDocumentsContinous.main(args);
		JoinPagesFromVariousDocuments.main(args);
		JoinDocumentsCrossFormat.main(args);
		JoinImages.main(args);
		PreviewDocument.main(args);
		SplitToMultiPageDocuments.main(args);
		SplitToSinglePages.main(args);
		SplitToSinglePagesByRange.main(args);
		SplitToSinglePagesByRangeWithFilter.main(args);
		ImportAttachment.main(args);

		// Pages API examples
		ChangePageOrientation.main(args);
		MovePage.main(args);
		RemovePages.main(args);
		RotatePages.main(args);
		SwapPages.main(args);
		ExtractPagesByNumbers.main(args);
		ExtractPagesByRange.main(args);

		// Security API examples
		CheckDocumentPasswordProtection.main(args);
		AddDocumentPassword.main(args);
		UpdateDocumentPassword.main(args);
		RemoveDocumentPassword.main(args);


		System.out.println("Completed");
	}	
}