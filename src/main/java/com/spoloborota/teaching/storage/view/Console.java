package com.spoloborota.teaching.storage.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.spoloborota.teaching.storage.processor.Processor;

/**
 * Commands received via system console
 * @author Spoloborota
 *
 */
public class Console {
	public Processor processor;
	
	public BufferedReader bufferedReader;
	
	public Console(Processor processor) {
		this.processor = processor;
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public void startListen() {
		while(true) {
			try {
				String commandString = bufferedReader.readLine();
				String result = processor.process(commandString);
				System.out.println(result);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
