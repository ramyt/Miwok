package com.example.android.miwok;

import java.text.NumberFormat;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int mediaResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String miwokTranslation, String defaultTranslation, int mediaResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.mediaResourceId = mediaResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int mediaResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = imageResourceId;
        this.mediaResourceId = mediaResourceId;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getMediaResourceId() {
        return mediaResourceId;
    }

    public boolean hasImage() {
            return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
