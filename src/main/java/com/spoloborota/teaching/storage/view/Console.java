package com.spoloborota.teaching.storage.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.spoloborota.teaching.storage.model.RAM;
import com.spoloborota.teaching.storage.processor.Processor;

public class Console {
	RAM ram;
	Processor processor;
	
	BufferedReader bufferedReader;
	
	public Console(RAM ram, Processor processor) {
		this.ram = ram;
		this.processor = processor;
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	void startListen() {
		while(true) {
			try {
				String s = bufferedReader.readLine();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
