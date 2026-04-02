package io.flutter.plugins.firebase.auth;

import D.AbstractC0055e;
import a4.AbstractC0467p;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/* renamed from: io.flutter.plugins.firebase.auth.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1141d implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11854a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ P5.h f11855b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0467p f11856c;

    public /* synthetic */ C1141d(P5.h hVar, AbstractC0467p abstractC0467p) {
        this.f11855b = hVar;
        this.f11856c = abstractC0467p;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        switch (this.f11854a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                P5.h hVar = this.f11855b;
                if (isSuccessful) {
                    AbstractC0467p abstractC0467p = this.f11856c;
                    abstractC0467p.m().addOnCompleteListener(new C1141d(hVar, abstractC0467p));
                    return;
                }
                hVar.a(org.slf4j.helpers.i.J(task.getException()));
                return;
            default:
                boolean isSuccessful2 = task.isSuccessful();
                P5.h hVar2 = this.f11855b;
                if (isSuccessful2) {
                    hVar2.c(AbstractC0055e.t(this.f11856c));
                    return;
                } else {
                    hVar2.a(org.slf4j.helpers.i.J(task.getException()));
                    return;
                }
        }
    }

    public /* synthetic */ C1141d(AbstractC0467p abstractC0467p, P5.h hVar) {
        this.f11856c = abstractC0467p;
        this.f11855b = hVar;
    }
}
