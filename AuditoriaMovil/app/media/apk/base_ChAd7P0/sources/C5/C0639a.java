package c5;

import E6.m;
import H1.g;
import K5.r;
import L5.p;
import M3.q;
import Q6.o;
import R6.e;
import S3.k;
import X3.b;
import a1.C0422H;
import a1.InterfaceC0427d;
import a1.InterfaceC0428e;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import c4.InterfaceC0635d;
import com.example.appecoactivate.R;
import com.google.protobuf.S;
import d5.C0901c;
import d5.C0902d;
import java.security.Provider;
import java.security.Signature;
import m1.InterfaceC1426A;
import m1.l;
import m1.s;
import m5.d;
/* renamed from: c5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639a implements S, g, p, k, V1.a, InterfaceC0427d, InterfaceC0635d, Z3.a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0639a f8416a;

    /* renamed from: b  reason: collision with root package name */
    public static C0639a f8417b;

    public static final boolean h(o oVar) {
        o oVar2 = e.f4792c;
        return !m.O(oVar.b(), ".class", true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0239, code lost:
        if (r114.f16479h == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x028d, code lost:
        if (r5 == r12) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0636 A[Catch: all -> 0x0648, Exception -> 0x064c, TryCatch #22 {Exception -> 0x064c, all -> 0x0648, blocks: (B:234:0x0632, B:236:0x0636, B:243:0x0657, B:242:0x064f), top: B:294:0x0632 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x064f A[Catch: all -> 0x0648, Exception -> 0x064c, TryCatch #22 {Exception -> 0x064c, all -> 0x0648, blocks: (B:234:0x0632, B:236:0x0636, B:243:0x0657, B:242:0x064f), top: B:294:0x0632 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032f  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v26, types: [long] */
    /* JADX WARN: Type inference failed for: r12v30, types: [long] */
    /* JADX WARN: Type inference failed for: r12v39, types: [double[]] */
    /* JADX WARN: Type inference failed for: r12v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r3v16, types: [long[]] */
    /* JADX WARN: Type inference failed for: r3v31, types: [double] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.nio.ByteBuffer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(x0.C1982h r113, x0.C1982h r114) {
        /*
            Method dump skipped, instructions count: 1746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.C0639a.i(x0.h, x0.h):void");
    }

    @Override // H1.g
    public long a(l lVar) {
        return -1L;
    }

    @Override // H1.g
    public InterfaceC1426A b() {
        return new s(-9223372036854775807L);
    }

    @Override // c4.InterfaceC0635d
    public Object d(q qVar) {
        return new C0902d(qVar.x(C0901c.class));
    }

    @Override // V1.a
    public CharSequence e(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return listPreference.f7987a.getString(R.string.not_set);
    }

    @Override // S3.k
    public Object g(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }

    @Override // a1.InterfaceC0427d
    public InterfaceC0428e j(int i7) {
        C0422H c0422h = new C0422H();
        c0422h.e(d.h(i7 * 2));
        return c0422h;
    }

    @Override // L5.p
    public void onMethodCall(L5.o oVar, L5.q qVar) {
        ((r) qVar).a(null);
    }

    @Override // Z3.a
    public void c(b bVar) {
    }

    @Override // H1.g
    public void f(long j) {
    }
}
