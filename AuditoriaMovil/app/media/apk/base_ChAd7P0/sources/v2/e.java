package V2;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
import com.google.android.gms.internal.p001authapi.zba;
import com.google.android.gms.internal.p001authapi.zbat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class e extends AbstractC0763l {

    /* renamed from: a  reason: collision with root package name */
    public final GoogleSignInOptions f5956a;

    public e(Context context, Looper looper, C0760i c0760i, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.m mVar, com.google.android.gms.common.api.n nVar) {
        super(context, looper, 91, c0760i, mVar, nVar);
        U2.b bVar;
        if (googleSignInOptions != null) {
            bVar = new U2.b(googleSignInOptions);
        } else {
            bVar = new U2.b();
        }
        bVar.f5724g = zbat.zba();
        Set<Scope> set = c0760i.f9355b;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = (HashSet) bVar.f5722d;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.f5956a = bVar.a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof m) {
            return (m) queryLocalInterface;
        }
        return new zba(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final Intent getSignInIntent() {
        return j.a(getContext(), this.f5956a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final boolean providesSignIn() {
        return true;
    }
}
