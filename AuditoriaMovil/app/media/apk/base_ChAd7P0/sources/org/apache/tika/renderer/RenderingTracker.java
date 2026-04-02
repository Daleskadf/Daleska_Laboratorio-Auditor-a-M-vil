package org.apache.tika.renderer;
/* loaded from: classes.dex */
public class RenderingTracker {
    private int id = 0;

    public synchronized int getNextId() {
        int i7;
        i7 = this.id + 1;
        this.id = i7;
        return i7;
    }
}
