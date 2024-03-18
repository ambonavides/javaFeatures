package com.estudos.feature.java8._07_java_script_nashorn;

import java.io.FileReader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScriptExemplo {
	
	public static void main(String[] args) {
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("nashorn");
		
		//irá lançar NullPointerException em ee.getBindgs pois ee está vindo null
		//isto porque nashorn foi removido completamente desde o java 15. Para usar
		//este tipo de implementação é necessário procurar algum framework que 
		//que trabalhe com ECMAScript.
		Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
		
		try {
			//exibe no console "Olá Mundo!"
			ee.eval(new FileReader("olamnundo.js"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
