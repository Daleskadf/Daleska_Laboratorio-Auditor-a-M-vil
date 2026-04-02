package com.taobao.accs.net;

import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f9214a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f9215b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f9216c;

    public p(k kVar, String str, boolean z10) {
        this.f9216c = kVar;
        this.f9214a = str;
        this.f9215b = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message a10 = this.f9216c.f9161e.a(this.f9214a);
        if (a10 != null) {
            this.f9216c.f9161e.a(a10, -9);
            this.f9216c.a(this.f9214a, this.f9215b, "receive data time out");
            String d10 = this.f9216c.d();
            ALog.e(d10, this.f9214a + "-> receive data time out!", new Object[0]);
        }
    }
}
