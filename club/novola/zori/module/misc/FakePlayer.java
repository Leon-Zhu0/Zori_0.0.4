// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.module.misc;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import com.mojang.authlib.GameProfile;
import java.util.UUID;
import club.novola.zori.util.Wrapper;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import club.novola.zori.module.Module;

public class FakePlayer extends Module
{
    private EntityOtherPlayerMP fake_player;
    
    public FakePlayer() {
        super("FakePlayer", Category.MISC);
    }
    
    @Override
    public void onUpdate() {
        if (Wrapper.mc.world == null) {
            this.disable();
        }
    }
    
    public void onEnable() {
        (this.fake_player = new EntityOtherPlayerMP((World)Wrapper.mc.world, new GameProfile(UUID.fromString("5b6a5015-a6eb-405d-bee6-a0a3e0514129"), "poop"))).copyLocationAndAnglesFrom((Entity)Wrapper.mc.player);
        this.fake_player.rotationYawHead = Wrapper.mc.player.rotationYawHead;
        Wrapper.mc.world.addEntityToWorld(-100, (Entity)this.fake_player);
    }
    
    public void onDisable() {
        try {
            Wrapper.mc.world.removeEntity((Entity)this.fake_player);
        }
        catch (Exception ex) {}
    }
}
