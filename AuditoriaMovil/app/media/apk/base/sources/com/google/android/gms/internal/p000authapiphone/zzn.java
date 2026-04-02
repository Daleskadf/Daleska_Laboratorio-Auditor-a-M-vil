package com.google.android.gms.internal.p000authapiphone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0760i;
/* renamed from: com.google.android.gms.internal.auth-api-phone.zzn  reason: invalid package */
/* loaded from: classes.dex */
final class zzn extends AbstractC0726a {
    @Override // com.google.android.gms.common.api.AbstractC0726a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0760i c0760i, Object obj, InterfaceC0734h interfaceC0734h, r rVar) {
        d dVar = (d) obj;
        return new zzw(context, looper, c0760i, interfaceC0734h, rVar);
    }
}
