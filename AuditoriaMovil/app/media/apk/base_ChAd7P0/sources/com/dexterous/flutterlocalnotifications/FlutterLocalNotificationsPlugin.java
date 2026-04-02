package com.dexterous.flutterlocalnotifications;

import B5.AbstractActivityC0032e;
import D.AbstractC0059i;
import H4.e1;
import H4.p1;
import I4.E;
import I4.EnumC0206h;
import I4.n;
import I4.x;
import L4.G;
import L5.o;
import L5.p;
import L5.q;
import L5.r;
import L5.t;
import L5.u;
import L5.v;
import V2.k;
import W.A;
import W.AbstractC0359b;
import W.AbstractC0371n;
import W.B;
import W.C;
import W.C0365h;
import W.C0370m;
import W.C0372o;
import W.L;
import W.O;
import W.Q;
import a.AbstractC0412a;
import a1.C0415A;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.graphics.drawable.IconCompat;
import b3.C0585f;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import com.example.appecoactivate.R;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.ClimateForcast;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.XMLReaderUtils;
import x2.C1986a;
@Keep
/* loaded from: classes.dex */
public class FlutterLocalNotificationsPlugin implements p, u, v, t, H5.b, I5.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_ID = "actionId";
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CALLBACK_HANDLE = "callback_handle";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ALL_PENDING_NOTIFICATIONS_METHOD = "cancelAllPendingNotifications";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CANCEL_TAG = "tag";
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = "canScheduleExactNotifications";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DISPATCHER_HANDLE = "dispatcher_handle";
    private static final String DRAWABLE = "drawable";
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = "exact_alarms_not_permitted";
    static final int EXACT_ALARM_PERMISSION_REQUEST_CODE = 2;
    static final int FULL_SCREEN_INTENT_PERMISSION_REQUEST_CODE = 3;
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = "getActiveNotificationMessagingStyleError";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_CALLBACK_HANDLE_METHOD = "getCallbackHandle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "getNotificationChannelsError";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String HAS_NOTIFICATION_POLICY_ACCESS_METHOD = "hasNotificationPolicyAccess";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INPUT = "input";
    private static final String INPUT_RESULT = "FlutterLocalNotificationsPluginInputResult";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "invalid_big_picture";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "invalid_icon";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "invalid_large_icon";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "invalid_led_details";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "invalid_sound";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    static String NOTIFICATION_DETAILS = "notificationDetails";
    static final String NOTIFICATION_ID = "notificationId";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    static final int NOTIFICATION_POLICY_ACCESS_REQUEST_CODE = 4;
    private static final String NOTIFICATION_RESPONSE_TYPE = "notificationResponseType";
    static final String NOTIFICATION_TAG = "notificationTag";
    static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String PERIODICALLY_SHOW_WITH_DURATION_METHOD = "periodicallyShowWithDuration";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = "permissionRequestInProgress";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = "Another permission request is already in progress";
    private static final String REQUEST_EXACT_ALARMS_PERMISSION_METHOD = "requestExactAlarmsPermission";
    private static final String REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD = "requestFullScreenIntentPermission";
    private static final String REQUEST_NOTIFICATIONS_PERMISSION_METHOD = "requestNotificationsPermission";
    private static final String REQUEST_NOTIFICATION_POLICY_ACCESS_METHOD = "requestNotificationPolicyAccess";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = "SELECT_FOREGROUND_NOTIFICATION";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_METHOD = "show";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String TAG = "FLTLocalNotifPlugin";
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = "unsupported_os_version";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    static n gson;
    private Context applicationContext;
    private i callback;
    private r channel;
    private Activity mainActivity;
    private f permissionRequestProgress = f.None;

    /* loaded from: classes.dex */
    public class a extends P4.a<ArrayList<NotificationDetails>> {
    }

    private static void applyGrouping(NotificationDetails notificationDetails, C0372o c0372o) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            c0372o.f6074s = notificationDetails.groupKey;
            if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
                c0372o.f6075t = true;
            }
            c0372o.f6053E = notificationDetails.groupAlertBehavior.intValue();
        }
    }

    private void areNotificationsEnabled(q qVar) {
        qVar.a(Boolean.valueOf(getNotificationManager(this.applicationContext).a()));
    }

    public static n buildGson() {
        boolean z7;
        if (gson == null) {
            RuntimeTypeAdapterFactory registerSubtype = RuntimeTypeAdapterFactory.of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class);
            K4.h hVar = K4.h.f2659c;
            x xVar = x.DEFAULT;
            EnumC0206h enumC0206h = EnumC0206h.IDENTITY;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            I4.i iVar = n.f2209h;
            E e7 = n.f2210i;
            E e8 = n.j;
            ArrayDeque arrayDeque = new ArrayDeque();
            ScheduleMode.a aVar = new ScheduleMode.a();
            P4.a aVar2 = new P4.a(ScheduleMode.class);
            if (aVar2.f4023b == aVar2.f4022a) {
                z7 = true;
            } else {
                z7 = false;
            }
            arrayList.add(new G(aVar, aVar2, z7));
            Objects.requireNonNull(registerSubtype);
            arrayList.add(registerSubtype);
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
            arrayList3.addAll(arrayList);
            Collections.reverse(arrayList3);
            ArrayList arrayList4 = new ArrayList(arrayList2);
            Collections.reverse(arrayList4);
            arrayList3.addAll(arrayList4);
            boolean z8 = O4.f.f3859a;
            gson = new n(hVar, enumC0206h, new HashMap(hashMap), iVar, xVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, e7, e8, new ArrayList(arrayDeque));
        }
        return gson;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [W.O, java.lang.Object] */
    private static O buildPerson(Context context, PersonDetails personDetails) {
        IconCompat iconCompat;
        IconSource iconSource;
        String str = null;
        if (personDetails == null) {
            return null;
        }
        boolean value = BooleanUtils.getValue(personDetails.bot);
        Object obj = personDetails.icon;
        if (obj != null && (iconSource = personDetails.iconBitmapSource) != null) {
            iconCompat = getIconFromSource(context, obj, iconSource);
        } else {
            iconCompat = null;
        }
        boolean value2 = BooleanUtils.getValue(personDetails.important);
        String str2 = personDetails.key;
        if (str2 == null) {
            str2 = null;
        }
        String str3 = personDetails.name;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = personDetails.uri;
        if (str4 != null) {
            str = str4;
        }
        ?? obj2 = new Object();
        obj2.f6016a = str3;
        obj2.f6017b = iconCompat;
        obj2.f6018c = str;
        obj2.f6019d = str2;
        obj2.f6020e = value;
        obj2.f = value2;
        return obj2;
    }

    private static long calculateNextNotificationTrigger(long j, long j8) {
        while (j < System.currentTimeMillis()) {
            j += j8;
        }
        return j;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        Integer num = notificationDetails.repeatIntervalMilliseconds;
        if (num != null) {
            return num.intValue();
        }
        int i7 = d.f9076a[notificationDetails.repeatInterval.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return 0L;
                    }
                    return 604800000L;
                }
                return 86400000L;
            }
            return 3600000L;
        }
        return 60000L;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        NotificationChannel notificationChannel;
        boolean z7;
        NotificationChannelAction notificationChannelAction;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(notificationChannelDetails.id);
            if ((notificationChannel == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) || (notificationChannel != null && notificationChannelDetails.channelAction == NotificationChannelAction.Update)) {
                z7 = true;
            } else {
                z7 = false;
            }
            return Boolean.valueOf(z7);
        }
        return Boolean.FALSE;
    }

    private void cancel(o oVar, q qVar) {
        Map map = (Map) oVar.f3039b;
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        qVar.a(null);
    }

    private void cancelAllNotifications(q qVar) {
        getNotificationManager(this.applicationContext).f6015b.cancelAll();
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications != null && !loadScheduledNotifications.isEmpty()) {
            Intent intent = new Intent(this.applicationContext, ScheduledNotificationReceiver.class);
            Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
            while (it.hasNext()) {
                getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
            }
            saveScheduledNotifications(this.applicationContext, new ArrayList());
            qVar.a(null);
            return;
        }
        qVar.a(null);
    }

    private void cancelAllPendingNotifications(q qVar) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications != null && !loadScheduledNotifications.isEmpty()) {
            AlarmManager alarmManager = getAlarmManager(this.applicationContext);
            Intent intent = new Intent(this.applicationContext, ScheduledNotificationReceiver.class);
            Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
            while (it.hasNext()) {
                alarmManager.cancel(getBroadcastPendingIntent(this.applicationContext, it.next().id.intValue(), intent));
            }
            saveScheduledNotifications(this.applicationContext, new ArrayList());
            qVar.a(null);
            return;
        }
        qVar.a(null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, ScheduledNotificationReceiver.class)));
        L notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.b(num.intValue(), null);
        } else {
            notificationManager.b(num.intValue(), str);
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            byte[] bArr = new byte[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                bArr[i7] = (byte) ((Double) arrayList.get(i7)).intValue();
            }
            return bArr;
        }
        return (byte[]) obj;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        boolean canScheduleExactAlarms;
        if (Build.VERSION.SDK_INT >= 31) {
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            if (!canScheduleExactAlarms) {
                throw new e();
            }
        }
    }

    private static A createMessage(Context context, MessageDetails messageDetails) {
        String str;
        A a7 = new A(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (str2 != null && (str = messageDetails.dataMimeType) != null) {
            Uri parse = Uri.parse(str2);
            a7.f5986e = str;
            a7.f = parse;
        }
        return a7;
    }

    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        CharSequence charSequence;
        CharSequence charSequence2;
        IconCompat d7;
        IconCompat iconCompat;
        Intent intent;
        int i7;
        int i8;
        PendingIntent broadcast;
        boolean z7;
        CharSequence[] charSequenceArr;
        IconSource iconSource;
        NotificationChannelDetails fromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, fromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, fromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(SELECT_NOTIFICATION);
        launchIntent.putExtra(NOTIFICATION_ID, notificationDetails.id);
        launchIntent.putExtra(PAYLOAD, notificationDetails.payload);
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.id.intValue(), launchIntent, 201326592);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        C0372o c0372o = new C0372o(context, notificationDetails.channelId);
        if (defaultStyleInformation.htmlFormatTitle.booleanValue()) {
            charSequence = fromHtml(notificationDetails.title);
        } else {
            charSequence = notificationDetails.title;
        }
        c0372o.f6062e = C0372o.b(charSequence);
        if (defaultStyleInformation.htmlFormatBody.booleanValue()) {
            charSequence2 = fromHtml(notificationDetails.body);
        } else {
            charSequence2 = notificationDetails.body;
        }
        c0372o.f = C0372o.b(charSequence2);
        c0372o.f6055G.tickerText = C0372o.b(notificationDetails.ticker);
        c0372o.c(16, BooleanUtils.getValue(notificationDetails.autoCancel));
        c0372o.f6063g = activity;
        c0372o.f6066k = notificationDetails.priority.intValue();
        c0372o.c(2, BooleanUtils.getValue(notificationDetails.ongoing));
        c0372o.f6056H = BooleanUtils.getValue(notificationDetails.silent);
        c0372o.c(8, BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        if (notificationDetails.actions != null) {
            int intValue = notificationDetails.id.intValue() * 16;
            for (NotificationAction notificationAction : notificationDetails.actions) {
                if (!TextUtils.isEmpty(notificationAction.icon) && (iconSource = notificationAction.iconSource) != null) {
                    iconCompat = getIconFromSource(context, notificationAction.icon, iconSource);
                } else {
                    iconCompat = null;
                }
                Boolean bool = notificationAction.showsUserInterface;
                if (bool != null && bool.booleanValue()) {
                    intent = getLaunchIntent(context);
                    intent.setAction(SELECT_FOREGROUND_NOTIFICATION_ACTION);
                } else {
                    intent = new Intent(context, ActionBroadcastReceiver.class);
                    intent.setAction("com.dexterous.flutterlocalnotifications.ActionBroadcastReceiver.ACTION_TAPPED");
                }
                intent.putExtra(NOTIFICATION_ID, notificationDetails.id).putExtra(NOTIFICATION_TAG, notificationDetails.tag).putExtra(ACTION_ID, notificationAction.id).putExtra(CANCEL_NOTIFICATION, notificationAction.cancelNotification).putExtra(PAYLOAD, notificationDetails.payload);
                List<C1986a> list = notificationAction.actionInputs;
                if (list != null && !list.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        i7 = 167772160;
                    } else {
                        i7 = 134217728;
                    }
                } else {
                    i7 = 201326592;
                }
                Boolean bool2 = notificationAction.showsUserInterface;
                if (bool2 != null && bool2.booleanValue()) {
                    i8 = intValue + 1;
                    broadcast = PendingIntent.getActivity(context, intValue, intent, i7);
                } else {
                    i8 = intValue + 1;
                    broadcast = PendingIntent.getBroadcast(context, intValue, intent, i7);
                }
                SpannableString spannableString = new SpannableString(notificationAction.title);
                if (notificationAction.titleColor != null) {
                    spannableString.setSpan(new ForegroundColorSpan(notificationAction.titleColor.intValue()), 0, spannableString.length(), 0);
                }
                C0365h c0365h = new C0365h(iconCompat, spannableString, broadcast);
                Boolean bool3 = notificationAction.contextual;
                if (bool3 != null) {
                    c0365h.f6032c = bool3.booleanValue();
                }
                Boolean bool4 = notificationAction.showsUserInterface;
                if (bool4 != null) {
                    c0365h.f6031b = bool4.booleanValue();
                }
                Boolean bool5 = notificationAction.allowGeneratedReplies;
                if (bool5 != null) {
                    c0365h.f6030a = bool5.booleanValue();
                }
                List<C1986a> list2 = notificationAction.actionInputs;
                if (list2 != null) {
                    for (C1986a c1986a : list2) {
                        HashSet hashSet = new HashSet();
                        Bundle bundle = new Bundle();
                        String str = c1986a.f16499c;
                        Boolean bool6 = c1986a.f16498b;
                        if (bool6 != null) {
                            z7 = bool6.booleanValue();
                        } else {
                            z7 = true;
                        }
                        List<String> list3 = c1986a.f16500d;
                        if (list3 != null) {
                            for (String str2 : list3) {
                                hashSet.add(str2);
                            }
                        }
                        List list4 = c1986a.f16497a;
                        if (list4 != null) {
                            charSequenceArr = (CharSequence[]) list4.toArray(new CharSequence[0]);
                        } else {
                            charSequenceArr = null;
                        }
                        Q q2 = new Q(str, charSequenceArr, z7, bundle, hashSet);
                        if (((ArrayList) c0365h.f6036h) == null) {
                            c0365h.f6036h = new ArrayList();
                        }
                        ((ArrayList) c0365h.f6036h).add(q2);
                    }
                }
                c0372o.f6059b.add(c0365h.a());
                intValue = i8;
            }
        }
        setSmallIcon(context, notificationDetails, c0372o);
        Bitmap bitmapFromSource = getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource);
        if (bitmapFromSource == null) {
            d7 = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = c0372o.f6058a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmapFromSource.getWidth() > dimensionPixelSize || bitmapFromSource.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmapFromSource.getWidth()), dimensionPixelSize2 / Math.max(1, bitmapFromSource.getHeight()));
                    bitmapFromSource = Bitmap.createScaledBitmap(bitmapFromSource, (int) Math.ceil(bitmapFromSource.getWidth() * min), (int) Math.ceil(bitmapFromSource.getHeight() * min), true);
                }
            }
            d7 = IconCompat.d(bitmapFromSource);
        }
        c0372o.f6065i = d7;
        Integer num = notificationDetails.color;
        if (num != null) {
            c0372o.f6081z = num.intValue();
        }
        Boolean bool7 = notificationDetails.colorized;
        if (bool7 != null) {
            c0372o.f6077v = bool7.booleanValue();
            c0372o.f6078w = true;
        }
        Boolean bool8 = notificationDetails.showWhen;
        if (bool8 != null) {
            c0372o.f6067l = BooleanUtils.getValue(bool8);
        }
        Long l8 = notificationDetails.when;
        if (l8 != null) {
            c0372o.f6055G.when = l8.longValue();
        }
        Boolean bool9 = notificationDetails.usesChronometer;
        if (bool9 != null) {
            c0372o.f6068m = bool9.booleanValue();
        }
        Boolean bool10 = notificationDetails.chronometerCountDown;
        if (bool10 != null && Build.VERSION.SDK_INT >= 24) {
            boolean booleanValue = bool10.booleanValue();
            if (c0372o.f6080y == null) {
                c0372o.f6080y = new Bundle();
            }
            c0372o.f6080y.putBoolean("android.chronometerCountDown", booleanValue);
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            c0372o.f6064h = activity;
            c0372o.c(RecognitionOptions.ITF, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            c0372o.f6051C = notificationDetails.shortcutId;
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            c0372o.f6070o = C0372o.b(notificationDetails.subText);
        }
        Integer num2 = notificationDetails.number;
        if (num2 != null) {
            c0372o.j = num2.intValue();
        }
        setVisibility(notificationDetails, c0372o);
        applyGrouping(notificationDetails, c0372o);
        setSound(context, notificationDetails, c0372o);
        setVibrationPattern(notificationDetails, c0372o);
        setLights(notificationDetails, c0372o);
        setStyle(context, notificationDetails, c0372o);
        setProgress(notificationDetails, c0372o);
        setCategory(notificationDetails, c0372o);
        setTimeoutAfter(notificationDetails, c0372o);
        Notification a7 = c0372o.a();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            for (int i9 : iArr) {
                a7.flags = i9 | a7.flags;
            }
        }
        return a7;
    }

    private void createNotificationChannel(o oVar, q qVar) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) oVar.f3039b));
        qVar.a(null);
    }

    private void createNotificationChannelGroup(o oVar, q qVar) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            NotificationChannelGroupDetails from = NotificationChannelGroupDetails.from((Map) oVar.f3039b);
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
            com.dexterous.flutterlocalnotifications.a.k();
            NotificationChannelGroup e7 = com.dexterous.flutterlocalnotifications.a.e(from.id, from.name);
            if (i7 >= 28) {
                e7.setDescription(from.description);
            }
            notificationManager.createNotificationChannelGroup(e7);
        }
        qVar.a(null);
    }

    private void deleteNotificationChannel(o oVar, q qVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannel((String) oVar.f3039b);
        }
        qVar.a(null);
    }

    private void deleteNotificationChannelGroup(o oVar, q qVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService("notification")).deleteNotificationChannelGroup((String) oVar.f3039b);
        }
        qVar.a(null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        IconSource iconSource;
        String resourceEntryName;
        if (iconCompat == null) {
            return null;
        }
        int i7 = iconCompat.f7706a;
        if (i7 == -1) {
            i7 = j3.f.w(iconCompat.f7707b);
        }
        if (i7 != 2) {
            if (i7 != 4) {
                return null;
            }
            iconSource = IconSource.ContentUri;
            resourceEntryName = iconCompat.g().toString();
        } else {
            iconSource = IconSource.DrawableResource;
            resourceEntryName = this.applicationContext.getResources().getResourceEntryName(iconCompat.f());
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ClimateForcast.SOURCE, Integer.valueOf(iconSource.ordinal()));
        hashMap.put("data", resourceEntryName);
        return hashMap;
    }

    private Map<String, Object> describePerson(O o7) {
        if (o7 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, o7.f6019d);
        hashMap.put("name", o7.f6016a);
        hashMap.put("uri", o7.f6018c);
        hashMap.put("bot", Boolean.valueOf(o7.f6020e));
        hashMap.put("important", Boolean.valueOf(o7.f));
        hashMap.put("icon", describeIcon(o7.f6017b));
        return hashMap;
    }

    private NotificationDetails extractNotificationDetails(q qVar, Map<String, Object> map) {
        NotificationDetails from = NotificationDetails.from(map);
        if (!hasInvalidIcon(qVar, from.icon) && !hasInvalidLargeIcon(qVar, from.largeIcon, from.largeIconBitmapSource) && !hasInvalidBigPictureResources(qVar, from) && !hasInvalidRawSoundResource(qVar, from) && !hasInvalidLedDetails(qVar, from)) {
            return from;
        }
        return null;
    }

    public static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        HashMap hashMap = new HashMap();
        hashMap.put(NOTIFICATION_ID, Integer.valueOf(intExtra));
        hashMap.put(NOTIFICATION_TAG, intent.getStringExtra(NOTIFICATION_TAG));
        hashMap.put(ACTION_ID, intent.getStringExtra(ACTION_ID));
        hashMap.put(PAYLOAD, intent.getStringExtra(PAYLOAD));
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent != null) {
            hashMap.put(INPUT, resultsFromIntent.getString(INPUT_RESULT));
        }
        if (SELECT_NOTIFICATION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 0);
        }
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 1);
        }
        return hashMap;
    }

    private static Spanned fromHtml(String str) {
        Spanned fromHtml;
        if (str == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
            return fromHtml;
        }
        return Html.fromHtml(str);
    }

    private void getActiveNotificationMessagingStyle(o oVar, q qVar) {
        StatusBarNotification[] activeNotifications;
        Notification notification;
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService("notification");
        try {
            Map map = (Map) oVar.f3039b;
            int intValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                if (statusBarNotification.getId() != intValue || (str != null && !str.equals(statusBarNotification.getTag()))) {
                }
                notification = statusBarNotification.getNotification();
            }
            notification = null;
            if (notification == null) {
                qVar.a(null);
                return;
            }
            B h8 = B.h(notification);
            if (h8 == null) {
                qVar.a(null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("groupConversation", Boolean.valueOf(h8.i()));
            hashMap.put("person", describePerson(h8.f5988g));
            hashMap.put("conversationTitle", h8.f5989h);
            ArrayList arrayList = new ArrayList();
            Iterator it = h8.f5987e.iterator();
            while (it.hasNext()) {
                A a7 = (A) it.next();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("text", a7.f5982a);
                hashMap2.put("timestamp", Long.valueOf(a7.f5983b));
                hashMap2.put("person", describePerson(a7.f5984c));
                arrayList.add(hashMap2);
            }
            hashMap.put("messages", arrayList);
            qVar.a(hashMap);
        } catch (Throwable th) {
            qVar.b(Log.getStackTraceString(th), GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE, th.getMessage());
        }
    }

    private void getActiveNotifications(q qVar) {
        String channelId;
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService("notification")).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap hashMap = new HashMap();
                hashMap.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                if (Build.VERSION.SDK_INT >= 26) {
                    channelId = notification.getChannelId();
                    hashMap.put("channelId", channelId);
                }
                hashMap.put(CANCEL_TAG, statusBarNotification.getTag());
                hashMap.put("groupKey", notification.getGroup());
                hashMap.put("title", notification.extras.getCharSequence("android.title"));
                hashMap.put("body", notification.extras.getCharSequence("android.text"));
                hashMap.put("bigText", notification.extras.getCharSequence("android.bigText"));
                arrayList.add(hashMap);
            }
            qVar.a(arrayList);
        } catch (Throwable th) {
            qVar.b(Log.getStackTraceString(th), UNSUPPORTED_OS_VERSION_ERROR_CODE, th.getMessage());
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource == BitmapSource.ByteArray) {
            byte[] castObjectToByteArray = castObjectToByteArray(obj);
            return BitmapFactory.decodeByteArray(castObjectToByteArray, 0, castObjectToByteArray.length);
        }
        return null;
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i7, Intent intent) {
        return PendingIntent.getBroadcast(context, i7, intent, 201326592);
    }

    private void getCallbackHandle(q qVar) {
        qVar.a(Long.valueOf(this.applicationContext.getSharedPreferences("flutter_local_notifications_plugin", 0).getLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", -1L)));
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        IconCompat d7;
        int i7 = d.f9077b[iconSource.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            return null;
                        }
                        byte[] castObjectToByteArray = castObjectToByteArray(obj);
                        int length = castObjectToByteArray.length;
                        d7 = new IconCompat(3);
                        d7.f7707b = castObjectToByteArray;
                        d7.f7710e = 0;
                        d7.f = length;
                    } else {
                        try {
                            AssetFileDescriptor openFd = context.getAssets().openFd(((F5.d) k.A().f5965b).b((String) obj));
                            FileInputStream createInputStream = openFd.createInputStream();
                            d7 = IconCompat.d(BitmapFactory.decodeStream(createInputStream));
                            createInputStream.close();
                            openFd.close();
                        } catch (IOException e7) {
                            throw new RuntimeException(e7);
                        }
                    }
                    return d7;
                }
                String str = (String) obj;
                PorterDuff.Mode mode = IconCompat.f7705k;
                str.getClass();
                IconCompat iconCompat = new IconCompat(4);
                iconCompat.f7707b = str;
                return iconCompat;
            }
            return IconCompat.d(BitmapFactory.decodeFile((String) obj));
        }
        int drawableResourceId = getDrawableResourceId(context, (String) obj);
        PorterDuff.Mode mode2 = IconCompat.f7705k;
        context.getClass();
        return IconCompat.e(context.getResources(), context.getPackageName(), drawableResourceId);
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        String id;
        CharSequence name;
        String description;
        String group;
        boolean canShowBadge;
        int importance;
        Uri sound;
        boolean canBypassDnd;
        boolean shouldVibrate;
        long[] vibrationPattern;
        boolean shouldShowLights;
        int lightColor;
        AudioAttributes audioAttributes;
        int usage;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            id = notificationChannel.getId();
            hashMap.put(CANCEL_ID, id);
            name = notificationChannel.getName();
            hashMap.put("name", name);
            description = notificationChannel.getDescription();
            hashMap.put("description", description);
            group = notificationChannel.getGroup();
            hashMap.put("groupId", group);
            canShowBadge = notificationChannel.canShowBadge();
            hashMap.put("showBadge", Boolean.valueOf(canShowBadge));
            importance = notificationChannel.getImportance();
            hashMap.put("importance", Integer.valueOf(importance));
            sound = notificationChannel.getSound();
            if (sound == null) {
                hashMap.put("sound", null);
                hashMap.put("playSound", Boolean.FALSE);
            } else {
                hashMap.put("playSound", Boolean.TRUE);
                List asList = Arrays.asList(SoundSource.values());
                if (sound.getScheme().equals("android.resource")) {
                    String[] split = sound.toString().split("/");
                    String str = split[split.length - 1];
                    Integer tryParseInt = tryParseInt(str);
                    if (tryParseInt == null) {
                        hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                        hashMap.put("sound", str);
                    } else {
                        try {
                            String resourceEntryName = this.applicationContext.getResources().getResourceEntryName(tryParseInt.intValue());
                            if (resourceEntryName != null) {
                                hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                                hashMap.put("sound", resourceEntryName);
                            }
                        } catch (Exception unused) {
                            hashMap.put("sound", null);
                            hashMap.put("playSound", Boolean.FALSE);
                        }
                    }
                } else {
                    hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.Uri)));
                    hashMap.put("sound", sound.toString());
                }
            }
            canBypassDnd = notificationChannel.canBypassDnd();
            hashMap.put("bypassDnd", Boolean.valueOf(canBypassDnd));
            shouldVibrate = notificationChannel.shouldVibrate();
            hashMap.put("enableVibration", Boolean.valueOf(shouldVibrate));
            vibrationPattern = notificationChannel.getVibrationPattern();
            hashMap.put("vibrationPattern", vibrationPattern);
            shouldShowLights = notificationChannel.shouldShowLights();
            hashMap.put("enableLights", Boolean.valueOf(shouldShowLights));
            lightColor = notificationChannel.getLightColor();
            hashMap.put("ledColor", Integer.valueOf(lightColor));
            audioAttributes = notificationChannel.getAudioAttributes();
            if (audioAttributes == null) {
                usage = 5;
            } else {
                usage = audioAttributes.getUsage();
            }
            hashMap.put("audioAttributesUsage", Integer.valueOf(usage));
        }
        return hashMap;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1L));
        } else if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Weekly) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1L));
        } else {
            return null;
        }
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId of = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), of);
        ZonedDateTime now = ZonedDateTime.now(of);
        ZonedDateTime of3 = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), of2.getHour(), of2.getMinute(), of2.getSecond(), of2.getNano(), of);
        while (of3.isBefore(now)) {
            of3 = of3.plusDays(1L);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents == DateTimeComponents.Time) {
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        }
        if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
            while (of3.getDayOfWeek() != of2.getDayOfWeek()) {
                of3 = of3.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        } else if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
            while (of3.getDayOfMonth() != of2.getDayOfMonth()) {
                of3 = of3.plusDays(1L);
            }
            return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
        } else if (dateTimeComponents != DateTimeComponents.DateAndTime) {
            return null;
        } else {
            while (true) {
                if (of3.getMonthValue() == of2.getMonthValue() && of3.getDayOfMonth() == of2.getDayOfMonth()) {
                    return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
                }
                of3 = of3.plusDays(1L);
            }
        }
    }

    private void getNotificationAppLaunchDetails(q qVar) {
        boolean z7;
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent != null && ((SELECT_NOTIFICATION.equals(intent.getAction()) || SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) && !launchedActivityFromHistory(intent))) {
                z7 = true;
            } else {
                z7 = false;
            }
            Boolean valueOf = Boolean.valueOf(z7);
            if (z7) {
                hashMap.put("notificationResponse", extractNotificationResponseMap(intent));
            }
            bool = valueOf;
        }
        hashMap.put(NOTIFICATION_LAUNCHED_APP, bool);
        qVar.a(hashMap);
    }

    private void getNotificationChannels(q qVar) {
        List<Object> emptyList;
        try {
            L notificationManager = getNotificationManager(this.applicationContext);
            if (Build.VERSION.SDK_INT >= 26) {
                emptyList = W.E.c(notificationManager.f6015b);
            } else {
                notificationManager.getClass();
                emptyList = Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : emptyList) {
                arrayList.add(getMappedNotificationChannel(com.dexterous.flutterlocalnotifications.a.d(obj)));
            }
            qVar.a(arrayList);
        } catch (Throwable th) {
            qVar.b(Log.getStackTraceString(th), GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage());
        }
    }

    private static L getNotificationManager(Context context) {
        return new L(context);
    }

    private boolean hasInvalidBigPictureResources(q qVar, NotificationDetails notificationDetails) {
        if (notificationDetails.style != NotificationStyle.BigPicture) {
            return false;
        }
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        if (hasInvalidLargeIcon(qVar, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
            return true;
        }
        BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
        if (bitmapSource == BitmapSource.DrawableResource) {
            String str = (String) bigPictureStyleInformation.bigPicture;
            if (!StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, qVar, INVALID_BIG_PICTURE_ERROR_CODE)) {
                return false;
            }
            return true;
        } else if (bitmapSource == BitmapSource.FilePath) {
            return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
        } else {
            if (bitmapSource != BitmapSource.ByteArray) {
                return false;
            }
            byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
            if (bArr != null && bArr.length != 0) {
                return false;
            }
            return true;
        }
    }

    private boolean hasInvalidIcon(q qVar, String str) {
        if (!StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, qVar, INVALID_ICON_ERROR_CODE)) {
            return true;
        }
        return false;
    }

    private boolean hasInvalidLargeIcon(q qVar, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            if (bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0) {
                return true;
            }
            return false;
        }
        String str = (String) obj;
        if (!StringUtils.isNullOrEmpty(str).booleanValue() && bitmapSource == bitmapSource2 && !isValidDrawableResource(this.applicationContext, str, qVar, INVALID_LARGE_ICON_ERROR_CODE)) {
            return true;
        }
        return false;
    }

    private boolean hasInvalidLedDetails(q qVar, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor != null) {
            if (notificationDetails.ledOnMs == null || notificationDetails.ledOffMs == null) {
                qVar.b(null, INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE);
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean hasInvalidRawSoundResource(q qVar, NotificationDetails notificationDetails) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue()) {
            SoundSource soundSource = notificationDetails.soundSource;
            if ((soundSource == null || soundSource == SoundSource.RawResource) && this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) == 0) {
                qVar.b(null, INVALID_SOUND_ERROR_CODE, AbstractC0059i.M("The resource ", notificationDetails.sound, " could not be found. Please make sure it has been added as a raw resource to your Android head project."));
                return true;
            }
            return false;
        }
        return false;
    }

    private void initialize(o oVar, q qVar) {
        String str = (String) ((Map) oVar.f3039b).get(DEFAULT_ICON);
        if (!isValidDrawableResource(this.applicationContext, str, qVar, INVALID_ICON_ERROR_CODE)) {
            return;
        }
        Long M7 = AbstractC0412a.M(oVar.a(DISPATCHER_HANDLE));
        Long M8 = AbstractC0412a.M(oVar.a(CALLBACK_HANDLE));
        if (M7 != null && M8 != null) {
            Context context = this.applicationContext;
            context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_DISPATCHER_HANDLE_KEY", M7.longValue()).apply();
            context.getSharedPreferences("flutter_local_notifications_plugin", 0).edit().putLong("com.dexterous.flutterlocalnotifications.CALLBACK_HANDLE_KEY", M8.longValue()).apply();
        }
        this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
        qVar.a(Boolean.TRUE);
    }

    private static boolean isValidDrawableResource(Context context, String str, q qVar, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) == 0) {
            qVar.b(null, str2, AbstractC0059i.M("The resource ", str, " could not be found. Please make sure it has been added as a drawable resource to your Android head project."));
            return false;
        }
        return true;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        if (intent != null && (intent.getFlags() & 1048576) == 1048576) {
            return true;
        }
        return false;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, null);
        if (string != null) {
            return (ArrayList) buildGson().b(string, new a().f4023b);
        }
        return arrayList;
    }

    private void pendingNotificationRequests(q qVar) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(CANCEL_ID, next.id);
            hashMap.put("title", next.title);
            hashMap.put("body", next.body);
            hashMap.put(PAYLOAD, next.payload);
            arrayList.add(hashMap);
        }
        qVar.a(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(CANCEL_NOTIFICATION, false)) {
            new L(this.applicationContext).b(((Integer) map.get(NOTIFICATION_ID)).intValue(), null);
        }
    }

    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().id.equals(num)) {
                it.remove();
                break;
            }
        }
        saveScheduledNotifications(context, loadScheduledNotifications);
    }

    private void repeat(o oVar, q qVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(qVar, (Map) oVar.f3039b);
        if (extractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                qVar.a(null);
            } catch (e e7) {
                qVar.b(null, e7.f9079a, e7.getMessage());
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long calculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long longValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, notificationDetails.repeatTime.hour.intValue());
            calendar.set(12, notificationDetails.repeatTime.minute.intValue());
            calendar.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                calendar.set(7, num.intValue());
            }
            longValue = calendar.getTimeInMillis();
        }
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(longValue, calculateRepeatIntervalMilliseconds);
        String f = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, f);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, calculateNextNotificationTrigger, calculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public static void rescheduleNotifications(Context context) {
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            try {
            } catch (e e7) {
                Log.e(TAG, e7.getMessage());
                removeNotificationFromCache(context, next.id);
            }
            if (next.repeatInterval == null && next.repeatIntervalMilliseconds == null) {
                if (next.timeZoneName != null) {
                    zonedScheduleNotification(context, next, Boolean.FALSE);
                } else {
                    scheduleNotification(context, next, Boolean.FALSE);
                }
            }
            repeatNotification(context, next, Boolean.FALSE);
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource != null && soundSource != SoundSource.RawResource) {
            if (soundSource == SoundSource.Uri) {
                return Uri.parse(str);
            }
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.id.equals(notificationDetails.id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().f(arrayList)).apply();
    }

    public static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
            } else if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
            } else {
                if (notificationDetails.repeatInterval == null && notificationDetails.repeatIntervalMilliseconds == null) {
                    removeNotificationFromCache(context, notificationDetails.id);
                }
                scheduleNextRepeatingNotification(context, notificationDetails);
            }
        } catch (e e7) {
            Log.e(TAG, e7.getMessage());
            removeNotificationFromCache(context, notificationDetails.id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String f = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, f);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String f = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, f);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> extractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap);
        }
        this.channel.a("didReceiveNotificationResponse", extractNotificationResponseMap, null);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [W.l, W.C] */
    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, C0372o c0372o) {
        IconCompat d7;
        CharSequence charSequence;
        CharSequence charSequence2;
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        ?? c8 = new C();
        if (bigPictureStyleInformation.contentTitle != null) {
            if (bigPictureStyleInformation.htmlFormatContentTitle.booleanValue()) {
                charSequence2 = fromHtml(bigPictureStyleInformation.contentTitle);
            } else {
                charSequence2 = bigPictureStyleInformation.contentTitle;
            }
            c8.f5992b = C0372o.b(charSequence2);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            if (bigPictureStyleInformation.htmlFormatSummaryText.booleanValue()) {
                charSequence = fromHtml(bigPictureStyleInformation.summaryText);
            } else {
                charSequence = bigPictureStyleInformation.summaryText;
            }
            c8.f5993c = C0372o.b(charSequence);
            c8.f5994d = true;
        }
        IconCompat iconCompat = null;
        if (bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            c8.f = null;
            c8.f6046g = true;
        } else {
            Object obj = bigPictureStyleInformation.largeIcon;
            if (obj != null) {
                Bitmap bitmapFromSource = getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource);
                if (bitmapFromSource == null) {
                    d7 = null;
                } else {
                    d7 = IconCompat.d(bitmapFromSource);
                }
                c8.f = d7;
                c8.f6046g = true;
            }
        }
        Bitmap bitmapFromSource2 = getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource);
        if (bitmapFromSource2 != null) {
            iconCompat = IconCompat.d(bitmapFromSource2);
        }
        c8.f6045e = iconCompat;
        c0372o.d(c8);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, C0372o c0372o) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        C0370m c0370m = new C0370m(0);
        if (bigTextStyleInformation.bigText != null) {
            if (bigTextStyleInformation.htmlFormatBigText.booleanValue()) {
                charSequence3 = fromHtml(bigTextStyleInformation.bigText);
            } else {
                charSequence3 = bigTextStyleInformation.bigText;
            }
            c0370m.f = C0372o.b(charSequence3);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            if (bigTextStyleInformation.htmlFormatContentTitle.booleanValue()) {
                charSequence2 = fromHtml(bigTextStyleInformation.contentTitle);
            } else {
                charSequence2 = bigTextStyleInformation.contentTitle;
            }
            c0370m.f5992b = C0372o.b(charSequence2);
        }
        if (bigTextStyleInformation.summaryText != null) {
            if (bigTextStyleInformation.htmlFormatSummaryText.booleanValue()) {
                charSequence = fromHtml(bigTextStyleInformation.summaryText);
            } else {
                charSequence = bigTextStyleInformation.summaryText;
            }
            c0370m.f5993c = C0372o.b(charSequence);
            c0370m.f5994d = true;
        }
        c0372o.d(c0370m);
    }

    private void setCanScheduleExactNotifications(q qVar) {
        boolean canScheduleExactAlarms;
        if (Build.VERSION.SDK_INT >= 31) {
            canScheduleExactAlarms = getAlarmManager(this.applicationContext).canScheduleExactAlarms();
            qVar.a(Boolean.valueOf(canScheduleExactAlarms));
            return;
        }
        qVar.a(Boolean.TRUE);
    }

    private static void setCategory(NotificationDetails notificationDetails, C0372o c0372o) {
        String str = notificationDetails.category;
        if (str == null) {
            return;
        }
        c0372o.f6079x = str;
    }

    private static void setInboxStyle(NotificationDetails notificationDetails, C0372o c0372o) {
        CharSequence charSequence;
        CharSequence charSequence2;
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        C0370m c0370m = new C0370m(1);
        if (inboxStyleInformation.contentTitle != null) {
            if (inboxStyleInformation.htmlFormatContentTitle.booleanValue()) {
                charSequence2 = fromHtml(inboxStyleInformation.contentTitle);
            } else {
                charSequence2 = inboxStyleInformation.contentTitle;
            }
            c0370m.f5992b = C0372o.b(charSequence2);
        }
        if (inboxStyleInformation.summaryText != null) {
            if (inboxStyleInformation.htmlFormatSummaryText.booleanValue()) {
                charSequence = fromHtml(inboxStyleInformation.summaryText);
            } else {
                charSequence = inboxStyleInformation.summaryText;
            }
            c0370m.f5993c = C0372o.b(charSequence);
            c0370m.f5994d = true;
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                CharSequence charSequence3 = next;
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    charSequence3 = fromHtml(next);
                }
                if (charSequence3 != null) {
                    ((ArrayList) c0370m.f).add(C0372o.b(charSequence3));
                }
            }
        }
        c0372o.d(c0370m);
    }

    private static void setLights(NotificationDetails notificationDetails, C0372o c0372o) {
        int i7;
        if (BooleanUtils.getValue(notificationDetails.enableLights) && notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            int intValue = notificationDetails.ledColor.intValue();
            int intValue2 = notificationDetails.ledOnMs.intValue();
            int intValue3 = notificationDetails.ledOffMs.intValue();
            Notification notification = c0372o.f6055G;
            notification.ledARGB = intValue;
            notification.ledOnMS = intValue2;
            notification.ledOffMS = intValue3;
            if (intValue2 != 0 && intValue3 != 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            notification.flags = i7 | (notification.flags & (-2));
        }
    }

    private static void setMediaStyle(C0372o c0372o) {
        c0372o.d(new G0.a(0));
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, C0372o c0372o) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        B b5 = new B(buildPerson(context, messagingStyleInformation.person));
        b5.f5990i = Boolean.valueOf(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            b5.f5989h = str;
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                A createMessage = createMessage(context, it.next());
                if (createMessage != null) {
                    ArrayList arrayList2 = b5.f5987e;
                    arrayList2.add(createMessage);
                    if (arrayList2.size() > 25) {
                        arrayList2.remove(0);
                    }
                }
            }
        }
        c0372o.d(b5);
    }

    private static void setProgress(NotificationDetails notificationDetails, C0372o c0372o) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            int intValue = notificationDetails.maxProgress.intValue();
            int intValue2 = notificationDetails.progress.intValue();
            boolean booleanValue = notificationDetails.indeterminate.booleanValue();
            c0372o.f6071p = intValue;
            c0372o.f6072q = intValue2;
            c0372o.f6073r = booleanValue;
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, C0372o c0372o) {
        if (!StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            c0372o.f6055G.icon = getDrawableResourceId(context, notificationDetails.icon);
            return;
        }
        String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, null);
        if (StringUtils.isNullOrEmpty(string).booleanValue()) {
            c0372o.f6055G.icon = notificationDetails.iconResourceId.intValue();
        } else {
            c0372o.f6055G.icon = getDrawableResourceId(context, string);
        }
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, C0372o c0372o) {
        if (BooleanUtils.getValue(notificationDetails.playSound)) {
            Uri retrieveSoundResourceUri = retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource);
            Notification notification = c0372o.f6055G;
            notification.sound = retrieveSoundResourceUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = AbstractC0371n.a(AbstractC0371n.d(AbstractC0371n.c(AbstractC0371n.b(), 4), 5));
            return;
        }
        Notification notification2 = c0372o.f6055G;
        notification2.sound = null;
        notification2.audioStreamType = -1;
        notification2.audioAttributes = AbstractC0371n.a(AbstractC0371n.d(AbstractC0371n.c(AbstractC0371n.b(), 4), 5));
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, C0372o c0372o) {
        int i7 = d.f9078c[notificationDetails.style.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 == 5) {
                            setMediaStyle(c0372o);
                            return;
                        }
                        return;
                    }
                    setMessagingStyle(context, notificationDetails, c0372o);
                    return;
                }
                setInboxStyle(notificationDetails, c0372o);
                return;
            }
            setBigTextStyle(notificationDetails, c0372o);
            return;
        }
        setBigPictureStyle(context, notificationDetails, c0372o);
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, C0372o c0372o) {
        Long l8 = notificationDetails.timeoutAfter;
        if (l8 == null) {
            return;
        }
        c0372o.f6052D = l8.longValue();
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, C0372o c0372o) {
        if (BooleanUtils.getValue(notificationDetails.enableVibration)) {
            long[] jArr = notificationDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                c0372o.f6055G.vibrate = jArr;
                return;
            }
            return;
        }
        c0372o.f6055G.vibrate = new long[]{0};
    }

    private static void setVisibility(NotificationDetails notificationDetails, C0372o c0372o) {
        int i7;
        Integer num = notificationDetails.visibility;
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            i7 = 1;
            if (intValue != 1) {
                if (intValue == 2) {
                    i7 = -1;
                } else {
                    throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
                }
            }
        } else {
            i7 = 0;
        }
        c0372o.f6049A = i7;
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j, pendingIntent);
        } else if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExact(0, j, pendingIntent);
        } else if (notificationDetails.scheduleMode.useAlarmClock()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent);
        } else {
            alarmManager.set(0, j, pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setExactAndAllowWhileIdle(0, j, pendingIntent);
        } else if (notificationDetails.scheduleMode.useAlarmClock()) {
            checkCanScheduleExactAlarms(alarmManager);
            alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(j, pendingIntent), pendingIntent);
        } else {
            alarmManager.setAndAllowWhileIdle(0, j, pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        int i7;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            org.apache.tika.io.b.i();
            NotificationChannel b5 = com.dexterous.flutterlocalnotifications.a.b(notificationChannelDetails.importance.intValue(), notificationChannelDetails.name, notificationChannelDetails.id);
            b5.setDescription(notificationChannelDetails.description);
            b5.setGroup(notificationChannelDetails.groupId);
            if (!notificationChannelDetails.playSound.booleanValue()) {
                b5.setSound(null, null);
            } else {
                Integer num2 = notificationChannelDetails.audioAttributesUsage;
                if (num2 != null) {
                    i7 = num2.intValue();
                } else {
                    i7 = 5;
                }
                b5.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(i7).build());
            }
            if (BooleanUtils.getValue(notificationChannelDetails.bypassDnd)) {
                if (notificationManager.isNotificationPolicyAccessGranted()) {
                    b5.setBypassDnd(true);
                } else {
                    Log.w(TAG, "Channel '" + notificationChannelDetails.name + "' was set to bypass Do Not Disturb but the OS prevents it.");
                }
            }
            b5.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
            long[] jArr = notificationChannelDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                b5.setVibrationPattern(jArr);
            }
            boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
            b5.enableLights(value);
            if (value && (num = notificationChannelDetails.ledColor) != null) {
                b5.setLightColor(num.intValue());
            }
            b5.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
            notificationManager.createNotificationChannel(b5);
        }
    }

    private void show(o oVar, q qVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(qVar, (Map) oVar.f3039b);
        if (extractNotificationDetails != null) {
            showNotification(this.applicationContext, extractNotificationDetails);
            qVar.a(null);
        }
    }

    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification createNotification = createNotification(context, notificationDetails);
        L notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        if (str != null) {
            notificationManager.c(str, notificationDetails.id.intValue(), createNotification);
        } else {
            notificationManager.c(null, notificationDetails.id.intValue(), createNotification);
        }
    }

    private void startForegroundService(o oVar, q qVar) {
        Map<String, Object> map = (Map) oVar.a("notificationData");
        Integer num = (Integer) oVar.a("startType");
        ArrayList arrayList = (ArrayList) oVar.a("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            qVar.b(null, "ARGUMENT_ERROR", "If foregroundServiceTypes is non-null it must not be empty!");
        } else if (map != null && num != null) {
            NotificationDetails extractNotificationDetails = extractNotificationDetails(qVar, map);
            if (extractNotificationDetails != null) {
                if (extractNotificationDetails.id.intValue() != 0) {
                    h hVar = new h(extractNotificationDetails, num.intValue(), arrayList);
                    Intent intent = new Intent(this.applicationContext, g.class);
                    intent.putExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", hVar);
                    X.d.startForegroundService(this.applicationContext, intent);
                    qVar.a(null);
                    return;
                }
                qVar.b(null, "ARGUMENT_ERROR", "The id of the notification for a foreground service must not be 0!");
            }
        } else {
            qVar.b(null, "ARGUMENT_ERROR", "An argument passed to startForegroundService was null!");
        }
    }

    private void stopForegroundService(q qVar) {
        this.applicationContext.stopService(new Intent(this.applicationContext, g.class));
        qVar.a(null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(o oVar, q qVar) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(qVar, (Map) oVar.f3039b);
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.matchDateTimeComponents != null) {
                extractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(extractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                qVar.a(null);
            } catch (e e7) {
                qVar.b(null, e7.f9079a, e7.getMessage());
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDate;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String f = buildGson().f(notificationDetails);
        Intent intent = new Intent(context, ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, f);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public void hasNotificationPolicyAccess(q qVar) {
        qVar.a(Boolean.valueOf(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()));
    }

    @Override // L5.t
    public boolean onActivityResult(int i7, int i8, Intent intent) {
        boolean canUseFullScreenIntent;
        boolean canScheduleExactAlarms;
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            return false;
        }
        if (this.permissionRequestProgress == f.RequestingExactAlarmsPermission && i7 == 2 && Build.VERSION.SDK_INT >= 31) {
            AlarmManager alarmManager = getAlarmManager(this.applicationContext);
            i iVar = this.callback;
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            iVar.v(canScheduleExactAlarms);
            this.permissionRequestProgress = f.None;
        }
        if (this.permissionRequestProgress == f.RequestingFullScreenIntentPermission && i7 == 3 && Build.VERSION.SDK_INT >= 34) {
            i iVar2 = this.callback;
            canUseFullScreenIntent = ((NotificationManager) this.applicationContext.getSystemService("notification")).canUseFullScreenIntent();
            iVar2.v(canUseFullScreenIntent);
            this.permissionRequestProgress = f.None;
        }
        if (this.permissionRequestProgress == f.RequestingNotificationPolicyAccess && i7 == 4) {
            this.callback.v(((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted());
            this.permissionRequestProgress = f.None;
        }
        return true;
    }

    @Override // I5.a
    public void onAttachedToActivity(I5.b bVar) {
        C5.d dVar = (C5.d) bVar;
        dVar.f575e.add(this);
        dVar.b(this);
        dVar.a(this);
        AbstractActivityC0032e abstractActivityC0032e = dVar.f571a;
        this.mainActivity = abstractActivityC0032e;
        Intent intent = abstractActivityC0032e.getIntent();
        if (!launchedActivityFromHistory(intent) && SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
        }
    }

    @Override // H5.b
    public void onAttachedToEngine(H5.a aVar) {
        this.applicationContext = aVar.f2029a;
        r rVar = new r(aVar.f2030b, METHOD_CHANNEL);
        this.channel = rVar;
        rVar.b(this);
    }

    @Override // I5.a
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // I5.a
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // H5.b
    public void onDetachedFromEngine(H5.a aVar) {
        this.channel.b(null);
        this.channel = null;
        this.applicationContext = null;
    }

    @Override // L5.p
    public void onMethodCall(o oVar, q qVar) {
        String str = oVar.f3038a;
        str.getClass();
        char c8 = 65535;
        switch (str.hashCode()) {
            case -2096263152:
                if (str.equals(STOP_FOREGROUND_SERVICE)) {
                    c8 = 0;
                    break;
                }
                break;
            case -2041662895:
                if (str.equals(GET_NOTIFICATION_CHANNELS_METHOD)) {
                    c8 = 1;
                    break;
                }
                break;
            case -1873731438:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c8 = 2;
                    break;
                }
                break;
            case -1785484984:
                if (str.equals(REQUEST_NOTIFICATIONS_PERMISSION_METHOD)) {
                    c8 = 3;
                    break;
                }
                break;
            case -1624574341:
                if (str.equals(HAS_NOTIFICATION_POLICY_ACCESS_METHOD)) {
                    c8 = 4;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals(CANCEL_METHOD)) {
                    c8 = 5;
                    break;
                }
                break;
            case -1108601471:
                if (str.equals(REQUEST_EXACT_ALARMS_PERMISSION_METHOD)) {
                    c8 = 6;
                    break;
                }
                break;
            case -950516363:
                if (str.equals(REQUEST_FULL_SCREEN_INTENT_PERMISSION_METHOD)) {
                    c8 = 7;
                    break;
                }
                break;
            case -799130106:
                if (str.equals(PENDING_NOTIFICATION_REQUESTS_METHOD)) {
                    c8 = '\b';
                    break;
                }
                break;
            case -321037320:
                if (str.equals(CANCEL_ALL_PENDING_NOTIFICATIONS_METHOD)) {
                    c8 = '\t';
                    break;
                }
                break;
            case -208611345:
                if (str.equals(GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD)) {
                    c8 = '\n';
                    break;
                }
                break;
            case 3529469:
                if (str.equals(SHOW_METHOD)) {
                    c8 = 11;
                    break;
                }
                break;
            case 6625712:
                if (str.equals(PERIODICALLY_SHOW_METHOD)) {
                    c8 = '\f';
                    break;
                }
                break;
            case 116003316:
                if (str.equals(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD)) {
                    c8 = '\r';
                    break;
                }
                break;
            case 476547271:
                if (str.equals(CANCEL_ALL_METHOD)) {
                    c8 = 14;
                    break;
                }
                break;
            case 548573423:
                if (str.equals(ZONED_SCHEDULE_METHOD)) {
                    c8 = 15;
                    break;
                }
                break;
            case 767006947:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c8 = 16;
                    break;
                }
                break;
            case 825311171:
                if (str.equals(GET_CALLBACK_HANDLE_METHOD)) {
                    c8 = 17;
                    break;
                }
                break;
            case 871091088:
                if (str.equals(INITIALIZE_METHOD)) {
                    c8 = 18;
                    break;
                }
                break;
            case 891942317:
                if (str.equals(ARE_NOTIFICATIONS_ENABLED_METHOD)) {
                    c8 = 19;
                    break;
                }
                break;
            case 972029712:
                if (str.equals(CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD)) {
                    c8 = 20;
                    break;
                }
                break;
            case 1008472557:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_METHOD)) {
                    c8 = 21;
                    break;
                }
                break;
            case 1207771056:
                if (str.equals(START_FOREGROUND_SERVICE)) {
                    c8 = 22;
                    break;
                }
                break;
            case 1594833996:
                if (str.equals(GET_ACTIVE_NOTIFICATIONS_METHOD)) {
                    c8 = 23;
                    break;
                }
                break;
            case 1653467900:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_METHOD)) {
                    c8 = 24;
                    break;
                }
                break;
            case 2017789808:
                if (str.equals(REQUEST_NOTIFICATION_POLICY_ACCESS_METHOD)) {
                    c8 = 25;
                    break;
                }
                break;
            case 2147197514:
                if (str.equals(PERIODICALLY_SHOW_WITH_DURATION_METHOD)) {
                    c8 = 26;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                stopForegroundService(qVar);
                return;
            case 1:
                getNotificationChannels(qVar);
                return;
            case 2:
                deleteNotificationChannelGroup(oVar, qVar);
                return;
            case 3:
                requestNotificationsPermission(new A.c(qVar, 27));
                return;
            case 4:
                hasNotificationPolicyAccess(qVar);
                return;
            case 5:
                cancel(oVar, qVar);
                return;
            case 6:
                requestExactAlarmsPermission(new C0415A(qVar));
                return;
            case 7:
                requestFullScreenIntentPermission(new C0585f(qVar, 2));
                return;
            case '\b':
                pendingNotificationRequests(qVar);
                return;
            case '\t':
                cancelAllPendingNotifications(qVar);
                return;
            case '\n':
                getNotificationAppLaunchDetails(qVar);
                return;
            case 11:
                show(oVar, qVar);
                return;
            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                repeat(oVar, qVar);
                return;
            case '\r':
                getActiveNotificationMessagingStyle(oVar, qVar);
                return;
            case 14:
                cancelAllNotifications(qVar);
                return;
            case 15:
                zonedSchedule(oVar, qVar);
                return;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                createNotificationChannelGroup(oVar, qVar);
                return;
            case 17:
                getCallbackHandle(qVar);
                return;
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                initialize(oVar, qVar);
                return;
            case 19:
                areNotificationsEnabled(qVar);
                return;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                setCanScheduleExactNotifications(qVar);
                return;
            case 21:
                deleteNotificationChannel(oVar, qVar);
                return;
            case 22:
                startForegroundService(oVar, qVar);
                return;
            case 23:
                getActiveNotifications(qVar);
                return;
            case 24:
                createNotificationChannel(oVar, qVar);
                return;
            case 25:
                requestNotificationPolicyAccess(new c(qVar));
                return;
            case 26:
                repeat(oVar, qVar);
                return;
            default:
                qVar.c();
                return;
        }
    }

    @Override // L5.u
    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (booleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    @Override // I5.a
    public void onReattachedToActivityForConfigChanges(I5.b bVar) {
        C5.d dVar = (C5.d) bVar;
        dVar.f575e.add(this);
        dVar.b(this);
        dVar.a(this);
        this.mainActivity = dVar.f571a;
    }

    @Override // L5.v
    public boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        boolean z7 = false;
        if (this.permissionRequestProgress == f.RequestingNotificationPermission && i7 == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z7 = true;
            }
            this.callback.v(z7);
            this.permissionRequestProgress = f.None;
        }
        return z7;
    }

    public void requestExactAlarmsPermission(i iVar) {
        boolean canScheduleExactAlarms;
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.None;
        if (fVar != fVar2) {
            iVar.A();
            return;
        }
        this.callback = iVar;
        if (Build.VERSION.SDK_INT >= 31) {
            canScheduleExactAlarms = getAlarmManager(this.applicationContext).canScheduleExactAlarms();
            if (!canScheduleExactAlarms) {
                this.permissionRequestProgress = f.RequestingExactAlarmsPermission;
                Activity activity = this.mainActivity;
                activity.startActivityForResult(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + this.applicationContext.getPackageName())), 2);
                return;
            }
            this.callback.v(true);
            this.permissionRequestProgress = fVar2;
            return;
        }
        iVar.v(true);
    }

    public void requestFullScreenIntentPermission(i iVar) {
        boolean canUseFullScreenIntent;
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.None;
        if (fVar != fVar2) {
            iVar.A();
            return;
        }
        this.callback = iVar;
        if (Build.VERSION.SDK_INT >= 34) {
            getAlarmManager(this.applicationContext);
            canUseFullScreenIntent = ((NotificationManager) this.applicationContext.getSystemService("notification")).canUseFullScreenIntent();
            if (!canUseFullScreenIntent) {
                this.permissionRequestProgress = f.RequestingFullScreenIntentPermission;
                Activity activity = this.mainActivity;
                activity.startActivityForResult(new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.parse("package:" + this.applicationContext.getPackageName())), 3);
                return;
            }
            this.callback.v(true);
            this.permissionRequestProgress = fVar2;
            return;
        }
        iVar.v(true);
    }

    public void requestNotificationPolicyAccess(i iVar) {
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.None;
        if (fVar != fVar2) {
            iVar.A();
            return;
        }
        this.callback = iVar;
        if (((NotificationManager) this.applicationContext.getSystemService("notification")).isNotificationPolicyAccessGranted()) {
            this.callback.v(true);
            this.permissionRequestProgress = fVar2;
            return;
        }
        this.permissionRequestProgress = f.RequestingNotificationPolicyAccess;
        this.mainActivity.startActivityForResult(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"), 4);
    }

    public void requestNotificationsPermission(i iVar) {
        f fVar = this.permissionRequestProgress;
        f fVar2 = f.None;
        if (fVar != fVar2) {
            iVar.A();
            return;
        }
        this.callback = iVar;
        if (Build.VERSION.SDK_INT >= 33) {
            if (X.d.checkSelfPermission(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
                this.callback.v(true);
                this.permissionRequestProgress = fVar2;
                return;
            }
            this.permissionRequestProgress = f.RequestingNotificationPermission;
            AbstractC0359b.a(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            return;
        }
        this.callback.v(new L(this.mainActivity).a());
    }
}
