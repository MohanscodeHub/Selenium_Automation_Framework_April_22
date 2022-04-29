package com.clipboard.utils;

import com.clipboard.constants.FrameworkConstants;
import com.st.API.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Readfile_util {

	private Readfile_util() {

	}

	private static Properties prop = new Properties();
	public static final Map<String,String> CONFIGMAP = new HashMap<String,String>();

	static {
		try {
			FileInputStream file = new FileInputStream(FrameworkConstants.getCONFIGPATH());
			prop.load(file);
			
			for (Object Key : prop.keySet()) {
				
				CONFIGMAP.put(String.valueOf(Key),String.valueOf(prop.get(Key)).trim());
			}
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}


}
