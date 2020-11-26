// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.module.client;

import club.novola.zori.setting.Setting;
import club.novola.zori.module.Module;

public class Settings extends Module
{
    public Setting<String> commandPrefix;
    
    public Settings() {
        super("Settings", Category.CLIENT);
        this.commandPrefix = (Setting<String>)this.register("Prefix", ",");
    }
}
