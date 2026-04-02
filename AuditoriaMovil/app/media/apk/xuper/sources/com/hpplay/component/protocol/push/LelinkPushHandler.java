package com.hpplay.component.protocol.push;

import android.text.TextUtils;
import com.google.android.gms.cast.MediaError;
import com.hpplay.component.common.ParamsMap;
import com.hpplay.component.common.protocol.ProtocolListener;
import com.hpplay.component.common.utils.CLog;
import com.hpplay.component.dlna.DLNAControllerImp;
import com.hpplay.component.protocol.ProtocolBuilder;
import com.hpplay.component.protocol.plist.NSDictionary;
import com.hpplay.component.protocol.plist.PropertyListParser;
import com.hpplay.cybergarage.soap.SOAP;
/* loaded from: classes2.dex */
public class LelinkPushHandler extends IPushHandler {
    private static final String TAG = "LelinkPushHandler";

    public LelinkPushHandler(ParamsMap paramsMap) {
        super(paramsMap);
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String buildDecreaseVolume() {
        return new ProtocolBuilder().getsubVolumeCmd().setUserAgent(ProtocolBuilder.HAPPYCAST_AGENT).setContentLength("0").setUserLelinkSessionId(this.mSessionId).getString(true);
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String buildGetPlayInfo() {
        return new ProtocolBuilder().getPositionCmd().setContentType(ProtocolBuilder.CONTENT_APPLE_PLAYLIST_TYPE).setContentLength("0").setUserAgent(ProtocolBuilder.MEDIACONTROL_AGENT).setUserLelinkSessionId(this.mSessionId).getString(true);
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String buildGetStateInfo() {
        return null;
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String buildIncreaseVolume() {
        return new ProtocolBuilder().getaddVolumeCmd().setUserAgent(ProtocolBuilder.HAPPYCAST_AGENT).setContentLength("0").setUserLelinkSessionId(this.mSessionId).getString(true);
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String buildPause() {
        return new ProtocolBuilder().getPauseCmd().setContentLength("0").setUserAgent(this.mUserAgent).setUserLelinkSessionId(this.mSessionId).getString(true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:30:0x01a9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.hpplay.component.protocol.push.IPushHandler
    public java.lang.String buildPush(java.lang.String r19, com.hpplay.component.common.ParamsMap r20) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hpplay.component.protocol.push.LelinkPushHandler.buildPush(java.lang.String, com.hpplay.component.common.ParamsMap):java.lang.String");
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String buildResume() {
        return new ProtocolBuilder().getRecoverPlayCmd().setContentLength("0").setUserAgent(this.mUserAgent).setUserLelinkSessionId(this.mSessionId).getString(true);
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String buildSeekTo(int i10) {
        return String.format(new ProtocolBuilder().getSetPositionCmd().setContentLength("0").setUserAgent(ProtocolBuilder.MEDIACONTROL_AGENT).setUserLelinkSessionId(this.mSessionId).getString(true), Integer.valueOf(i10));
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String buildStopPlay() {
        CLog.i(TAG, "----------->" + this.mSessionId);
        return new ProtocolBuilder().getStopCmd().setContentLength("0").setUserAgent(ProtocolBuilder.MEDIACONTROL_AGENT).setUserLelinkSessionId(this.mSessionId).getString(true);
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String getReverseData() {
        return new ProtocolBuilder().getReverseCmd().setUpgradeKey(ProtocolBuilder.UPGRADE_PTTH).setConnectionKey("Upgrade").setApplePurposeKey("event").setContentLength("0").setUserAgent(ProtocolBuilder.MEDIACONTROL_AGENT).setUserLelinkSessionId(this.mSessionId).getString(true);
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public boolean parsePlayBackInfo(int i10, String str, ProtocolListener protocolListener) {
        if (str.contains("duration:") && str.contains("position:")) {
            try {
                String trim = str.substring(str.lastIndexOf(SOAP.DELIM) + 1).trim();
                String substring = str.substring(0, str.lastIndexOf("position"));
                String trim2 = substring.substring(substring.lastIndexOf(SOAP.DELIM) + 1).trim();
                if (protocolListener != null) {
                    protocolListener.onResult(i10, trim2, trim);
                }
                return true;
            } catch (Exception e10) {
                CLog.w(TAG, e10);
            }
        }
        return false;
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public synchronized void parseReversePlist(PushControllerImpl pushControllerImpl, String... strArr) {
        char c10;
        if (strArr != null) {
            String str = strArr[0];
            if (str != null) {
                CLog.d(TAG, str);
                if (str.contains(IPushHandler.SP)) {
                    return;
                }
                if (str.contains(IPushHandler.PHOTO_HIDE)) {
                    CLog.d(TAG, "on PHOTO_HIDE");
                    pushControllerImpl.disConnect();
                    return;
                }
                try {
                    NSDictionary nSDictionary = (NSDictionary) PropertyListParser.parse(str.getBytes());
                    if (nSDictionary != null) {
                        String str2 = "0";
                        String str3 = "0";
                        String str4 = "";
                        if (nSDictionary.containsKey(IPushHandler.KEY_URL_ID)) {
                            str4 = nSDictionary.objectForKey(IPushHandler.KEY_URL_ID).toString();
                        }
                        String upperFirstChar = upperFirstChar("duration");
                        String upperFirstChar2 = upperFirstChar("position");
                        if (nSDictionary.containsKey(upperFirstChar)) {
                            str2 = nSDictionary.objectForKey(upperFirstChar).toString();
                        }
                        if (nSDictionary.containsKey(upperFirstChar2)) {
                            str3 = nSDictionary.objectForKey(upperFirstChar2).toString();
                        }
                        try {
                            if (Integer.valueOf(str2).intValue() > 0 && Integer.valueOf(str3).intValue() > 0) {
                                CLog.d(TAG, "reverse to uiduration : " + str2 + "position : " + str3);
                                pushControllerImpl.eventCallback(17, str2, str3, str4);
                            }
                        } catch (Exception e10) {
                            CLog.w(TAG, e10);
                        }
                        if (nSDictionary.containsKey(IPushHandler.STOP_TYPE)) {
                            String obj = nSDictionary.objectForKey(IPushHandler.STOP_TYPE).toString();
                            if (TextUtils.equals(obj, IPushHandler.MEDIA_COMPLETION)) {
                                pushControllerImpl.disConnect();
                                pushControllerImpl.eventCallback(12, str4);
                                CLog.d(TAG, "on completion");
                                return;
                            } else if (TextUtils.equals(obj, IPushHandler.PHONE_VIDEO_HIDE)) {
                                CLog.d(TAG, "on stop");
                                pushControllerImpl.disConnect();
                                pushControllerImpl.eventCallback(7, str4);
                                return;
                            }
                        }
                        if (nSDictionary.containsKey(IPushHandler.STATE)) {
                            String obj2 = nSDictionary.objectForKey(IPushHandler.STATE).toString();
                            switch (obj2.hashCode()) {
                                case -1884319283:
                                    if (obj2.equals("stopped")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -995321554:
                                    if (obj2.equals("paused")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -493563858:
                                    if (obj2.equals("playing")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 96784904:
                                    if (obj2.equals("error")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 336650556:
                                    if (obj2.equals("loading")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            if (c10 != 0) {
                                if (c10 != 1) {
                                    if (c10 != 2) {
                                        if (c10 != 3) {
                                            if (c10 == 4) {
                                                CLog.d(TAG, MediaError.ERROR_TYPE_ERROR);
                                                pushControllerImpl.disConnect();
                                                pushControllerImpl.eventCallback(16, str4);
                                            }
                                        } else {
                                            pushControllerImpl.disConnect();
                                            CLog.d(TAG, "STOPPED ");
                                            pushControllerImpl.eventCallback(16, str4);
                                            CLog.d(TAG, "state on stop---------");
                                        }
                                    } else {
                                        CLog.d(TAG, "PAUSED ");
                                        if (this.isPlaying) {
                                            pushControllerImpl.eventCallback(15, str4);
                                        }
                                        this.isPlaying = false;
                                    }
                                } else {
                                    CLog.d(TAG, "LOADING");
                                    pushControllerImpl.eventCallback(14, str4);
                                }
                            } else {
                                if (!this.isPlaying) {
                                    this.isPlaying = true;
                                    pushControllerImpl.eventCallback(13, str4);
                                }
                                CLog.d(TAG, DLNAControllerImp.PLAYING);
                            }
                        }
                    }
                } catch (Exception e11) {
                    CLog.w(TAG, e11);
                }
            }
        }
    }

    @Override // com.hpplay.component.protocol.push.IPushHandler
    public String setVolume(int i10) {
        return null;
    }

    public String upperFirstChar(String str) {
        if (str != null && !"".equals(str)) {
            StringBuffer stringBuffer = new StringBuffer();
            char[] charArray = str.toCharArray();
            for (int i10 = 0; i10 < charArray.length; i10++) {
                if (i10 == 0) {
                    stringBuffer.append(String.valueOf(charArray[0]).toUpperCase());
                } else {
                    stringBuffer.append(charArray[i10]);
                }
            }
            return stringBuffer.toString();
        }
        return str;
    }
}
