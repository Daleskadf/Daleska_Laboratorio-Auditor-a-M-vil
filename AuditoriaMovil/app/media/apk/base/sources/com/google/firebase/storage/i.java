package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
/* loaded from: classes.dex */
public final class i extends U3.i {

    /* renamed from: a  reason: collision with root package name */
    public final int f9914a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f9915b;

    public i(int i7, int i8, Throwable th) {
        super(c(i7));
        this.f9915b = th;
        this.f9914a = i7;
        Log.e("StorageException", "StorageException has occurred.\n" + c(i7) + "\n Code: " + i7 + " HttpResult: " + i8);
        if (th != null) {
            Log.e("StorageException", th.getMessage(), th);
        }
    }

    public static i a(Status status) {
        int i7;
        I.c(!status.k());
        if (status.f9153a == 16) {
            i7 = -13040;
        } else if (status.equals(Status.f9150Y)) {
            i7 = -13030;
        } else {
            i7 = -13000;
        }
        return new i(i7, 0, null);
    }

    public static i b(int i7, Throwable th) {
        int i8;
        if (th instanceof i) {
            return (i) th;
        }
        if ((i7 == 0 || (i7 >= 200 && i7 < 300)) && th == null) {
            return null;
        }
        if (th instanceof C0824a) {
            i8 = -13040;
        } else if (i7 != -2) {
            if (i7 != 401) {
                if (i7 != 409) {
                    if (i7 != 403) {
                        if (i7 != 404) {
                            i8 = -13000;
                        } else {
                            i8 = -13010;
                        }
                    } else {
                        i8 = -13021;
                    }
                } else {
                    i8 = -13031;
                }
            } else {
                i8 = -13020;
            }
        } else {
            i8 = -13030;
        }
        return new i(i8, i7, th);
    }

    public static String c(int i7) {
        if (i7 != -13040) {
            if (i7 != -13031) {
                if (i7 != -13030) {
                    if (i7 != -13021) {
                        if (i7 != -13020) {
                            switch (i7) {
                                case -13013:
                                    return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
                                case -13012:
                                    return "Project does not exist.";
                                case -13011:
                                    return "Bucket does not exist.";
                                case -13010:
                                    return "Object does not exist at location.";
                                default:
                                    return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
                            }
                        }
                        return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
                    }
                    return "User does not have permission to access this object.";
                }
                return "The operation retry limit has been exceeded.";
            }
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        return "The operation was cancelled.";
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        Throwable th = this.f9915b;
        if (th == this) {
            return null;
        }
        return th;
    }
}
