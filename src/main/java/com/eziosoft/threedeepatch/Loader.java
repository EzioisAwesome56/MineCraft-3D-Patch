package com.eziosoft.threedeepatch;

import com.google.gson.Gson;
import net.fabricmc.api.ModInitializer;

import java.io.*;
import java.net.MalformedURLException;

public class Loader implements ModInitializer {

	public static CorrectArgs fix;
	public static Options globalopts;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("MineCraft 3D Patch starting up...");
		File config = new File("./config/3dpatch.json");
		// check if our config file even exists
		Gson g = new Gson();
		try {
				if (!config.exists()) {
					if (!new File("./config").exists()){
						new File("./config").mkdir();
					}
					Options op = new Options(false);
					BufferedWriter write = new BufferedWriter(new FileWriter(config));
					write.write(g.toJson(op));
					write.close();
					globalopts = op;
				} else {
					FileInputStream fis = new FileInputStream(config);
					byte[] data = new byte[(int) config.length()];
					fis.read(data);
					fis.close();
					Options op = g.fromJson(new String(data, "UTF-8"), Options.class);
					globalopts = op;
				}

			} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Minecraft 3D Patch loaded!");
	}
}
