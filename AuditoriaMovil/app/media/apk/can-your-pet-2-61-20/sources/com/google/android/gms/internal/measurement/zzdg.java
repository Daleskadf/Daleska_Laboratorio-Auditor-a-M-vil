package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzdg extends zzbx implements zzdd {
    public static zzdd asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzdd) {
            return (zzdd) queryLocalInterface;
        }
        return new zzdf(iBinder);
    }

    public zzdg() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdi zzdkVar;
        zzdi zzdiVar;
        zzdi zzdiVar2 = null;
        zzdi zzdiVar3 = null;
        zzdi zzdiVar4 = null;
        zzdi zzdiVar5 = null;
        zzdj zzdjVar = null;
        zzdj zzdjVar2 = null;
        zzdj zzdjVar3 = null;
        zzdi zzdiVar6 = null;
        zzdi zzdiVar7 = null;
        zzdi zzdiVar8 = null;
        zzdi zzdiVar9 = null;
        zzdi zzdiVar10 = null;
        zzdi zzdiVar11 = null;
        zzdo zzdoVar = null;
        zzdi zzdiVar12 = null;
        zzdi zzdiVar13 = null;
        zzdi zzdiVar14 = null;
        zzdi zzdiVar15 = null;
        switch (i) {
            case 1:
                long readLong = parcel.readLong();
                zzbw.zzb(parcel);
                initialize(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzdq) zzbw.zza(parcel, zzdq.CREATOR), readLong);
                break;
            case 2:
                boolean zzc = zzbw.zzc(parcel);
                boolean zzc2 = zzbw.zzc(parcel);
                long readLong2 = parcel.readLong();
                zzbw.zzb(parcel);
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzbw.zza(parcel, Bundle.CREATOR), zzc, zzc2, readLong2);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdiVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzdi) {
                        zzdkVar = (zzdi) queryLocalInterface;
                    } else {
                        zzdkVar = new zzdk(readStrongBinder);
                    }
                    zzdiVar = zzdkVar;
                }
                long readLong3 = parcel.readLong();
                zzbw.zzb(parcel);
                logEventAndBundle(readString, readString2, bundle, zzdiVar, readLong3);
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zzc3 = zzbw.zzc(parcel);
                long readLong4 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserProperty(readString3, readString4, asInterface, zzc3, readLong4);
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean zzc4 = zzbw.zzc(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof zzdi) {
                        zzdiVar2 = (zzdi) queryLocalInterface2;
                    } else {
                        zzdiVar2 = new zzdk(readStrongBinder2);
                    }
                }
                zzbw.zzb(parcel);
                getUserProperties(readString5, readString6, zzc4, zzdiVar2);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof zzdi) {
                        zzdiVar15 = (zzdi) queryLocalInterface3;
                    } else {
                        zzdiVar15 = new zzdk(readStrongBinder3);
                    }
                }
                zzbw.zzb(parcel);
                getMaxUserProperties(readString7, zzdiVar15);
                break;
            case 7:
                String readString8 = parcel.readString();
                long readLong5 = parcel.readLong();
                zzbw.zzb(parcel);
                setUserId(readString8, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                zzbw.zzb(parcel);
                setConditionalUserProperty((Bundle) zzbw.zza(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                zzbw.zzb(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzbw.zza(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof zzdi) {
                        zzdiVar14 = (zzdi) queryLocalInterface4;
                    } else {
                        zzdiVar14 = new zzdk(readStrongBinder4);
                    }
                }
                zzbw.zzb(parcel);
                getConditionalUserProperties(readString9, readString10, zzdiVar14);
                break;
            case 11:
                boolean zzc5 = zzbw.zzc(parcel);
                long readLong7 = parcel.readLong();
                zzbw.zzb(parcel);
                setMeasurementEnabled(zzc5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                zzbw.zzb(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                zzbw.zzb(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                zzbw.zzb(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                long readLong11 = parcel.readLong();
                zzbw.zzb(parcel);
                setCurrentScreen(asInterface2, readString11, readString12, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof zzdi) {
                        zzdiVar13 = (zzdi) queryLocalInterface5;
                    } else {
                        zzdiVar13 = new zzdk(readStrongBinder5);
                    }
                }
                zzbw.zzb(parcel);
                getCurrentScreenName(zzdiVar13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof zzdi) {
                        zzdiVar12 = (zzdi) queryLocalInterface6;
                    } else {
                        zzdiVar12 = new zzdk(readStrongBinder6);
                    }
                }
                zzbw.zzb(parcel);
                getCurrentScreenClass(zzdiVar12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof zzdo) {
                        zzdoVar = (zzdo) queryLocalInterface7;
                    } else {
                        zzdoVar = new zzdn(readStrongBinder7);
                    }
                }
                zzbw.zzb(parcel);
                setInstanceIdProvider(zzdoVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof zzdi) {
                        zzdiVar11 = (zzdi) queryLocalInterface8;
                    } else {
                        zzdiVar11 = new zzdk(readStrongBinder8);
                    }
                }
                zzbw.zzb(parcel);
                getCachedAppInstanceId(zzdiVar11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof zzdi) {
                        zzdiVar10 = (zzdi) queryLocalInterface9;
                    } else {
                        zzdiVar10 = new zzdk(readStrongBinder9);
                    }
                }
                zzbw.zzb(parcel);
                getAppInstanceId(zzdiVar10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof zzdi) {
                        zzdiVar9 = (zzdi) queryLocalInterface10;
                    } else {
                        zzdiVar9 = new zzdk(readStrongBinder10);
                    }
                }
                zzbw.zzb(parcel);
                getGmpAppId(zzdiVar9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof zzdi) {
                        zzdiVar8 = (zzdi) queryLocalInterface11;
                    } else {
                        zzdiVar8 = new zzdk(readStrongBinder11);
                    }
                }
                zzbw.zzb(parcel);
                generateEventId(zzdiVar8);
                break;
            case 23:
                String readString13 = parcel.readString();
                long readLong12 = parcel.readLong();
                zzbw.zzb(parcel);
                beginAdUnitExposure(readString13, readLong12);
                break;
            case 24:
                String readString14 = parcel.readString();
                long readLong13 = parcel.readLong();
                zzbw.zzb(parcel);
                endAdUnitExposure(readString14, readLong13);
                break;
            case 25:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStarted(asInterface3, readLong14);
                break;
            case 26:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityStopped(asInterface4, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityCreated(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (Bundle) zzbw.zza(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityDestroyed(asInterface5, readLong17);
                break;
            case 29:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityPaused(asInterface6, readLong18);
                break;
            case 30:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivityResumed(asInterface7, readLong19);
                break;
            case 31:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof zzdi) {
                        zzdiVar7 = (zzdi) queryLocalInterface12;
                    } else {
                        zzdiVar7 = new zzdk(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                zzbw.zzb(parcel);
                onActivitySaveInstanceState(asInterface8, zzdiVar7, readLong20);
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzbw.zza(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof zzdi) {
                        zzdiVar6 = (zzdi) queryLocalInterface13;
                    } else {
                        zzdiVar6 = new zzdk(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                zzbw.zzb(parcel);
                performAction(bundle2, zzdiVar6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString15 = parcel.readString();
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbw.zzb(parcel);
                logHealthData(readInt, readString15, asInterface9, asInterface10, asInterface11);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof zzdj) {
                        zzdjVar3 = (zzdj) queryLocalInterface14;
                    } else {
                        zzdjVar3 = new zzdl(readStrongBinder14);
                    }
                }
                zzbw.zzb(parcel);
                setEventInterceptor(zzdjVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof zzdj) {
                        zzdjVar2 = (zzdj) queryLocalInterface15;
                    } else {
                        zzdjVar2 = new zzdl(readStrongBinder15);
                    }
                }
                zzbw.zzb(parcel);
                registerOnMeasurementEventListener(zzdjVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof zzdj) {
                        zzdjVar = (zzdj) queryLocalInterface16;
                    } else {
                        zzdjVar = new zzdl(readStrongBinder16);
                    }
                }
                zzbw.zzb(parcel);
                unregisterOnMeasurementEventListener(zzdjVar);
                break;
            case 37:
                HashMap zza = zzbw.zza(parcel);
                zzbw.zzb(parcel);
                initForTests(zza);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof zzdi) {
                        zzdiVar5 = (zzdi) queryLocalInterface17;
                    } else {
                        zzdiVar5 = new zzdk(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                zzbw.zzb(parcel);
                getTestFlag(zzdiVar5, readInt2);
                break;
            case 39:
                boolean zzc6 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                setDataCollectionEnabled(zzc6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof zzdi) {
                        zzdiVar4 = (zzdi) queryLocalInterface18;
                    } else {
                        zzdiVar4 = new zzdk(readStrongBinder18);
                    }
                }
                zzbw.zzb(parcel);
                isDataCollectionEnabled(zzdiVar4);
                break;
            case 41:
            case 47:
            default:
                return false;
            case 42:
                zzbw.zzb(parcel);
                setDefaultEventParameters((Bundle) zzbw.zza(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                zzbw.zzb(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsent((Bundle) zzbw.zza(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                zzbw.zzb(parcel);
                setConsentThirdParty((Bundle) zzbw.zza(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof zzdi) {
                        zzdiVar3 = (zzdi) queryLocalInterface19;
                    } else {
                        zzdiVar3 = new zzdk(readStrongBinder19);
                    }
                }
                zzbw.zzb(parcel);
                getSessionId(zzdiVar3);
                break;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                zzbw.zzb(parcel);
                setSgtmDebugInfo((Intent) zzbw.zza(parcel, Intent.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
