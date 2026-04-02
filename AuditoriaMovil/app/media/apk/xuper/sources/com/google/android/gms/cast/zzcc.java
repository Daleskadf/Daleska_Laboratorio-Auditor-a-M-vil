package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzcc implements Parcelable.Creator<MediaQueueContainerMetadata> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaQueueContainerMetadata createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        double d10 = 0.0d;
        int i10 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 2) {
                if (fieldId != 3) {
                    if (fieldId != 4) {
                        if (fieldId != 5) {
                            if (fieldId != 6) {
                                SafeParcelReader.skipUnknownField(parcel, readHeader);
                            } else {
                                d10 = SafeParcelReader.readDouble(parcel, readHeader);
                            }
                        } else {
                            arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, WebImage.CREATOR);
                        }
                    } else {
                        arrayList = SafeParcelReader.createTypedList(parcel, readHeader, MediaMetadata.CREATOR);
                    }
                } else {
                    str = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                i10 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new MediaQueueContainerMetadata(i10, str, arrayList, arrayList2, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaQueueContainerMetadata[] newArray(int i10) {
        return new MediaQueueContainerMetadata[i10];
    }
}
