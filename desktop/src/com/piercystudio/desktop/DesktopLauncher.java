package com.piercystudio.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.piercystudio.PiercyGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = PiercyGame.TITULO + " v" + PiercyGame.VERSION;
		config.vSyncEnabled = true;
		config.width = 800;
		config.height = 480;
		config.resizable = false;
		new LwjglApplication(new PiercyGame(), config);
	}
}
