package s3;
/* renamed from: s3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1775c extends C1776d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f15591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775c(int i7) {
        super(0, null, null);
        this.f15591d = i7;
        switch (i7) {
            case 1:
                super(2, null, null);
                return;
            case 2:
                super(1, null, null);
                return;
            default:
                return;
        }
    }

    @Override // s3.C1776d
    public final String toString() {
        switch (this.f15591d) {
            case 0:
                return "[ButtCap]";
            case 1:
                return "[RoundCap]";
            default:
                return "[SquareCap]";
        }
    }
}
