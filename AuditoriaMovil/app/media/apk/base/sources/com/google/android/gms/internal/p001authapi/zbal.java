package com.google.android.gms.internal.p001authapi;

import R2.s;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0760i;
/* renamed from: com.google.android.gms.internal.auth-api.zbal  reason: invalid package */
/* loaded from: classes.dex */
final class zbal extends AbstractC0726a {
    @Override // com.google.android.gms.common.api.AbstractC0726a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0760i c0760i, Object obj, InterfaceC0734h interfaceC0734h, r rVar) {
        return new zbar(context, looper, (s) obj, c0760i, interfaceC0734h, rVar);
    }
}
