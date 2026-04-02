package U2;

import V2.k;
import android.accounts.Account;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import l4.C1418b;
import x.j;
import z.AbstractC2038a;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5719a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5720b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5721c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5722d;

    /* renamed from: e  reason: collision with root package name */
    public Object f5723e;
    public Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f5724g;

    /* renamed from: h  reason: collision with root package name */
    public Object f5725h;

    /* renamed from: i  reason: collision with root package name */
    public Object f5726i;

    public b() {
        this.f5722d = new HashSet();
        this.f5726i = new HashMap();
    }

    public GoogleSignInOptions a() {
        Scope scope = GoogleSignInOptions.f9122k0;
        HashSet hashSet = (HashSet) this.f5722d;
        if (hashSet.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.f9121j0;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (this.f5721c && (((Account) this.f5725h) == null || !hashSet.isEmpty())) {
            ((HashSet) this.f5722d).add(GoogleSignInOptions.f9120i0);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) this.f5725h, this.f5721c, this.f5719a, this.f5720b, (String) this.f5723e, (String) this.f, (HashMap) this.f5726i, (String) this.f5724g);
    }

    public b(GoogleSignInOptions googleSignInOptions) {
        this.f5722d = new HashSet();
        this.f5726i = new HashMap();
        I.i(googleSignInOptions);
        this.f5722d = new HashSet(googleSignInOptions.f9128b);
        this.f5719a = googleSignInOptions.f9131e;
        this.f5720b = googleSignInOptions.f;
        this.f5721c = googleSignInOptions.f9130d;
        this.f5723e = googleSignInOptions.f9124X;
        this.f5725h = googleSignInOptions.f9129c;
        this.f = googleSignInOptions.f9125Y;
        this.f5726i = GoogleSignInOptions.m(googleSignInOptions.f9126Z);
        this.f5724g = googleSignInOptions.f9132e0;
    }

    public b(j jVar) {
        boolean z7;
        this.f5719a = false;
        this.f5720b = false;
        this.f5721c = false;
        this.f5722d = jVar;
        int[] iArr = (int[]) jVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i7 : iArr) {
                if (i7 == 4) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        this.f5720b = z7;
        this.f5721c = AbstractC2038a.f16621a.a0(ZslDisablerQuirk.class) != null;
        this.f5723e = new k(new C1418b(7));
    }
}
