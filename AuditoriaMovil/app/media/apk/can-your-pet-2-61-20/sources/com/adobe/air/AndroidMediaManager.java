package com.adobe.air;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.provider.MediaStore;
import com.adobe.air.AndroidActivityWrapper;
/* loaded from: classes.dex */
public class AndroidMediaManager {
    public static final int ERROR_ACTIVITY_DESTROYED = 2;
    public static final int ERROR_IMAGE_PICKER_NOT_FOUND = 1;
    private static long MediaManagerObjectPointer = 0;
    private static final String PHONE_STORAGE = "phoneStorage";
    private boolean mCallbacksRegistered = false;
    private AndroidActivityWrapper.ActivityResultCallback mActivityResultCB = null;

    public native void useImagePickerData(long j, boolean z, boolean z2, String str, String str2, String str3);

    public native void useStreamData(long j, boolean z, boolean z2, String str);

    public AndroidMediaManager() {
        MediaManagerObjectPointer = 0L;
    }

    public void registerCallbacks() {
        doCallbackRegistration(true);
    }

    public void unregisterCallbacks() {
        doCallbackRegistration(false);
    }

    private void doCallbackRegistration(boolean z) {
        this.mCallbacksRegistered = z;
        if (z) {
            if (this.mActivityResultCB == null) {
                this.mActivityResultCB = new AndroidActivityWrapper.ActivityResultCallback() { // from class: com.adobe.air.AndroidMediaManager.1
                    @Override // com.adobe.air.AndroidActivityWrapper.ActivityResultCallback
                    public void onActivityResult(int i, int i2, Intent intent) {
                        if (i == 2 && AndroidMediaManager.MediaManagerObjectPointer != 0 && AndroidMediaManager.this.mCallbacksRegistered) {
                            AndroidMediaManager.this.onBrowseImageResult(i2, intent, AndroidActivityWrapper.GetAndroidActivityWrapper().getActivity());
                            AndroidMediaManager.this.unregisterCallbacks();
                        }
                    }
                };
            }
            AndroidActivityWrapper.GetAndroidActivityWrapper().addActivityResultListener(this.mActivityResultCB);
        } else if (this.mActivityResultCB != null) {
            AndroidActivityWrapper.GetAndroidActivityWrapper().removeActivityResultListener(this.mActivityResultCB);
            this.mActivityResultCB = null;
        }
    }

