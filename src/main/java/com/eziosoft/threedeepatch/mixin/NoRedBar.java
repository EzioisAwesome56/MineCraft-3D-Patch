package com.eziosoft.threedeepatch.mixin;

import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = GameRenderer.class)
public abstract class NoRedBar {

    // this draws the stupid red bar at the top of the screen.
    // Making this function do nothing will stop this from happening.
    @Overwrite
    private void method_20281(){
        return;
    }
}
