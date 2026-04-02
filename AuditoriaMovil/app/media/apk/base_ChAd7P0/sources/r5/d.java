package r5;

import B5.AbstractActivityC0032e;
import E6.m;
import L5.o;
import L5.p;
import L5.q;
import L5.r;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.lifecycle.AbstractC0564p;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import org.apache.tika.Tika;
import org.apache.tika.detect.Detector;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import q5.C1712a;
/* loaded from: classes.dex */
public final class d implements p, H5.b, I5.a {

    /* renamed from: X  reason: collision with root package name */
    public AbstractActivityC0032e f15529X;

    /* renamed from: Y  reason: collision with root package name */
    public r f15530Y;

    /* renamed from: a  reason: collision with root package name */
    public I5.b f15531a;

    /* renamed from: b  reason: collision with root package name */
    public b f15532b;

    /* renamed from: c  reason: collision with root package name */
    public Application f15533c;

    /* renamed from: d  reason: collision with root package name */
    public H5.a f15534d;

    /* renamed from: e  reason: collision with root package name */
    public AbstractC0564p f15535e;
    public c f;

    @Override // I5.a
    public final void onAttachedToActivity(I5.b binding) {
        j.e(binding, "binding");
        this.f15531a = binding;
        H5.a aVar = this.f15534d;
        if (aVar != null) {
            L5.f fVar = aVar.f2030b;
            j.d(fVar, "it.binaryMessenger");
            Context context = aVar.f2029a;
            j.c(context, "null cannot be cast to non-null type android.app.Application");
            I5.b bVar = this.f15531a;
            j.b(bVar);
            AbstractActivityC0032e abstractActivityC0032e = ((C5.d) bVar).f571a;
            j.d(abstractActivityC0032e, "activityBinding!!.activity");
            I5.b bVar2 = this.f15531a;
            j.b(bVar2);
            this.f15529X = abstractActivityC0032e;
            this.f15533c = (Application) context;
            this.f15532b = new b(abstractActivityC0032e);
            r rVar = new r(fVar, "miguelruivo.flutter.plugins.filepicker");
            this.f15530Y = rVar;
            rVar.b(this);
            b bVar3 = this.f15532b;
            if (bVar3 != null) {
                new L5.j(fVar, "miguelruivo.flutter.plugins.filepickerevent").a(new io.flutter.plugins.videoplayer.p(bVar3, 1));
                this.f = new c(abstractActivityC0032e);
                C5.d dVar = (C5.d) bVar2;
                dVar.a(bVar3);
                AbstractC0564p lifecycle = dVar.f572b.getLifecycle();
                this.f15535e = lifecycle;
                c cVar = this.f;
                if (cVar != null && lifecycle != null) {
                    lifecycle.a(cVar);
                }
            }
        }
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a binding) {
        j.e(binding, "binding");
        this.f15534d = binding;
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        I5.b bVar;
        b bVar2 = this.f15532b;
        if (bVar2 != null && (bVar = this.f15531a) != null) {
            ((C5.d) bVar).d(bVar2);
        }
        this.f15531a = null;
        c cVar = this.f;
        if (cVar != null) {
            AbstractC0564p abstractC0564p = this.f15535e;
            if (abstractC0564p != null) {
                abstractC0564p.b(cVar);
            }
            Application application = this.f15533c;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(cVar);
            }
        }
        this.f15535e = null;
        b bVar3 = this.f15532b;
        if (bVar3 != null) {
            bVar3.f15521Y = null;
        }
        this.f15532b = null;
        r rVar = this.f15530Y;
        if (rVar != null) {
            rVar.b(null);
        }
        this.f15530Y = null;
        this.f15533c = null;
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a binding) {
        j.e(binding, "binding");
        this.f15534d = null;
    }

    @Override // L5.p
    public final void onMethodCall(o call, q qVar) {
        HashMap hashMap;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        String detect;
        Context applicationContext;
        boolean z7 = true;
        j.e(call, "call");
        Object obj11 = null;
        if (this.f15529X == null) {
            ((K5.r) qVar).b(null, "no_activity", "file picker plugin requires a foreground activity");
            return;
        }
        C1712a c1712a = new C1712a((K5.r) qVar, 1);
        Object obj12 = call.f3039b;
        if (obj12 instanceof HashMap) {
            hashMap = (HashMap) obj12;
        } else {
            hashMap = null;
        }
        String method = call.f3038a;
        if (method != null) {
            int hashCode = method.hashCode();
            if (hashCode != -1349088399) {
                if (hashCode != 3522941) {
                    if (hashCode == 94746189 && method.equals("clear")) {
                        AbstractActivityC0032e abstractActivityC0032e = this.f15529X;
                        if (abstractActivityC0032e != null && (applicationContext = abstractActivityC0032e.getApplicationContext()) != null) {
                            try {
                                f.h(new File(applicationContext.getCacheDir().toString() + "/file_picker/"));
                            } catch (Exception e7) {
                                Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e7);
                                z7 = false;
                            }
                            obj11 = Boolean.valueOf(z7);
                        }
                        c1712a.a(obj11);
                        return;
                    }
                } else if (method.equals("save")) {
                    if (hashMap != null) {
                        obj7 = hashMap.get("fileType");
                    } else {
                        obj7 = null;
                    }
                    j.c(obj7, "null cannot be cast to non-null type kotlin.String");
                    String c8 = f.c((String) obj7);
                    if (hashMap != null) {
                        obj8 = hashMap.get("initialDirectory");
                    } else {
                        obj8 = null;
                    }
                    String str = (String) obj8;
                    if (hashMap != null) {
                        obj9 = hashMap.get("bytes");
                    } else {
                        obj9 = null;
                    }
                    byte[] bArr = (byte[]) obj9;
                    if (hashMap != null) {
                        obj10 = hashMap.get("fileName");
                    } else {
                        obj10 = null;
                    }
                    String valueOf = String.valueOf(obj10);
                    if (valueOf.length() > 0 && !m.N(valueOf, ".")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(valueOf);
                        sb.append('.');
                        String mimeType = new Tika().detect(bArr);
                        j.d(mimeType, "mimeType");
                        sb.append(m.g0(mimeType, "/", mimeType));
                        valueOf = sb.toString();
                    }
                    b bVar = this.f15532b;
                    if (bVar != null) {
                        if (bVar.f15524b == null) {
                            bVar.f15524b = c1712a;
                            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                            intent.addCategory("android.intent.category.OPENABLE");
                            if (valueOf != null && valueOf.length() != 0) {
                                intent.putExtra("android.intent.extra.TITLE", valueOf);
                            }
                            bVar.f15522Z = bArr;
                            if (!"dir".equals(c8)) {
                                try {
                                    Tika tika = new Tika();
                                    if (valueOf != null && valueOf.length() != 0) {
                                        Detector detector = tika.getDetector();
                                        TikaInputStream tikaInputStream = TikaInputStream.get(bArr);
                                        Metadata metadata = new Metadata();
                                        metadata.set(TikaCoreProperties.RESOURCE_NAME_KEY, valueOf);
                                        detect = detector.detect(tikaInputStream, metadata).toString();
                                        j.d(detect, "detector.detect(stream, metadata).toString()");
                                        intent.setType(detect);
                                    }
                                    detect = tika.detect(bArr);
                                    j.d(detect, "tika.detect(bytes)");
                                    intent.setType(detect);
                                } catch (Throwable th) {
                                    intent.setType("*/*");
                                    Log.e("FilePickerDelegate", "Failed to detect mime type. " + th);
                                }
                            }
                            if (str != null && str.length() != 0 && Build.VERSION.SDK_INT >= 26) {
                                intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str));
                            }
                            AbstractActivityC0032e abstractActivityC0032e2 = bVar.f15523a;
                            if (intent.resolveActivity(abstractActivityC0032e2.getPackageManager()) != null) {
                                abstractActivityC0032e2.startActivityForResult(intent, b.f15519f0);
                                return;
                            }
                            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
                            bVar.b("invalid_format_type", "Can't handle the provided file type.");
                            return;
                        }
                        int i7 = b.f15518e0;
                        c1712a.b(null, "already_active", "File picker is already active");
                        return;
                    }
                    return;
                }
            } else if (method.equals("custom")) {
                if (hashMap != null) {
                    obj4 = hashMap.get("allowedExtensions");
                } else {
                    obj4 = null;
                }
                ArrayList g3 = f.g((ArrayList) obj4);
                if (g3 != null && !g3.isEmpty()) {
                    b bVar2 = this.f15532b;
                    if (bVar2 != null) {
                        String c9 = f.c(method);
                        if (hashMap != null) {
                            obj5 = hashMap.get("allowMultipleSelection");
                        } else {
                            obj5 = null;
                        }
                        Boolean bool = (Boolean) obj5;
                        if (hashMap != null) {
                            obj6 = hashMap.get("withData");
                        } else {
                            obj6 = null;
                        }
                        Boolean bool2 = (Boolean) obj6;
                        if (hashMap != null) {
                            obj11 = hashMap.get("compressionQuality");
                        }
                        f.i(bVar2, c9, bool, bool2, g3, (Integer) obj11, c1712a);
                        return;
                    }
                    return;
                }
                c1712a.b(null, "FilePicker", "Unsupported filter. Ensure using extension without dot (e.g., jpg, not .jpg).");
                return;
            }
        }
        j.d(method, "method");
        String c10 = f.c(method);
        if (c10 == null) {
            c1712a.c();
            return;
        }
        b bVar3 = this.f15532b;
        if (bVar3 != null) {
            if (hashMap != null) {
                obj = hashMap.get("allowMultipleSelection");
            } else {
                obj = null;
            }
            Boolean bool3 = (Boolean) obj;
            if (hashMap != null) {
                obj2 = hashMap.get("withData");
            } else {
                obj2 = null;
            }
            Boolean bool4 = (Boolean) obj2;
            if (hashMap != null) {
                obj3 = hashMap.get("allowedExtensions");
            } else {
                obj3 = null;
            }
            ArrayList g4 = f.g((ArrayList) obj3);
            if (hashMap != null) {
                obj11 = hashMap.get("compressionQuality");
            }
            f.i(bVar3, c10, bool3, bool4, g4, (Integer) obj11, c1712a);
        }
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b binding) {
        j.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
