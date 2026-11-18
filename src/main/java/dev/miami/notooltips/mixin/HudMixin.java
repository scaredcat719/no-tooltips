package dev.miami.notooltips.mixin;

import net.minecraft.client.gui.Hud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Hud.class)
public class HudMixin {
	@Inject(at = @At("HEAD"), method = "extractSelectedItemName", cancellable = true)
	private void onExtractSelectedItemName(CallbackInfo ci) {
		ci.cancel();
	}
}