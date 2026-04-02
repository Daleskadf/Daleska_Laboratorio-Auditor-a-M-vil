package com.google.android.gms.auth;

import D.C0066p;
import N2.i;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.I;
@KeepName
/* loaded from: classes.dex */
public class UserRecoverableAuthException extends C0066p {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f9091a;

    /* renamed from: b  reason: collision with root package name */
    public final i f9092b;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, i.zza);
    }

    public UserRecoverableAuthException(String str, Intent intent, i iVar) {
        super(str);
        this.f9091a = intent;
        I.i(iVar);
        this.f9092b = iVar;
    }
}
