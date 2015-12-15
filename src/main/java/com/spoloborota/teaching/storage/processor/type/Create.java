package com.spoloborota.teaching.storage.processor.type;

import com.spoloborota.teaching.storage.model.Model;

public class Create {
	
	public static String process(Model model, String[] commandWords) {
		boolean isCreated = model.create(commandWords[1]);
		if (isCreated) {
			return "Storage " + commandWords[1] + " is created";
		} else {
			return "Storage " + commandWords[1] + " already exists";
		}
	}
}
