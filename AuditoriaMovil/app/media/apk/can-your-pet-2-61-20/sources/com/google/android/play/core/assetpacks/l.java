package com.google.android.play.core.assetpacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
public final class l implements AssetPackManager {
    private static final com.google.android.play.core.assetpacks.internal.o a = new com.google.android.play.core.assetpacks.internal.o("AssetPackManager");
    private final bh b;
    private final bb c;
    private final com.google.android.play.core.assetpacks.internal.ad d;
    private final de e;
    private final co f;
    private final bx g;
    private final ea h;
    private final Handler i = new Handler(Looper.getMainLooper());
    private boolean j;
    private final com.google.android.play.core.assetpacks.internal.aq k;
    private final com.google.android.play.core.assetpacks.internal.aq l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(bh bhVar, com.google.android.play.core.assetpacks.internal.aq aqVar, bb bbVar, com.google.android.play.core.assetpacks.internal.ad adVar, de deVar, co coVar, bx bxVar, com.google.android.play.core.assetpacks.internal.aq aqVar2, ea eaVar) {
        this.b = bhVar;
        this.k = aqVar;
        this.c = bbVar;
        this.d = adVar;
        this.e = deVar;
        this.f = coVar;
        this.g = bxVar;
        this.l = aqVar2;
        this.h = eaVar;
    }

    private final Task h(Activity activity) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", this.g.a());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new k(this, this.i, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    private final void i() {
        ((Executor) this.l.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.e
            @Override // java.lang.Runnable
            public final void run() {
                l.this.f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i, String str) {
        if (this.b.G(str) || i != 4) {
            if (!this.b.G(str) || i == 4) {
                return i;
            }
            return 4;
        }
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.b.y();
        this.b.w();
        this.b.x();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetPackStates cancel(List<String> list) {
        Map f = this.e.f(list);
        HashMap hashMap = new HashMap();
        for (String str : list) {
            Integer num = (Integer) f.get(str);
            hashMap.put(str, AssetPackState.a(str, num == null ? 0 : num.intValue(), 0, 0L, 0L, 0.0d, 0, "", ""));
        }
        ((y) this.k.a()).e(list);
        return new bo(0L, hashMap);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void clearListeners() {
        this.c.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(String str, TaskCompletionSource taskCompletionSource) {
        if (this.b.D(str)) {
            taskCompletionSource.setResult(null);
            ((y) this.k.a()).j(str);
            return;
        }
        taskCompletionSource.setException(new IOException(String.format("Failed to remove pack %s.", str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        final bh bhVar = this.b;
        Objects.requireNonNull(bhVar);
        ((y) this.k.a()).d(this.b.u()).addOnSuccessListener((Executor) this.l.a(), new OnSuccessListener() { // from class: com.google.android.play.core.assetpacks.i
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                bh.this.C((List) obj);
            }
        }).addOnFailureListener((Executor) this.l.a(), new OnFailureListener() { // from class: com.google.android.play.core.assetpacks.j
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                l.a.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
            }
        });
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<AssetPackStates> fetch(List<String> list) {
        Map u = this.b.u();
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", 0);
            bundle.putInt("error_code", 0);
            for (String str : list) {
                bundle.putInt(com.google.android.play.core.assetpacks.model.b.a(NotificationCompat.CATEGORY_STATUS, str), 4);
                bundle.putInt(com.google.android.play.core.assetpacks.model.b.a("error_code", str), 0);
                bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("total_bytes_to_download", str), 0L);
                bundle.putLong(com.google.android.play.core.assetpacks.model.b.a("bytes_downloaded", str), 0L);
            }
            bundle.putStringArrayList("pack_names", new ArrayList<>(list));
            bundle.putLong("total_bytes_to_download", 0L);
            bundle.putLong("bytes_downloaded", 0L);
            return Tasks.forResult(AssetPackStates.a(bundle, this.f, this.h, bf.a));
        }
        return ((y) this.k.a()).c(arrayList, u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(boolean z) {
        bb bbVar = this.c;
        boolean j = bbVar.j();
        bbVar.g(z);
        if (!z || j) {
            return;
        }
        i();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetLocation getAssetLocation(String str, String str2) {
        AssetPackLocation f;
        if (!this.j) {
            ((Executor) this.l.a()).execute(new h(this));
            this.j = true;
        }
        if (this.b.G(str)) {
            try {
                f = this.b.f(str);
            } catch (IOException unused) {
            }
        } else {
            if (this.d.a().contains(str)) {
                f = AssetPackLocation.a();
            }
            f = null;
        }
        if (f == null) {
            return null;
        }
        if (f.packStorageMethod() == 1) {
            bh bhVar = this.b;
            return bhVar.d(str, str2, bhVar.s(str));
        } else if (f.packStorageMethod() == 0) {
            return this.b.e(str, str2, f);
        } else {
            a.a("The asset %s is not present in Asset Pack %s", str2, str);
            return null;
        }
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetPackLocation getPackLocation(String str) {
        if (!this.j) {
            ((Executor) this.l.a()).execute(new h(this));
            this.j = true;
        }
        if (this.b.G(str)) {
            try {
                return this.b.f(str);
            } catch (IOException unused) {
                return null;
            }
        } else if (this.d.a().contains(str)) {
            return AssetPackLocation.a();
        } else {
            return null;
        }
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Map<String, AssetPackLocation> getPackLocations() {
        Map<String, AssetPackLocation> v = this.b.v();
        HashMap hashMap = new HashMap();
        for (String str : this.d.a()) {
            hashMap.put(str, AssetPackLocation.a());
        }
        v.putAll(hashMap);
        return v;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<AssetPackStates> getPackStates(List<String> list) {
        return ((y) this.k.a()).b(list, new f(this), this.b.u());
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final synchronized void registerListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        bb bbVar = this.c;
        boolean j = bbVar.j();
        bbVar.f(assetPackStateUpdateListener);
        if (j) {
            return;
        }
        i();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<Void> removePack(final String str) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ((Executor) this.l.a()).execute(new Runnable() { // from class: com.google.android.play.core.assetpacks.g
            @Override // java.lang.Runnable
            public final void run() {
                l.this.d(str, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<Integer> showCellularDataConfirmation(Activity activity) {
        if (activity == null) {
            return Tasks.forException(new AssetPackException(-3));
        }
        if (this.g.a() == null) {
            return Tasks.forException(new AssetPackException(-12));
        }
        return h(activity);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task<Integer> showConfirmationDialog(Activity activity) {
        if (activity == null) {
            return Tasks.forException(new AssetPackException(-3));
        }
        if (this.g.a() == null) {
            return Tasks.forException(new AssetPackException(-14));
        }
        return h(activity);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final void unregisterListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        this.c.h(assetPackStateUpdateListener);
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final boolean showCellularDataConfirmation(ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        if (activityResultLauncher == null || this.g.a() == null) {
            return false;
        }
        activityResultLauncher.launch(new IntentSenderRequest.Builder(this.g.a().getIntentSender()).build());
        return true;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackManager
    public final boolean showConfirmationDialog(ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
        if (activityResultLauncher == null || this.g.a() == null) {
            return false;
        }
        activityResultLauncher.launch(new IntentSenderRequest.Builder(this.g.a().getIntentSender()).build());
        return true;
    }
}
