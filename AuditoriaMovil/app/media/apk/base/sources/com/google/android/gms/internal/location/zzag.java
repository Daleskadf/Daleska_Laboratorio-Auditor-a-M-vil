package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0760i;
/* loaded from: classes.dex */
final class zzag extends AbstractC0726a {
    @Override // com.google.android.gms.common.api.AbstractC0726a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0760i c0760i, Object obj, InterfaceC0734h interfaceC0734h, r rVar) {
        d dVar = (d) obj;
        return new zzg(context, looper, c0760i, interfaceC0734h, rVar);
    }
}
