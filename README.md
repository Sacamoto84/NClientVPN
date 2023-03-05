# NClientV2

Добавленна поддержка WireGuard ибо сайт является закрытым, настройки берем https://finevpn.org бот в телеге @FineVPNbot
Настройка клиента добавлена в насройках программы. Файл настроек кидаем в NClientV2\vpn\vpn.conf
при включении VPN и отсуствию файла, VPN работать не будет. Настройки принимаются после перезегрузки программы.
[Interface]

PrivateKey = 0FSuBk31SOpyZsJeGTKs4hwL3NssAoHsQlyucZU0024=

Address = 10.21.57.22

DNS = 1.1.1.1

[Peer]

PublicKey = 0pkNqlR6IREHG7nwT/YUqNWMScE6l/pn/ihuqH/VHyY=

AllowedIps = 0.0.0.0/0

Endpoint = se.wg.finevpn.org:993

PersistentKeepalive = 21


An unofficial NHentai Android Client.
This app  works for devices from API 14 (Android 4.0) and above.

Теперь минимально API 21 (Android 5.0)

Releases: <https://github.com/Dar9586/NClientV2/releases>

## API Features

- Browse main page
- Search by query or tags
- Include or exclude tags
- Blur or hide excluded tags
- Download manga
- Favorite galleries
- Enable PIN to access the app

## Custom feature

- Share galleries
- Open in browser
- Bookmark

## App Screen

Main page|Lateral menu
:-:|:-:
![Main page](https://raw.githubusercontent.com/Dar9586/NClientV2/master/fastlane/metadata/android/en-US/images/phoneScreenshots/img1.jpg)|![Lateral menu](https://media.discordapp.net/attachments/608725424092086280/720369411030253578/Screenshot_20200610-230229_NClientV2.jpg?width=360&height=658)
Search|Random manga
![Search](https://media.discordapp.net/attachments/608725424092086280/720369411030253578/Screenshot_20200610-230229_NClientV2.jpg?width=360&height=658)|![Random manga](https://raw.githubusercontent.com/Dar9586/NClientV2/master/fastlane/metadata/android/en-US/images/phoneScreenshots/img4.jpg)

## Libraries

- PersistentCookieJar ([License](https://github.com/franmontiel/PersistentCookieJar/blob/master/LICENSE.txt))
- OKHttp ([License](https://github.com/square/okhttp/blob/master/LICENSE.txt))
- multiline-collapsingtoolbar ([License](https://github.com/opacapp/multiline-collapsingtoolbar/blob/master/LICENSE))
- PhotoView ([License](https://github.com/chrisbanes/PhotoView/blob/master/LICENSE))
- JSoup ([License](https://github.com/jhy/jsoup/blob/master/LICENSE))
- ACRA ([License](https://github.com/ACRA/acra/blob/master/LICENSE))
- Glide ([License](https://github.com/bumptech/glide/blob/master/LICENSE))
