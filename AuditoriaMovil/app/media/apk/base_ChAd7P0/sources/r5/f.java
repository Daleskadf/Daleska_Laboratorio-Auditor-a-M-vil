package r5;

import B5.AbstractActivityC0032e;
import E6.m;
import H4.W;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.j;
import q5.C1712a;
/* loaded from: classes.dex */
public final class f {
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119 A[Catch: IOException -> 0x0115, TryCatch #1 {IOException -> 0x0115, blocks: (B:55:0x010b, B:57:0x0111, B:61:0x0119, B:63:0x011e), top: B:86:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e A[Catch: IOException -> 0x0115, TRY_LEAVE, TryCatch #1 {IOException -> 0x0115, blocks: (B:55:0x010b, B:57:0x0111, B:61:0x0119, B:63:0x011e), top: B:86:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(B5.AbstractActivityC0032e r12, android.net.Uri r13, boolean r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.a(B5.e, android.net.Uri, boolean, java.util.ArrayList):void");
    }

    public static final Uri b(AbstractActivityC0032e abstractActivityC0032e, Uri uri, int i7) {
        if (i7 > 0) {
            Context applicationContext = abstractActivityC0032e.getApplicationContext();
            j.d(applicationContext, "activity.applicationContext");
            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(applicationContext.getContentResolver().getType(uri));
            if (extensionFromMimeType != null && (extensionFromMimeType.contentEquals("jpg") || extensionFromMimeType.contentEquals("jpeg") || extensionFromMimeType.contentEquals("png") || extensionFromMimeType.contentEquals("webp"))) {
                Context applicationContext2 = abstractActivityC0032e.getApplicationContext();
                j.d(applicationContext2, "activity.applicationContext");
                try {
                    InputStream openInputStream = applicationContext2.getContentResolver().openInputStream(uri);
                    File d7 = d(applicationContext2, uri);
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                    FileOutputStream fileOutputStream = new FileOutputStream(d7);
                    decodeStream.compress(e(applicationContext2, uri), i7, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    uri = Uri.fromFile(d7);
                    j.d(uri, "fromFile(compressedFile)");
                    W.g(openInputStream, null);
                } catch (IOException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
        return uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0054 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String c(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1349088399: goto L4c;
                case 96748: goto L43;
                case 99469: goto L38;
                case 93166550: goto L2c;
                case 100313435: goto L20;
                case 103772132: goto L14;
                case 112202875: goto L8;
                default: goto L7;
            }
        L7:
            goto L54
        L8:
            java.lang.String r0 = "video"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L11
            goto L54
        L11:
            java.lang.String r1 = "video/*"
            goto L58
        L14:
            java.lang.String r0 = "media"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1d
            goto L54
        L1d:
            java.lang.String r1 = "image/*,video/*"
            goto L58
        L20:
            java.lang.String r0 = "image"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L29
            goto L54
        L29:
            java.lang.String r1 = "image/*"
            goto L58
        L2c:
            java.lang.String r0 = "audio"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L35
            goto L54
        L35:
            java.lang.String r1 = "audio/*"
            goto L58
        L38:
            java.lang.String r0 = "dir"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L41
            goto L54
        L41:
            r1 = r0
            goto L58
        L43:
            java.lang.String r0 = "any"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L56
            goto L54
        L4c:
            java.lang.String r0 = "custom"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L56
        L54:
            r1 = 0
            goto L58
        L56:
        */
        //  java.lang.String r1 = "*/*"
        /*
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.c(java.lang.String):java.lang.String");
    }

    public static File d(Context context, Uri uri) {
        File createTempFile = File.createTempFile("IMAGE_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + '_', "." + MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)), context.getCacheDir());
        j.d(createTempFile, "createTempFile(imageFile…ontext, uri), storageDir)");
        return createTempFile;
    }

    public static Bitmap.CompressFormat e(Context context, Uri uri) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri));
        j.b(extensionFromMimeType);
        Locale locale = Locale.getDefault();
        j.d(locale, "getDefault()");
        String upperCase = extensionFromMimeType.toUpperCase(locale);
        j.d(upperCase, "toUpperCase(...)");
        if (upperCase.equals("PNG")) {
            return Bitmap.CompressFormat.PNG;
        }
        if (upperCase.equals("WEBP")) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public static final String f(Uri uri, Activity context) {
        String str;
        j.e(uri, "uri");
        j.e(context, "context");
        String str2 = null;
        try {
            if (j.a(uri.getScheme(), "content")) {
                Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                if (query != null && query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                } else {
                    str = null;
                }
                try {
                    W.g(query, null);
                } catch (Exception e7) {
                    e = e7;
                    str2 = str;
                    Log.e("FilePickerUtils", "Failed to handle file name: " + e);
                    return str2;
                }
            } else {
                str = null;
            }
        } catch (Exception e8) {
            e = e8;
        }
        if (str == null) {
            String path = uri.getPath();
            if (path != null) {
                str2 = m.h0(path, '/', path);
            }
            return str2;
        }
        return str;
    }

    public static ArrayList g(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension((String) arrayList.get(i7));
                if (mimeTypeFromExtension == null) {
                    Log.w("FilePickerUtils", "Custom file type " + ((String) arrayList.get(i7)) + " is unsupported and will be ignored.");
                } else {
                    arrayList2.add(mimeTypeFromExtension);
                }
            }
            return arrayList2;
        }
        return null;
    }

    public static void h(File file) {
        if (file != null && file.exists()) {
            if (file.listFiles() != null && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                for (File file2 : listFiles) {
                    h(file2);
                }
            }
            file.delete();
        }
    }

    public static void i(b bVar, String str, Boolean bool, Boolean bool2, ArrayList arrayList, Integer num, C1712a c1712a) {
        String str2;
        Intent intent;
        String str3 = null;
        if (bVar != null) {
            if (bVar.f15524b == null) {
                bVar.f15524b = c1712a;
            } else {
                int i7 = b.f15518e0;
                c1712a.b(null, "already_active", "File picker is already active");
                return;
            }
        }
        if (bVar != null) {
            bVar.f15527e = str;
        }
        if (bool != null && bVar != null) {
            bVar.f15525c = bool.booleanValue();
        }
        if (bool2 != null && bVar != null) {
            bVar.f15526d = bool2.booleanValue();
        }
        if (bVar != null) {
            bVar.f15520X = arrayList;
        }
        if (num != null && bVar != null) {
            bVar.f = num.intValue();
        }
        if (bVar != null && (str2 = bVar.f15527e) != null) {
            if (str2.equals("dir")) {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            } else if (j.a(bVar.f15527e, "image/*")) {
                intent = new Intent("android.intent.action.PICK");
                intent.setDataAndType(Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator), bVar.f15527e);
                intent.setType(bVar.f15527e);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bVar.f15525c);
                intent.putExtra("multi-pick", bVar.f15525c);
                String str4 = bVar.f15527e;
                if (str4 != null) {
                    if (m.N(str4, ",")) {
                        str3 = str4;
                    }
                    if (str3 != null) {
                        List d02 = m.d0(str3, new String[]{","});
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : d02) {
                            if (((String) obj).length() > 0) {
                                arrayList2.add(obj);
                            }
                        }
                        bVar.f15520X = new ArrayList(arrayList2);
                    }
                }
                ArrayList arrayList3 = bVar.f15520X;
                if (arrayList3 != null) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", arrayList3);
                }
            } else {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType(bVar.f15527e);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bVar.f15525c);
                intent.putExtra("multi-pick", bVar.f15525c);
                ArrayList arrayList4 = bVar.f15520X;
                if (arrayList4 != null) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) arrayList4.toArray(new String[0]));
                }
            }
            AbstractActivityC0032e abstractActivityC0032e = bVar.f15523a;
            if (intent.resolveActivity(abstractActivityC0032e.getPackageManager()) != null) {
                abstractActivityC0032e.startActivityForResult(intent, b.f15518e0);
                return;
            }
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            bVar.b("invalid_format_type", "Can't handle the provided file type.");
        }
    }
}
