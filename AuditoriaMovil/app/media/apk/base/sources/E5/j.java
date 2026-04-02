package e5;

import B5.M;
import a3.C0447c;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import b3.C0580a;
import b3.C0585f;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final W2.d[] f10900a = new W2.d[0];

    /* renamed from: b  reason: collision with root package name */
    public static final W2.d f10901b;

    /* renamed from: c  reason: collision with root package name */
    public static final zzai f10902c;

    /* renamed from: d  reason: collision with root package name */
    public static final zzai f10903d;

    static {
        W2.d dVar = new W2.d("vision.barcode", 1L);
        f10901b = dVar;
        W2.d dVar2 = new W2.d("vision.custom.ica", 1L);
        W2.d dVar3 = new W2.d("vision.face", 1L);
        W2.d dVar4 = new W2.d("vision.ica", 1L);
        W2.d dVar5 = new W2.d("vision.ocr", 1L);
        W2.d dVar6 = new W2.d("mlkit.langid", 1L);
        W2.d dVar7 = new W2.d("mlkit.nlclassifier", 1L);
        W2.d dVar8 = new W2.d("tflite_dynamite", 1L);
        W2.d dVar9 = new W2.d("mlkit.barcode.ui", 1L);
        W2.d dVar10 = new W2.d("mlkit.smartreply", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza("barcode", dVar);
        zzahVar.zza("custom_ica", dVar2);
        zzahVar.zza("face", dVar3);
        zzahVar.zza("ica", dVar4);
        zzahVar.zza("ocr", dVar5);
        zzahVar.zza("langid", dVar6);
        zzahVar.zza("nlclassifier", dVar7);
        zzahVar.zza("tflite_dynamite", dVar8);
        zzahVar.zza("barcode_ui", dVar9);
        zzahVar.zza("smart_reply", dVar10);
        f10902c = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza("com.google.android.gms.vision.barcode", dVar);
        zzahVar2.zza("com.google.android.gms.vision.custom.ica", dVar2);
        zzahVar2.zza("com.google.android.gms.vision.face", dVar3);
        zzahVar2.zza("com.google.android.gms.vision.ica", dVar4);
        zzahVar2.zza("com.google.android.gms.vision.ocr", dVar5);
        zzahVar2.zza("com.google.android.gms.mlkit.langid", dVar6);
        zzahVar2.zza("com.google.android.gms.mlkit.nlclassifier", dVar7);
        zzahVar2.zza("com.google.android.gms.tflite_dynamite", dVar8);
        zzahVar2.zza("com.google.android.gms.mlkit_smartreply", dVar10);
        f10903d = zzahVar2.zzb();
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [com.google.android.gms.common.api.l, b3.h] */
    public static void a(Context context, List list) {
        Task doRead;
        W2.f.f6172b.getClass();
        if (W2.f.a(context) >= 221500000) {
            W2.d[] b5 = b(f10902c, list);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new r(b5, 0));
            I.a("APIs must not be empty.", !arrayList.isEmpty());
            ?? lVar = new com.google.android.gms.common.api.l(context, null, b3.h.f8174a, com.google.android.gms.common.api.e.f9157U, com.google.android.gms.common.api.k.f9283c);
            C0580a k2 = C0580a.k(arrayList, true);
            if (k2.f8165a.isEmpty()) {
                doRead = Tasks.forResult(new C0447c(0, false));
            } else {
                M a7 = AbstractC0751z.a();
                a7.f331d = new W2.d[]{zav.zaa};
                a7.f328a = true;
                a7.f329b = 27304;
                a7.f330c = new C0585f((b3.h) lVar, k2);
                doRead = lVar.doRead(a7.a());
            }
            doRead.addOnFailureListener(new s(0));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static W2.d[] b(zzai zzaiVar, List list) {
        W2.d[] dVarArr = new W2.d[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            W2.d dVar = (W2.d) zzaiVar.get(list.get(i7));
            I.i(dVar);
            dVarArr[i7] = dVar;
        }
        return dVarArr;
    }
}
