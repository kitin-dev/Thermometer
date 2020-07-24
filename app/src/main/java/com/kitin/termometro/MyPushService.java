package com.kitin.termometro;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import com.huawei.hms.push.HmsMessageService;

public class MyPushService extends HmsMessageService {
    private static final String TAG = "PushDemoLog";
    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.i(TAG, "receive token:" + token);
    /*  Toast.makeText(MyPushService.this, token, Toast.LENGTH_SHORT).show();
       Intent send = new Intent(Intent.ACTION_SENDTO);
        String uriText = "mailto:" + Uri.encode("kitincuevas@gmail.com") +
                "?subject=" + Uri.encode("TOKEN ") +
                "&body=" + Uri.encode(token);
        Uri uri2 = Uri.parse(uriText);
        send.setData(uri2);
        startActivity(Intent.createChooser(send, "Enviar Email..."));
        */
    }
}
