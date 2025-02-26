package com.project.beans;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

//import com.sun.xml.internal.fastinfoset.sax.Properties;

public class WritePropertiesFile {
	
	public static void main(final String[] args) {

		final Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("build/config.properties");

			prop.setProperty("db.url", "jdbc:mysql://localhost:3306/tp_jee");
			prop.setProperty("db.user", "root");
			prop.setProperty("db.password", "");

			prop.store(output, null);

		} catch (final IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
