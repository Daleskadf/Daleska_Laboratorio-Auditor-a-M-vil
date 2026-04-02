package com.google.android.recaptcha.internal;
/* loaded from: classes.dex */
public abstract class zzjk implements Iterable {
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean z7 = true;
        for (Object obj : this) {
            if (!z7) {
                sb.append(", ");
            }
            sb.append(obj);
            z7 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
