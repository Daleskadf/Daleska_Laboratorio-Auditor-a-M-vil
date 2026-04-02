package n4;
/* renamed from: n4.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1528n {
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL("<="),
    EQUAL("=="),
    NOT_EQUAL("!="),
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL(">="),
    ARRAY_CONTAINS("array_contains"),
    ARRAY_CONTAINS_ANY("array_contains_any"),
    IN("in"),
    NOT_IN("not_in");
    
    private final String text;

    EnumC1528n(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.text;
    }
}
