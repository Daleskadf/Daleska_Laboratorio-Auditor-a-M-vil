package com.google.firebase.storage;

import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public final i f9950a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f9951b;

    public u(v vVar, i iVar) {
        this.f9951b = vVar;
        if (iVar == null) {
            if (vVar.isCanceled()) {
                this.f9950a = i.a(Status.f9151Z);
                return;
            } else if (vVar.f9959h == 64) {
                this.f9950a = i.a(Status.f9149X);
                return;
            } else {
                this.f9950a = null;
                return;
            }
        }
        this.f9950a = iVar;
    }
}
