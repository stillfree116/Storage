package com.spoloborota.teaching.storage.main;

import com.spoloborota.teaching.storage.model.Model;
import com.spoloborota.teaching.storage.model.RAM;
import com.spoloborota.teaching.storage.processor.Processor;
import com.spoloborota.teaching.storage.view.Console;;

/**
 * Main class
 * @author Spoloborota
 *
 */
public class Main {

	public static void main(String[] args) {
		Model model = new RAM();
		Processor processor = new Processor(model);
		Console console = new Console(processor);
		console.startListen();
	}

}