    public static boolean AddImage(Application application, Bitmap bitmap, boolean z) {
        String str;
        if (application != null) {
            ContentResolver contentResolver = application.getContentResolver();
            try {
                str = MediaStore.Images.Media.insertImage(contentResolver, bitmap, "IMG" + System.currentTimeMillis(), (String) null);
            } catch (Exception unused) {
                str = null;
            }
            if (str == null) {
                str = SaveImage(PHONE_STORAGE, contentResolver, bitmap, z);
            }
            if (str != null) {
                try {
                    Cursor query = contentResolver.query(Uri.parse(str), new String[]{"_data"}, null, null, null);
                    if (query != null) {
                        int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                        query.moveToFirst();
                        MediaScannerConnection.scanFile(AndroidActivityWrapper.GetAndroidActivityWrapper().getDefaultContext(), new String[]{query.getString(columnIndexOrThrow)}, null, null);
                    }
                } catch (Exception unused2) {
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String SaveImage(java.lang.String r12, android.content.ContentResolver r13, android.graphics.Bitmap r14, boolean r15) {
        /*
            r0 = 0
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Exception -> L7c
            r1.<init>()     // Catch: java.lang.Exception -> L7c
            java.lang.String r2 = "mime_type"
            if (r15 == 0) goto L10
            java.lang.String r15 = "image/jpeg"
            r1.put(r2, r15)     // Catch: java.lang.Exception -> L7c
            goto L15
        L10:
            java.lang.String r15 = "image/png"
            r1.put(r2, r15)     // Catch: java.lang.Exception -> L7c
        L15:
            java.util.Date r15 = new java.util.Date     // Catch: java.lang.Exception -> L7c
            r15.<init>()     // Catch: java.lang.Exception -> L7c
            java.lang.String r2 = "datetaken"
            long r3 = r15.getTime()     // Catch: java.lang.Exception -> L7c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L7c
            r1.put(r2, r3)     // Catch: java.lang.Exception -> L7c
            java.lang.String r2 = "date_added"
            long r3 = r15.getTime()     // Catch: java.lang.Exception -> L7c
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            java.lang.Long r15 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Exception -> L7c
            r1.put(r2, r15)     // Catch: java.lang.Exception -> L7c
            android.net.Uri r15 = android.provider.MediaStore.Images.Media.getContentUri(r12)     // Catch: java.lang.Exception -> L7c
            android.net.Uri r15 = r13.insert(r15, r1)     // Catch: java.lang.Exception -> L7c
            if (r15 == 0) goto L84
            java.io.OutputStream r1 = r13.openOutputStream(r15)     // Catch: java.lang.Exception -> L7a
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r3 = 90
            r14.compress(r2, r3, r1)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            long r2 = android.content.ContentUris.parseId(r15)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r9 = 1134559232(0x43a00000, float:320.0)
            r10 = 1131413504(0x43700000, float:240.0)
            r11 = 1
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r2
            android.graphics.Bitmap r6 = SaveThumbnail(r4, r5, r6, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r9 = 1112014848(0x42480000, float:50.0)
            r10 = 1112014848(0x42480000, float:50.0)
            r11 = 3
            r4 = r12
            r5 = r13
            r7 = r2
            SaveThumbnail(r4, r5, r6, r7, r9, r10, r11)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
        L68:
            r1.close()     // Catch: java.lang.Exception -> L7a
            goto L84
        L6c:
            r12 = move-exception
            goto L76
        L6e:
            if (r15 == 0) goto L68
            r13.delete(r15, r0, r0)     // Catch: java.lang.Throwable -> L6c
            r15 = r0
            goto L68
        L76:
            r1.close()     // Catch: java.lang.Exception -> L7a
            throw r12     // Catch: java.lang.Exception -> L7a
        L7a:
            goto L7e
        L7c:
            r15 = r0
        L7e:
            if (r15 == 0) goto L84
            r13.delete(r15, r0, r0)
            r15 = r0
        L84:
            if (r15 == 0) goto L8a
            java.lang.String r0 = r15.toString()
        L8a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidMediaManager.SaveImage(java.lang.String, android.content.ContentResolver, android.graphics.Bitmap, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.graphics.Bitmap SaveThumbnail(java.lang.String r8, android.content.ContentResolver r9, android.graphics.Bitmap r10, long r11, float r13, float r14, int r15) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r1 = r10.getWidth()     // Catch: java.lang.Exception -> L81
            float r1 = (float) r1     // Catch: java.lang.Exception -> L81
            float r13 = r13 / r1
            int r1 = r10.getHeight()     // Catch: java.lang.Exception -> L81
            float r1 = (float) r1     // Catch: java.lang.Exception -> L81
            float r14 = r14 / r1
            r6.setScale(r13, r14)     // Catch: java.lang.Exception -> L81
            r2 = 0
            r3 = 0
            int r4 = r10.getWidth()     // Catch: java.lang.Exception -> L81
            int r5 = r10.getHeight()     // Catch: java.lang.Exception -> L81
            r7 = 1
            r1 = r10
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L81
            android.content.ContentValues r13 = new android.content.ContentValues
            r14 = 4
            r13.<init>(r14)
            java.lang.String r14 = "kind"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r13.put(r14, r15)
            int r12 = (int) r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.String r12 = "image_id"
            r13.put(r12, r11)
            int r11 = r10.getHeight()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "height"
            r13.put(r12, r11)
            int r11 = r10.getWidth()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "width"
            r13.put(r12, r11)
            android.net.Uri r8 = android.provider.MediaStore.Images.Thumbnails.getContentUri(r8)     // Catch: java.lang.Exception -> L76
            android.net.Uri r8 = r9.insert(r8, r13)     // Catch: java.lang.Exception -> L76
            if (r8 == 0) goto L7e
            java.io.OutputStream r11 = r9.openOutputStream(r8)     // Catch: java.lang.Exception -> L74
            android.graphics.Bitmap$CompressFormat r12 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Exception -> L74
            r13 = 100
            r10.compress(r12, r13, r11)     // Catch: java.lang.Exception -> L74
            r11.close()     // Catch: java.lang.Exception -> L74
            goto L7e
        L74:
            goto L78
        L76:
            r8 = r0
        L78:
            if (r8 == 0) goto L7e
            r9.delete(r8, r0, r0)
            r8 = r0
        L7e:
            if (r8 == 0) goto L81
            return r10
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.air.AndroidMediaManager.SaveThumbnail(java.lang.String, android.content.ContentResolver, android.graphics.Bitmap, long, float, float, int):android.graphics.Bitmap");
    }

    public int BrowseImage(long j) {
        int i;
        try {
            AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
            Intent intent = new Intent();
            intent.setType("image/*");
            intent.setAction("android.intent.action.PICK");
            i = 2;
            if (GetAndroidActivityWrapper.getActivity() != null) {
                GetAndroidActivityWrapper.getActivity().startActivityForResult(Intent.createChooser(intent, ""), 2);
                i = 0;
            }
        } catch (ActivityNotFoundException unused) {
            i = 1;
        }
        if (i == 0) {
            registerCallbacks();
            MediaManagerObjectPointer = j;
        }
        return i;
    }

    public void onBrowseImageResult(int i, Intent intent, Activity activity) {
        if (i == 0) {
            useImagePickerData(MediaManagerObjectPointer, false, true, "", "", "");
        } else if (i == -1) {
            useStreamData(MediaManagerObjectPointer, true, true, intent.getDataString());
        }
    }

    private static Bitmap rotateImage(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return createBitmap;
    }
}
