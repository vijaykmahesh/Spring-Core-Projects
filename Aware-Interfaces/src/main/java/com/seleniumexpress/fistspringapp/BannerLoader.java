package com.seleniumexpress.fistspringapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;


@Component
public class BannerLoader implements ResourceLoaderAware {

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		
		
		System.out.println("#BannerLoader");
		Resource resource = resourceLoader.getResource("file:C:\\Users\\vijay.krishnegowda\\Desktop\\banner.txt");
		
		try {
			InputStream inputStream = resource.getInputStream();
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
			
			String readLine = bf.readLine();
			
			while(readLine!=null) {
				
				System.out.println(readLine);
				readLine = bf.readLine();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
