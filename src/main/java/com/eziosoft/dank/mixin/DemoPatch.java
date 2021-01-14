package com.eziosoft.dank.mixin;

import com.eziosoft.dank.Loader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = MinecraftClient.class)
public abstract class DemoPatch {

    @Overwrite
    public final boolean isDemo() {
        return Loader.fix.isDemo();
    }

}
