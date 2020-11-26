// 
// Decompiled by Procyon v0.5.36
// 

package club.novola.zori.setting;

import java.util.function.Predicate;
import club.novola.zori.module.Module;

public class Setting<T>
{
    private final String name;
    private final Module parent;
    private T value;
    private T min;
    private T max;
    private final Predicate<Boolean> visible;
    
    public Setting(final String name, final T value, final Module parent) {
        this.name = name;
        this.value = value;
        this.parent = parent;
        this.visible = (b -> true);
    }
    
    public Setting(final String name, final T value, final T min, final T max, final Module parent) {
        this.name = name;
        this.value = value;
        this.min = min;
        this.max = max;
        this.parent = parent;
        this.visible = (b -> true);
    }
    
    public Setting(final String name, final T value, final Module parent, final Predicate<Boolean> visible) {
        this.name = name;
        this.value = value;
        this.parent = parent;
        this.visible = visible;
    }
    
    public Setting(final String name, final T value, final T min, final T max, final Module parent, final Predicate<Boolean> visible) {
        this.name = name;
        this.value = value;
        this.min = min;
        this.max = max;
        this.parent = parent;
        this.visible = visible;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Module getParent() {
        return this.parent;
    }
    
    public T getValue() {
        return this.value;
    }
    
    public T getMin() {
        return this.min;
    }
    
    public T getMax() {
        return this.max;
    }
    
    public T setValue(final T value) {
        return this.value = value;
    }
    
    public boolean isVisible() {
        return this.visible.test(false);
    }
}
