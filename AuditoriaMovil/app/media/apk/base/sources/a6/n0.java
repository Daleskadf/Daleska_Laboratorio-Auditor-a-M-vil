package a6;
/* loaded from: classes.dex */
public enum n0 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);
    
    private final int value;
    private final byte[] valueAscii;

    n0(int i7) {
        this.value = i7;
        this.valueAscii = Integer.toString(i7).getBytes(z3.h.f16884a);
    }

    public static byte[] a(n0 n0Var) {
        return n0Var.valueAscii;
    }

    public final o0 b() {
        return (o0) o0.f7172d.get(this.value);
    }

    public final int c() {
        return this.value;
    }
}
