// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.module.movement;

import club.novola.zori.util.Wrapper;
import club.novola.zori.setting.Setting;
import club.novola.zori.module.Module;

public class Sprint extends Module
{
    private Setting<Boolean> Rage;
    
    public Sprint() {
        super("Sprint", Category.MOVEMENT);
        this.Rage = (Setting<Boolean>)this.register("Rage", false);
    }
    
    @Override
    public void onUpdate() {
        if (Wrapper.getPlayer() == null) {
            return;
        }
        if (this.Rage.getValue()) {
            if (Wrapper.getPlayer().moveForward != 0.0f) {
                Wrapper.getPlayer().setSprinting(true);
            }
        }
        else if (Wrapper.getPlayer().moveForward > 0.0f) {
            Wrapper.getPlayer().setSprinting(true);
        }
    }
}
