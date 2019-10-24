package examples;

import examples.DocumentOperations.JoinMultipleDocuments;
import examples.DocumentOperations.JoinPagesFromVariousDocuments;
import examples.DocumentOperations.PreviewDocument;
import examples.DocumentOperations.SplitDocument.SplitToMultiPageDocuments;
import examples.DocumentOperations.SplitDocument.SplitToSinglePages;
import examples.DocumentOperations.SplitDocument.SplitToSinglePagesByRange;
import examples.DocumentOperations.SplitDocument.SplitToSinglePagesByRangeWithFilter;
import examples.PagesOperations.ChangePageOrientation;
import examples.PagesOperations.MovePage;
import examples.PagesOperations.RemovePages;
import examples.PagesOperations.RotatePages;
import examples.PagesOperations.SwapPages;
import examples.PagesOperations.ExtractPages.ExtractPagesByNumbers;
import examples.PagesOperations.ExtractPages.ExtractPagesByRange;
import examples.SecurityOperations.AddDocumentPassword;
import examples.SecurityOperations.CheckDocumentPasswordProtection;
import examples.SecurityOperations.RemoveDocumentPassword;
import examples.SecurityOperations.UpdateDocumentPassword;

public class RunExamples {

	public static void main(String[] args) {

		// Upload files
		UploadResoruces.main(args);

		// Info API examples
		GetSupportedFileTypes.main(args);
		GetDocumentInformation.main(args);

		// Document API examples
		JoinMultipleDocuments.main(args);
		JoinPagesFromVariousDocuments.main(args);
		PreviewDocument.main(args);
		SplitToMultiPageDocuments.main(args);
		SplitToSinglePages.main(args);
		SplitToSinglePagesByRange.main(args);
		SplitToSinglePagesByRangeWithFilter.main(args);

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