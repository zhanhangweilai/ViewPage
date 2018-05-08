package com.example.lh.viewpagerdemo;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * Created by lihang on 18-4-25.
 */

public class MyParcelable implements Parcelable {
    private int age;
    private int id;
    public MyParcelable () {

    }

    protected MyParcelable (Parcel source) {
        age = source.readInt();
        id = source.readInt();
        Log.i("lihang1","age = "+age);
    }
    @Override
    public int describeContents() {
        Log.i("lihang","describeContents");
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        Log.i("lihang","writeToParcel");
        dest.writeInt(2);
        dest.writeInt(3);

    }

    public static final Creator<MyParcelable> CREATOR = new Creator<MyParcelable>() {
        @Override
        public MyParcelable createFromParcel(Parcel source) {
            Log.i("lihang","createFromParcel");
            return new MyParcelable(source);
        }

        @Override
        public MyParcelable[] newArray(int size) {
            Log.i("lihang","newArray");
            return new MyParcelable[size];
        }
    };

    @Override
    public String toString() {
        Log.i("lihang","toString()");
        return "age="+age+" id="+id;
    }
}
