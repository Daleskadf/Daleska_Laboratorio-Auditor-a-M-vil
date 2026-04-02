package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f604a;

    /* renamed from: b  reason: collision with root package name */
    public final float f605b;

    /* renamed from: c  reason: collision with root package name */
    public Object f606c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    public RatingCompat(int i10, float f10) {
        this.f604a = i10;
        this.f605b = f10;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = b(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = e(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = d(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = c(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = f(ratingStyle);
            }
            ratingCompat.f606c = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat b(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return new RatingCompat(1, f10);
    }

    public static RatingCompat c(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new RatingCompat(6, f10);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat d(int i10, float f10) {
        float f11;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                    return null;
                }
                f11 = 5.0f;
            } else {
                f11 = 4.0f;
            }
        } else {
            f11 = 3.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new RatingCompat(i10, f10);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat e(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return new RatingCompat(2, f10);
    }

    public static RatingCompat f(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i10, -1.0f);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f604a;
    }

    public String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f604a);
        sb.append(" rating=");
        float f10 = this.f605b;
        if (f10 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f10);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f604a);
        parcel.writeFloat(this.f605b);
    }
}
