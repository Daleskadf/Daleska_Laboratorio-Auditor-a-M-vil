package com.taobao.accs.client;

import com.taobao.accs.utl.UtilityImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GlobalClientInfo f9060a;

    public c(GlobalClientInfo globalClientInfo) {
        this.f9060a = globalClientInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        GlobalClientInfo.f9033c = UtilityImpl.m(GlobalClientInfo.f9031a);
    }
}
