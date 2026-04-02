package r5;

import B5.AbstractActivityC0032e;
import F6.H;
import F6.P;
import H4.W;
import L5.h;
import L5.q;
import L5.t;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: e0  reason: collision with root package name */
    public static final int f15518e0 = (d.class.hashCode() + 43) & 65535;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f15519f0 = (d.class.hashCode() + 83) & 65535;

    /* renamed from: X  reason: collision with root package name */
    public ArrayList f15520X;

    /* renamed from: Y  reason: collision with root package name */
    public h f15521Y;

    /* renamed from: Z  reason: collision with root package name */
    public byte[] f15522Z;

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0032e f15523a;

    /* renamed from: b  reason: collision with root package name */
    public q f15524b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15525c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15526d;

    /* renamed from: e  reason: collision with root package name */
    public String f15527e;
    public int f;

    public b(AbstractActivityC0032e activity) {
        j.e(activity, "activity");
        this.f15523a = activity;
        this.f15524b = null;
    }

    public final void a(boolean z7) {
        if (this.f15521Y != null && !j.a(this.f15527e, "dir")) {
            new Handler(Looper.getMainLooper()).post(new C.d(this, z7, 3));
        }
    }

    public final void b(String str, String str2) {
        a(false);
        q qVar = this.f15524b;
        if (qVar != null) {
            qVar.b(null, str, str2);
        }
        this.f15524b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r3 == 0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [L5.q] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.io.Serializable r12) {
        /*
            r11 = this;
            r0 = 0
            r11.a(r0)
            L5.q r1 = r11.f15524b
            if (r1 == 0) goto L93
            r2 = 0
            if (r12 == 0) goto L14
            boolean r3 = r12 instanceof java.lang.String
            if (r3 == 0) goto L11
            r3 = r12
            goto L12
        L11:
            r3 = r2
        L12:
            if (r3 != 0) goto L8e
        L14:
            boolean r3 = r12 instanceof java.util.ArrayList
            if (r3 == 0) goto L1b
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            goto L1c
        L1b:
            r12 = r2
        L1c:
            if (r12 == 0) goto L8d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r12 = r12.iterator()
        L27:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r12.next()
            boolean r5 = r4 instanceof r5.C1747a
            if (r5 == 0) goto L38
            r5.a r4 = (r5.C1747a) r4
            goto L39
        L38:
            r4 = r2
        L39:
            if (r4 == 0) goto L86
            l6.d r5 = new l6.d
            java.lang.String r6 = "path"
            java.lang.String r7 = r4.f15513a
            r5.<init>(r6, r7)
            l6.d r6 = new l6.d
            java.lang.String r7 = "name"
            java.lang.String r8 = r4.f15514b
            r6.<init>(r7, r8)
            l6.d r7 = new l6.d
            long r8 = r4.f15516d
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "size"
            r7.<init>(r9, r8)
            l6.d r8 = new l6.d
            java.lang.String r9 = "bytes"
            byte[] r10 = r4.f15517e
            r8.<init>(r9, r10)
            l6.d r9 = new l6.d
            android.net.Uri r4 = r4.f15515c
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r10 = "identifier"
            r9.<init>(r10, r4)
            r4 = 5
            l6.d[] r4 = new l6.d[r4]
            r4[r0] = r5
            r5 = 1
            r4[r5] = r6
            r5 = 2
            r4[r5] = r7
            r5 = 3
            r4[r5] = r8
            r5 = 4
            r4[r5] = r9
            java.util.HashMap r4 = m6.s.N(r4)
            goto L87
        L86:
            r4 = r2
        L87:
            if (r4 == 0) goto L27
            r3.add(r4)
            goto L27
        L8d:
            r3 = r2
        L8e:
            r1.a(r3)
            r11.f15524b = r2
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.b.c(java.io.Serializable):void");
    }

    @Override // L5.t
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        Uri uri;
        int i9 = f15519f0;
        AbstractActivityC0032e activity = this.f15523a;
        boolean z7 = true;
        if (i7 == i9) {
            if (i8 != -1) {
                if (i8 != 0) {
                    return false;
                }
                c(null);
                return false;
            }
            if (intent != null) {
                uri = intent.getData();
            } else {
                uri = null;
            }
            if (uri == null) {
                return false;
            }
            a(true);
            try {
                byte[] bArr = this.f15522Z;
                j.e(activity, "context");
                OutputStream openOutputStream = activity.getContentResolver().openOutputStream(uri);
                if (openOutputStream != null) {
                    if (bArr != null) {
                        openOutputStream.write(bArr);
                    }
                    W.g(openOutputStream, null);
                }
                c(uri.getPath());
            } catch (IOException e7) {
                Log.e("FilePickerDelegate", "Error while saving file", e7);
                b("Error while saving file", e7.getMessage());
            }
        } else if (i7 == f15518e0) {
            if (i8 != -1) {
                if (i8 == 0) {
                    c(null);
                }
                z7 = false;
            } else {
                a(true);
                int i10 = this.f;
                boolean z8 = this.f15526d;
                String str = this.f15527e;
                if (str == null) {
                    str = StringUtils.EMPTY;
                }
                j.e(activity, "activity");
                H.q(H.b(P.f1238b), null, new e(intent, this, activity, i10, z8, str, null), 3);
            }
        } else {
            b("unknown_activity", "Unknown activity error, please file an issue.");
            return false;
        }
        return z7;
    }
}
