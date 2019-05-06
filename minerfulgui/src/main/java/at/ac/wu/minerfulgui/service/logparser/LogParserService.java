package at.ac.wu.minerfulgui.service.logparser;

import javafx.concurrent.Task;

public interface LogParserService {

	public Task<Void> parseLog();
	
}
