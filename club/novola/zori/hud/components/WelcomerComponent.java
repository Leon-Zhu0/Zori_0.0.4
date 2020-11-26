// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.hud.components;

import club.novola.zori.Zori;
import club.novola.zori.util.Wrapper;
import club.novola.zori.module.hud.Welcomer;
import club.novola.zori.hud.HudComponent;

public class WelcomerComponent extends HudComponent<Welcomer>
{
    public WelcomerComponent() {
        super("Welcomer", 2, 2, Welcomer.INSTANCE);
    }
    
    @Override
    public void render() {
        if (Wrapper.getPlayer() != null) {
            super.render();
            Wrapper.getFontRenderer().drawStringWithShadow("Welcome, " + Wrapper.getPlayer().getName(), (float)this.x, (float)this.y, Zori.getInstance().clientSettings.getColor());
            this.width = Wrapper.getFontRenderer().getStringWidth(Zori.getInstance().toString());
        }
    }
}
