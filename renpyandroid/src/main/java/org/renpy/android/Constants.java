package org.renpy.android;

public class Constants {
    // Used by the google play store.
    public static String PLAY_BASE64_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv3JnsHstHYwtZx7I9/VYXiAygGciiga1gIe9haRutNrBPgEU/MXvZGVIDmni1wl/gJJOTaTRliAJDNYMsB5qx84mxtCQFHp//nagcRbtSOyPrsEXnjMe7hcW0FVjhe9gzHI4zDY9RSyXwH1poyqX1c6T/KL3Bm8zXjTn5LEB25/IG3W/Ac8JpdEo3HyPB03bbRfld7D6fmReBXZXincLgx/NhvzWDzs9fPpQUwH/kHHOSK8oVP3nW0Tc7gDmCEIdbXci7Ca6OJu5tdTGFNTzUud+QkebwvEcOW0UteBE1+9WCpQPVaVI/3aLXPYP7OoQjJZTN67Mh/wlrf6ub5wnjQIDAQAB";
    public static byte[] PLAY_SALT = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

    // Used by the expansion downloader.
    public static int fileVersion = 113;
    public static int fileSize = 802002691;

    // Used by the in-app purchasing code.
    public static String store = "play";
}