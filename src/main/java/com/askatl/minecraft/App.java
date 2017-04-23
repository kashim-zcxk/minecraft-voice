package com.askatl.minecraft;

import com.mojang.text2speech.Narrator;

/**
 * Aplicacion que lee texto usando una biblioteca de Minecraft - Mojang.
 * 
 * @author Marco Antonio cruz
 *
 */

public class App {
	public static void main(String[] args) {
		/* Ubicacion de la biblioteca */
		System.setProperty("jna.library.path", "./src/natives/resources/");

		Narrator narrator = Narrator.getNarrator();
		narrator.say("Hola mundo!!!!");

		while (true) {
			try {
				Thread.sleep(100L);
				System.exit(0);
			} catch (InterruptedException arg2) {
				arg2.printStackTrace();
			}
		}
	}
}
