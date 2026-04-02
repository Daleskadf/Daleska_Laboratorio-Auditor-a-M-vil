package com.google.firebase.storage;

import X5.L;
import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class v extends AbstractC0825b {
    public static final HashMap j;

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap f9952k;

    /* renamed from: a  reason: collision with root package name */
    public final Object f9953a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final B.a f9954b = new B.a(this, (int) RecognitionOptions.ITF, new B(this) { // from class: com.google.firebase.storage.n

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v f9933b;

        {
            this.f9933b = this;
        }

        @Override // com.google.firebase.storage.B
        public final void a(Object obj, Object obj2) {
            switch (r2) {
                case 0:
                    v vVar = this.f9933b;
                    vVar.getClass();
                    w.f9961c.b(vVar);
                    ((OnSuccessListener) obj).onSuccess((u) obj2);
                    return;
                case 1:
                    v vVar2 = this.f9933b;
                    vVar2.getClass();
                    w.f9961c.b(vVar2);
                    ((OnFailureListener) obj).onFailure(((u) obj2).f9950a);
                    return;
                case 2:
                    u uVar = (u) obj2;
                    v vVar3 = this.f9933b;
                    vVar3.getClass();
                    w.f9961c.b(vVar3);
                    ((OnCompleteListener) obj).onComplete(vVar3);
                    return;
                default:
                    u uVar2 = (u) obj2;
                    v vVar4 = this.f9933b;
                    vVar4.getClass();
                    w.f9961c.b(vVar4);
                    ((OnCanceledListener) obj).onCanceled();
                    return;
            }
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public final B.a f9955c = new B.a(this, 64, new B(this) { // from class: com.google.firebase.storage.n

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v f9933b;

        {
            this.f9933b = this;
        }

        @Override // com.google.firebase.storage.B
        public final void a(Object obj, Object obj2) {
            switch (r2) {
                case 0:
                    v vVar = this.f9933b;
                    vVar.getClass();
                    w.f9961c.b(vVar);
                    ((OnSuccessListener) obj).onSuccess((u) obj2);
                    return;
                case 1:
                    v vVar2 = this.f9933b;
                    vVar2.getClass();
                    w.f9961c.b(vVar2);
                    ((OnFailureListener) obj).onFailure(((u) obj2).f9950a);
                    return;
                case 2:
                    u uVar = (u) obj2;
                    v vVar3 = this.f9933b;
                    vVar3.getClass();
                    w.f9961c.b(vVar3);
                    ((OnCompleteListener) obj).onComplete(vVar3);
                    return;
                default:
                    u uVar2 = (u) obj2;
                    v vVar4 = this.f9933b;
                    vVar4.getClass();
                    w.f9961c.b(vVar4);
                    ((OnCanceledListener) obj).onCanceled();
                    return;
            }
        }
    });

    /* renamed from: d  reason: collision with root package name */
    public final B.a f9956d = new B.a(this, 448, new B(this) { // from class: com.google.firebase.storage.n

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v f9933b;

        {
            this.f9933b = this;
        }

        @Override // com.google.firebase.storage.B
        public final void a(Object obj, Object obj2) {
            switch (r2) {
                case 0:
                    v vVar = this.f9933b;
                    vVar.getClass();
                    w.f9961c.b(vVar);
                    ((OnSuccessListener) obj).onSuccess((u) obj2);
                    return;
                case 1:
                    v vVar2 = this.f9933b;
                    vVar2.getClass();
                    w.f9961c.b(vVar2);
                    ((OnFailureListener) obj).onFailure(((u) obj2).f9950a);
                    return;
                case 2:
                    u uVar = (u) obj2;
                    v vVar3 = this.f9933b;
                    vVar3.getClass();
                    w.f9961c.b(vVar3);
                    ((OnCompleteListener) obj).onComplete(vVar3);
                    return;
                default:
                    u uVar2 = (u) obj2;
                    v vVar4 = this.f9933b;
                    vVar4.getClass();
                    w.f9961c.b(vVar4);
                    ((OnCanceledListener) obj).onCanceled();
                    return;
            }
        }
    });

    /* renamed from: e  reason: collision with root package name */
    public final B.a f9957e = new B.a(this, (int) RecognitionOptions.QR_CODE, new B(this) { // from class: com.google.firebase.storage.n

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ v f9933b;

        {
            this.f9933b = this;
        }

        @Override // com.google.firebase.storage.B
        public final void a(Object obj, Object obj2) {
            switch (r2) {
                case 0:
                    v vVar = this.f9933b;
                    vVar.getClass();
                    w.f9961c.b(vVar);
                    ((OnSuccessListener) obj).onSuccess((u) obj2);
                    return;
                case 1:
                    v vVar2 = this.f9933b;
                    vVar2.getClass();
                    w.f9961c.b(vVar2);
                    ((OnFailureListener) obj).onFailure(((u) obj2).f9950a);
                    return;
                case 2:
                    u uVar = (u) obj2;
                    v vVar3 = this.f9933b;
                    vVar3.getClass();
                    w.f9961c.b(vVar3);
                    ((OnCompleteListener) obj).onComplete(vVar3);
                    return;
                default:
                    u uVar2 = (u) obj2;
                    v vVar4 = this.f9933b;
                    vVar4.getClass();
                    w.f9961c.b(vVar4);
                    ((OnCanceledListener) obj).onCanceled();
                    return;
            }
        }
    });
    public final B.a f = new B.a(this, -465, new L(25));

    /* renamed from: g  reason: collision with root package name */
    public final B.a f9958g = new B.a(this, 16, new L(26));

    /* renamed from: h  reason: collision with root package name */
    public volatile int f9959h = 1;

    /* renamed from: i  reason: collision with root package name */
    public u f9960i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        HashMap hashMap2 = new HashMap();
        f9952k = hashMap2;
        Integer valueOf = Integer.valueOf((int) RecognitionOptions.QR_CODE);
        hashMap.put(1, new HashSet(Arrays.asList(16, valueOf)));
        hashMap.put(2, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(4, new HashSet(Arrays.asList(8, 32)));
        hashMap.put(16, new HashSet(Arrays.asList(2, valueOf)));
        hashMap.put(64, new HashSet(Arrays.asList(2, valueOf)));
        hashMap2.put(1, new HashSet(Arrays.asList(2, 64)));
        Integer valueOf2 = Integer.valueOf((int) RecognitionOptions.ITF);
        hashMap2.put(2, new HashSet(Arrays.asList(4, 64, valueOf2)));
        hashMap2.put(4, new HashSet(Arrays.asList(4, 64, valueOf2)));
        hashMap2.put(8, new HashSet(Arrays.asList(16, 64, valueOf2)));
        hashMap2.put(32, new HashSet(Arrays.asList(valueOf, 64, valueOf2)));
    }

    public static String c(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 8) {
                        if (i7 != 16) {
                            if (i7 != 32) {
                                if (i7 != 64) {
                                    if (i7 != 128) {
                                        if (i7 != 256) {
                                            return "Unknown Internal State!";
                                        }
                                        return "INTERNAL_STATE_CANCELED";
                                    }
                                    return "INTERNAL_STATE_SUCCESS";
                                }
                                return "INTERNAL_STATE_FAILURE";
                            }
                            return "INTERNAL_STATE_CANCELING";
                        }
                        return "INTERNAL_STATE_PAUSED";
                    }
                    return "INTERNAL_STATE_PAUSING";
                }
                return "INTERNAL_STATE_IN_PROGRESS";
            }
            return "INTERNAL_STATE_QUEUED";
        }
        return "INTERNAL_STATE_NOT_STARTED";
    }

    public final void a() {
        if (!isComplete() && (this.f9959h & 16) == 0 && this.f9959h != 2 && !o(RecognitionOptions.QR_CODE, false)) {
            o(64, false);
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(OnCanceledListener onCanceledListener) {
        I.i(onCanceledListener);
        this.f9957e.d(null, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(OnCompleteListener onCompleteListener) {
        I.i(onCompleteListener);
        this.f9956d.d(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(OnFailureListener onFailureListener) {
        I.i(onFailureListener);
        this.f9955c.d(null, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(OnSuccessListener onSuccessListener) {
        I.i(onSuccessListener);
        this.f9954b.d(null, null, onSuccessListener);
        return this;
    }

    public final u b() {
        u uVar = this.f9960i;
        if (uVar != null) {
            return uVar;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.f9960i == null) {
            this.f9960i = m();
        }
        return this.f9960i;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Continuation continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9956d.d(null, null, new r(this, continuation, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Continuation continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f9956d.d(null, null, new s(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    public abstract m d();

    public abstract void e();

    public void f() {
    }

    public boolean g() {
        return p(new int[]{16, 8}, true);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Exception getException() {
        if (b() == null) {
            return null;
        }
        return b().f9950a;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult() {
        if (b() != null) {
            i iVar = b().f9950a;
            if (iVar == null) {
                return b();
            }
            throw new RuntimeExecutionException(iVar);
        }
        throw new IllegalStateException();
    }

    public final void h() {
        if (o(2, false)) {
            l();
        }
    }

    public void i() {
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        if (this.f9959h == 256) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        if ((this.f9959h & 448) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        if ((this.f9959h & RecognitionOptions.ITF) != 0) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (o(2, true)) {
            i();
            l();
            return true;
        }
        return false;
    }

    public abstract void k();

    public abstract void l();

    public final u m() {
        u n7;
        synchronized (this.f9953a) {
            n7 = n();
        }
        return n7;
    }

    public abstract u n();

    public final boolean o(int i7, boolean z7) {
        return p(new int[]{i7}, z7);
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(SuccessContinuation successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f9954b.d(null, null, new t(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    public final boolean p(int[] iArr, boolean z7) {
        HashMap hashMap;
        String substring;
        if (z7) {
            hashMap = j;
        } else {
            hashMap = f9952k;
        }
        synchronized (this.f9953a) {
            try {
                for (int i7 : iArr) {
                    HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(this.f9959h));
                    if (hashSet != null && hashSet.contains(Integer.valueOf(i7))) {
                        this.f9959h = i7;
                        int i8 = this.f9959h;
                        if (i8 != 2) {
                            if (i8 != 4) {
                                if (i8 != 16 && i8 != 64 && i8 != 128 && i8 == 256) {
                                    e();
                                }
                            } else {
                                f();
                            }
                        } else {
                            w.f9961c.a(this);
                        }
                        this.f9954b.f();
                        this.f9955c.f();
                        this.f9957e.f();
                        this.f9956d.f();
                        this.f9958g.f();
                        this.f.f();
                        if (Log.isLoggable("StorageTask", 3)) {
                            Log.d("StorageTask", "changed internal state to: " + c(i7) + " isUser: " + z7 + " from state:" + c(this.f9959h));
                        }
                        return true;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unable to change internal state to: ");
                if (iArr.length == 0) {
                    substring = StringUtils.EMPTY;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i9 : iArr) {
                        sb2.append(c(i9));
                        sb2.append(", ");
                    }
                    substring = sb2.substring(0, sb2.length() - 2);
                }
                sb.append(substring);
                sb.append(" isUser: ");
                sb.append(z7);
                sb.append(" from state:");
                sb.append(c(this.f9959h));
                Log.w("StorageTask", sb.toString());
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        I.i(onCanceledListener);
        I.i(executor);
        this.f9957e.d(null, executor, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        I.i(onCompleteListener);
        I.i(executor);
        this.f9956d.d(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        I.i(onFailureListener);
        I.i(executor);
        this.f9955c.d(null, executor, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        I.i(executor);
        I.i(onSuccessListener);
        this.f9954b.d(null, executor, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWith(Executor executor, Continuation continuation) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9956d.d(null, executor, new r(this, continuation, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        I.i(onCanceledListener);
        I.i(activity);
        this.f9957e.d(activity, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        I.i(onCompleteListener);
        I.i(activity);
        this.f9956d.d(activity, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        I.i(onFailureListener);
        I.i(activity);
        this.f9955c.d(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        I.i(activity);
        I.i(onSuccessListener);
        this.f9954b.d(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task continueWithTask(Executor executor, Continuation continuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f9956d.d(null, executor, new s(this, continuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f9954b.d(null, executor, new t(successContinuation, taskCompletionSource, cancellationTokenSource));
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.tasks.Task
    public final Object getResult(Class cls) {
        if (b() != null) {
            if (!cls.isInstance(b().f9950a)) {
                i iVar = b().f9950a;
                if (iVar == null) {
                    return b();
                }
                throw new RuntimeExecutionException(iVar);
            }
            throw ((Throwable) cls.cast(b().f9950a));
        }
        throw new IllegalStateException();
    }
}
