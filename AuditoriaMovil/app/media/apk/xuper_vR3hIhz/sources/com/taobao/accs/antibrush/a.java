package com.taobao.accs.antibrush;

import android.content.Context;
import com.taobao.accs.utl.ALog;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AntiBrush f9020a;

    public a(AntiBrush antiBrush) {
        this.f9020a = antiBrush;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        ALog.e("AntiBrush", "anti bursh timeout", new Object[0]);
        context = this.f9020a.mContext;
        AntiBrush.onResult(context, false);
    }
}
