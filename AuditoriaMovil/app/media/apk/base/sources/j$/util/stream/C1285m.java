package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* renamed from: j$.util.stream.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1285m extends AbstractC1278k2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13307b;

    /* renamed from: c  reason: collision with root package name */
    Object f13308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1285m(AbstractC1230b abstractC1230b, InterfaceC1298o2 interfaceC1298o2, int i7) {
        super(interfaceC1298o2);
        this.f13307b = i7;
        this.f13308c = abstractC1230b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1285m(InterfaceC1298o2 interfaceC1298o2) {
        super(interfaceC1298o2);
        this.f13307b = 0;
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public void k() {
        switch (this.f13307b) {
            case 0:
                this.f13308c = null;
                this.f13295a.k();
                return;
            default:
                super.k();
                return;
        }
    }

    @Override // j$.util.stream.AbstractC1278k2, j$.util.stream.InterfaceC1298o2
    public void l(long j) {
        switch (this.f13307b) {
            case 0:
                this.f13308c = new HashSet();
                this.f13295a.l(-1L);
                return;
            case 1:
            default:
                super.l(j);
                return;
            case 2:
                this.f13295a.l(-1L);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f13307b) {
            case 0:
                if (((HashSet) this.f13308c).contains(obj)) {
                    return;
                }
                ((HashSet) this.f13308c).add(obj);
                this.f13295a.accept((InterfaceC1298o2) obj);
                return;
            case 1:
                ((Consumer) ((C1319t) this.f13308c).f13349n).accept(obj);
                this.f13295a.accept((InterfaceC1298o2) obj);
                return;
            case 2:
                if (((Predicate) ((C1319t) this.f13308c).f13349n).test(obj)) {
                    this.f13295a.accept((InterfaceC1298o2) obj);
                    return;
                }
                return;
            case 3:
                this.f13295a.accept((InterfaceC1298o2) ((Function) ((C1319t) this.f13308c).f13349n).apply(obj));
                return;
            case 4:
                this.f13295a.accept(((ToIntFunction) ((W) this.f13308c).f13171n).applyAsInt(obj));
                return;
            case 5:
                this.f13295a.accept(((ToLongFunction) ((C1256g0) this.f13308c).f13274n).applyAsLong(obj));
                return;
            default:
                this.f13295a.accept(((ToDoubleFunction) ((C1344y) this.f13308c).f13394n).applyAsDouble(obj));
                return;
        }
    }
}
