package com.eziosoft.threedeepatch.mixin;

import com.eziosoft.threedeepatch.Loader;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = MinecraftClient.class)
public abstract class DemoPatch {

    @Overwrite
    public final boolean isDemo() {
        return Loader.fix.isDemo();
    }

}
