package androidx.camera.core.impl;
/* renamed from: androidx.camera.core.impl.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0520w {
    RELEASED(false),
    RELEASING(true),
    CLOSED(false),
    PENDING_OPEN(false),
    CLOSING(true),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true);
    
    private final boolean mHoldsCameraSlot;

    EnumC0520w(boolean z7) {
        this.mHoldsCameraSlot = z7;
    }

    public final boolean a() {
        return this.mHoldsCameraSlot;
    }
}
