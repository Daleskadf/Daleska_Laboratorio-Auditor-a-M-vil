package com.taobao.accs.utl;

import com.taobao.accs.base.AccsDataListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AccsDataListener f9346a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f9347b;

    public g(AccsDataListener accsDataListener, boolean z10) {
        this.f9346a = accsDataListener;
        this.f9347b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9346a.onAntiBrush(this.f9347b, null);
    }
}
