package com.express.model;

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

	public void setResourceLoader(ResourceLoader resourceLoader) {

		System.out.println("#ResourceLoaderAware");
		Resource resource = resourceLoader.getResource("file:D:/Vijay Notes/banner.txt");

		InputStream inputStream;
		try {
			inputStream = resource.getInputStream();
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
			
			String line = bf.readLine();
			
			while (line!=null) {
				System.out.println(line);
				line = bf.readLine();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
