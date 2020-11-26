// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.module.hud;

import club.novola.zori.module.Module;

public class Welcomer extends Module
{
    public static Welcomer INSTANCE;
    
    public Welcomer() {
        super("Welcomer", Category.HUD);
        Welcomer.INSTANCE = this;
    }
}
