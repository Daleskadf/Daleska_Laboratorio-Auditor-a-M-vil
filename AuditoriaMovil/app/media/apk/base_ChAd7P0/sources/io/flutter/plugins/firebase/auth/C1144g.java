package io.flutter.plugins.firebase.auth;

import D.AbstractC0055e;
import a4.AbstractC0467p;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* renamed from: io.flutter.plugins.firebase.auth.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1144g implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11863a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractC0467p f11864b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ P5.h f11865c;

    public /* synthetic */ C1144g(P5.h hVar, AbstractC0467p abstractC0467p) {
        this.f11865c = hVar;
        this.f11864b = abstractC0467p;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f11863a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                P5.h hVar = this.f11865c;
                if (isSuccessful) {
                    hVar.c(AbstractC0055e.t(this.f11864b));
                    return;
                } else {
                    hVar.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
            default:
                boolean isSuccessful2 = task.isSuccessful();
                P5.h hVar2 = this.f11865c;
                if (isSuccessful2) {
                    AbstractC0467p abstractC0467p = this.f11864b;
                    abstractC0467p.m().addOnCompleteListener(new C1144g(hVar2, abstractC0467p));
                    return;
                }
                hVar2.a(org.slf4j.helpers.i.J(task.getException()));
                return;
        }
    }

    public /* synthetic */ C1144g(AbstractC0467p abstractC0467p, P5.h hVar) {
        this.f11864b = abstractC0467p;
        this.f11865c = hVar;
    }
}
