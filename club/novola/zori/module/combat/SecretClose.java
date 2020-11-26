// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.module.combat;

import net.minecraft.network.play.client.CPacketCloseWindow;
import club.novola.zori.event.PacketSendEvent;
import club.novola.zori.module.Module;

public class SecretClose extends Module
{
    public SecretClose() {
        super("SecretClose", Category.COMBAT);
    }
    
    public void onPacketSend(final PacketSendEvent event) {
        if (event.getPacket() instanceof CPacketCloseWindow) {
            event.setCanceled(true);
        }
    }
}
