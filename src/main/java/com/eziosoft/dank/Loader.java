package com.eziosoft.dank;

import net.fabricmc.api.ModInitializer;

public class Loader implements ModInitializer {

	public static CorrectArgs fix;

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Minecraft 3D crack loaded!");
	}
}
