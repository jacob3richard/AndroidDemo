package com.example.richardje1.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by richardje1 on 2/11/17.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        //this creates a unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


    public UUID getId() {
        return mId;
    }

    public Date getDate(){
        return mDate;
    }

    public void setDate(Date date){
        mDate = date;
    }

    public boolean isSolved(){
        return mSolved;
    }

    public void setSolved(boolean solved){
        mSolved = solved;
    }

    @Override
    public String toString(){
        return mTitle;
    }
}
