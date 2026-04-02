package com.google.android.gms.common.internal;
/* loaded from: classes.dex */
public final class N extends F {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AbstractC0757f f9323g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AbstractC0757f abstractC0757f, int i7) {
        super(abstractC0757f, i7, null);
        this.f9323g = abstractC0757f;
    }

    @Override // com.google.android.gms.common.internal.F
    public final void a(W2.b bVar) {
        AbstractC0757f abstractC0757f = this.f9323g;
        if (abstractC0757f.enableLocalFallback() && AbstractC0757f.zzo(abstractC0757f)) {
            AbstractC0757f.zzk(abstractC0757f, 16);
            return;
        }
        abstractC0757f.zzc.a(bVar);
        abstractC0757f.onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.F
    public final boolean b() {
        this.f9323g.zzc.a(W2.b.f6158e);
        return true;
    }
}
