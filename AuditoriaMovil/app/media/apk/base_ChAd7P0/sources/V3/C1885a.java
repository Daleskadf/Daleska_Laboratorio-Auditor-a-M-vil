package v3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
import com.google.android.gms.internal.base.zaa;
/* renamed from: v3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1885a extends AbstractC0763l implements com.google.android.gms.common.api.g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f16040a;

    /* renamed from: b  reason: collision with root package name */
    public final C0760i f16041b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f16042c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f16043d;

    public C1885a(Context context, Looper looper, C0760i c0760i, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, c0760i, mVar, nVar);
        this.f16040a = true;
        this.f16041b = c0760i;
        this.f16042c = bundle;
        this.f16043d = c0760i.f9359g;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C1888d) {
            return (C1888d) queryLocalInterface;
        }
        return new zaa(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final Bundle getGetServiceRequestExtraArgs() {
        C0760i c0760i = this.f16041b;
        boolean equals = getContext().getPackageName().equals(c0760i.f9357d);
        Bundle bundle = this.f16042c;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c0760i.f9357d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f16040a;
    }
}
