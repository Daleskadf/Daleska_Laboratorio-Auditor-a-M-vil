package io.flutter.plugins.imagepicker;

import B5.AbstractActivityC0032e;
import a1.C0415A;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import b3.C0585f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.firebase.firestore.Z;
import e0.C0927b;
import g1.C1006c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class h implements L5.t, L5.v {

    /* renamed from: X  reason: collision with root package name */
    public final Z f12351X;

    /* renamed from: Y  reason: collision with root package name */
    public final ExecutorService f12352Y;

    /* renamed from: Z  reason: collision with root package name */
    public f f12353Z;

    /* renamed from: a  reason: collision with root package name */
    public final String f12354a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractActivityC0032e f12355b;

    /* renamed from: c  reason: collision with root package name */
    public final C0927b f12356c;

    /* renamed from: d  reason: collision with root package name */
    public final C0415A f12357d;

    /* renamed from: e  reason: collision with root package name */
    public final C0585f f12358e;

    /* renamed from: e0  reason: collision with root package name */
    public Uri f12359e0;
    public final C1006c f;

    /* renamed from: f0  reason: collision with root package name */
    public R1.j f12360f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Object f12361g0;

    public h(AbstractActivityC0032e abstractActivityC0032e, C0927b c0927b, C0415A c0415a) {
        C0585f c0585f = new C0585f(abstractActivityC0032e, 8);
        C1006c c1006c = new C1006c(abstractActivityC0032e);
        Z z7 = new Z(19);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f12361g0 = new Object();
        this.f12355b = abstractActivityC0032e;
        this.f12356c = c0927b;
        this.f12354a = abstractActivityC0032e.getPackageName() + ".flutter.image_provider";
        this.f12358e = c0585f;
        this.f = c1006c;
        this.f12351X = z7;
        this.f12357d = c0415a;
        this.f12352Y = newSingleThreadExecutor;
    }

    public static void a(io.flutter.plugins.firebase.storage.g gVar) {
        gVar.e(new o("already_active", "Image picker is already active"));
    }

    public final void b(String str, String str2) {
        io.flutter.plugins.firebase.storage.g gVar;
        synchronized (this.f12361g0) {
            R1.j jVar = this.f12360f0;
            if (jVar != null) {
                gVar = (io.flutter.plugins.firebase.storage.g) jVar.f4684d;
            } else {
                gVar = null;
            }
            this.f12360f0 = null;
        }
        if (gVar == null) {
            this.f12357d.n(null, str, str2);
        } else {
            gVar.e(new o(str, str2));
        }
    }

    public final void c(ArrayList arrayList) {
        io.flutter.plugins.firebase.storage.g gVar;
        synchronized (this.f12361g0) {
            R1.j jVar = this.f12360f0;
            if (jVar != null) {
                gVar = (io.flutter.plugins.firebase.storage.g) jVar.f4684d;
            } else {
                gVar = null;
            }
            this.f12360f0 = null;
        }
        if (gVar == null) {
            this.f12357d.n(arrayList, null, null);
        } else {
            gVar.g(arrayList);
        }
    }

    public final void d(String str) {
        io.flutter.plugins.firebase.storage.g gVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f12361g0) {
            R1.j jVar = this.f12360f0;
            if (jVar != null) {
                gVar = (io.flutter.plugins.firebase.storage.g) jVar.f4684d;
            } else {
                gVar = null;
            }
            this.f12360f0 = null;
        }
        if (gVar == null) {
            if (!arrayList.isEmpty()) {
                this.f12357d.n(arrayList, null, null);
                return;
            }
            return;
        }
        gVar.g(arrayList);
    }

    public final ArrayList e(Intent intent, boolean z7) {
        String str;
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        Z z8 = this.f12351X;
        AbstractActivityC0032e abstractActivityC0032e = this.f12355b;
        if (data == null) {
            if (intent.getClipData() == null) {
                return null;
            }
            for (int i7 = 0; i7 < intent.getClipData().getItemCount(); i7++) {
                Uri uri = intent.getClipData().getItemAt(i7).getUri();
                if (uri == null) {
                    return null;
                }
                z8.getClass();
                String x7 = Z.x(abstractActivityC0032e, uri);
                if (x7 == null) {
                    return null;
                }
                if (z7) {
                    str = abstractActivityC0032e.getContentResolver().getType(uri);
                } else {
                    str = null;
                }
                arrayList.add(new g(x7, str));
            }
        } else {
            z8.getClass();
            String x8 = Z.x(abstractActivityC0032e, data);
            if (x8 == null) {
                return null;
            }
            arrayList.add(new g(x8, null));
        }
        return arrayList;
    }

    public final void f(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        AbstractActivityC0032e abstractActivityC0032e = this.f12355b;
        PackageManager packageManager = abstractActivityC0032e.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(65536L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            abstractActivityC0032e.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    public final void g(ArrayList arrayList) {
        r rVar;
        synchronized (this.f12361g0) {
            R1.j jVar = this.f12360f0;
            if (jVar != null) {
                rVar = (r) jVar.f4682b;
            } else {
                rVar = null;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        if (rVar != null) {
            while (i7 < arrayList.size()) {
                g gVar = (g) arrayList.get(i7);
                String str = gVar.f12349a;
                String str2 = gVar.f12350b;
                if (str2 == null || !str2.startsWith("video/")) {
                    str = this.f12356c.D(gVar.f12349a, rVar.f12379a, rVar.f12380b, rVar.f12381c.intValue());
                }
                arrayList2.add(str);
                i7++;
            }
            c(arrayList2);
            return;
        }
        while (i7 < arrayList.size()) {
            arrayList2.add(((g) arrayList.get(i7)).f12349a);
            i7++;
        }
        c(arrayList2);
    }

    public final void h() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f12353Z == f.FRONT) {
            int i7 = Build.VERSION.SDK_INT;
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (i7 >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
        }
        String uuid = UUID.randomUUID().toString();
        AbstractActivityC0032e abstractActivityC0032e = this.f12355b;
        File cacheDir = abstractActivityC0032e.getCacheDir();
        try {
            cacheDir.mkdirs();
            File createTempFile = File.createTempFile(uuid, ".jpg", cacheDir);
            this.f12359e0 = Uri.parse("file:" + createTempFile.getAbsolutePath());
            Uri d7 = X.f.d((AbstractActivityC0032e) this.f.f11091a, this.f12354a, createTempFile);
            intent.putExtra("output", d7);
            f(intent, d7);
            try {
                try {
                    abstractActivityC0032e.startActivityForResult(intent, 2343);
                } catch (ActivityNotFoundException unused) {
                    createTempFile.delete();
                    b("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (SecurityException e7) {
                e7.printStackTrace();
                b("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final void i() {
        x xVar;
        Long l8;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.f12361g0) {
            R1.j jVar = this.f12360f0;
            if (jVar != null) {
                xVar = (x) jVar.f4683c;
            } else {
                xVar = null;
            }
        }
        if (xVar != null && (l8 = xVar.f12386a) != null) {
            intent.putExtra("android.intent.extra.durationLimit", l8.intValue());
        }
        if (this.f12353Z == f.FRONT) {
            int i7 = Build.VERSION.SDK_INT;
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (i7 >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
            }
        }
        String uuid = UUID.randomUUID().toString();
        File cacheDir = this.f12355b.getCacheDir();
        try {
            cacheDir.mkdirs();
            File createTempFile = File.createTempFile(uuid, ".mp4", cacheDir);
            this.f12359e0 = Uri.parse("file:" + createTempFile.getAbsolutePath());
            Uri d7 = X.f.d((AbstractActivityC0032e) this.f.f11091a, this.f12354a, createTempFile);
            intent.putExtra("output", d7);
            f(intent, d7);
            try {
                try {
                    this.f12355b.startActivityForResult(intent, 2353);
                } catch (ActivityNotFoundException unused) {
                    createTempFile.delete();
                    b("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (SecurityException e7) {
                e7.printStackTrace();
                b("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final boolean j() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        C0585f c0585f = this.f12358e;
        if (c0585f == null) {
            return false;
        }
        AbstractActivityC0032e abstractActivityC0032e = (AbstractActivityC0032e) c0585f.f8171b;
        int i7 = Build.VERSION.SDK_INT;
        try {
            PackageManager packageManager = abstractActivityC0032e.getPackageManager();
            if (i7 >= 33) {
                String packageName = abstractActivityC0032e.getPackageName();
                of = PackageManager.PackageInfoFlags.of(4096L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = packageManager.getPackageInfo(abstractActivityC0032e.getPackageName(), RecognitionOptions.AZTEC);
            }
            return Arrays.asList(packageInfo.requestedPermissions).contains("android.permission.CAMERA");
        } catch (PackageManager.NameNotFoundException e7) {
            e7.printStackTrace();
            return false;
        }
    }

    public final boolean k(r rVar, x xVar, io.flutter.plugins.firebase.storage.g gVar) {
        synchronized (this.f12361g0) {
            try {
                if (this.f12360f0 != null) {
                    return false;
                }
                this.f12360f0 = new R1.j(rVar, xVar, gVar, 21);
                ((Activity) this.f12357d.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // L5.t
    public final boolean onActivityResult(int i7, final int i8, final Intent intent) {
        Runnable runnable;
        if (i7 != 2342) {
            if (i7 != 2343) {
                if (i7 != 2346) {
                    if (i7 != 2347) {
                        if (i7 != 2352) {
                            if (i7 != 2353) {
                                return false;
                            }
                            runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.c

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ h f12344b;

                                {
                                    this.f12344b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            int i9 = i8;
                                            h hVar = this.f12344b;
                                            if (i9 == -1) {
                                                Uri uri = hVar.f12359e0;
                                                String str = StringUtils.EMPTY;
                                                if (uri == null) {
                                                    uri = Uri.parse(((Activity) hVar.f12357d.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", StringUtils.EMPTY));
                                                }
                                                final d dVar = new d(hVar, 0);
                                                C1006c c1006c = hVar.f;
                                                c1006c.getClass();
                                                if (uri != null) {
                                                    str = uri.getPath();
                                                }
                                                MediaScannerConnection.scanFile((AbstractActivityC0032e) c1006c.f11091a, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.e
                                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                                    public final void onScanCompleted(String str2, Uri uri2) {
                                                        r rVar;
                                                        d dVar2 = d.this;
                                                        int i10 = dVar2.f12346a;
                                                        h hVar2 = dVar2.f12347b;
                                                        switch (i10) {
                                                            case 0:
                                                                synchronized (hVar2.f12361g0) {
                                                                    R1.j jVar = hVar2.f12360f0;
                                                                    if (jVar != null) {
                                                                        rVar = (r) jVar.f4682b;
                                                                    } else {
                                                                        rVar = null;
                                                                    }
                                                                }
                                                                if (rVar != null) {
                                                                    String D4 = hVar2.f12356c.D(str2, rVar.f12379a, rVar.f12380b, rVar.f12381c.intValue());
                                                                    if (D4 != null && !D4.equals(str2)) {
                                                                        new File(str2).delete();
                                                                    }
                                                                    hVar2.d(D4);
                                                                    return;
                                                                }
                                                                hVar2.d(str2);
                                                                return;
                                                            default:
                                                                hVar2.d(str2);
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            hVar.d(null);
                                            return;
                                        default:
                                            int i10 = i8;
                                            h hVar2 = this.f12344b;
                                            if (i10 == -1) {
                                                Uri uri2 = hVar2.f12359e0;
                                                String str2 = StringUtils.EMPTY;
                                                if (uri2 == null) {
                                                    uri2 = Uri.parse(((Activity) hVar2.f12357d.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", StringUtils.EMPTY));
                                                }
                                                final d dVar2 = new d(hVar2, 1);
                                                C1006c c1006c2 = hVar2.f;
                                                c1006c2.getClass();
                                                if (uri2 != null) {
                                                    str2 = uri2.getPath();
                                                }
                                                MediaScannerConnection.scanFile((AbstractActivityC0032e) c1006c2.f11091a, new String[]{str2}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.e
                                                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                                    public final void onScanCompleted(String str22, Uri uri22) {
                                                        r rVar;
                                                        d dVar22 = d.this;
                                                        int i102 = dVar22.f12346a;
                                                        h hVar22 = dVar22.f12347b;
                                                        switch (i102) {
                                                            case 0:
                                                                synchronized (hVar22.f12361g0) {
                                                                    R1.j jVar = hVar22.f12360f0;
                                                                    if (jVar != null) {
                                                                        rVar = (r) jVar.f4682b;
                                                                    } else {
                                                                        rVar = null;
                                                                    }
                                                                }
                                                                if (rVar != null) {
                                                                    String D4 = hVar22.f12356c.D(str22, rVar.f12379a, rVar.f12380b, rVar.f12381c.intValue());
                                                                    if (D4 != null && !D4.equals(str22)) {
                                                                        new File(str22).delete();
                                                                    }
                                                                    hVar22.d(D4);
                                                                    return;
                                                                }
                                                                hVar22.d(str22);
                                                                return;
                                                            default:
                                                                hVar22.d(str22);
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                            hVar2.d(null);
                                            return;
                                    }
                                }
                            };
                        } else {
                            runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.b

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ h f12340b;

                                {
                                    this.f12340b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Intent intent2;
                                    Intent intent3;
                                    Intent intent4;
                                    Intent intent5;
                                    switch (r4) {
                                        case 0:
                                            h hVar = this.f12340b;
                                            hVar.getClass();
                                            if (i8 == -1 && (intent2 = intent) != null) {
                                                ArrayList e7 = hVar.e(intent2, false);
                                                if (e7 == null) {
                                                    hVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                                    return;
                                                } else {
                                                    hVar.g(e7);
                                                    return;
                                                }
                                            }
                                            hVar.d(null);
                                            return;
                                        case 1:
                                            h hVar2 = this.f12340b;
                                            hVar2.getClass();
                                            if (i8 == -1 && (intent3 = intent) != null) {
                                                ArrayList e8 = hVar2.e(intent3, false);
                                                if (e8 == null) {
                                                    hVar2.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                                    return;
                                                } else {
                                                    hVar2.g(e8);
                                                    return;
                                                }
                                            }
                                            hVar2.d(null);
                                            return;
                                        case 2:
                                            h hVar3 = this.f12340b;
                                            hVar3.getClass();
                                            if (i8 == -1 && (intent4 = intent) != null) {
                                                ArrayList e9 = hVar3.e(intent4, true);
                                                if (e9 == null) {
                                                    hVar3.b("no_valid_media_uri", "Cannot find the selected media.");
                                                    return;
                                                } else {
                                                    hVar3.g(e9);
                                                    return;
                                                }
                                            }
                                            hVar3.d(null);
                                            return;
                                        default:
                                            h hVar4 = this.f12340b;
                                            hVar4.getClass();
                                            if (i8 == -1 && (intent5 = intent) != null) {
                                                ArrayList e10 = hVar4.e(intent5, false);
                                                if (e10 != null && e10.size() >= 1) {
                                                    hVar4.d(((g) e10.get(0)).f12349a);
                                                    return;
                                                } else {
                                                    hVar4.b("no_valid_video_uri", "Cannot find the selected video.");
                                                    return;
                                                }
                                            }
                                            hVar4.d(null);
                                            return;
                                    }
                                }
                            };
                        }
                    } else {
                        runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.b

                            /* renamed from: b  reason: collision with root package name */
                            public final /* synthetic */ h f12340b;

                            {
                                this.f12340b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Intent intent2;
                                Intent intent3;
                                Intent intent4;
                                Intent intent5;
                                switch (r4) {
                                    case 0:
                                        h hVar = this.f12340b;
                                        hVar.getClass();
                                        if (i8 == -1 && (intent2 = intent) != null) {
                                            ArrayList e7 = hVar.e(intent2, false);
                                            if (e7 == null) {
                                                hVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                                return;
                                            } else {
                                                hVar.g(e7);
                                                return;
                                            }
                                        }
                                        hVar.d(null);
                                        return;
                                    case 1:
                                        h hVar2 = this.f12340b;
                                        hVar2.getClass();
                                        if (i8 == -1 && (intent3 = intent) != null) {
                                            ArrayList e8 = hVar2.e(intent3, false);
                                            if (e8 == null) {
                                                hVar2.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                                return;
                                            } else {
                                                hVar2.g(e8);
                                                return;
                                            }
                                        }
                                        hVar2.d(null);
                                        return;
                                    case 2:
                                        h hVar3 = this.f12340b;
                                        hVar3.getClass();
                                        if (i8 == -1 && (intent4 = intent) != null) {
                                            ArrayList e9 = hVar3.e(intent4, true);
                                            if (e9 == null) {
                                                hVar3.b("no_valid_media_uri", "Cannot find the selected media.");
                                                return;
                                            } else {
                                                hVar3.g(e9);
                                                return;
                                            }
                                        }
                                        hVar3.d(null);
                                        return;
                                    default:
                                        h hVar4 = this.f12340b;
                                        hVar4.getClass();
                                        if (i8 == -1 && (intent5 = intent) != null) {
                                            ArrayList e10 = hVar4.e(intent5, false);
                                            if (e10 != null && e10.size() >= 1) {
                                                hVar4.d(((g) e10.get(0)).f12349a);
                                                return;
                                            } else {
                                                hVar4.b("no_valid_video_uri", "Cannot find the selected video.");
                                                return;
                                            }
                                        }
                                        hVar4.d(null);
                                        return;
                                }
                            }
                        };
                    }
                } else {
                    runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.b

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ h f12340b;

                        {
                            this.f12340b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            switch (r4) {
                                case 0:
                                    h hVar = this.f12340b;
                                    hVar.getClass();
                                    if (i8 == -1 && (intent2 = intent) != null) {
                                        ArrayList e7 = hVar.e(intent2, false);
                                        if (e7 == null) {
                                            hVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                            return;
                                        } else {
                                            hVar.g(e7);
                                            return;
                                        }
                                    }
                                    hVar.d(null);
                                    return;
                                case 1:
                                    h hVar2 = this.f12340b;
                                    hVar2.getClass();
                                    if (i8 == -1 && (intent3 = intent) != null) {
                                        ArrayList e8 = hVar2.e(intent3, false);
                                        if (e8 == null) {
                                            hVar2.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                            return;
                                        } else {
                                            hVar2.g(e8);
                                            return;
                                        }
                                    }
                                    hVar2.d(null);
                                    return;
                                case 2:
                                    h hVar3 = this.f12340b;
                                    hVar3.getClass();
                                    if (i8 == -1 && (intent4 = intent) != null) {
                                        ArrayList e9 = hVar3.e(intent4, true);
                                        if (e9 == null) {
                                            hVar3.b("no_valid_media_uri", "Cannot find the selected media.");
                                            return;
                                        } else {
                                            hVar3.g(e9);
                                            return;
                                        }
                                    }
                                    hVar3.d(null);
                                    return;
                                default:
                                    h hVar4 = this.f12340b;
                                    hVar4.getClass();
                                    if (i8 == -1 && (intent5 = intent) != null) {
                                        ArrayList e10 = hVar4.e(intent5, false);
                                        if (e10 != null && e10.size() >= 1) {
                                            hVar4.d(((g) e10.get(0)).f12349a);
                                            return;
                                        } else {
                                            hVar4.b("no_valid_video_uri", "Cannot find the selected video.");
                                            return;
                                        }
                                    }
                                    hVar4.d(null);
                                    return;
                            }
                        }
                    };
                }
            } else {
                runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.c

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ h f12344b;

                    {
                        this.f12344b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (r3) {
                            case 0:
                                int i9 = i8;
                                h hVar = this.f12344b;
                                if (i9 == -1) {
                                    Uri uri = hVar.f12359e0;
                                    String str = StringUtils.EMPTY;
                                    if (uri == null) {
                                        uri = Uri.parse(((Activity) hVar.f12357d.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", StringUtils.EMPTY));
                                    }
                                    final d dVar = new d(hVar, 0);
                                    C1006c c1006c = hVar.f;
                                    c1006c.getClass();
                                    if (uri != null) {
                                        str = uri.getPath();
                                    }
                                    MediaScannerConnection.scanFile((AbstractActivityC0032e) c1006c.f11091a, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.e
                                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                        public final void onScanCompleted(String str22, Uri uri22) {
                                            r rVar;
                                            d dVar22 = d.this;
                                            int i102 = dVar22.f12346a;
                                            h hVar22 = dVar22.f12347b;
                                            switch (i102) {
                                                case 0:
                                                    synchronized (hVar22.f12361g0) {
                                                        R1.j jVar = hVar22.f12360f0;
                                                        if (jVar != null) {
                                                            rVar = (r) jVar.f4682b;
                                                        } else {
                                                            rVar = null;
                                                        }
                                                    }
                                                    if (rVar != null) {
                                                        String D4 = hVar22.f12356c.D(str22, rVar.f12379a, rVar.f12380b, rVar.f12381c.intValue());
                                                        if (D4 != null && !D4.equals(str22)) {
                                                            new File(str22).delete();
                                                        }
                                                        hVar22.d(D4);
                                                        return;
                                                    }
                                                    hVar22.d(str22);
                                                    return;
                                                default:
                                                    hVar22.d(str22);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                hVar.d(null);
                                return;
                            default:
                                int i10 = i8;
                                h hVar2 = this.f12344b;
                                if (i10 == -1) {
                                    Uri uri2 = hVar2.f12359e0;
                                    String str2 = StringUtils.EMPTY;
                                    if (uri2 == null) {
                                        uri2 = Uri.parse(((Activity) hVar2.f12357d.f6744a).getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", StringUtils.EMPTY));
                                    }
                                    final d dVar2 = new d(hVar2, 1);
                                    C1006c c1006c2 = hVar2.f;
                                    c1006c2.getClass();
                                    if (uri2 != null) {
                                        str2 = uri2.getPath();
                                    }
                                    MediaScannerConnection.scanFile((AbstractActivityC0032e) c1006c2.f11091a, new String[]{str2}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.e
                                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                                        public final void onScanCompleted(String str22, Uri uri22) {
                                            r rVar;
                                            d dVar22 = d.this;
                                            int i102 = dVar22.f12346a;
                                            h hVar22 = dVar22.f12347b;
                                            switch (i102) {
                                                case 0:
                                                    synchronized (hVar22.f12361g0) {
                                                        R1.j jVar = hVar22.f12360f0;
                                                        if (jVar != null) {
                                                            rVar = (r) jVar.f4682b;
                                                        } else {
                                                            rVar = null;
                                                        }
                                                    }
                                                    if (rVar != null) {
                                                        String D4 = hVar22.f12356c.D(str22, rVar.f12379a, rVar.f12380b, rVar.f12381c.intValue());
                                                        if (D4 != null && !D4.equals(str22)) {
                                                            new File(str22).delete();
                                                        }
                                                        hVar22.d(D4);
                                                        return;
                                                    }
                                                    hVar22.d(str22);
                                                    return;
                                                default:
                                                    hVar22.d(str22);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                hVar2.d(null);
                                return;
                        }
                    }
                };
            }
        } else {
            runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.b

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ h f12340b;

                {
                    this.f12340b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    switch (r4) {
                        case 0:
                            h hVar = this.f12340b;
                            hVar.getClass();
                            if (i8 == -1 && (intent2 = intent) != null) {
                                ArrayList e7 = hVar.e(intent2, false);
                                if (e7 == null) {
                                    hVar.b("no_valid_image_uri", "Cannot find the selected image.");
                                    return;
                                } else {
                                    hVar.g(e7);
                                    return;
                                }
                            }
                            hVar.d(null);
                            return;
                        case 1:
                            h hVar2 = this.f12340b;
                            hVar2.getClass();
                            if (i8 == -1 && (intent3 = intent) != null) {
                                ArrayList e8 = hVar2.e(intent3, false);
                                if (e8 == null) {
                                    hVar2.b("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                    return;
                                } else {
                                    hVar2.g(e8);
                                    return;
                                }
                            }
                            hVar2.d(null);
                            return;
                        case 2:
                            h hVar3 = this.f12340b;
                            hVar3.getClass();
                            if (i8 == -1 && (intent4 = intent) != null) {
                                ArrayList e9 = hVar3.e(intent4, true);
                                if (e9 == null) {
                                    hVar3.b("no_valid_media_uri", "Cannot find the selected media.");
                                    return;
                                } else {
                                    hVar3.g(e9);
                                    return;
                                }
                            }
                            hVar3.d(null);
                            return;
                        default:
                            h hVar4 = this.f12340b;
                            hVar4.getClass();
                            if (i8 == -1 && (intent5 = intent) != null) {
                                ArrayList e10 = hVar4.e(intent5, false);
                                if (e10 != null && e10.size() >= 1) {
                                    hVar4.d(((g) e10.get(0)).f12349a);
                                    return;
                                } else {
                                    hVar4.b("no_valid_video_uri", "Cannot find the selected video.");
                                    return;
                                }
                            }
                            hVar4.d(null);
                            return;
                    }
                }
            };
        }
        this.f12352Y.execute(runnable);
        return true;
    }

    @Override // L5.v
    public final boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        boolean z7;
        if (iArr.length > 0 && iArr[0] == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i7 != 2345) {
            if (i7 != 2355) {
                return false;
            }
            if (z7) {
                i();
            }
        } else if (z7) {
            h();
        }
        if (!z7 && (i7 == 2345 || i7 == 2355)) {
            b("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }
}
