// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.module.render;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import club.novola.zori.util.Wrapper;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import club.novola.zori.setting.Setting;
import club.novola.zori.module.Module;

public class NoRender extends Module
{
    private Setting<Boolean> armorBar;
    private Setting<Boolean> rain;
    
    public NoRender() {
        super("NoRender", Category.RENDER);
        this.armorBar = (Setting<Boolean>)this.register("ArmorBar", false);
        this.rain = (Setting<Boolean>)this.register("Rain", true);
    }
    
    @SubscribeEvent
    public void preRenderGameOverlay(final RenderGameOverlayEvent.Pre event) {
        if (event.getType().equals((Object)RenderGameOverlayEvent.ElementType.ARMOR) && this.armorBar.getValue()) {
            event.setCanceled(true);
        }
        if (this.rain.getValue()) {
            Wrapper.getWorld().setRainStrength(0.0f);
        }
    }
}
