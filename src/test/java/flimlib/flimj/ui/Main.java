package flimlib.flimj.ui;

import io.scif.services.DatasetIOService;

import net.imagej.Dataset;

import org.scijava.Context;
import org.scijava.command.CommandService;
import org.scijava.ui.UIService;

import flimlib.flimj.ui.FLIMJCommand;

public class Main {

	public static void main(String[] args) throws Exception {
		Context context = new Context();
		CommandService command = context.service(CommandService.class);
		UIService ui = context.service(UIService.class);
		DatasetIOService datasetIO = context.service(DatasetIOService.class);
		ui.showUI();
		Dataset trans = datasetIO.open("test_files/input.sdt");
		ui.show(trans);
		command.run(FLIMJCommand.class, true);
	}
}
