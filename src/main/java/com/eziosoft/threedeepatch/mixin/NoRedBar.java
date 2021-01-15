package com.eziosoft.threedeepatch.mixin;

import com.eziosoft.threedeepatch.Loader;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = GameRenderer.class)
public abstract class NoRedBar {

    // this draws the stupid red bar at the top of the screen.
    // Making this function do nothing will stop this from happening.
    @Inject(method = "method_20281", at = @At("HEAD"), cancellable = true)
    private void doRedBar(CallbackInfo ci){
        if (Loader.globalopts.isRedbar()){
            return;
        } else {
            ci.cancel();
            return;
        }
    }
}
