# Hamza Arshad - Profile App

A minimal Android app that opens my profile website (https://thehamzaarshad.github.io) inside a full-screen WebView.

## What it does
- Loads the website in a WebView with JavaScript and DOM storage enabled.
- The Back button goes to the previous page in the site; at the first page it closes the app.
- Links stay inside the app.

## Why it is needed
Gives the website an app-like launcher icon on the phone, so it opens in one tap without a browser, address bar or tabs. It always shows the latest version of the site, so nothing needs to be updated in the app when the website changes.

## Install
1. Download `profileapp.apk` from the Releases page.
2. Install it. If Play Protect warns, choose to install anyway or turn off app scanning temporarily.
3. Open **Hamza Arshad** from the app drawer.

## Permissions
Only INTERNET. No data is collected.

## Requirements
The device needs an internet connection and a WebView (built into Android).

## Build
Built manually in Termux with aapt2, ecj, dx and apksigner (Java, no Gradle). The release APK is debug-signed.
