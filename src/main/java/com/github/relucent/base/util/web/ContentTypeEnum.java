package com.github.relucent.base.util.web;

import java.util.Objects;

/**
 * ContentType枚举类
 * @author YYL
 */
public enum ContentTypeEnum {

    WILD_CARD("application/octet-streabmpm", ""), //
    _123("application/vnd.lotus-1-2-3", "123"), //
    _3DS("image/x-3ds", "3ds"), //
    _3G2("video/3gpp", "3g2"), //
    _3GA("video/3gpp", "3ga"), //
    _3GP("video/3gpp", "3gp"), //
    _3GPP("video/3gpp", "3gpp"), //
    _602("application/x-t602", "602"), //
    _669("audio/x-mod", "669"), //
    _7Z("application/x-7z-compressed", "7z"), //
    A("application/x-archive", "a"), //
    AAC("audio/mp4", "aac"), //
    ABW("application/x-abiword", "abw"), //
    ABW_CRASHED("application/x-abiword", "abw.crashed"), //
    ABW_GZ("application/x-abiword", "abw.gz"), //
    AC3("audio/ac3", "ac3"), //
    ACE("application/x-ace", "ace"), //
    ADB("text/x-adasrc", "adb"), //
    ADS("text/x-adasrc", "ads"), //
    AFM("application/x-font-afm", "afm"), //
    AG("image/x-applix-graphics", "ag"), //
    AI("application/illustrator", "ai"), //
    AIF("audio/x-aiff", "aif"), //
    AIFC("audio/x-aiff", "aifc"), //
    AIFF("audio/x-aiff", "aiff"), //
    AL("application/x-perl", "al"), //
    ALZ("application/x-alz", "alz"), //
    AMR("audio/amr", "amr"), //
    ANI("application/x-navi-animation", "ani"), //
    ANIM("video/x-anim", "anim[1-9j]"), //
    ANX("application/annodex", "anx"), //
    APE("audio/x-ape", "ape"), //
    ARJ("application/x-arj", "arj"), //
    ARW("image/x-sony-arw", "arw"), //
    AS("application/x-applix-spreadsheet", "as"), //
    ASC("text/plain", "asc"), //
    ASF("video/x-ms-asf", "asf"), //
    ASP("application/x-asp", "asp"), //
    ASS("text/x-ssa", "ass"), //
    ASX("audio/x-ms-asx", "asx"), //
    ATOM("application/atom+xml", "atom"), //
    AU("audio/basic", "au"), //
    AVI("video/x-msvideo", "avi"), //
    AW("application/x-applix-word", "aw"), //
    AWB("audio/amr-wb", "awb"), //
    AWK("application/x-awk", "awk"), //
    AXA("audio/annodex", "axa"), //
    AXV("video/annodex", "axv"), //
    BAK("application/x-trash", "bak"), //
    BCPIO("application/x-bcpio", "bcpio"), //
    BDF("application/x-font-bdf", "bdf"), //
    BIB("text/x-bibtex", "bib"), //
    BIN("application/octet-stream", "bin"), //
    BLEND("application/x-blender", "blend"), //
    BLENDER("application/x-blender", "blender"), //
    BMP("image/bmp", "bmp"), //
    BZ("application/x-bzip", "bz"), //
    BZ2("application/x-bzip", "bz2"), //
    C("text/x-csrc", "c"), //
    CAB("application/vnd.ms-cab-compressed", "cab"), //
    CB7("application/x-cb7", "cb7"), //
    CBR("application/x-cbr", "cbr"), //
    CBT("application/x-cbt", "cbt"), //
    CBZ("application/x-cbz", "cbz"), //
    CC("text/x-c++src", "cc"), //
    CDF("application/x-netcdf", "cdf"), //
    CDR("application/vnd.corel-draw", "cdr"), //
    CER("application/x-x509-ca-cert", "cer"), //
    CERT("application/x-x509-ca-cert", "cert"), //
    CGM("image/cgm", "cgm"), //
    CHM("application/x-chm", "chm"), //
    CHRT("application/x-kchart", "chrt"), //
    CLASS("application/x-java", "class"), //
    CLS("text/x-tex", "cls"), //
    CMAKE("text/x-cmake", "cmake"), //
    CPIO("application/x-cpio", "cpio"), //
    CPIO_GZ("application/x-cpio-compressed", "cpio.gz"), //
    CPP("text/x-c++src", "cpp"), //
    CR2("image/x-canon-cr2", "cr2"), //
    CRT("application/x-x509-ca-cert", "crt"), //
    CRW("image/x-canon-crw", "crw"), //
    CS("text/x-csharp", "cs"), //
    CSH("application/x-csh", "csh"), //
    CSS("text/css", "css"), //
    CSSL("text/css", "cssl"), //
    CSV("text/csv", "csv"), //
    CUE("application/x-cue", "cue"), //
    CUR("image/x-win-bitmap", "cur"), //
    CXX("text/x-c++src", "cxx"), //
    C__("text/x-c++src", "c++"), //
    D("text/x-dsrc", "d"), //
    DAR("application/x-dar", "dar"), //
    DBF("application/x-dbf", "dbf"), //
    DC("application/x-dc-rom", "dc"), //
    DCL("text/x-dcl", "dcl"), //
    DCM("application/dicom", "dcm"), //
    DCR("image/x-kodak-dcr", "dcr"), //
    DDS("image/x-dds", "dds"), //
    DEB("application/x-deb", "deb"), //
    DER("application/x-x509-ca-cert", "der"), //
    DESKTOP("application/x-desktop", "desktop"), //
    DIA("application/x-dia-diagram", "dia"), //
    DIFF("text/x-patch", "diff"), //
    DIVX("video/x-msvideo", "divx"), //
    DJV("image/vnd.djvu", "djv"), //
    DJVU("image/vnd.djvu", "djvu"), //
    DNG("image/x-adobe-dng", "dng"), //
    DOC("application/msword", "doc"), //
    DOCBOOK("application/docbook+xml", "docbook"), //
    DOCM("application/vnd.openxmlformats-officedocument.wordprocessingml.document", "docm"), //
    DOCX("application/vnd.openxmlformats-officedocument.wordprocessingml.document", "docx"), //
    DOT("text/vnd.graphviz", "dot"), //
    DSL("text/x-dsl", "dsl"), //
    DTD("application/xml-dtd", "dtd"), //
    DTX("text/x-tex", "dtx"), //
    DV("video/dv", "dv"), //
    DVI("application/x-dvi", "dvi"), //
    DVI_BZ2("application/x-bzdvi", "dvi.bz2"), //
    DVI_GZ("application/x-gzdvi", "dvi.gz"), //
    DWG("image/vnd.dwg", "dwg"), //
    DXF("image/vnd.dxf", "dxf"), //
    E("text/x-eiffel", "e"), //
    EGON("application/x-egon", "egon"), //
    EIF("text/x-eiffel", "eif"), //
    EL("text/x-emacs-lisp", "el"), //
    EMF("image/x-emf", "emf"), //
    EMP("application/vnd.emusic-emusic_package", "emp"), //
    ENT("application/xml-external-parsed-entity", "ent"), //
    EPS("image/x-eps", "eps"), //
    EPSF("image/x-eps", "epsf"), //
    EPSF_BZ2("image/x-bzeps", "epsf.bz2"), //
    EPSF_GZ("image/x-gzeps", "epsf.gz"), //
    EPSI("image/x-eps", "epsi"), //
    EPSI_BZ2("image/x-bzeps", "epsi.bz2"), //
    EPSI_GZ("image/x-gzeps", "epsi.gz"), //
    EPS_BZ2("image/x-bzeps", "eps.bz2"), //
    EPS_GZ("image/x-gzeps", "eps.gz"), //
    EPUB("application/epub+zip", "epub"), //
    ERL("text/x-erlang", "erl"), //
    ES("application/ecmascript", "es"), //
    ETHEME("application/x-e-theme", "etheme"), //
    ETX("text/x-setext", "etx"), //
    EXE("application/x-ms-dos-executable", "exe"), //
    EXR("image/x-exr", "exr"), //
    EZ("application/andrew-inset", "ez"), //
    F("text/x-fortran", "f"), //
    F90("text/x-fortran", "f90"), //
    F95("text/x-fortran", "f95"), //
    FB2("application/x-fictionbook+xml", "fb2"), //
    FIG("image/x-xfig", "fig"), //
    FITS("image/fits", "fits"), //
    FL("application/x-fluid", "fl"), //
    FLAC("audio/x-flac", "flac"), //
    FLC("video/x-flic", "flc"), //
    FLI("video/x-flic", "fli"), //
    FLV("video/x-flv", "flv"), //
    FLW("application/x-kivio", "flw"), //
    FO("text/x-xslfo", "fo"), //
    FOR("text/x-fortran", "for"), //
    G3("image/fax-g3", "g3"), //
    GB("application/x-gameboy-rom", "gb"), //
    GBA("application/x-gba-rom", "gba"), //
    GCRD("text/directory", "gcrd"), //
    GED("application/x-gedcom", "ged"), //
    GEDCOM("application/x-gedcom", "gedcom"), //
    GEN("application/x-genesis-rom", "gen"), //
    GF("application/x-tex-gf", "gf"), //
    GG("application/x-sms-rom", "gg"), //
    GIF("image/gif", "gif"), //
    GLADE("application/x-glade", "glade"), //
    GMO("application/x-gettext-translation", "gmo"), //
    GNC("application/x-gnucash", "gnc"), //
    GND("application/gnunet-directory", "gnd"), //
    GNUCASH("application/x-gnucash", "gnucash"), //
    GNUMERIC("application/x-gnumeric", "gnumeric"), //
    GNUPLOT("application/x-gnuplot", "gnuplot"), //
    GP("application/x-gnuplot", "gp"), //
    GPG("application/pgp-encrypted", "gpg"), //
    GPLT("application/x-gnuplot", "gplt"), //
    GRA("application/x-graphite", "gra"), //
    GSF("application/x-font-type1", "gsf"), //
    GSM("audio/x-gsm", "gsm"), //
    GTAR("application/x-tar", "gtar"), //
    GV("text/vnd.graphviz", "gv"), //
    GVP("text/x-google-video-pointer", "gvp"), //
    GZ("application/x-gzip", "gz"), //
    H("text/x-chdr", "h"), //
    HDF("application/x-hdf", "hdf"), //
    HH("text/x-c++hdr", "hh"), //
    HP("text/x-c++hdr", "hp"), //
    HPGL("application/vnd.hp-hpgl", "hpgl"), //
    HPP("text/x-c++hdr", "hpp"), //
    HS("text/x-haskell", "hs"), //
    HTM("text/html", "htm"), //
    HTML("text/html", "html"), //
    HWP("application/x-hwp", "hwp"), //
    HWT("application/x-hwt", "hwt"), //
    HXX("text/x-c++hdr", "hxx"), //
    H__("text/x-c++hdr", "h++"), //
    ICA("application/x-ica", "ica"), //
    ICB("image/x-tga", "icb"), //
    ICNS("image/x-icns", "icns"), //
    ICO("image/vnd.microsoft.icon", "ico"), //
    ICS("text/calendar", "ics"), //
    IDL("text/x-idl", "idl"), //
    IEF("image/ief", "ief"), //
    IFF("image/x-iff", "iff"), //
    ILBM("image/x-ilbm", "ilbm"), //
    IME("text/x-imelody", "ime"), //
    IMY("text/x-imelody", "imy"), //
    INS("text/x-tex", "ins"), //
    IPTABLES("text/x-iptables", "iptables"), //
    ISO("application/x-cd-image", "iso"), //
    ISO9660("application/x-cd-image", "iso9660"), //
    IT("audio/x-it", "it"), //
    J2K("image/jp2", "j2k"), //
    JAD("text/vnd.sun.j2me.app-descriptor", "jad"), //
    JAR("application/x-java-archive", "jar"), //
    JAVA("text/x-java", "java"), //
    JNG("image/x-jng", "jng"), //
    JNLP("application/x-java-jnlp-file", "jnlp"), //
    JP2("image/jp2", "jp2"), //
    JPC("image/jp2", "jpc"), //
    JPE("image/jpeg", "jpe"), //
    JPEG("image/jpeg", "jpeg"), //
    JPF("image/jp2", "jpf"), //
    JPG("image/jpeg", "jpg"), //
    JPR("application/x-jbuilder-project", "jpr"), //
    JPX("image/jp2", "jpx"), //
    JS("application/javascript", "js"), //
    JSON("application/json", "json"), //
    JSONP("application/jsonp", "jsonp"), //
    K25("image/x-kodak-k25", "k25"), //
    KAR("audio/midi", "kar"), //
    KARBON("application/x-karbon", "karbon"), //
    KDC("image/x-kodak-kdc", "kdc"), //
    KDELNK("application/x-desktop", "kdelnk"), //
    KEXI("application/x-kexiproject-sqlite3", "kexi"), //
    KEXIC("application/x-kexi-connectiondata", "kexic"), //
    KEXIS("application/x-kexiproject-shortcut", "kexis"), //
    KFO("application/x-kformula", "kfo"), //
    KIL("application/x-killustrator", "kil"), //
    KINO("application/smil", "kino"), //
    KML("application/vnd.google-earth.kml+xml", "kml"), //
    KMZ("application/vnd.google-earth.kmz", "kmz"), //
    KON("application/x-kontour", "kon"), //
    KPM("application/x-kpovmodeler", "kpm"), //
    KPR("application/x-kpresenter", "kpr"), //
    KPT("application/x-kpresenter", "kpt"), //
    KRA("application/x-krita", "kra"), //
    KSP("application/x-kspread", "ksp"), //
    KUD("application/x-kugar", "kud"), //
    KWD("application/x-kword", "kwd"), //
    KWT("application/x-kword", "kwt"), //
    LA("application/x-shared-library-la", "la"), //
    LATEX("text/x-tex", "latex"), //
    LDIF("text/x-ldif", "ldif"), //
    LHA("application/x-lha", "lha"), //
    LHS("text/x-literate-haskell", "lhs"), //
    LHZ("application/x-lhz", "lhz"), //
    LOG("text/x-log", "log"), //
    LTX("text/x-tex", "ltx"), //
    LUA("text/x-lua", "lua"), //
    LWO("image/x-lwo", "lwo"), //
    LWOB("image/x-lwo", "lwob"), //
    LWS("image/x-lws", "lws"), //
    LY("text/x-lilypond", "ly"), //
    LYX("application/x-lyx", "lyx"), //
    LZ("application/x-lzip", "lz"), //
    LZH("application/x-lha", "lzh"), //
    LZMA("application/x-lzma", "lzma"), //
    LZO("application/x-lzop", "lzo"), //
    M("text/x-matlab", "m"), //
    M15("audio/x-mod", "m15"), //
    M2T("video/mpeg", "m2t"), //
    M3U("audio/x-mpegurl", "m3u"), //
    M3U8("audio/x-mpegurl", "m3u8"), //
    M4("application/x-m4", "m4"), //
    M4A("audio/mp4", "m4a"), //
    M4B("audio/x-m4b", "m4b"), //
    M4V("video/mp4", "m4v"), //
    MAB("application/x-markaby", "mab"), //
    MAN("application/x-troff-man", "man"), //
    MBOX("application/mbox", "mbox"), //
    MD("application/x-genesis-rom", "md"), //
    MDB("application/vnd.ms-access", "mdb"), //
    MDI("image/vnd.ms-modi", "mdi"), //
    ME("text/x-troff-me", "me"), //
    MED("audio/x-mod", "med"), //
    METALINK("application/metalink+xml", "metalink"), //
    MGP("application/x-magicpoint", "mgp"), //
    MID("audio/midi", "mid"), //
    MIDI("audio/midi", "midi"), //
    MIF("application/x-mif", "mif"), //
    MINIPSF("audio/x-minipsf", "minipsf"), //
    MKA("audio/x-matroska", "mka"), //
    MKV("video/x-matroska", "mkv"), //
    ML("text/x-ocaml", "ml"), //
    MLI("text/x-ocaml", "mli"), //
    MM("text/x-troff-mm", "mm"), //
    MMF("application/x-smaf", "mmf"), //
    MML("text/mathml", "mml"), //
    MNG("video/x-mng", "mng"), //
    MO("application/x-gettext-translation", "mo"), //
    MO3("audio/x-mo3", "mo3"), //
    MOC("text/x-moc", "moc"), //
    MOD("audio/x-mod", "mod"), //
    MOF("text/x-mof", "mof"), //
    MOOV("video/quicktime", "moov"), //
    MOV("video/quicktime", "mov"), //
    MOVIE("video/x-sgi-movie", "movie"), //
    MP2("video/mpeg", "mp2"), //
    MP3("audio/mpeg", "mp3"), //
    MP4("video/mp4", "mp4"), //
    MPC("audio/x-musepack", "mpc"), //
    MPE("video/mpeg", "mpe"), //
    MPEG("video/mpeg", "mpeg"), //
    MPG("video/mpeg", "mpg"), //
    MPGA("audio/mpeg", "mpga"), //
    MPP("audio/x-musepack", "mpp"), //
    MP_("audio/x-musepack", "mp+"), //
    MRL("text/x-mrml", "mrl"), //
    MRML("text/x-mrml", "mrml"), //
    MRW("image/x-minolta-mrw", "mrw"), //
    MS("text/x-troff-ms", "ms"), //
    MSI("application/x-msi", "msi"), //
    MSOD("image/x-msod", "msod"), //
    MSX("application/x-msx-rom", "msx"), //
    MTM("audio/x-mod", "mtm"), //
    MUP("text/x-mup", "mup"), //
    MXF("application/mxf", "mxf"), //
    N64("application/x-n64-rom", "n64"), //
    NB("application/mathematica", "nb"), //
    NC("application/x-netcdf", "nc"), //
    NDS("application/x-nintendo-ds-rom", "nds"), //
    NEF("image/x-nikon-nef", "nef"), //
    NES("application/x-nes-rom", "nes"), //
    NFO("text/x-nfo", "nfo"), //
    NOT("text/x-mup", "not"), //
    NSC("application/x-netshow-channel", "nsc"), //
    NSV("video/x-nsv", "nsv"), //
    O("application/x-object", "o"), //
    OBJ("application/x-tgif", "obj"), //
    OCL("text/x-ocl", "ocl"), //
    ODA("application/oda", "oda"), //
    ODB("application/vnd.oasis.opendocument.database", "odb"), //
    ODC("application/vnd.oasis.opendocument.chart", "odc"), //
    ODF("application/vnd.oasis.opendocument.formula", "odf"), //
    ODG("application/vnd.oasis.opendocument.graphics", "odg"), //
    ODI("application/vnd.oasis.opendocument.image", "odi"), //
    ODM("application/vnd.oasis.opendocument.text-master", "odm"), //
    ODP("application/vnd.oasis.opendocument.presentation", "odp"), //
    ODS("application/vnd.oasis.opendocument.spreadsheet", "ods"), //
    ODT("application/vnd.oasis.opendocument.text", "odt"), //
    OGA("audio/ogg", "oga"), //
    OGG("video/x-theora+ogg", "ogg"), //
    OGM("video/x-ogm+ogg", "ogm"), //
    OGV("video/ogg", "ogv"), //
    OGX("application/ogg", "ogx"), //
    OLD("application/x-trash", "old"), //
    OLEO("application/x-oleo", "oleo"), //
    OPML("text/x-opml+xml", "opml"), //
    ORA("image/openraster", "ora"), //
    ORF("image/x-olympus-orf", "orf"), //
    OTC("application/vnd.oasis.opendocument.chart-template", "otc"), //
    OTF("application/x-font-otf", "otf"), //
    OTG("application/vnd.oasis.opendocument.graphics-template", "otg"), //
    OTH("application/vnd.oasis.opendocument.text-web", "oth"), //
    OTP("application/vnd.oasis.opendocument.presentation-template", "otp"), //
    OTS("application/vnd.oasis.opendocument.spreadsheet-template", "ots"), //
    OTT("application/vnd.oasis.opendocument.text-template", "ott"), //
    OWL("application/rdf+xml", "owl"), //
    OXT("application/vnd.openofficeorg.extension", "oxt"), //
    P("text/x-pascal", "p"), //
    P10("application/pkcs10", "p10"), //
    P12("application/x-pkcs12", "p12"), //
    P7B("application/x-pkcs7-certificates", "p7b"), //
    P7S("application/pkcs7-signature", "p7s"), //
    PACK("application/x-java-pack200", "pack"), //
    PAK("application/x-pak", "pak"), //
    PAR2("application/x-par2", "par2"), //
    PAS("text/x-pascal", "pas"), //
    PATCH("text/x-patch", "patch"), //
    PBM("image/x-portable-bitmap", "pbm"), //
    PCD("image/x-photo-cd", "pcd"), //
    PCF("application/x-cisco-vpn-settings", "pcf"), //
    PCF_GZ("application/x-font-pcf", "pcf.gz"), //
    PCF_Z("application/x-font-pcf", "pcf.z"), //
    PCL("application/vnd.hp-pcl", "pcl"), //
    PCX("image/x-pcx", "pcx"), //
    PDB("chemical/x-pdb", "pdb"), //
    PDC("application/x-aportisdoc", "pdc"), //
    PDF("application/pdf", "pdf"), //
    PDF_BZ2("application/x-bzpdf", "pdf.bz2"), //
    PDF_GZ("application/x-gzpdf", "pdf.gz"), //
    PEF("image/x-pentax-pef", "pef"), //
    PEM("application/x-x509-ca-cert", "pem"), //
    PERL("application/x-perl", "perl"), //
    PFA("application/x-font-type1", "pfa"), //
    PFB("application/x-font-type1", "pfb"), //
    PFX("application/x-pkcs12", "pfx"), //
    PGM("image/x-portable-graymap", "pgm"), //
    PGN("application/x-chess-pgn", "pgn"), //
    PGP("application/pgp-encrypted", "pgp"), //
    PHP("application/x-php", "php"), //
    PHP3("application/x-php", "php3"), //
    PHP4("application/x-php", "php4"), //
    PICKLE("application/python-pickle", "pickle"), //
    PICT("image/x-pict", "pict"), //
    PICT1("image/x-pict", "pict1"), //
    PICT2("image/x-pict", "pict2"), //
    PK("application/x-tex-pk", "pk"), //
    PKIPATH("application/pkix-pkipath", "pkipath"), //
    PKR("application/pgp-keys", "pkr"), //
    PL("application/x-perl", "pl"), //
    PLA("audio/x-iriver-pla", "pla"), //
    PLN("application/x-planperfect", "pln"), //
    PLS("audio/x-scpls", "pls"), //
    PM("application/x-perl", "pm"), //
    PNG("image/png", "png"), //
    PNM("image/x-portable-anymap", "pnm"), //
    PNTG("image/x-macpaint", "pntg"), //
    PO("text/x-gettext-translation", "po"), //
    POR("application/x-spss-por", "por"), //
    POT("text/x-gettext-translation-template", "pot"), //
    PPM("image/x-portable-pixmap", "ppm"), //
    PPS("application/vnd.ms-powerpoint", "pps"), //
    PPT("application/vnd.ms-powerpoint", "ppt"), //
    PPTM("application/vnd.openxmlformats-officedocument.presentationml.presentation", "pptm"), //
    PPTX("application/vnd.openxmlformats-officedocument.presentationml.presentation", "pptx"), //
    PPZ("application/vnd.ms-powerpoint", "ppz"), //
    PRC("application/x-palm-database", "prc"), //
    PS("application/postscript", "ps"), //
    PSD("image/vnd.adobe.photoshop", "psd"), //
    PSF("audio/x-psf", "psf"), //
    PSFLIB("audio/x-psflib", "psflib"), //
    PSF_GZ("application/x-gz-font-linux-psf", "psf.gz"), //
    PSID("audio/prs.sid", "psid"), //
    PSW("application/x-pocket-word", "psw"), //
    PS_BZ2("application/x-bzpostscript", "ps.bz2"), //
    PS_GZ("application/x-gzpostscript", "ps.gz"), //
    PW("application/x-pw", "pw"), //
    PY("text/x-python", "py"), //
    PYC("application/x-python-bytecode", "pyc"), //
    PYO("application/x-python-bytecode", "pyo"), //
    QIF("image/x-quicktime", "qif"), //
    QT("video/quicktime", "qt"), //
    QTIF("image/x-quicktime", "qtif"), //
    QTL("application/x-quicktime-media-link", "qtl"), //
    QTVR("video/quicktime", "qtvr"), //
    RA("audio/vnd.rn-realaudio", "ra"), //
    RAF("image/x-fuji-raf", "raf"), //
    RAM("application/ram", "ram"), //
    RAR("application/x-rar", "rar"), //
    RAS("image/x-cmu-raster", "ras"), //
    RAW("image/x-panasonic-raw", "raw"), //
    RAX("audio/vnd.rn-realaudio", "rax"), //
    RB("application/x-ruby", "rb"), //
    RDF("application/rdf+xml", "rdf"), //
    RDFS("application/rdf+xml", "rdfs"), //
    REG("text/x-ms-regedit", "reg"), //
    REJ("application/x-reject", "rej"), //
    RGB("image/x-rgb", "rgb"), //
    RLE("image/rle", "rle"), //
    RM("application/vnd.rn-realmedia", "rm"), //
    RMJ("application/vnd.rn-realmedia", "rmj"), //
    RMM("application/vnd.rn-realmedia", "rmm"), //
    RMS("application/vnd.rn-realmedia", "rms"), //
    RMVB("application/vnd.rn-realmedia", "rmvb"), //
    RMX("application/vnd.rn-realmedia", "rmx"), //
    ROFF("text/troff", "roff"), //
    RP("image/vnd.rn-realpix", "rp"), //
    RPM("application/x-rpm", "rpm"), //
    RSS("application/rss+xml", "rss"), //
    RT("text/vnd.rn-realtext", "rt"), //
    RTF("application/rtf", "rtf"), //
    RTX("text/richtext", "rtx"), //
    RV("video/vnd.rn-realvideo", "rv"), //
    RVX("video/vnd.rn-realvideo", "rvx"), //
    S3M("audio/x-s3m", "s3m"), //
    SAM("application/x-amipro", "sam"), //
    SAMI("application/x-sami", "sami"), //
    SAV("application/x-spss-sav", "sav"), //
    SCM("text/x-scheme", "scm"), //
    SDA("application/vnd.stardivision.draw", "sda"), //
    SDC("application/vnd.stardivision.calc", "sdc"), //
    SDD("application/vnd.stardivision.impress", "sdd"), //
    SDP("application/sdp", "sdp"), //
    SDS("application/vnd.stardivision.chart", "sds"), //
    SDW("application/vnd.stardivision.writer", "sdw"), //
    SGF("application/x-go-sgf", "sgf"), //
    SGI("image/x-sgi", "sgi"), //
    SGL("application/vnd.stardivision.writer", "sgl"), //
    SGM("text/sgml", "sgm"), //
    SGML("text/sgml", "sgml"), //
    SH("application/x-shellscript", "sh"), //
    SHAR("application/x-shar", "shar"), //
    SHN("application/x-shorten", "shn"), //
    SIAG("application/x-siag", "siag"), //
    SID("audio/prs.sid", "sid"), //
    SIK("application/x-trash", "sik"), //
    SIS("application/vnd.symbian.install", "sis"), //
    SISX("x-epoc/x-sisx-app", "sisx"), //
    SIT("application/x-stuffit", "sit"), //
    SIV("application/sieve", "siv"), //
    SK("image/x-skencil", "sk"), //
    SK1("image/x-skencil", "sk1"), //
    SKR("application/pgp-keys", "skr"), //
    SLK("text/spreadsheet", "slk"), //
    SMAF("application/x-smaf", "smaf"), //
    SMC("application/x-snes-rom", "smc"), //
    SMD("application/vnd.stardivision.mail", "smd"), //
    SMF("application/vnd.stardivision.math", "smf"), //
    SMI("application/x-sami", "smi"), //
    SMIL("application/smil", "smil"), //
    SML("application/smil", "sml"), //
    SMS("application/x-sms-rom", "sms"), //
    SND("audio/basic", "snd"), //
    SO("application/x-sharedlib", "so"), //
    SPC("application/x-pkcs7-certificates", "spc"), //
    SPD("application/x-font-speedo", "spd"), //
    SPEC("text/x-rpm-spec", "spec"), //
    SPL("application/x-shockwave-flash", "spl"), //
    SPX("audio/x-speex", "spx"), //
    SQL("text/x-sql", "sql"), //
    SR2("image/x-sony-sr2", "sr2"), //
    SRC("application/x-wais-source", "src"), //
    SRF("image/x-sony-srf", "srf"), //
    SRT("application/x-subrip", "srt"), //
    SSA("text/x-ssa", "ssa"), //
    STC("application/vnd.sun.xml.calc.template", "stc"), //
    STD("application/vnd.sun.xml.draw.template", "std"), //
    STI("application/vnd.sun.xml.impress.template", "sti"), //
    STM("audio/x-stm", "stm"), //
    STW("application/vnd.sun.xml.writer.template", "stw"), //
    STY("text/x-tex", "sty"), //
    SUB("text/x-subviewer", "sub"), //
    SUN("image/x-sun-raster", "sun"), //
    SV4CPIO("application/x-sv4cpio", "sv4cpio"), //
    SV4CRC("application/x-sv4crc", "sv4crc"), //
    SVG("image/svg+xml", "svg"), //
    SVGZ("image/svg+xml-compressed", "svgz"), //
    SWF("application/x-shockwave-flash", "swf"), //
    SXC("application/vnd.sun.xml.calc", "sxc"), //
    SXD("application/vnd.sun.xml.draw", "sxd"), //
    SXG("application/vnd.sun.xml.writer.global", "sxg"), //
    SXI("application/vnd.sun.xml.impress", "sxi"), //
    SXM("application/vnd.sun.xml.math", "sxm"), //
    SXW("application/vnd.sun.xml.writer", "sxw"), //
    SYLK("text/spreadsheet", "sylk"), //
    T("text/troff", "t"), //
    T2T("text/x-txt2tags", "t2t"), //
    TAR("application/x-tar", "tar"), //
    TAR_BZ("application/x-bzip-compressed-tar", "tar.bz"), //
    TAR_BZ2("application/x-bzip-compressed-tar", "tar.bz2"), //
    TAR_GZ("application/x-compressed-tar", "tar.gz"), //
    TAR_LZMA("application/x-lzma-compressed-tar", "tar.lzma"), //
    TAR_LZO("application/x-tzo", "tar.lzo"), //
    TAR_XZ("application/x-xz-compressed-tar", "tar.xz"), //
    TAR_Z("application/x-tarz", "tar.z"), //
    TBZ("application/x-bzip-compressed-tar", "tbz"), //
    TBZ2("application/x-bzip-compressed-tar", "tbz2"), //
    TCL("text/x-tcl", "tcl"), //
    TEX("text/x-tex", "tex"), //
    TEXI("text/x-texinfo", "texi"), //
    TEXINFO("text/x-texinfo", "texinfo"), //
    TGA("image/x-tga", "tga"), //
    TGZ("application/x-compressed-tar", "tgz"), //
    THEME("application/x-theme", "theme"), //
    THEMEPACK("application/x-windows-themepack", "themepack"), //
    TIF("image/tiff", "tif"), //
    TIFF("image/tiff", "tiff"), //
    TK("text/x-tcl", "tk"), //
    TLZ("application/x-lzma-compressed-tar", "tlz"), //
    TNEF("application/vnd.ms-tnef", "tnef"), //
    TNF("application/vnd.ms-tnef", "tnf"), //
    TOC("application/x-cdrdao-toc", "toc"), //
    TORRENT("application/x-bittorrent", "torrent"), //
    TPIC("image/x-tga", "tpic"), //
    TR("text/troff", "tr"), //
    TS("application/x-linguist", "ts"), //
    TSV("text/tab-separated-values", "tsv"), //
    TTA("audio/x-tta", "tta"), //
    TTC("application/x-font-ttf", "ttc"), //
    TTF("application/x-font-ttf", "ttf"), //
    TTX("application/x-font-ttx", "ttx"), //
    TXT("text/plain", "txt"), //
    TXZ("application/x-xz-compressed-tar", "txz"), //
    TZO("application/x-tzo", "tzo"), //
    UFRAW("application/x-ufraw", "ufraw"), //
    UI("application/x-designer", "ui"), //
    UIL("text/x-uil", "uil"), //
    ULT("audio/x-mod", "ult"), //
    UNI("audio/x-mod", "uni"), //
    URI("text/x-uri", "uri"), //
    URL("text/x-uri", "url"), //
    USTAR("application/x-ustar", "ustar"), //
    VALA("text/x-vala", "vala"), //
    VAPI("text/x-vala", "vapi"), //
    VCF("text/directory", "vcf"), //
    VCS("text/calendar", "vcs"), //
    VCT("text/directory", "vct"), //
    VDA("image/x-tga", "vda"), //
    VHD("text/x-vhdl", "vhd"), //
    VHDL("text/x-vhdl", "vhdl"), //
    VIV("video/vivo", "viv"), //
    VIVO("video/vivo", "vivo"), //
    VLC("audio/x-mpegurl", "vlc"), //
    VOB("video/mpeg", "vob"), //
    VOC("audio/x-voc", "voc"), //
    VOR("application/vnd.stardivision.writer", "vor"), //
    VST("image/x-tga", "vst"), //
    W2P("application/w2p", "w2p"), //
    WAV("audio/x-wav", "wav"), //
    WAX("audio/x-ms-asx", "wax"), //
    WB1("application/x-quattropro", "wb1"), //
    WB2("application/x-quattropro", "wb2"), //
    WB3("application/x-quattropro", "wb3"), //
    WBMP("image/vnd.wap.wbmp", "wbmp"), //
    WCM("application/vnd.ms-works", "wcm"), //
    WDB("application/vnd.ms-works", "wdb"), //
    WEBM("video/webm", "webm"), //
    WK1("application/vnd.lotus-1-2-3", "wk1"), //
    WK3("application/vnd.lotus-1-2-3", "wk3"), //
    WK4("application/vnd.lotus-1-2-3", "wk4"), //
    WKS("application/vnd.ms-works", "wks"), //
    WMA("audio/x-ms-wma", "wma"), //
    WMF("image/x-wmf", "wmf"), //
    WML("text/vnd.wap.wml", "wml"), //
    WMLS("text/vnd.wap.wmlscript", "wmls"), //
    WMV("video/x-ms-wmv", "wmv"), //
    WMX("audio/x-ms-asx", "wmx"), //
    WP("application/vnd.wordperfect", "wp"), //
    WP4("application/vnd.wordperfect", "wp4"), //
    WP5("application/vnd.wordperfect", "wp5"), //
    WP6("application/vnd.wordperfect", "wp6"), //
    WPD("application/vnd.wordperfect", "wpd"), //
    WPG("application/x-wpg", "wpg"), //
    WPL("application/vnd.ms-wpl", "wpl"), //
    WPP("application/vnd.wordperfect", "wpp"), //
    WPS("application/vnd.ms-works", "wps"), //
    WRI("application/x-mswrite", "wri"), //
    WRL("model/vrml", "wrl"), //
    WV("audio/x-wavpack", "wv"), //
    WVC("audio/x-wavpack-correction", "wvc"), //
    WVP("audio/x-wavpack", "wvp"), //
    WVX("audio/x-ms-asx", "wvx"), //
    X3F("image/x-sigma-x3f", "x3f"), //
    XAC("application/x-gnucash", "xac"), //
    XBEL("application/x-xbel", "xbel"), //
    XBL("application/xml", "xbl"), //
    XBM("image/x-xbitmap", "xbm"), //
    XCF("image/x-xcf", "xcf"), //
    XCF_BZ2("image/x-compressed-xcf", "xcf.bz2"), //
    XCF_GZ("image/x-compressed-xcf", "xcf.gz"), //
    XHTML("application/xhtml+xml", "xhtml"), //
    XI("audio/x-xi", "xi"), //
    XLA("application/vnd.ms-excel", "xla"), //
    XLC("application/vnd.ms-excel", "xlc"), //
    XLD("application/vnd.ms-excel", "xld"), //
    XLF("application/x-xliff", "xlf"), //
    XLIFF("application/x-xliff", "xliff"), //
    XLL("application/vnd.ms-excel", "xll"), //
    XLM("application/vnd.ms-excel", "xlm"), //
    XLS("application/vnd.ms-excel", "xls"), //
    XLSM("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsm"), //
    XLSX("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", "xlsx"), //
    XLT("application/vnd.ms-excel", "xlt"), //
    XLW("application/vnd.ms-excel", "xlw"), //
    XM("audio/x-xm", "xm"), //
    XMF("audio/x-xmf", "xmf"), //
    XMI("text/x-xmi", "xmi"), //
    XML("application/xml", "xml"), //
    XPM("image/x-xpixmap", "xpm"), //
    XPS("application/vnd.ms-xpsdocument", "xps"), //
    XSL("application/xml", "xsl"), //
    XSLFO("text/x-xslfo", "xslfo"), //
    XSLT("application/xml", "xslt"), //
    XSPF("application/xspf+xml", "xspf"), //
    XUL("application/vnd.mozilla.xul+xml", "xul"), //
    XWD("image/x-xwindowdump", "xwd"), //
    XYZ("chemical/x-pdb", "xyz"), //
    XZ("application/x-xz", "xz"), //
    Z("application/x-compress", "z"), //
    ZABW("application/x-abiword", "zabw"), //
    ZIP("application/zip", "zip"), //
    ZOO("application/x-zoo", "zoo");//

    private final String mimeType;
    private final String extension;

    /* 私有构造 */
    ContentTypeEnum(String mimeType, String extension) {
        this.mimeType = mimeType;
        this.extension = extension;
    }

    /** 类型字符串 */
    public String mimeType() {
        return mimeType;
    }

    /** 文件后缀名 */
    public String extension() {
        return extension;
    }

    /**
     * 根据文件后缀获得内容类型
     * @param extension 文件后缀
     * @return 内容类型(如果没有对应的类则返回默认类型)
     */
    public static ContentTypeEnum getByExtension(String extension) {
        return getByExtension(extension, WILD_CARD);
    }

    /**
     * 根据文件后缀获得内容类型
     * @param extension 文件后缀
     * @param defaultContentType 默认内容类型
     * @return 内容类型
     */
    public static ContentTypeEnum getByExtension(String extension, ContentTypeEnum defaultType) {
        for (ContentTypeEnum en : ContentTypeEnum.values()) {
            if (Objects.equals(en.extension, extension)) {
                return en;
            }
        }
        return defaultType;
    }
}