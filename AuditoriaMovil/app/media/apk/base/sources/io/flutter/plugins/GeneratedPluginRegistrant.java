package io.flutter.plugins;

import C5.c;
import P6.g;
import S5.a;
import T5.K;
import X5.j0;
import android.util.Log;
import androidx.annotation.Keep;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import io.flutter.plugins.firebase.auth.C1140c;
import io.flutter.plugins.firebase.firestore.C1162g;
import io.flutter.plugins.googlemaps.C1181n;
import io.flutter.plugins.imagepicker.k;
import io.flutter.plugins.pathprovider.f;
import io.flutter.plugins.videoplayer.r;
import j7.d;
import q5.C1713b;
import r2.C1734c;
import t5.C1839k;
import v2.C1882a;
import v5.C1890a;
import w5.C1958b;
import x5.C2016r;
@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f556d.a(new d());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin audioplayers_android, xyz.luan.audioplayers.AudioplayersPlugin", e7);
        }
        try {
            cVar.f556d.a(new C1162g());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", e8);
        }
        try {
            cVar.f556d.a(new C1890a());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e9);
        }
        try {
            cVar.f556d.a(new r5.d());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e10);
        }
        try {
            cVar.f556d.a(new C1140c());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e11);
        }
        try {
            cVar.f556d.a(new P5.d());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e12);
        }
        try {
            cVar.f556d.a(new io.flutter.plugins.firebase.storage.c());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin firebase_storage, io.flutter.plugins.firebase.storage.FlutterFirebaseStoragePlugin", e13);
        }
        try {
            cVar.f556d.a(new FlutterLocalNotificationsPlugin());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e14);
        }
        try {
            cVar.f556d.a(new a());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e15);
        }
        try {
            cVar.f556d.a(new C1713b());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e16);
        }
        try {
            cVar.f556d.a(new Z5.a());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e17);
        }
        try {
            cVar.f556d.a(new C1734c());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin geolocator_android, com.baseflow.geolocator.GeolocatorPlugin", e18);
        }
        try {
            cVar.f556d.a(new C1181n());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin google_maps_flutter_android, io.flutter.plugins.googlemaps.GoogleMapsPlugin", e19);
        }
        try {
            cVar.f556d.a(new io.flutter.plugins.googlesignin.d());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e20);
        }
        try {
            cVar.f556d.a(new k());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e21);
        }
        try {
            cVar.f556d.a(new C2016r());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin mobile_scanner, dev.steenbakker.mobile_scanner.MobileScannerPlugin", e22);
        }
        try {
            cVar.f556d.a(new f());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e23);
        }
        try {
            cVar.f556d.a(new C1882a());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e24);
        }
        try {
            cVar.f556d.a(new g());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin printing, net.nfet.flutter.printing.PrintingPlugin", e25);
        }
        try {
            cVar.f556d.a(new C1958b());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e26);
        }
        try {
            cVar.f556d.a(new K());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e27);
        }
        try {
            cVar.f556d.a(new C1839k());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e28);
        }
        try {
            cVar.f556d.a(new s5.c());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin syncfusion_flutter_pdfviewer, com.syncfusion.flutter.pdfviewer.SyncfusionFlutterPdfViewerPlugin", e29);
        }
        try {
            cVar.f556d.a(new U5.f());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e30);
        }
        try {
            cVar.f556d.a(new r());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e31);
        }
        try {
            cVar.f556d.a(new j0());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e32);
        }
    }
}
