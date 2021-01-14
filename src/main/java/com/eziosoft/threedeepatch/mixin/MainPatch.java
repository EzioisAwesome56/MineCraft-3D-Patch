package com.eziosoft.threedeepatch.mixin;


import com.eziosoft.threedeepatch.CorrectArgs;
import com.eziosoft.threedeepatch.Loader;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import net.minecraft.client.main.Main;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Main.class)
public class MainPatch {

    @Inject(method = "main", at = @At("HEAD"))
    private static void getRightArgs(String[] strings_1, CallbackInfo ci){
        // spin up our own options parser
        OptionParser parse = new OptionParser();
        parse.allowsUnrecognizedOptions();
        parse.accepts("demo");
        // convert into option set
        OptionSet set = parse.parse(strings_1);
        // make new correctargs and store it for later
        Loader.fix = new CorrectArgs(set.has("demo"));
        return;
    }


}
