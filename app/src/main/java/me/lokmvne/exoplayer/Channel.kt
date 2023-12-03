package me.lokmvne.exoplayer

import android.net.Uri
import androidx.media3.common.MediaItem

data class Channel(
    val contentUri: Uri,
    val mediaItem: MediaItem,
    val logo: String,
    val name: String,
)

val VideoTsItems = listOf(
    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/2296.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/2296.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481565/samples/channelslogo/xrt0a4eb4kio3n8etmo0.png",
        name = "Bein Sports News"
    ),
    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/1.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/1.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481565/samples/channelslogo/xrt0a4eb4kio3n8etmo0.png",
        name = "Bein Sports 1"
    ),
    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/48878.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/48878.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481565/samples/channelslogo/xrt0a4eb4kio3n8etmo0.png",
        name = "Bein Sports 2"
    ),
    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/52271.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/52271.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481565/samples/channelslogo/xrt0a4eb4kio3n8etmo0.png",
        name = "Bein Sports 3"
    ),
    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/4.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/4.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481565/samples/channelslogo/xrt0a4eb4kio3n8etmo0.png",
        name = "Bein Sports 4"
    ),

    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/5.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/tverdnic2006/5KdVRcHHrH/5.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481565/samples/channelslogo/xrt0a4eb4kio3n8etmo0.png",
        name = "Bein Sports 5"
    ),

    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54301.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54301.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695489316/samples/channelslogo/SSC_TV_logo.svg_o4ovpb.png",
        name = "SSC 1"
    ),

    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54302.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54302.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695489316/samples/channelslogo/SSC_TV_logo.svg_o4ovpb.png",
        name = "SSC 2"
    ),

    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54303.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54303.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695489316/samples/channelslogo/SSC_TV_logo.svg_o4ovpb.png",
        name = "SSC 3"
    ),
    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54304.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54304.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695489316/samples/channelslogo/SSC_TV_logo.svg_o4ovpb.png",
        name = "SSC 4"
    ),
    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54305.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54305.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695489316/samples/channelslogo/SSC_TV_logo.svg_o4ovpb.png",
        name = "SSC 5"
    ),
    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54896.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54896.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695489316/samples/channelslogo/SSC_TV_logo.svg_o4ovpb.png",
        name = "SSC extra 1"
    ),
    Channel(
        contentUri = Uri.parse("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54897.ts"),
        mediaItem = MediaItem.fromUri("http://server.sibfungold.info:8080/live/kuloviceldin1/4imy1RgmDA/54897.ts"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695489316/samples/channelslogo/SSC_TV_logo.svg_o4ovpb.png",
        name = "SSC extra 2"
    ),
)

val VideoItems = listOf(
    Channel(
        contentUri = Uri.parse("https://admdn1.cdn.mangomolo.com/adsports1/smil:adsports1.stream.smil/playlist.m3u8"),
        mediaItem = MediaItem.fromUri("https://admdn1.cdn.mangomolo.com/adsports1/smil:adsports1.stream.smil/playlist.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481568/samples/channelslogo/g3oa8oympryyngrzieok.png",
        name = "AD Sports 1"
    ),
    Channel(
        contentUri = Uri.parse("https://ott.tv5monde.com/Content/HLS/Live/channel(orient)/variant.m3u8"),
        mediaItem = MediaItem.fromUri("https://ott.tv5monde.com/Content/HLS/Live/channel(orient)/variant.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481569/samples/channelslogo/hb6zgnld9s9isejod8hz.png",
        name = "TV5 Monde"
    ),
    Channel(
        contentUri = Uri.parse("https://ythls.onrender.com/channel/UCdTyuXgmJkG_O8_75eqej-w.m3u8"),
        mediaItem = MediaItem.fromUri("https://ythls.onrender.com/channel/UCdTyuXgmJkG_O8_75eqej-w.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481572/samples/channelslogo/thfzypxwtjpfjve7rdie.png",
        name = "FRANCE 24"
    ),

    Channel(
        contentUri = Uri.parse("https://shls-mbc3-eur-prod-dub.shahid.net/out/v1/fce09dd6a967431a871efb3b8dec9f82/index.m3u8"),
        mediaItem = MediaItem.fromUri("https://shls-mbc3-eur-prod-dub.shahid.net/out/v1/fce09dd6a967431a871efb3b8dec9f82/index.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481570/samples/channelslogo/xlq26mcfa8telohsvvba.png",
        name = "MBC3"
    ),

    //----------------------------------------------------------------ssc-------------------------------------------------------
    Channel(
        contentUri = Uri.parse("https://live-hls-web-ajm.getaj.net/AJM/index.m3u8"),
        mediaItem = MediaItem.fromUri("https://live-hls-web-ajm.getaj.net/AJM/index.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481563/samples/channelslogo/u5wrezwjzpq7q5vhrke6.png",
        name = "Al Jazeera Mubasher"
    ),
    Channel(
        contentUri = Uri.parse("https://stream.skynewsarabia.com/vertical/vertical.m3u8"),
        mediaItem = MediaItem.fromUri("https://stream.skynewsarabia.com/vertical/vertical.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481570/samples/channelslogo/tbvngweaa9vi8fv4eud8.png",
        name = "SKY NEWS ARABIA"
    ),
    Channel(
        contentUri = Uri.parse("https://admdn2.cdn.mangomolo.com/nagtv/smil:nagtv.stream.smil/playlist.m3u8"),
        mediaItem = MediaItem.fromUri("https://admdn2.cdn.mangomolo.com/nagtv/smil:nagtv.stream.smil/playlist.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481565/samples/channelslogo/ze3fxst6ezfxlqb31ays.png",
        name = "National Geographic"
    ),
    Channel(
        contentUri = Uri.parse("https://dwamdstream103.akamaized.net/hls/live/2015526/dwstream103/index.m3u8"),
        mediaItem = MediaItem.fromUri("https://dwamdstream103.akamaized.net/hls/live/2015526/dwstream103/index.m3u8"),
        logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481570/samples/channelslogo/w68lucj4qim61jo0h3hs.png",
        name = "DW ARABIA"
    ),

    )
