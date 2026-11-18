package dev.miami.notooltips.mixin;

import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiMixin {
	@Inject(at = @At("HEAD"), method = "extractSelectedItemName", cancellable = true)
	private void onExtractSelectedItemName(CallbackInfo ci) {
		ci.cancel();
	}
}