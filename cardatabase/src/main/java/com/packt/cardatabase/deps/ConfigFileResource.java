package com.packt.cardatabase.deps;

import java.io.File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration		// ConfigFileResource 파일을 설정용으로 사용하겠다는 표시
public class ConfigFileResource {
	@Bean(name = "configFile")	// configfile.xml 파일을 configFile으로 관리하겠다는 표시
	public File configFile() {
		File configFile = new File("configfile.xml");
		return configFile;
	}
}

// configfile.xml 파일의 내용을 읽어와서 cFile로 만들어서 사용가능 - D/I