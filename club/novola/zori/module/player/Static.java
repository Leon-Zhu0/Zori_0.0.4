// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.module.player;

import club.novola.zori.util.Wrapper;
import club.novola.zori.module.Module;

public class Static extends Module
{
    public Static() {
        super("Static", Category.PLAYER);
    }
    
    @Override
    public void onUpdate() {
        if (Wrapper.getPlayer().isAirBorne) {
            Wrapper.getPlayer().motionY = 0.0;
        }
    }
}
