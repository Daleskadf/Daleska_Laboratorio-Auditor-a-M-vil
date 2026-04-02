package O2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC0726a;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.p000authapiphone.zzw;
import com.google.android.gms.internal.p001authapi.zbe;
import java.util.Collections;
import java.util.List;
import u3.C1869a;
import v3.C1885a;
/* loaded from: classes.dex */
public final class g extends AbstractC0726a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3849a;

    public /* synthetic */ g(int i7) {
        this.f3849a = i7;
    }

    @Override // com.google.android.gms.common.api.AbstractC0726a
    public com.google.android.gms.common.api.g buildClient(Context context, Looper looper, C0760i c0760i, Object obj, InterfaceC0734h interfaceC0734h, r rVar) {
        switch (this.f3849a) {
            case 3:
                return new zzbe(context, looper, c0760i, (P2.c) obj, interfaceC0734h, rVar);
            case 4:
                com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) obj;
                return new zzw(context, looper, c0760i, interfaceC0734h, rVar);
            case 5:
                return new Y2.c(context, looper, c0760i, (z) obj, interfaceC0734h, rVar);
            case 6:
                com.google.android.gms.common.api.d dVar2 = (com.google.android.gms.common.api.d) obj;
                return new AbstractC0763l(context, looper, 308, c0760i, interfaceC0734h, rVar);
            default:
                return super.buildClient(context, looper, c0760i, obj, interfaceC0734h, rVar);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        switch (this.f3849a) {
            case 2:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                if (googleSignInOptions == null) {
                    return Collections.emptyList();
                }
                return googleSignInOptions.k();
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC0726a
    public com.google.android.gms.common.api.g buildClient(Context context, Looper looper, C0760i c0760i, Object obj, m mVar, n nVar) {
        switch (this.f3849a) {
            case 0:
                com.google.android.gms.common.api.d dVar = (com.google.android.gms.common.api.d) obj;
                return new zzam(context, looper, c0760i, mVar, nVar);
            case 1:
                return new zbe(context, looper, c0760i, (P2.d) obj, mVar, nVar);
            case 2:
                return new V2.e(context, looper, c0760i, (GoogleSignInOptions) obj, mVar, nVar);
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                return super.buildClient(context, looper, c0760i, obj, mVar, nVar);
            case 7:
                C1869a c1869a = (C1869a) obj;
                c0760i.getClass();
                Integer num = c0760i.f9359g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C1885a(context, looper, c0760i, bundle, mVar, nVar);
            case 8:
                obj.getClass();
                throw new ClassCastException();
        }
    }
}
