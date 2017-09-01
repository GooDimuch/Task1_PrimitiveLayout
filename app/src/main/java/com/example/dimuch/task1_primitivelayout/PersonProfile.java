package com.example.dimuch.task1_primitivelayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dimuch on 01.09.2017.
 */

public class PersonProfile {

    private String sPersonName = "Элвис Пресли";
    private Boolean bPersonStatus = true;
    private String sPersonCity = "Каламазу";
    private int iPersonOld = 42;
    private String sPersonOld = sPersonCity + ", " + String.valueOf(iPersonOld) + " года";
    private int iPersonNumberAllFriends = 372;
    private String sPersonAllFriends = "друга";
    private int iPersonNumberCommonFriends = 13;
    private String sPersonCommonFriends = "общих";
    private int iPersonNumberSubscribers = 345;
    private String sPersonSubscribers = "подписчиков";
    private int iPersonNumberPhotos = 802;
    private String sPersonPhotos = "фото";
    private int iPersonNumberVideos = 212;
    private String sPersonVideos = "видео";
    private int iPersonNumberAudios = 1055;
    private String sPersonAudios = "аудио";
    private List<Integer> lIdPhotos;

    public PersonProfile() {
        lIdPhotos = new ArrayList<>();
        lIdPhotos.add(R.drawable.a1);
        lIdPhotos.add(R.drawable.a2);
        lIdPhotos.add(R.drawable.a3);
        lIdPhotos.add(R.drawable.a1);
        lIdPhotos.add(R.drawable.a2);
        lIdPhotos.add(R.drawable.a3);
        lIdPhotos.add(R.drawable.a3);
        lIdPhotos.add(R.drawable.a2);
        lIdPhotos.add(R.drawable.a3);
        lIdPhotos.add(R.drawable.a2);
        lIdPhotos.add(R.drawable.a1);
    }

    public List<Integer> getlIdPhotos() {
        return lIdPhotos;
    }

    public String getsPersonName() {
        return sPersonName;
    }

    public String getsPersonStatus() {
        return bPersonStatus ? "Онлайн" : "Оффлайн";
    }

    public String getsPersonOld() {
        return sPersonOld;
    }

    public String getsPersonNumberAllFriends() {
        return String.valueOf(iPersonNumberAllFriends);
    }

    public String getsPersonAllFriends() {
        return sPersonAllFriends;
    }

    public String getsPersonNumberCommonFriends() {
        return String.valueOf(iPersonNumberCommonFriends);
    }

    public String getsPersonCommonFriends() {
        return sPersonCommonFriends;
    }

    public String getsPersonNumberSubscribers() {
        return String.valueOf(iPersonNumberSubscribers);
    }

    public String getsPersonSubscribers() {
        return sPersonSubscribers;
    }

    public String getsPersonNumberPhotos() {
        return String.valueOf(iPersonNumberPhotos);
    }

    public String getsPersonPhotos() {
        return sPersonPhotos;
    }

    public String getsPersonNumberVideos() {
        return String.valueOf(iPersonNumberVideos);
    }

    public String getsPersonVideos() {
        return sPersonVideos;
    }

    public String getsPersonNumberAudios() {
        return String.valueOf(iPersonNumberAudios);
    }

    public String getsPersonAudios() {
        return sPersonAudios;
    }
}
