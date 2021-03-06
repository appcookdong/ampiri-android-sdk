[中文](localization/zh/README.md) - [Português](localization/pt/README.md)

# Integração do Ampiri SDK

Turbine o faturamento do seu app e poupe tempo: crie uma conta em [Ampiri.com](https://ampiri.com)

## Conteúdo

* [Suporte Ampiri](#suporte-ampiri)
* [Suporte Para Redes e Tipos de Anúncios](#suporte-para-redes-e-tipos-de-anúncios)
* [Requisitos e Dependências](#requisitos-e-dependências)
* [Adicione o Ampiri SDK e Outras Redes ao seu Projeto](#adicione-o-ampiri-sdk-e-outras-redes-ao-seu-projeto)
* [Atualize seu Android Manifest](#atualize-seu-android-manifest)
* [Banner](#banner)
* [Intersticial](#intersticial)
* [Vídeo](#vídeo)
* [Templates Nativo e In-Feed](#templates-nativo-e-in-feed)
* [Manipulação de Eventos (Callbacks)](#manipulação-de-eventos-(callbacks))
* [Manuseamento de eventos de ciclo de vida útil da atividade](#manuseamento-de-eventos-de-ciclo-de-vida-útil-da-atividade)
* [Demo App / Testes](#demo-app-/-testes)

## Suporte Ampiri ##

Documentos adicionais sobre a integração do Ampiri SDK com o seu Android app pode ser encontrado clicando nos links.

- [Tutoriais Ampiri.com](http://www.ampiri.com/tutorials/) - Tutoriais Ampiri
- [Guia do desenvolvedor](https://ampiri.zendesk.com/hc/en-us/articles/213857245-Publisher-s-Self-Serve-UI-User-Guide) - Guia do desenvolvedor
- [Começando com Ampiri SDK Android](https://ampiri.zendesk.com/hc/en-us/articles/213431769-Ampiri-SDK-Android-Quickstart) - Integração Básica
- [Manual de Integração Ampiri SDK Android](https://ampiri.zendesk.com/hc/en-us/articles/115000510445-Ampiri-SDK-Android-Integration-Manual) - Manual de Integração Ampiri SDK
- [Zendesk Support](https://ampiri.zendesk.com/hc/en-us) - Suporte e FAQ

## Suporte Para Redes e Tipos de Anúncios ##

Ampiri suporta as seguintes redes de anúncio do lado do cliente:

Para mostrar anúncio de *banner padrão*:

| Especificação | Rede | Versão |
|----------|----------|----------|
|`ampiri-sdk-mediation-admob`|[Google Mobile Ads](https://developers.google.com/admob/android/quick-start)|v10.2.1, API 14: Android 4.0 (Ice Cream Sandwich)|
|`ampiri-sdk-mediation-mopub`|[MoPub](https://github.com/mopub/mopub-android-sdk)|v4.13.0, API 16: Android 4.1 (JELLY_BEAN)|
|`ampiri-sdk-mediation-facebook`| [Facebook Audience](https://developers.facebook.com/docs/audience-network)|v4.20.0, API 15: Android 4.0.3 (ICE_CREAM_SANDWICH_MR1)|
|`ampiri-sdk-mediation-inlocomedia`| [InLocoMedia](http://docs.inlocomedia.com)| v2.5.0, API 14: Android 4.0 (ICE_CREAM_SANDWICH)|

Para mostrar anúncio *intersticial*:

| Especificação | Rede | Versão |
|----------|----------|----------|
|`ampiri-sdk-mediation-admob`|[Google Mobile Ads](https://developers.google.com/admob/android/quick-start)|v10.2.1, API 14: Android 4.0 (Ice Cream Sandwich)|
|`ampiri-sdk-mediation-mopub`|[MoPub](https://github.com/mopub/mopub-android-sdk)|v4.13.0, API 16: Android 4.1 (JELLY_BEAN)|
|`ampiri-sdk-mediation-chartboost`|[Chartboost](https://answers.chartboost.com/hc/en-us/articles/201219545-Download-Integrate-the-Chartboost-SDK-for-Android)|v6.6.2, API 14: Android 4.0 (Ice Cream Sandwich)|
|`ampiri-sdk-mediation-facebook`|[Facebook Audience](https://developers.facebook.com/docs/audience-network)|v4.20.0, API 15: Android 4.0.3 (ICE_CREAM_SANDWICH_MR1)|
|`ampiri-sdk-mediation-nativex`|[NativeX](https://github.com/nativex/NativeX-Android-SDK)|v5.5.9, API 11: Android 3.0 (Honeycomb)|
|`ampiri-sdk-mediation-applovin`|[AppLovin](https://github.com/AppLovin/Android-Demo-App)|v6.4.2, API 9: Android 2.3 (Gingerbread)|
|`ampiri-sdk-mediation-inlocomedia`| [InLocoMedia](http://docs.inlocomedia.com)| v2.5.0, API 14: Android 4.0 (ICE_CREAM_SANDWICH)|

Para mostrar anúncio de *vídeo*:

| Especificação | Rede | Versão |
|----------|----------|----------|
|`ampiri-sdk-mediation-adcolony`|[AdColony](https://github.com/AdColony/AdColony-Android-SDK)|v2.3.6, API 14: Android 4.0 (Ice Cream Sandwich)|
|`ampiri-sdk-mediation-unityads`|[Unity Ads](https://github.com/Applifier/unity-ads-sdk)|v2.0.8, API 9: Android 2.3 (Gingerbread)|
|`ampiri-sdk-mediation-chartboost`|[Chartboost](https://answers.chartboost.com/hc/en-us/articles/201219545-Download-Integrate-the-Chartboost-SDK-for-Android)|v6.6.2, API 14: Android 4.0 (Ice Cream Sandwich)|
|`ampiri-sdk-mediation-nativex`|[NativeX](https://github.com/nativex/NativeX-Android-SDK)|v5.5.9, API 11: Android 3.0 (Honeycomb)|
|`ampiri-sdk-mediation-vungle`|[Vungle](https://v.vungle.com/sdk)|v4.0.3, API 14: Android 4.0 (Ice Cream Sandwich)|

Para mostrar anúncio *nativo*:

| Especificação | Rede | Versão |
|----------|----------|----------|
|`ampiri-sdk-mediation-admob`|[Google Mobile Ads](https://developers.google.com/admob/android/quick-start)|v10.2.1, API 14: Android 4.0 (Ice Cream Sandwich)|
|`ampiri-sdk-mediation-mopub`|[MoPub](https://github.com/mopub/mopub-android-sdk)|v4.13.0, API 16: Android 4.1 (JELLY_BEAN)|
|`ampiri-sdk-mediation-facebook`|[Facebook Audience](https://developers.facebook.com/docs/audience-network)|v4.20.0, API 15: Android 4.0.3 (ICE_CREAM_SANDWICH_MR1)|
|`ampiri-sdk-mediation-applovin`|[AppLovin](https://github.com/AppLovin/Android-Demo-App)|v6.4.2, API 9: Android 2.3 (Gingerbread)|
|`ampiri-sdk-mediation-baidu`|[Baidu](http://mssp.baidu.com/app/static/main.html#/sdk)|v5.6, API 8: Android 2.2 (Froyo)|
|`ampiri-sdk-mediation-inlocomedia`| [InLocoMedia](http://docs.inlocomedia.com)| v2.5.0, API 14: Android 4.0 (ICE_CREAM_SANDWICH)|

> Não podemos garantir um funcionamento estável do SDK se você usar outra versão destas bibliotecas.

Você precisa configurar cada rede de terceiro no site da Ampiri, caso contrário elas não irão ser usadas para mostrar anúncios.

## Requisitos e Dependências ##

* Android 2.3 (API Versão 9) ou superior
* support-annotations, v25.3.0
* support-v4, v25.3.0
* **Recomendado** Google Play Services 10.2.1

Recomendamos fortemente a compilação da sua app usando o **Google Play services**, de modo a utilizar o `Android Advertising ID`
em vez do `Device ID`, conforme requirido pela Google. A não utilização correta do `Android Advertising ID` poderá resultar na rejeição do seu pedido à Play Store.

>NOTA: Você precisa ter um **adUnitId** diferente para cada espaço de anúncio utilizado no seu app. Caso você use o mesmo ID para múltiplos anúncios ou IDs de teste/demonstração,
relatórios de error ocorrerão e não haverá pagamento. Por favor consulte o seu gestor de conta para obter mais informações.


## Adicione o Ampiri SDK e Outras Redes ao seu Projeto ##
O Ampiri SDK está disponível via:

1. jCenter AAR (**Recomendado**)
2. Zipped AAR

Adicione as linhas a seguir no seu _app_ módulo, arquivo `build.gradle`:
```
repositories {
  maven { url "http://ampiri.bintray.com/maven" }
}

dependencies {
  compile 'com.ampiri.sdk:ampiri-sdk:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-adcolony:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-admob:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-unityads:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-applovin:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-chartboost:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-facebook:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-inlocomedia:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-mopub:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-nativex:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-vungle:3.8.0'
  compile 'com.ampiri.sdk:ampiri-sdk-mediation-baidu:3.8.0'

  compile 'com.google.android.gms:play-services-ads:10.2.1'
}
```

### Inclua a biblioteca local .aar ###

Salve os arquivos `aar` no módulo _app_ na pasta `libs` (ex: `<project>/<app>/libs`)

Depois adicione as seguintes linhas no seu módulo _app_ arquivo `build.gradle`:
```
repositories {
  flatDir {
    dirs 'libs'
  }
}

dependencies {
  compile(name: 'ampiri-sdk', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-adcolony', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-admob', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-applovin', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-unityads', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-chartboost', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-facebook', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-inlocomedia', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-mopub', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-nativex', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-vungle', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mediation-baidu', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-mraid', version:'3.8.0', ext: 'aar')
  compile(name: 'ampiri-sdk-vast', version:'3.8.0', ext: 'aar')

  compile 'com.google.android.gms:play-services-ads:10.2.1'
  compile 'com.facebook.android:audience-network-sdk:4.20.0'
  compile('com.mopub:mopub-sdk-banner:4.13.0@aar') {
      transitive = true
  }
  compile('com.mopub:mopub-sdk-interstitial:4.13.0@aar') {
      transitive = true
  }
  compile('com.mopub:mopub-sdk-native-static:4.13.0@aar') {
        transitive = true
  }
  compile 'com.inlocomedia.android:android-sdk:2.5.0'
  compile 'com.google.code.gson:gson:2.8.0'
}
```

Então, adicione as linhas a seguir no seu módulo _app_ no arquivo `proguard-rules.pro`:

```
-keep class com.ampiri.** { *; }
-dontwarn com.ampiri.**
```

## Atualize seu Android Manifest ##

Sob o elemento principal `<manifest>`, adicione as seguintes permissões.
```xml
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
<uses-permission android:name="android.permission.READ_PHONE_STATE"/>
```

* ACCESS_COARSE_LOCATION (recomendado) – Garante a permissão SDK para acessar a localização aproximada com base na torre celular.
* ACCESS_FINE_LOCATION (recomendado) – Garante a permissão SDK para acessar uma localização mais exata com base no GPS.

Embora não seja tecnicamente necessário, as permissões de LOCALIZAÇÃO permitem ao SDK enviar informações com base na localização aos anunciantes. O envio de melhores
informações de localização originam geralmente uma melhor monetização.

* WRITE_EXTERNAL_STORAGE (opcional) – Permite ao SDK armazenar em cache todos os anúncios (criativos, estruturas personalizadas, etc.) na memória externa. Isto pode melhorar
o desempenho garantindo um fornecimento imediato de anúncios reduzindo o tráfego na rede usada pelo SDK mantendo armazenados em cache
os anúncios disponíveis mesmo após o usuário fechar a app.

* READ_PHONE_STATE (recomendado) – Permite ao SDK gerir as chamadas que interrompem a reprodução de vídeos.

> Quando se utiliza o SDK como um projeto de biblioteca, não é necessário se preocupar em fazer merging do AndroidManifest.xml ou com as configurações Proguard. Se encontrar problemas, certifique-se que `manifestmerger.enabled` está configurado para `true` em `project.properties`

Por favor veja a documentação do Android [aqui](https://developer.android.com/studio/build/shrink-code.html).

## Banner ##
Adicione um banner no arquivo de layout, ex:
```xml
<FrameLayout
    android:id="@+id/ad_view"
    android:layout_width="320dp"
    android:layout_height="50dp"
    android:background="@android:color/white"/>
```

Recomenda-se que o tamanho do banner no layout seja o mesmo do requerido (ver abaixo). Caso contrário, o banner podee ser visualizado incorretamente.

Adicione o seguinte código a sua atividade:
```java
FrameLayout adView = (FrameLayout) view.findViewById(R.id.ad_view);
StandardAd standardAd = new StandardAd(this, adView, "YOUR_STANDARD_AD_UNIT_ID", BannerSize.BANNER_SIZE_320x50, adListener);
standardAd.loadAd();
```

Banners `320*50` são servidos por padrão. Tamanhos disponíveis:

* 320x50
* 728x90

### Auto atualização do banner padrão

Você pode ligar ou desligar a função de auto atualização do banner; para efetuar esta ação, chame o método `setAutorefreshEnabled()`, ex:

```java
standardAd.setAutorefreshEnabled(false);
```

Por padrão, a auto atualização está ligada. O período de auto atualização é configurado no painel de administração.

A partir da versão 3.4, a interface do SDK inclui o método `showAd()`. É altamente recomendável chamar este método depois do banner padrão estar visível, pois isso
vai disparar um evento do tipo impressão.

## Intersticial ##

> Nota: Todas as chamadas do método SDK devem ser efetuadas a partir da Main thread (Main thread, UI thread).

### Inicialização de anúncio intersticial

Adicione o seguinte código à sua atividade:
```java
InterstitialAd interstitialAd = new InterstitialAd(this, "YOUR_INTERSTITIAL_AD_UNIT_ID", adListener);
interstitialAd.loadAd();
```

Após ativar o método `loadAd()`, inicia-se o download do intersticial. Se chamar novamente `loadAd()` antes do banner ser completamente servido, o processamento do pedido anterior é cancelado. Neste caso, apenas será processado o último pedido.

Quando o download do banner estiver concluído, você pode exibir o banner chamando o método `showAd()`.
```java
interstitialAd.showAd();
```

Para mais informações sobre a conclusão de download e como subscrever os eventos do banner (veja em [Manipulação de Eventos (Callbacks)](#Manipulação-de-Eventos-(Callbacks))) ou chame o método `isReady()`.
```java
interstitialAd.isReady();
```

Se o fluxo da sua aplicação permitir mostrar os banners em tela cheia em qualquer momento e em qualquer lugar, existem 2 formas adicionais para fazer isso logo após o carregamento ser finalizado ou com um atraso personalizado após a chamada do método.

Para carregar e mostrar o banner em tela cheia logo após ter sido carregado, use:
```java
interstitialAd.loadAndShow()
```

Para carregar e mostrar o banner em tela cheia com um atraso personalizado após a chamada do método, use:
```java
interstitialAd.loadAndShowWithDelay()
```

O intervalo de atraso é especificado via Admin UI.

Se deseja ter controle total em relação a quando e onde mostrar os banners em tela cheia, deve realizar os seguintes passos:

1. Chame `interstitialAd.loadAd()` antecipadamente
2. Configure `AdEventCallback` para manipular os eventos do banner
3. Quando quiser mostar o banner, verifique se está pronto e mostre: `if (interstitialAd.isReady()) interstitialAd.showAd()`
4. Inicie o carregamento do banner seguinte no manipulador de eventos `onAdClosed()` do `AdEventCallback`


## Vídeo ##

> Nota: Todas as chamadas do método SDK devem ser efetuadas a partir da Main thread (Main thread, UI thread).

### Inicialização de anúncio em vídeo

Adicione o seguinte código à sua atividade:
```java
VideoAd videoAd = new VideoAd(this, "YOUR_VIDEO_AD_UNIT_ID", adListener);
videoAd.loadAd();
```

O botão *Fechar* é suportado apenas por algumas redes de anúncios. Para habilitar este botão você deve adicionar um parâmetro booleano no construtor do anúncio de vídeo:
```java
VideoAd videoAd = new VideoAd(this, "YOUR_VIDEO_AD_UNIT_ID", closeButtonEnabled);
ou
VideoAd videoAd = new VideoAd(this, "YOUR_VIDEO_AD_UNIT_ID", closeButtonEnabled, adListener);
```

Após chamar o método `loadAd()`, inicia-se o download do vídeo. Se chamar novamente `loadAd()` antes de iniciar a visualização do vídeo, a nova chamada será cancelada. Será apenas aceita a primeira chamada realizada.

Quando o download do vídeo estiver concluído, para exibir deve-se chamar o método `showAd()`.
```java
videoAd.showAd();
```

Para mais informações sobre a conclusão do download e como subscrever aos eventos do banner de vídeo (veja [[Manipulação de Eventos (Callbacks)](#Manipulação-de-Eventos-(Callbacks))) ou chame o método `isReady()`.
```java
videoAd.isReady();
```

## Templates Nativo e In-Feed ##

> Nota: Todas as chamadas do método SDK devem ser efetuadas a partir da Main thread (Main thread, UI thread).

Os anúncios nativos são carregados através da classe `NativeAd`, a qual possui a sua própria classe `Builder` para personalizar durante a criação:
```java
NativeAd nativeAd = new NativeAd.Builder()
  .setAdUnitId(YOUR_NATIVE_AD_UNIT_ID)
  .setCallback(adListener)
  .build(this);
```

Para mostrar os anúncios nativos, pode-se utilizar dois métodos:

* Crie uma view de anúncio de forma programática a partir do template e adicione-o no tela.
* Adicione a view `NativeAdView` no layout e vincule os dados carregados a esta view.

### Templates

O Ampiri SDK permite 3 tipos de templates para anúncios nativos:

* FeedCardNativeAdView - Icon, title, description, star rating, and CTA button
* StoryCardNativeAdView - Icon, image, title, description, star rating, and CTA button
* VideoCardNativeAdView - Icon, image/video/carousel, title, description, star rating, and CTA button

* FeedCardNativeAdView - Ícone, título, descrição, classificação por estrelas e botão CTA
* StoryCardNativeAdView - Ícone, imagem, ícone, título, descrição, classificação por estrelas e botão CTA
* VideoCardNativeAdView - Ícone, imagem/vídeo/carrossel, título, descrição, classificação por estrelas e botão CTA

> Todos os templates incluem uma indicação clara do tipo do anúncio. Por exemplo, "Ad" ou "Sponsored".

Se quiser usar um destes templates, você pode adicionar o template selecionado na criação do `NativeAd`:
```java
.setAdViewBuilder(FeedCardNativeAdView.BUILDER);
```

Adicione o layout básico customizado e nativo, ex:
``` xml
  <FrameLayout
    android:id="@+id/ad_container"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:visibility="gone"/>
```

Após chamar o método `loadAd()`, inicia-se a transferência do anúncio. Se chamar novamente `loadAd()` antes do banner ser totalmente servido, o novo pedido será
ignorado. Neste caso, apenas será processado o último pedido.

Quando a transferência do banner estiver concluída, pode-se visualizar o banner chamando o método `renderAdView()`.

```java
adContainerView = (FrameLayout) view.findViewById(R.id.ad_container);

@Override
public void onAdLoaded() {
  adContainerView.setVisibility(View.VISIBLE);
  adContainerView.removeAllViews();
  adContainerView.addView(nativeAd.renderAdView());
}
```

### Crie UI nativa

Para criar anúncios customizados nativos, é necessário efetuar os seguintes passos:

* Crie todas as views necessárias (ícone view, view da imagem principal, views de texto, barra de classificação, etc...)
* Transfira as views para o nosso SDK

Pode-se criar as suas views personalizadas numa configuração `.xml` ou pode-se adicionar elementos ao código.

> Todas as visualizações devem ser colocadas num nó sucessor; este nó sucessor deve ser colocado em `NativeAdView`.

Layout customizado `.xml`. Por exemplo:
``` xml
<com.ampiri.sdk.banner.NativeAdView android:id="@+id/native_ad"
 ...>
    <RelativeLayout ...>
        <ImageView android:id="@+id/native_ad_icon"
          ... />
        <ImageView android:id="@+id/native_ad_cover_image"
          ... />
        <FrameLayout android:id="@+id/native_ad_media_container"
          ... />
        <TextView android:id="@+id/native_ad_title"
          ... />
        <TextView android:id="@+id/native_ad_text"
          ... />
        <RatingBar android:id="@+id/native_ad_star_rating"
          ... />
        <Button android:id="@+id/native_ad_call_to_action"
          ... />
        <TextView android:id="@+id/native_ad_attribution"
          ... />
        <ImageView android:id="@+id/native_ad_choices_icon"
          android:layout_width="40dp"
          android:layout_height="40dp"
          android:padding="10dp"
          ... />
        <FrameLayout
          android:id="@+id/native_ad_choices_container"
          android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:minHeight="20dp"
          android:minWidth="20dp"
          ... />
    </RelativeLayout>
</com.ampiri.sdk.banner.NativeAdView>
```


Após ter criado todas as views, por favor continue passando as views para o nosso SDK. Por exemplo:
```java
  adView = (NativeAdView) view.findViewById(R.id.native_ad);

  adView.setIconView(R.id.native_ad_icon);
  adView.setCoverImageView(R.id.native_ad_cover_image);
  adView.setMediaContainerView(R.id.native_ad_media_container);
  adView.setTextView(R.id.native_ad_text);
  adView.setTitleView(R.id.native_ad_title);
  adView.setCallToActionView(R.id.native_ad_call_to_action);
  adView.setStarRatingView(R.id.native_ad_star_rating);
  adView.setAdAttributionView(R.id.native_ad_attribution);
  adView.setAdChoiceIconView(R.id.native_ad_choices_icon);
  adView.setAdChoiceContainerView(R.id.native_ad_choices_container);
```

Registrando a visualização do anúncio nativo na criação do `NativeAd`:
```java
.setAdView(adView);
```
Após chamar o método `loadAd()`, inicia-se o download do anúncio. Caso chame novamente `loadAd()` antes do banner ter sido totalmente enviado, o processamento do novo pedido
será ignorado. Neste caso, apenas será processado o último pedido.

Quando a transferência do banner estiver concluída, pode-se visualizar o banner chamando o método `showAd()`.

Para mais informações sobre a conclusão do download e subscrever os eventos de anúncio (veja [Manipulação de Eventos (Callbacks)](#Manipulação-de-Eventos-(Callbacks))) ou chame o método `isReady()`.

```java
nativeAd.isReady();
```

### Customize anúncios nativos

Com um template nativo, você pode customizar os seguintes elementos:

* Título
    * Fonte do texto (DEFAULT, DEFAULT_BOLD, MONOSPACE, SANS_SERIF, SERIF)
    * Tamanho do texto
    * Cor do texto
    * Máximo ems (25 por padrão)
* Ícone
    * Dimensões(width, height)
    * Margens (left, right)
* Star rating (Estrelas para pontuação)
  * Tamanho (SMALL, MEDIUM, LARGE)
* Label
  * Texto padrão
  * Fonte do texto (DEFAULT, DEFAULT_BOLD, MONOSPACE, SANS_SERIF, SERIF)
  * Tamanho do texto
  * Cor do texto
* Imagem da capa
    * Cor de fundo
    * Conteúdo do fundo
    * Margem (left, right, bottom, top)
    * Alinhamento (undefine, top, bottom, left, right, center, center_vertical, center_horizontal
* Descrição
    * Fonte do texto (DEFAULT, DEFAULT_BOLD, MONOSPACE, SANS_SERIF, SERIF)
    * Tamanho do texto
    * Cor do texto
    * Margem (left, right)
    * Máximo ems (100 por padrão)
* Chamada do botão de ação
    * Texto padrão
    * Fonte do texto (DEFAULT, DEFAULT_BOLD, MONOSPACE, SANS_SERIF, SERIF)
    * Tamanho do texto
    * Cor do texto
    * Máximo ems (25 por padrão)
    * Cor de fundo
    * Conteúdo do fundo
    * Margem (left, right)

Para customizar estes elementos, você vai precisar criar um objeto com atributos e passar o seguinte código na criação do `NativeAd`:
```java
.setAdUnitId(AD_UNIT_ID)
.setAdViewBuilder(StoryCardNativeAdView.BUILDER)
.setAdViewAttributes(new NativeAdView.Attributes(this)
    .setTitle(new NativeAdView.Attributes.Setter<NativeAdView.Attributes.Title>() {
        @Override
        public NativeAdView.Attributes.Title set(@NonNull NativeAdView.Attributes.Title builder) {
            return builder
                    .setTextFont(Typeface.MONOSPACE)
                    .setTextColor(Color.RED)
                    .setMaxEms(20);
        }
    })
    .setStarRating(new NativeAdView.Attributes.Setter<NativeAdView.Attributes.StarRating>() {
        @Override
        public NativeAdView.Attributes.StarRating set(@NonNull NativeAdView.Attributes.StarRating builder) {
            return builder.setStarSize(Size.MEDIUM);
            }
        })
    .setAdAttribution(new NativeAdView.Attributes.Setter<NativeAdView.Attributes.AdAttribution>() {
        @Override
        public NativeAdView.Attributes.AdAttribution set(@NonNull final NativeAdView.Attributes.AdAttribution adAttribution) {
            return adAttribution.setDefaultText(R.string.sponsored);
        }
}))
```

Também, você pode definir o estilo do seu `NativeAdView` layout usando os seguintes atributos:

| Nome do Atributo | Formato | Descrição |
|---|---|---|
| `Title` |
| ampiriTitleTextFont | DEFAULT, DEFAULT_BOLD, MONOSPACE, SANS_SERIF, SERIF | Fonte do texto do título |
| ampiriTitleTextSize | reference,dimension | Tamanho do texto do título |
| ampiriTitleTextColor | reference,color | Cor do texto do título |
| ampiriTitleTextMaxLengthEms | integer | Máximo ems do texto do título|
| `Icon` |
| ampiriIconWidth | reference,dimension | Largura do ícone |
| ampiriIconHeight | reference,dimension | Altura do ícone|
| ampiriIconMarginLeft | reference,dimension | Margem esquerda do ícone |
| ampiriIconMarginRight | reference,dimension | Margem direita do ícone |
| `Star Rating` |
| ampiriStarRatingSize | SMALL, MEDIUM, LARGE | Tamanho da barra de estrelas. SMALL - 10dp para altura e largura, MEDIUM - 16dp, LARGE - 22dp |
| `Ad Attribution` |
| ampiriAdAttributionTextFont | DEFAULT, DEFAULT_BOLD, MONOSPACE, SANS_SERIF, SERIF | Fonte do texto do label de atribuição |
| ampiriAdAttributionTextSize | reference,dimension | Tamanho do texto do label de atribuição |
| ampiriAdAttributionTextColor | reference,color | Cor do texto do label de atribuição|
| ampiriAdAttributionDefaultText | reference,string | Padrão do texto do label de atribuição |
| `Cover Image` |
| ampiriCoverImageBackgroundColor | reference,color | Cor do fundo da imagem da capa |
| ampiriCoverImageBackgroundResource | reference | Conteúdo do fundo da imagem da capa |
| ampiriCoverImageMarginLeft | reference,dimension | Margem esquerda da imagem da capa|
| ampiriCoverImageMarginRight | reference,dimension | Margem direita da imagem da capa|
| ampiriCoverImageMarginTop | reference,dimension | Margem de cima da imagem da capa |
| ampiriCoverImageMarginBottom | reference,dimension | Margem de baixo da imagem da capa |
| ampiriCoverImageAlignment | undefine, top, bottom, left, right, center, center_vertical, center_horizontal | Alinhamento da imagem da capa dentro da NativeAd view |
| `Description` |
| ampiriDescriptionTextFont | DEFAULT, DEFAULT_BOLD, MONOSPACE, SANS_SERIF, SERIF | Fonte do texto da descrição |
| ampiriDescriptionTextSize | reference,dimension | Tamanho do texto da descrição|
| ampiriDescriptionTextColor | reference,color | Cor do texto da descrição |
| ampiriTitleTextMaxLengthEms | integer | Máximo ems do texto da descrição |
| ampiriDescriptionMarginLeft | reference,dimension | Margem esquerda da descrição |
| ampiriDescriptionMarginRight | reference,dimension | Margem direita da descrição |
| `Call To Action` |
| ampiriCallToActionBackgroundColor |  reference,color | Cor do botão de chamada de ação |
| ampiriCallToActionTextFont | DEFAULT, DEFAULT_BOLD, MONOSPACE, SANS_SERIF, SERIF | Fonte do texto da descrição |
| ampiriCallToActionTextSize | reference,dimension | Tamanhao  do botão de chamada de ação |
| ampiriCallToActionTextColor | reference,color | Cor do botão de chamada de ação |
| ampiriCallToActionMarginLeft | reference,dimension | Margem esquerda do botão de chamada de ação |
| ampiriCallToActionMarginRight | reference,dimension | Margem direita do botão de chamada de ação |
| ampiriCallToActionMarginTop | reference,dimension | Margem de cima do botão de chamada de ação |
| ampiriCallToActionMarginBottom | reference,dimension | Margem de baixo do botão de chamada de ação|
| ampiriCallToActionDefaultText | reference,string | Texto padrão do botão de chamada de ação |

Você pode configurar estes atributos no seu layout customizado `NativeAdView`
``` xml
<com.ampiri.sdk.banner.NativeAdView android:id="@+id/native_ad"
    app:ampiriTitleTextFont="MONOSPACE"
    app:ampiriIconWidth="42dp"
    app:ampiriIconHeight="42dp"
    app:ampiriCallToActionTextColor="@android:color/lighter_gray"
 ...>
```

### Visualizador de In-Feed ###

> Nota: Todas as chamadas do método SDK devem ser efetuadas a partir da Main thread (Main thread, UI thread).

Adicione o seguinte código a sua atividade:
```java
StreamAdAdapter adAdapter = new StreamAdAdapter.Builder()
  .setAdapter(new MainAdapter(this))
  .setAdUnitId("YOUR_NATIVE_AD_UNIT_ID")
  .setViewBuilder(FeedCardNativeAdView.BUILDER)
  .setEventCallback(this)
  .build(this);
listView.setAdapter(adAdapter);
adAdapter.loadAd();
```

Após chamar o método `loadAd()`, o download do anúncio de in-feed inicia-se. Caso o método `loadAd()` seja chamado novamente antes do anúncio nativo ter sido totalmente servido, o processamento do novo pedido será cancelado. Apenas será processado um pedido.

Quando o anúncio in-feed estiver concluído, este será automaticamente exibido.

Para mais informações sobre a conclusão do download e como subscrever aos eventos de anúncio (veja [Manipulação de Eventos (Callbacks)](#Manipulação-de-Eventos-(Callbacks))).

## Manipulação de Eventos (Callbacks)

Para receber eventos de anúncio, deve-se implementar uma interface de listener de evento `AdEventCallback`.

Exemplo de listener:
```java
AdEventCallback adListener = new AdEventCallback() {
    @Override
    public void onAdLoaded() {
    }

    @Override
    public void onAdFailed(@NonNull final ResponseStatus responseStatus) {
    }

    @Override
    public void onAdOpened() {
    }

    @Override
    public void onAdClicked() {
    }

    @Override
    public void onAdClosed() {
    }

    @Override
    public void onAdCompleted() {
    }
};
```

## Manuseamento de eventos de ciclo de vida útil da atividade

Os métodos `onPause()`, `onResume()` e `onDestroy()` devem ser ativados dependendo dos eventos do ciclo de vida útil da atividade.

Exemplo:

```java
@Override
protected void onPause() {
    super.onPause();
    interstitialAd.onActivityPaused();
    standardAd.onActivityPaused();
    videoAd.onActivityPaused();
    nativeAd.onActivityPaused();
}

@Override
protected void onResume() {
    super.onResume();
    interstitialAd.onActivityResumed();
    standardAd.onActivityResumed();
    videoAd.onActivityResumed();
    nativeAd.onActivityResumed();
}

@Override
protected void onDestroy() {
    super.onDestroy();
    interstitialAd.onActivityDestroyed();
    standardAd.onActivityDestroyed();
    videoAd.onActivityDestroyed();
    nativeAd.onActivityDestroyed();
}
```


## Demo App / Testes

### Passos

1. Baixe o Ampiri Demo (Sample) do GitHub.
2. Importe o Ampiri Demo (Sample App) no Android Studio pelo menu *File > New > Import Project*.
3. Na Ampiri UI, defina o status do **Ad Unit que você quer usar** para *Test*.
4. Na Ampiri UI, clique no botão "Click to Copy Ad Unit ID" para copiar o ID do Ad Unit para o clipboard.
5. No Android Studio, em Java activity do Ad Type do **Ad Unit que você quer usar**, cole o Ad Unit ID do Passo 4.
6. No menu principal do Android Studio, selecione **Run** e clique *Run* para compilar e rodar o App.
7. No Android emulator (ou no seu device) onde o app está rodando com Ampiri, selecione o Ad Type do Passo 4 e você vai ver um evento registrado na Ampiri UI na seção *Reporting*.

[Para tópicos avançados do SDK, clique aqui.](CONFIGURATIONS.md)
