package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* renamed from: com.google.android.play.core.assetpacks.do  reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cdo implements y {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("FakeAssetPackService");
    private static final AtomicInteger b = new AtomicInteger(1);
    private final String c;
    private final bb d;
    private final co e;
    private final Context f;
    private final ec g;
    private final ea h;
    private final Handler i = new Handler(Looper.getMainLooper());
    private final com.google.android.play.core.assetpacks.internal.aq j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Cdo(File file, bb bbVar, co coVar, Context context, ec ecVar, com.google.android.play.core.assetpacks.internal.aq aqVar, ea eaVar) {
        this.c = file.getAbsolutePath();
        this.d = bbVar;
        this.e = coVar;
        this.f = context;
        this.g = ecVar;
        this.j = aqVar;
        this.h = eaVar;
    }

    static long k(int i, long j) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return j;
            }
            return 0L;
        }
        return j / 2;
    }

    private final Bundle p(int i, String str, int i2) throws LocalTestingException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.g.a());
        bundle.putInt("session_id", i);
        File[] s = s(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : s) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(i2 == 3 ? new Intent().setData(Uri.EMPTY) : null);
            String a2 = com.google.android.play.core.assetpacks.internal.ak.a(file);
            bundle.putParcelableArrayList(com.google.android.play.core.assetpacks.model.b.b("chunk_intents", str, a2), arrayList2);
            bundle.putString(com.google.android.play.core.assetpacks.model.b.b("uncompressed_hash_sha256", str, a2), r(file));
            bundle.putLong(com.google.android.play.core.assetpacks.model.b.b("uncompressed_size", str, a2), file.length());
            arrayList.add(a2);
        }
        bundle.putStringArrayList(com.google.android.play.core.assetpacks.model.b.a("slice_ids", str), arrayList);
        bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("pack_version", str), this.g.a());
        bundle.putInt(com.google.android.play.core.assetpacks.model.b.a(NotificationCompat.CATEGORY_STATUS, str), i2);
        bundle.putInt(com.google.android.play.core.assetpacks.model.b.a("error_code", str), 0);
        bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("bytes_downloaded", str), k(i2, j));
        bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", k(i2, j));
        bundle.putLong("total_bytes_to_download", j);
        final Intent putExtra = new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle);
        this.i.post(new Runnable() { // from class: com.google.android.play.core.assetpacks.dn
            @Override // java.lang.Runnable
            public final void run() {
                Cdo.this.l(putExtra);
            }
        });
        return bundle;
    }

    private final AssetPackState q(String str, int i) throws LocalTestingException {
        long j = 0;
        for (File file : s(str)) {
            j += file.length();
        }
        return AssetPackState.a(str, i, 0, k(i, j), j, this.e.a(str), 1, String.valueOf(this.g.a()), this.h.a(str));
    }

    private static String r(File file) throws LocalTestingException {
        try {
            return dq.a(Arrays.asList(file));
        } catch (IOException e) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file), e);
        } catch (NoSuchAlgorithmException e2) {
            throw new LocalTestingException("SHA256 algorithm not supported.", e2);
        }
    }

    private final File[] s(final String str) throws LocalTestingException {
        File file = new File(this.c);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: com.google.android.play.core.assetpacks.dj
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(String.valueOf(str).concat("-")) && str2.endsWith(".apk");
            }
        });
        if (listFiles == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        if (listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (com.google.android.play.core.assetpacks.internal.ak.a(file2).equals(str)) {
                    return listFiles;
                }
            }
            throw new LocalTestingException(String.format("No main slice available for pack '%s'.", str));
        }
        throw new LocalTestingException(String.format("No APKs available for pack '%s'.", str));
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final Task a(int i, String str, String str2, int i2) {
        File[] s;
        int i3;
        a.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
        } catch (LocalTestingException e) {
            a.e("getChunkFileDescriptor failed", e);
            taskCompletionSource.setException(e);
        } catch (FileNotFoundException e2) {
            a.e("getChunkFileDescriptor failed", e2);
            taskCompletionSource.setException(new LocalTestingException("Asset Slice file not found.", e2));
        }
        for (File file : s(str)) {
            if (com.google.android.play.core.assetpacks.internal.ak.a(file).equals(str2)) {
                taskCompletionSource.setResult(ParcelFileDescriptor.open(file, 268435456));
                return taskCompletionSource.getTask();
            }
        }
        throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", str2));
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final Task b(final List list, final be beVar, Map map) {
        a.d("getPackStates(%s)", list);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Executor) this.j.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.dm
            @Override // java.lang.Runnable
            public final void run() {
                Cdo.this.m(list, beVar, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final Task c(final List list, Map map) {
        a.d("startDownload(%s)", list);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Executor) this.j.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.dl
            @Override // java.lang.Runnable
            public final void run() {
                Cdo.this.o(list, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final Task d(Map map) {
        a.d("syncPacks()", new Object[0]);
        return Tasks.forResult(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void e(List list) {
        a.d("cancelDownload(%s)", list);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void f() {
        a.d("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void g(int i, String str, String str2, int i2) {
        a.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void h(final int i, final String str) {
        a.d("notifyModuleCompleted", new Object[0]);
        ((Executor) this.j.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.dk
            @Override // java.lang.Runnable
            public final void run() {
                Cdo.this.n(i, str);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void i(int i) {
        a.d("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.y
    public final void j(String str) {
        a.d("removePack(%s)", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void l(Intent intent) {
        this.d.c(this.f, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m(List list, be beVar, TaskCompletionSource taskCompletionSource) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState q = q(str, ((f) beVar).a.a(8, str));
                j += q.totalBytesToDownload();
                hashMap.put(str, q);
            } catch (LocalTestingException e) {
                taskCompletionSource.setException(e);
                return;
            }
        }
        taskCompletionSource.setResult(new bo(j, hashMap));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void n(int i, String str) {
        try {
            p(i, str, 4);
        } catch (LocalTestingException e) {
            a.e("notifyModuleCompleted failed", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void o(List list, TaskCompletionSource taskCompletionSource) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                AssetPackState q = q(str, 1);
                j += q.totalBytesToDownload();
                hashMap.put(str, q);
            } catch (LocalTestingException e) {
                taskCompletionSource.setException(e);
                return;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            try {
                int andIncrement = b.getAndIncrement();
                p(andIncrement, str2, 1);
                p(andIncrement, str2, 2);
                p(andIncrement, str2, 3);
            } catch (LocalTestingException e2) {
                taskCompletionSource.setException(e2);
                return;
            }
        }
        taskCompletionSource.setResult(new bo(j, hashMap));
    }
}
