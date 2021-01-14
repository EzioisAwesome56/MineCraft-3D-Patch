package com.eziosoft.dank.mixin;

import com.mojang.bridge.game.GameVersion;
import net.minecraft.MinecraftVersion;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Date;

@Mixin(value = MinecraftVersion.class)
public abstract class Protocol implements GameVersion {

	@Overwrite
	public int getProtocolVersion() {
		return 5;
	}

	@Overwrite
	public String getName() {
		return "3D \"Registered\" v1.34";
	}



}
