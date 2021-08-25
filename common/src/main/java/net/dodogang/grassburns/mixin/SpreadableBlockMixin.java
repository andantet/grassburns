package net.dodogang.grassburns.mixin;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SpreadableBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SpreadableBlock.class)
public class SpreadableBlockMixin {
    @Inject(method = "canSurvive", at = @At("HEAD"), cancellable = true)
    private static void onCanSurvive(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (world.getBlockState(pos.up()).getBlock() instanceof AbstractFireBlock) {
            cir.setReturnValue(false);
        }
    }
}
