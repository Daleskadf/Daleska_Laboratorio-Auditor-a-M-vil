package com.google.android.gms.auth.api.identity;

import N2.f;
import X2.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import m5.d;
/* loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new f(18);

    /* renamed from: a  reason: collision with root package name */
    public final PendingIntent f9100a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9101b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9102c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f9103d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9104e;
    public final int f;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, ArrayList arrayList, String str3, int i7) {
        this.f9100a = pendingIntent;
        this.f9101b = str;
        this.f9102c = str2;
        this.f9103d = arrayList;
        this.f9104e = str3;
        this.f = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        ArrayList arrayList = this.f9103d;
        if (arrayList.size() != saveAccountLinkingTokenRequest.f9103d.size() || !arrayList.containsAll(saveAccountLinkingTokenRequest.f9103d) || !I.m(this.f9100a, saveAccountLinkingTokenRequest.f9100a) || !I.m(this.f9101b, saveAccountLinkingTokenRequest.f9101b) || !I.m(this.f9102c, saveAccountLinkingTokenRequest.f9102c) || !I.m(this.f9104e, saveAccountLinkingTokenRequest.f9104e) || this.f != saveAccountLinkingTokenRequest.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9100a, this.f9101b, this.f9102c, this.f9103d, this.f9104e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.A(parcel, 1, this.f9100a, i7, false);
        d.B(parcel, 2, this.f9101b, false);
        d.B(parcel, 3, this.f9102c, false);
        d.D(parcel, 4, this.f9103d);
        d.B(parcel, 5, this.f9104e, false);
        d.K(parcel, 6, 4);
        parcel.writeInt(this.f);
        d.J(G2, parcel);
    }
}
