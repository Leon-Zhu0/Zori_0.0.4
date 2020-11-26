// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.module.render;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.util.math.Vec3d;
import java.util.Iterator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import club.novola.zori.util.RenderUtils;
import net.minecraft.entity.Entity;
import club.novola.zori.util.EntityUtils;
import net.minecraft.entity.player.EntityPlayer;
import club.novola.zori.util.Wrapper;
import club.novola.zori.module.Module;

public class PlayerESP extends Module
{
    public PlayerESP() {
        super("PlayerESP", Category.RENDER);
    }
    
    @Override
    public void onRender3D() {
        for (final EntityPlayer player : Wrapper.getWorld().playerEntities) {
            final Vec3d pos = EntityUtils.INSTANCE.getInterpolatedPos((Entity)player);
            RenderUtils.INSTANCE.prepare();
            GlStateManager.pushMatrix();
            GlStateManager.translate(pos.x, pos.y, pos.z);
            GlStateManager.glNormal3f(0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(-Wrapper.mc.getRenderManager().playerViewY, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(((Wrapper.mc.getRenderManager().options.thirdPersonView == 2) ? -1 : 1) * Wrapper.mc.getRenderManager().playerViewX, 1.0f, 0.0f, 0.0f);
            final Tessellator tessellator = Tessellator.getInstance();
            final BufferBuilder buffer = tessellator.getBuffer();
            buffer.begin(1, DefaultVertexFormats.POSITION_COLOR);
            GlStateManager.glLineWidth(1.0f);
            buffer.pos(pos.x, pos.y, pos.z).color(0.0f, 0.0f, 0.0f, 1.0f).endVertex();
            buffer.pos(pos.x + player.width, pos.y, pos.z).color(0.0f, 0.0f, 0.0f, 1.0f).endVertex();
            buffer.pos(pos.x + player.width, pos.y + player.height, pos.z).color(0.0f, 0.0f, 0.0f, 1.0f).endVertex();
            buffer.pos(pos.x, pos.y + player.height, pos.z).color(0.0f, 0.0f, 0.0f, 1.0f).endVertex();
            buffer.pos(pos.x, pos.y, pos.z).color(0.0f, 0.0f, 0.0f, 1.0f).endVertex();
            tessellator.draw();
            GlStateManager.popMatrix();
            RenderUtils.INSTANCE.finish();
        }
    }
}
