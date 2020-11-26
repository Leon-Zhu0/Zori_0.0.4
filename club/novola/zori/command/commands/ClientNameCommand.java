// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.command.commands;

import org.lwjgl.opengl.Display;
import club.novola.zori.Zori;
import club.novola.zori.command.Command;

public class ClientNameCommand extends Command
{
    public ClientNameCommand() {
        super(new String[] { "clientname", "name", "cn" }, "clientname <name>");
    }
    
    public void exec(final String[] args) throws Exception {
        if (!args[0].replace("__", " ").equalsIgnoreCase("")) {
            Zori.MODNAME = args[0].replace("__", " ");
            Display.setTitle(Zori.MODNAME + " " + "v0.0.4-BETA");
            Command.sendClientMessage("set client name to " + args[0].replace("__", " "), false);
        }
        else {
            Command.sendClientMessage(this.getSyntax(), false);
        }
    }
    
    @Override
    public void exec(final String args) throws Exception {
    }
}
