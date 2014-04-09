package main;

import java.io.File;
import java.util.InputMismatchException;

import controller.Controller;

public class NimGame {
	/**
	 * Die Anzahl an durchzuf�hrenden Spielen.
	 */
	public static int NUMBER_OF_GAMES = 10;
	
	/**
	 * F�hrt eine Anzahl von Nimspielen durch. 
	 * @param args 0: Die Eingabedatei 1: Die Ausgabedatei
	 */
	public static void main(String[] args) {
		String in, out;
		
		if(args.length >= 2) { 
			in = args[0];
			out = args[1];
		} else {
			// TODO: nur zu debug- und testzwecken
			in = "resources/input/debug_example.in";
			out = "resources/output/debug_example.out";
		}
		
		try {
			Controller c = new Controller(new File(in), new File(out));
			c.playGames(NUMBER_OF_GAMES);
		} catch(InputMismatchException ime) {
			// ignore, because the error is already written to view
		} catch (Exception e) {
			System.err.println("Exception: " + e.getLocalizedMessage());
		}
	}
}
