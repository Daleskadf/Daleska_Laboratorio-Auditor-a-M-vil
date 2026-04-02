package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1253f2 extends AbstractC1258g2 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f13269l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1253f2(AbstractC1230b abstractC1230b, int i7, int i8) {
        super(abstractC1230b, i7);
        this.f13269l = i8;
    }

    @Override // j$.util.stream.AbstractC1230b
    final boolean Q() {
        switch (this.f13269l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final InterfaceC1260h unordered() {
        switch (this.f13269l) {
            case 0:
                return !L() ? this : new AbstractC1253f2(this, EnumC1239c3.f13223r, 1);
            default:
                return !L() ? this : new AbstractC1253f2(this, EnumC1239c3.f13223r, 1);
        }
    }
}
