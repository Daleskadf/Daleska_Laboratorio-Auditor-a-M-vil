package io.flutter.plugins.videoplayer;
/* loaded from: classes.dex */
public enum a {
    ROTATE_0(0),
    ROTATE_90(90),
    ROTATE_180(180),
    ROTATE_270(270);
    
    private final int degrees;

    a(int i7) {
        this.degrees = i7;
    }

    public static a a(int i7) {
        a[] values;
        for (a aVar : values()) {
            if (aVar.degrees == i7) {
                return aVar;
            }
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.e(i7, "Invalid rotation degrees specified: "));
    }

    public final int b() {
        return this.degrees;
    }
}
