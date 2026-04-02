package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.internal.C0760i;
/* renamed from: com.google.android.gms.common.api.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0726a extends f {
    @Deprecated
    public g buildClient(Context context, Looper looper, C0760i c0760i, Object obj, m mVar, n nVar) {
        return buildClient(context, looper, c0760i, obj, (InterfaceC0734h) mVar, (com.google.android.gms.common.api.internal.r) nVar);
    }

    public g buildClient(Context context, Looper looper, C0760i c0760i, Object obj, InterfaceC0734h interfaceC0734h, com.google.android.gms.common.api.internal.r rVar) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
