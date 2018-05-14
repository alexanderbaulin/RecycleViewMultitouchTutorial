package com.example.alex.recycleviewmultitouchtutorial;

import android.os.Parcel;
import android.os.Parcelable;


public class Information implements Parcelable {
    boolean isSelected;
    String time, days;
    Information(String periodOfTime, String daysOfWeeks) {
        time = periodOfTime;
        days = daysOfWeeks;

    }

    private Information(Parcel in) {
       // isSelected = in.readByte() != 0;
        time = in.readString();
        days = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(time);
        dest.writeString(days);
    }

    public static final Creator<Information> CREATOR = new Creator<Information>() {
        @Override
        public Information createFromParcel(Parcel in) {
            return new Information(in);
        }

        @Override
        public Information[] newArray(int size) {
            return new Information[size];
        }
    };
}
