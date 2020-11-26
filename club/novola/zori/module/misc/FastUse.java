// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.module.misc;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemEndCrystal;
import net.minecraft.item.ItemExpBottle;
import club.novola.zori.util.Wrapper;
import club.novola.zori.module.Module;

public class FastUse extends Module
{
    public FastUse() {
        super("FastUse", Category.MISC);
    }
    
    @Override
    public void onUpdate() {
        if (Wrapper.getPlayer() == null) {
            return;
        }
        Wrapper.mc.playerController.blockHitDelay = 0;
        if (Wrapper.getPlayer().getHeldItemMainhand().getItem() instanceof ItemExpBottle || Wrapper.getPlayer().getHeldItemMainhand().getItem() instanceof ItemEndCrystal || this.offhand()) {
            Wrapper.mc.rightClickDelayTimer = 0;
        }
    }
    
    private boolean offhand() {
        final boolean item = Wrapper.getPlayer().getHeldItemOffhand().getItem() instanceof ItemEndCrystal || Wrapper.getPlayer().getHeldItemOffhand().getItem() instanceof ItemExpBottle;
        final boolean block = Wrapper.getPlayer().getHeldItemMainhand().getItem() instanceof ItemBlock;
        return item && !block;
    }
}
