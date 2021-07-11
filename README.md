# PoC For Intent Redirect Issue

This is PoC to demontrate the issue described by Snyk in this article : https://snyk.io/blog/exploring-android-intent-based-security-vulnerabilities-google-play/

## Target App
The target application used for this PoC is https://github.com/t0thkr1s/allsafe :
* The vulnerable Activity (TargetProxyActivity) https://github.com/t0thkr1s/allsafe/blob/master/app/src/main/java/infosecadventures/allsafe/ProxyActivity.java
* The FileProvider : https://github.com/t0thkr1s/allsafe/blob/master/app/src/main/AndroidManifest.xml#L82

## The malicious App :
In the PoC we have 2 main component :
* EvilActivity : https://github.com/TmmmmmR/PoC_Intent-Redirect/blob/master/app/src/main/java/com/attacker/application/MainActivity.java#L31
* AccessProviderActivity : https://github.com/TmmmmmR/PoC_Intent-Redirect/blob/master/app/src/main/java/com/attacker/application/AccessProviderActivity.java#L28
* 
