package b3;

import a3.C0445a;
import a3.C0446b;
import a3.C0447c;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: b3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0586g extends zab implements InterfaceC0583d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8172a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8173b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0586g(int i7, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
        this.f8172a = i7;
        this.f8173b = taskCompletionSource;
    }

    @Override // b3.InterfaceC0583d
    public void d(Status status, C0447c c0447c) {
        switch (this.f8172a) {
            case 1:
                android.support.v4.media.session.a.D(status, c0447c, this.f8173b);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // b3.InterfaceC0583d
    public void f(Status status, C0445a c0445a) {
        switch (this.f8172a) {
            case 0:
                android.support.v4.media.session.a.D(status, c0445a, this.f8173b);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return false;
                    }
                    Status status = (Status) zac.zaa(parcel, Status.CREATOR);
                    zac.zab(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status2 = (Status) zac.zaa(parcel, Status.CREATOR);
                C0446b c0446b = (C0446b) zac.zaa(parcel, C0446b.CREATOR);
                zac.zab(parcel);
                throw new UnsupportedOperationException();
            }
            zac.zab(parcel);
            d((Status) zac.zaa(parcel, Status.CREATOR), (C0447c) zac.zaa(parcel, C0447c.CREATOR));
        } else {
            zac.zab(parcel);
            f((Status) zac.zaa(parcel, Status.CREATOR), (C0445a) zac.zaa(parcel, C0445a.CREATOR));
        }
        return true;
    }
}
