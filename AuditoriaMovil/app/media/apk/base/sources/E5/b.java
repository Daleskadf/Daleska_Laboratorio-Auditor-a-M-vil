package e5;

import A3.K;
import a4.C0462k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.CamcorderProfile;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.datastore.preferences.protobuf.Y;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import c4.InterfaceC0635d;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.S;
import d6.x;
import j1.AbstractC1362a;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.KeyAgreement;
import k5.C1402e;
import org.apache.tika.utils.StringUtils;
import p.C1608t;
import p4.P;
import w.InterfaceC1920e;
/* loaded from: classes.dex */
public class b implements S, L2.a, i1.p, S3.k, W1.d, Continuation, W, InterfaceC0635d, i1.o, i1.k, InterfaceC1920e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10889a;

    public /* synthetic */ b(int i7) {
        this.f10889a = i7;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Q6.e, java.lang.Object] */
    public static x l(int i7) {
        return new x(new Object(), Math.min(1048576, Math.max((int) RecognitionOptions.AZTEC, i7)));
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] q(K k2, long j) {
        A.i iVar = new A.i(13);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(k2.size());
        for (Object obj : k2) {
            arrayList.add((Bundle) iVar.apply(obj));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static C1608t r(Context context, String[] strArr, String str, P p7) {
        String[] u7 = u(context);
        int length = u7.length;
        int i7 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i7 >= length) {
                return null;
            }
            String str2 = u7[i7];
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i8 = i9;
                }
            }
            if (zipFile != null) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c8 = File.separatorChar;
                            sb.append(c8);
                            sb.append(str3);
                            sb.append(c8);
                            sb.append(str);
                            String sb2 = sb.toString();
                            p7.getClass();
                            P.n("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                C1608t c1608t = new C1608t(28, false);
                                c1608t.f14880b = zipFile;
                                c1608t.f14881c = entry;
                                return c1608t;
                            }
                        }
                        i10 = i11;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i7++;
        }
    }

    public static String[] t(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c8 = File.separatorChar;
        sb.append(c8);
        sb.append("([^\\");
        sb.append(c8);
        sb.append("]*)");
        sb.append(c8);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : u(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] u(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            String[] strArr2 = new String[strArr.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            return strArr2;
        }
        return new String[]{applicationInfo.sourceDir};
    }

    @Override // W1.d
    public void N() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // i1.k
    public void b() {
        synchronized (AbstractC1362a.f13419a) {
            Object obj = AbstractC1362a.f13420b;
            synchronized (obj) {
                if (AbstractC1362a.f13421c) {
                    return;
                }
                long a7 = AbstractC1362a.a();
                synchronized (obj) {
                    AbstractC1362a.f13422d = a7;
                    AbstractC1362a.f13421c = true;
                }
            }
        }
    }

    @Override // androidx.lifecycle.W
    public U c(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // c4.InterfaceC0635d
    public Object d(M3.q qVar) {
        switch (this.f10889a) {
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                C0965a c0965a = new C0965a();
                l lVar = new l(0);
                ReferenceQueue referenceQueue = c0965a.f10887a;
                Set set = c0965a.f10888b;
                set.add(new m(c0965a, referenceQueue, set, lVar));
                Thread thread = new Thread(new H.h(17, referenceQueue, set), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return c0965a;
            default:
                return new C1402e((g) qVar.a(g.class));
        }
    }

    @Override // androidx.lifecycle.W
    public /* synthetic */ U e(kotlin.jvm.internal.e eVar, B0.c cVar) {
        return Y.a(this, eVar, cVar);
    }

    @Override // w.InterfaceC1920e
    public CamcorderProfile f(int i7, int i8) {
        return CamcorderProfile.get(i7, i8);
    }

    @Override // S3.k
    public Object g(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }

    @Override // w.InterfaceC1920e
    public boolean h(int i7, int i8) {
        return CamcorderProfile.hasProfile(i7, i8);
    }

    @Override // W1.d
    public void i(int i7, Serializable serializable) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = StringUtils.EMPTY;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
    }

    @Override // i1.p
    public Object j(Uri uri, M0.j jVar) {
        return Long.valueOf(K0.x.P(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    @Override // androidx.lifecycle.W
    public U n(Class cls, B0.c cVar) {
        return new Q();
    }

    @Override // L2.a
    public long o() {
        return System.currentTimeMillis();
    }

    public String p(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public Signature[] s(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful() && (task.getException() instanceof C0462k) && ((C0462k) task.getException()).f7038a.equals("ERROR_INTERNAL_SUCCESS_SIGN_OUT")) {
            return Tasks.forResult(null);
        }
        return task;
    }

    public b(A.m mVar) {
        this.f10889a = 1;
        mVar.T(UseTorchAsFlashQuirk.class);
    }

    @Override // i1.o
    public void a() {
    }

    @Override // i1.k
    public void k() {
    }
}
