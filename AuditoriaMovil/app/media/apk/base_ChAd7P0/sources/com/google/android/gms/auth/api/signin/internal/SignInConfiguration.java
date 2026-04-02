package com.google.android.gms.auth.api.signin.internal;

import N2.f;
import X2.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.ReflectedParcelable;
import m5.d;
/* loaded from: classes.dex */
public final class SignInConfiguration extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new f(29);

    /* renamed from: a  reason: collision with root package name */
    public final String f9136a;

    /* renamed from: b  reason: collision with root package name */
    public final GoogleSignInOptions f9137b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        I.e(str);
        this.f9136a = str;
        this.f9137b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f9136a.equals(signInConfiguration.f9136a)) {
            GoogleSignInOptions googleSignInOptions = signInConfiguration.f9137b;
            GoogleSignInOptions googleSignInOptions2 = this.f9137b;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 1 * 31;
        int i8 = 0;
        String str = this.f9136a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (i7 + hashCode) * 31;
        GoogleSignInOptions googleSignInOptions = this.f9137b;
        if (googleSignInOptions != null) {
            i8 = googleSignInOptions.hashCode();
        }
        return i9 + i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.B(parcel, 2, this.f9136a, false);
        d.A(parcel, 5, this.f9137b, i7, false);
        d.J(G2, parcel);
    }
}
