package com.eziosoft.dank.mixin;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.resource.SynchronousResourceReloadListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = GameRenderer.class)
public abstract class NoRedBar implements AutoCloseable, SynchronousResourceReloadListener {

    @Shadow private final MinecraftClient client;

    protected NoRedBar(MinecraftClient client) {
        this.client = client;
    }

    // this draws the stupid red bar at the top of the screen.
    // Making this function do nothing will stop this from happening.
    @Overwrite
    private void method_20281(){
        return;
    }
}
