package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0760i;
/* loaded from: classes.dex */
public final class zzj extends AbstractC0726a {
    @Override // com.google.android.gms.common.api.AbstractC0726a
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0760i c0760i, Object obj, m mVar, n nVar) {
        d dVar = (d) obj;
        return new zzk(context, looper, c0760i, mVar, nVar);
    }
}
