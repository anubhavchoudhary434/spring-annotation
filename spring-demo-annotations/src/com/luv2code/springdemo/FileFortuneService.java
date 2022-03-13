package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:\\Users\\91958\\fortune-data.txt";
	private List<String> theFortunes;
	private Random myRandom = new Random();
	
	public FileFortuneService()
	{
		File thefile = new File(fileName);
		theFortunes = new ArrayList<String>();
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(thefile));
			String tempFortune;
			while((tempFortune=br.readLine())!=null)
			{
				
				theFortunes.add(tempFortune);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(theFortunes.size());
		String randomFortune = theFortunes.get(index);
		return randomFortune;
	}

}
