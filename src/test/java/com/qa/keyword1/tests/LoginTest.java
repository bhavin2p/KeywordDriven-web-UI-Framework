package com.qa.keyword1.tests;

import org.testng.annotations.Test;

import com.qa.keyword1.engine.KeyWordEngine;

public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest() {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}

}
