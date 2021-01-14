package com.eziosoft.threedeepatch.mixin;

import net.minecraft.MinecraftVersion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = MinecraftVersion.class)
public class Protocol {

	@Overwrite
	public int getProtocolVersion() {
		return 5;
	}

	@Overwrite
	public String getName() {
		return "3D \"Registered\" v1.34";
	}



}
