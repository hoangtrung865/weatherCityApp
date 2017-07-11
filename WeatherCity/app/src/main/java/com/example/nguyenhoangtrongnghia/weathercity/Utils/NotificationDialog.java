package com.example.nguyenhoangtrongnghia.weathercity.Utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.example.nguyenhoangtrongnghia.weathercity.R;

/**
 * Created by nguyenhoangtrongnghia on 7/11/17.
 */

public class NotificationDialog {
    private static final NotificationDialog instance = new NotificationDialog();

    public NotificationDialog() {
    }

    public static NotificationDialog getInstance() {
        return instance;
    }

    public static void show(Context context, String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(context.getString(R.string.c_btn_ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        dialog = null;
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public static void show(Context context, String title, String message,
                            boolean isHaveNegativeBtn, final NotificationDialogResponse response) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(context.getString(R.string.c_btn_ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        response.onOk();
                        dialog.dismiss();
                        dialog = null;
                    }
                });
        if (isHaveNegativeBtn) {
            builder.setNegativeButton(context.getString(R.string.c_btn_cancel), new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    response.onCancel();
                    dialog.dismiss();
                    dialog = null;
                }
            });
        }
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public interface NotificationDialogResponse {
        void onCancel();

        void onOk();
    }
}
