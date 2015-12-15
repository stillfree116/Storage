package com.spoloborota.teaching.storage.processor.type;

import com.spoloborota.teaching.storage.model.Model;

public class Use {
	public static String process(Model model, String[] commandWords) {
		boolean isSelected = model.use(commandWords[1]);
		if (isSelected) {
			return "Selected storage: " + commandWords[1];
		} else {
			return "Storage with name " + commandWords[1] + " does not exist";
		}
	}
}
