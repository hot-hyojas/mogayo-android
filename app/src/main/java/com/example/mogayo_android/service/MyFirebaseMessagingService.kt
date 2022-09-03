package com.example.mogayo_android.service

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.media.RingtoneManager
import android.os.Build
import androidx.core.app.NotificationCompat
import com.example.mogayo_android.R
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
//            val currentTitle = remoteMessage!!.data["title"]
//            val prefNotice = this.getSharedPreferences("lastTitle", Context.MODE_PRIVATE)
//            val lastTitle = prefNotice.getString("lastTitle", "null")

//            if(currentTitle != lastTitle){
//                if(remoteMessage.data.isNotEmpty()){
//                    sendNotification(remoteMessage)
//                }
//
//                val editor = prefNotice.edit()
//                editor.putString("lastTitle", remoteMessage.data["title"]).apply()
//                editor.commit()
//            }
        sendNotification(remoteMessage)
    }

    private fun sendNotification(remoteMessage: RemoteMessage) {
        val uniId: Int = (System.currentTimeMillis() / 7).toInt()
        //val intent = Intent(this, WebViewActivity::class.java)
        //intent.putExtra("url", remoteMessage.data["url"])
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
       // val pendingIntent = PendingIntent.getActivity(this, uniId, intent, PendingIntent.FLAG_IMMUTABLE)

        val channelId = "test"
        val soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

        val notificationBuilder = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(remoteMessage.data["body"])
            .setContentText(remoteMessage.data["title"])
            .setAutoCancel(true)
            .setSound(soundUri)
           // .setContentIntent(pendingIntent)

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(channelId, "UNITHON", NotificationManager.IMPORTANCE_DEFAULT)
            notificationManager.createNotificationChannel(channel)
        }

        notificationManager.notify(uniId, notificationBuilder.build())
    }
}
