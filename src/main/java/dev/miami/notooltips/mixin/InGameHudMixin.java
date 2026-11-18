package dev.miami.notooltips.mixin;

import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin {
	@Inject(at = @At("HEAD"), method = "renderHeldItemTooltip", cancellable = true)
	private void onRenderHeldItemTooltip(CallbackInfo ci) {
		ci.cancel();
	}
}