package n4;
/* renamed from: n4.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1512A {
    ASCENDING(1),
    DESCENDING(-1);
    
    private final int comparisonModifier;

    EnumC1512A(int i7) {
        this.comparisonModifier = i7;
    }

    public final int a() {
        return this.comparisonModifier;
    }
}
