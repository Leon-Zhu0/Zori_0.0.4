// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.util;

public class StringUtils
{
    public static boolean isNumber(final String string) {
        try {
            Integer.parseInt(string);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
