package j$.util.stream;

import j$.util.Spliterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.i0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1266i0 extends AbstractC1271j0 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f13281l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC1266i0(AbstractC1230b abstractC1230b, int i7, int i8) {
        super(abstractC1230b, i7);
        this.f13281l = i8;
    }

    @Override // j$.util.stream.AbstractC1230b
    final boolean Q() {
        switch (this.f13281l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final InterfaceC1260h unordered() {
        switch (this.f13281l) {
            case 0:
                return !L() ? this : new C1334w(this, EnumC1239c3.f13223r, 4);
            default:
                return !L() ? this : new C1334w(this, EnumC1239c3.f13223r, 4);
        }
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ InterfaceC1286m0 parallel() {
        switch (this.f13281l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ InterfaceC1286m0 sequential() {
        switch (this.f13281l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.f13281l) {
            case 0:
                return spliterator();
            default:
                return spliterator();
        }
    }
}
