/*
 * GameData.java
 * 
 * @author: E. Mendoza, J. Custodio, G. Brolo
 * 16/09/15
 * 
 * Guarda datos del juego.
 * 
 */

package com.piercystudio.handlers;

import java.io.Serializable;
import java.util.HashMap;

public class GameData implements Serializable{
	
	private static final long serialVersionUID = 1;
	public boolean firstRun;
	
	public int currentLevel = 0;
	public int exp;
	public int errores;
	public String resultado;
	
	public HashMap<Integer, Integer>lvlErrors;
	
	public GameData(){
		firstRun = true;
		lvlErrors = new HashMap<Integer, Integer>();
		
		lvlErrors.put(1, 0);
		lvlErrors.put(2, 0);
		lvlErrors.put(3, 0);
		lvlErrors.put(4, 0);
		lvlErrors.put(5, 0);
		lvlErrors.put(6, 0);
		lvlErrors.put(7, 0);
		lvlErrors.put(8, 0);
		lvlErrors.put(9, 0);
		lvlErrors.put(10, 0);
		lvlErrors.put(11, 0);
		lvlErrors.put(12, 0);
		lvlErrors.put(13, 0);
		lvlErrors.put(14, 0);
		lvlErrors.put(15, 0);
		lvlErrors.put(16, 0);
		lvlErrors.put(17, 0);
		lvlErrors.put(18, 0);
		lvlErrors.put(19, 0);
		lvlErrors.put(20, 0);
		lvlErrors.put(21, 0);
		lvlErrors.put(22, 0);
		lvlErrors.put(23, 0);
		lvlErrors.put(24, 0);
		lvlErrors.put(25, 0);
		
		
	}
	
	public void init(){
		
		/* Empezar juego en primer nivel */
		currentLevel = 1;
		exp = 0;
		errores = 0;
	}
	
	public int getCurrentLevel(){
		return currentLevel; 
	}
	
	public void setCurrentLevel(int level){
		currentLevel = level;
	}
	
	public boolean getFirstRun(){
		return firstRun;
	}
	
	public void addError(int level){
		errores += 1;
		lvlErrors.put(level, lvlErrors.get(level)+1);
	}
	
	public int getError(){
		return this.errores;
	}
	
	public void setExp(int exp){
		this.exp += exp;
	}
	
	public int getExp(){
		return this.exp;
	}
	
	public String getResultado(){
		if(exp > errores){
			resultado = "Buen trabajo.";
		}else if(errores > exp){
			resultado = "Necesita practicar.";
		}else if(exp == errores){
			resultado = "No hay progreso.";
		}
		return resultado;
	}

}
