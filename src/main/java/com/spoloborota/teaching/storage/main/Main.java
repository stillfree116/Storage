package com.spoloborota.teaching.storage.main;

import com.spoloborota.teaching.storage.model.RAM;
import com.spoloborota.teaching.storage.processor.Processor;

public class Main {

	public static void main(String[] args) {
		RAM ram = new RAM();
		Processor processor = new Processor(ram);

	}

}
