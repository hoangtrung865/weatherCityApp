package com.example.nguyenhoangtrongnghia.weathercity.Utils;

import android.content.Context;

import com.example.nguyenhoangtrongnghia.weathercity.R;

/**
 * Created by nguyenhoangtrongnghia on 7/11/17.
 */

public class Utils {
    /*
    * check connection
    * */
    public  static boolean checkNetwork(Context context) {
        if (!Connectivity.isConnectedOrConnecting(context)) {
            NotificationDialog.getInstance().show(context,"",
                    context.getResources().getString(R.string.c_dialog_message_no_network));
            return false;
        }
        return true;
    }
}
