package com.nida.idn.dzikir_digital

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nida.idn.dzikir_digital.Adapter.ViewPagerAdapterDzikir
import com.nida.idn.dzikir_digital.Data.DataDzikirShalat
import kotlinx.android.synthetic.main.activity_dzikir_shalat.*

class DzikirShalatActivity : AppCompatActivity() {

    private val adapterDzikirShalat = ViewPagerAdapterDzikir(
        listOf(
            DataDzikirShalat(
                "Dzikir Setelah Shalat",
                "[1]  Membaca Istighfar (3x)",
                "أَسْتَغْفِرُ اللهَ",
                "Astagfirullah",
                "Aku minta ampun kepada Allah,",
                "(HR. Muslim no. 591)."),

            DataDzikirShalat(
                "Dzikir Setelah Shalat",
                "[2]  Membaca Do'a memuji Allah (1x)",
                "اَللَّهُمَّ أَنْتَ السَّلاَمُ، وَمِنْكَ السَّلاَمُ، تَبَارَكْتَ يَا ذَا الْجَلاَلِ وَاْلإِكْرَامِ\n",
                "Allahumma antas salaam wa minkas salaam tabaarokta yaa dzal jalaali wal ikrom.\n" ,
                "Ya Allah, Engkau pemberi keselamatan, dan dariMu keselamatan, Maha Suci Engkau, wahai Tuhan Yang Pemilik Keagungan dan Kemuliaan\n" ,
                "Rasulullah shallallahu ‘alaihi wa sallam jika selesai dari shalatnya beliau beristighfar sebanyak tiga kali dan membaca dzikir di atas. Al Auza’i menyatakan bahwa bacaan istighfar adalah astaghfirullah, astaghfirullah.\n" ),

            DataDzikirShalat(
                "Dzikir Setelah Shalat",
                "[3]  Membaca Tahlil (1x)",
                "اَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ، اَللَّهُمَّ لاَ مَانِعَ لِمَا أَعْطَيْتَ، وَلاَ مُعْطِيَ لِمَا مَنَعْتَ، وَلاَ يَنْفَعُ ذَا الْجَدِّ مِنْكَ الْجَدُّ\n" ,
                "Laa ilaha illallah wahdahu laa syarika lah, lahul mulku wa lahul hamdu wa huwa ‘ala kulli syai-in qodiir. Allahumma laa maani’a lima a’thoita wa laa mu’thiya limaa mana’ta wa laa yanfau dzal jaddi minkal jaddu.\n" ,
                "Tiada Rabb yang berhak disembah selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya. Bagi-Nya puji dan bagi-Nya kerajaan. Dia Maha Kuasa atas segala sesuatu. Ya Allah, tidak ada yang mencegah apa yang Engkau berikan dan tidak ada yang memberi apa yang Engkau cegah. Tidak berguna kekayaan dan kemuliaan itu bagi pemiliknya (selain iman dan amal shalihnya yang menyelamatkan dari siksaan). Hanya dari-Mu kekayaan dan kemuliaan.\n" ,
                "(HR. Bukhari no.6615, Muslim no.593)"),
            DataDzikirShalat(
                "Dzikir Setelah Shalat",
                "[4]  Membaca Tahlil (1x)",
                "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ. لاَ حَوْلَ وَلاَ قُوَّةَ إِلاَّ بِاللهِ، لاَ إِلَـهَ إِلاَّ اللهُ، وَلاَ نَعْبُدُ إِلاَّ إِيَّاهُ، لَهُ النِّعْمَةُ وَلَهُ الْفَضْلُ وَلَهُ الثَّنَاءُ الْحَسَنُ، لاَ إِلَـهَ إِلاَّ اللهُ مُخْلِصِيْنَ لَهُ الدِّيْنَ وَلَوْ كَرِهَ الْكَافِرُوْنَ\n" ,
                "Laa ilaha illallah wahdahu laa syarika lah. Lahul mulku wa lahul hamdu wa huwa ‘ala kulli syai-in qodiir.\n" +
                        "\n" +
                        "Laa hawla wa laa quwwata illa billah. Laa ilaha illallah wa laa na’budu illa iyyaah. Lahun ni’mah wa lahul fadhlu wa lahuts tsanaaul hasan.\n" +
                        "\n" +
                        "Laa ilaha illallah mukhlishiina lahud diin wa law karihal kaafiruun.\n" +
                        "\n" +
                        "\n" +
                        "\n" ,
                "Tiada Rabb (yang berhak disembah) kecuali Allah, Yang Maha Esa, tidak ada sekutu bagi-Nya. Bagi-Nya kerajaan dan pujaan. Dia Mahakuasa atas segala sesuatu. Tidak ada daya dan kekuatan kecuali (dengan pertolongan) Allah. Tiada Rabb (yang hak disembah) kecuali Allah. Kami tidak menyembah kecuali kepada-Nya. Bagi-Nya nikmat, anugerah dan pujaan yang baik. Tiada Rabb (yang hak disembah) kecuali Allah, dengan memurnikan ibadah kepadaNya, sekalipun orang-orang kafir sama benci.\n" +
                        "\n" ,
                "Dikatakan oleh ‘Abdullah bin Zubair, Nabi shallallahu ‘alaihi wa sallam biasa membaca tahlil (laa ilaha illallah) di akhir shalat\n" ),
            DataDzikirShalat(
                "Dzikir Setelah Shalat",
                "[5]  Membaca Tasbih(33x), Tahmid(33x), & Takbir(33x)",
                "سُبْحَانَ اللهِ\n" +
                        "\n" +
                        "اَلْحَمْدُ لِلَّهِ\n" +
                        "\n" +
                      "اَللهُ أَكْبَرُ\n" +
                        "\n" +
                        "لاَ إِلَـهَ إِلاَّ اللهُ وَحْدَهُ لاَ شَرِيْكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ\n" +
                        "\n" ,
                "Subhanallah (33x)\n" +
                        "\n" +
                        "Al hamdulillah (33x)\n" +
                        "\n" +
                        "Allahu akbar (33 x)\n" +
                        "\n" +
                        "Laa ilaha illallah wahdahu laa syarika lah. Lahul mulku wa lahul hamdu wa huwa ‘ala kulli syai-in qodiir.\n" +
                        "\n" ,
                "Maha Suci Allah (33 x), segala puji bagi Allah (33 x), Allah Maha Besar (33 x). Tidak ada Rabb (yang berhak disembah) kecuali Allah Yang Maha Esa, tidak ada sekutu bagi-Nya. Bagi-Nya kerajaan. Bagi-Nya pujaan. Dia-lah Yang Mahakuasa atas segala sesuatu.”\n" +
                        "\n" ,
                "Siapa yang membaca dzikir di atas, maka dosa-dosanya diampuni walau sebanyak buih di lautan.[5] Kata Imam Nawawi rahimahullah, tekstual hadits menunjukkan bahwa bacaan Subhanallah, Alhamdulillah, Allahu akbar, masing-masing dibaca 33 kali secara terpisah.[\n" +
                        "\n" ),
            DataDzikirShalat(
                "Dzikir Setelah Shalat",
                "[5] Membaca Ayat Kursi",
                "اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ، لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ، لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ، مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ، يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ، وَلَا يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ، وَسِعَ كُرْسِيُّهُ السَّمَاوَاتِ وَالْأَرْضَ، وَلَا يَئُودُهُ حِفْظُهُمَا، وَهُوَ الْعَلِيُّ الْعَظِيمُ\n" ,
                "Allahu laa ilaaha illaa huwal hayyul qayyumm, laa ta`khuduhuu sinatun wa laa naum, lahuu maa fissamaawaati wa maa fil ardhi, man dzalladzii yasyfa'u 'indahuu illaa bi idznih, ya'lamu maa bainaa aidiihiim wa maa khalfahum, wa laa yuhiithuuna bi syai-in min 'ilmihii ilaa bimaa syaa-a, wa si'a kursiyyuhussamaawaati wal ardhi, wa laa ya-uuduhu hifzhuhumaa wa huswal 'aliyyul 'azhiim",
                "Allah, tidak ada ilah (yang berhak disembah) melainkan Dia, yang hidup kekal lagi terus menerus mengurus (makhluk-Nya). Dia tidak mengantuk dan tidak tidur. Kepunyaan-Nya apa yang di langit dan di bumi. Tiada yang dapat memberi syafa’at di sisi-Nya tanpa seizin-Nya. Dia mengetahui apa-apa yang di hadapan mereka dan di belakang mereka. Mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendaki-Nya. Kursi Allah meliputi langit dan bumi. Dia tidak merasa berat memelihara keduanya. Dan Dia Maha Tinggi lagi Maha besar\n" ,
                "Siapa membaca ayat Kursi setiap selesai shalat, tidak ada yang menghalanginya masuk surga selain kematian\n" ),

                DataDzikirShalat(
                    "Dzikir Setelah Shalat",
                    "[6] Membaca Surat Al -IKhlas, Alfalaq & An-nas",
                    "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ" +
                            " قُلْ هُوَ اللَّهُ أَحَدٌ اللَّهُ الصَّمَدُ لَمْ يَلِدْ وَلَمْ يُولَدْ وَلَمْ يَكُن لَّهُ كُفُوًا أَحَدٌ\n" +
                            "\n" +
                            "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                            "\n" +
                            "قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ مِن شَرِّ مَا خَلَقَ وَمِن شَرِّ غَاسِقٍ إِذَا وَقَبَ وَمِن شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ  وَمِن شَرِّ حَاسِدٍ إِذَا حَسَدَ\n" +
                            "\n" +
                            "بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ\n" +
                            "\n" +
                            "قُلْ أَعُوذُ بِرَبِّ النَّاسِ مَلِكِ النَّاسِ إِلَهِ النَّاسِ مِن شَرِّ الْوَسْوَاسِ الْخَنَّاسِ الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ مِنَ الْجِنَّةِ وَ النَّاسِ\n" +
                            "\n" ,
                    "Bismillahirrahmanirrahiim\" " +
                            "\n" +
                            "Qul huwallaahu ahad.Allahus-shamad. Lam yalid walam yuulad.walam yakullahu kufuwan ahad.\n" +
                            "\n" +
                            "Bismillahirrahmanirrahiim\n" +
                            "\n" +
                            "Qul A'udzu birabbil-falaq. Min Syarri maa Khalaq. Wamin Syarri ghaa siqin idzaa waqab. Wamin syarrin naffaastaatifil uqad. Wamin syarri haasidin idzaa hasad \n" +
                            "\n" +
                            "Bismillahirrahmanirrahiim\n" +
                            "\n" +
                            "Qul A'udzu birabbin-nas malikinnas . Ilaahin-naas. Min syarril waswaasil khannas. Alladzii, yuwaswisuii shuduurinnas. Minaljinnati wannaas\n",
                                    "“Katakanlah, Dia-lah Allah Yang Maha Esa. Allah adalah (Rabb) yang segala sesuatu bergantung kepada-Nya. Dia tidak beranak dan tidak pula diperanakkan. Dan tidak ada seorang pun yang setara dengan-Nya.\n" +
                                            "\n" +
                                            "Katakanlah: ‘Aku berlindung kepada Rabb Yang menguasai (waktu) Shubuh dari kejahatan makhluk-Nya. Dan dari kejahatan malam apabila telah gelap gulita. Dan dari kejahatan wanita-wanita tukang sihir yang menghembus pada buhul-buhul. Serta dari kejahatan orang yang dengki apabila dia dengki.\n" +
                                            "\n" +
                                           "Katakanlah, ‘Aku berlindung kepada Rabb (yang memelihara dan menguasai) manusia. Raja manusia. Sembahan (Ilah) manusia. Dari kejahatan (bisikan) syaitan yang biasa bersembunyi. Yang membisikkan (kejahatan) ke dalam dada-dada manusia. Dari golongan jin dan manusia.\n" +
                                            "\n" ,
                    "HR. Abu Daud no. 1523 dan An-Nasai no. 1337. Al Hafizh Abu Thohir mengatakan bahwa sanad hadits ini hasan.\n" +
                            "\n" ),
            DataDzikirShalat(
                "Dzikir Setelah Shalat",
                "Membaca do'a Memohon Ilmu dan Amal" +
                        "Dibaca setelah salam dari shalat subuh",
                "اَللَّهُمَّ إِنِّيْ أَسْأَلُكَ عِلْمًا نَافِعًا، وَرِزْقًا طَيِّبًا، وَعَمَلاً مُتَقَبَّلاً\n" ,
                "Allahumma inni as-aluka ‘ilman naafi’a, wa rizqon thoyyiba, wa ‘amalan mutaqobbala\n" +
                        "\n" ,
                "Ya Allah, sungguh aku memohon kepada-Mu ilmu yang bermanfaat (bagi diriku dan orang lain), rizki yang halal dan amal yang diterima (di sisi-Mu dan mendapatkan ganjaran yang baik).\n" +
                        "\n" ,
                "HR. Ibnu Majah no. 925 dan Ahmad 6: 305, 322. Al Hafizh Abu Thohir mengatakan bahwa hadits ini shahih.\n" +
                        "\n" )
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_shalat)
                dzikir_shalat.adapter = adapterDzikirShalat
    }
}