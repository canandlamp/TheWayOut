/*
This software is released "AS IS,"
with no claims whatsoever,
TO THE PUBLIC DOMAIN.

The author intends this software NEVER,
neither in whole nor in part,
neither directly nor indirectly,
BRING HARM TO ANY living being.
*/

package canandlamp.thewayout;

import android.app.*;
import android.os.*;
import android.content.*;
import android.net.*;
import android.widget.*;

public class MainActivity extends Activity {

 private Intent intent;
 private final String webAddress = "twelvetribes.org/publication/way-out";

 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  intent = new Intent(
   Intent.ACTION_VIEW,
   Uri.parse(
    "http://" + webAddress
   )
  );
  if (intent.resolveActivity(getPackageManager()) == null) {
   Toast.makeText(
    getApplicationContext(),
    "              no app found to view:\n\"" + webAddress + "\"",
    Toast.LENGTH_LONG
   ).show();
  } else {
   Toast.makeText(
    getApplicationContext(),
    "                 attempting to view:\n\"" + webAddress + "\"",
    Toast.LENGTH_LONG
   ).show();
   startActivity(intent);
  };
  finish();
 }

}