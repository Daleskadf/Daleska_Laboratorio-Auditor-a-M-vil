package s3;
/* renamed from: s3.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1780h extends C1788p {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15606c;

    /* renamed from: d  reason: collision with root package name */
    public final float f15607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1780h(float f, int i7) {
        super(0, Float.valueOf(Math.max(f, 0.0f)));
        this.f15606c = i7;
        switch (i7) {
            case 1:
                super(2, Float.valueOf(Math.max(f, 0.0f)));
                this.f15607d = Math.max(f, 0.0f);
                return;
            default:
                this.f15607d = Math.max(f, 0.0f);
                return;
        }
    }

    @Override // s3.C1788p
    public final String toString() {
        switch (this.f15606c) {
            case 0:
                return "[Dash: length=" + this.f15607d + "]";
            default:
                return "[Gap: length=" + this.f15607d + "]";
        }
    }
}
